package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.WebDialog;
import com.facebook.internal.WebDialog.Builder;
import com.facebook.internal.WebDialog.OnCompleteListener;
import com.facebook.login.LoginClient.Request;
import com.tencent.matrix.trace.core.AppMethodBeat;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<WebViewLoginMethodHandler> CREATOR = new Creator<WebViewLoginMethodHandler>() {
        public final WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            AppMethodBeat.i(96931);
            WebViewLoginMethodHandler webViewLoginMethodHandler = new WebViewLoginMethodHandler(parcel);
            AppMethodBeat.o(96931);
            return webViewLoginMethodHandler;
        }

        public final WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    };
    private String e2e;
    private WebDialog loginDialog;

    static class AuthDialogBuilder extends Builder {
        private static final String OAUTH_DIALOG = "oauth";
        private String authType;
        private String e2e;
        private String redirect_uri = ServerProtocol.DIALOG_REDIRECT_URI;

        public AuthDialogBuilder(Context context, String str, Bundle bundle) {
            super(context, str, OAUTH_DIALOG, bundle);
        }

        public AuthDialogBuilder setE2E(String str) {
            this.e2e = str;
            return this;
        }

        public AuthDialogBuilder setIsRerequest(boolean z) {
            return this;
        }

        public AuthDialogBuilder setIsChromeOS(boolean z) {
            this.redirect_uri = z ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : ServerProtocol.DIALOG_REDIRECT_URI;
            return this;
        }

        public AuthDialogBuilder setAuthType(String str) {
            this.authType = str;
            return this;
        }

        public WebDialog build() {
            AppMethodBeat.i(96934);
            Bundle parameters = getParameters();
            parameters.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, this.redirect_uri);
            parameters.putString("client_id", getApplicationId());
            parameters.putString("e2e", this.e2e);
            parameters.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST);
            parameters.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, "true");
            parameters.putString(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, this.authType);
            WebDialog newInstance = WebDialog.newInstance(getContext(), OAUTH_DIALOG, parameters, getTheme(), getListener());
            AppMethodBeat.o(96934);
            return newInstance;
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* Access modifiers changed, original: 0000 */
    public String getNameForLogging() {
        return "web_view";
    }

    /* Access modifiers changed, original: 0000 */
    public AccessTokenSource getTokenSource() {
        return AccessTokenSource.WEB_VIEW;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean needsInternetPermission() {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void cancel() {
        AppMethodBeat.i(96935);
        if (this.loginDialog != null) {
            this.loginDialog.cancel();
            this.loginDialog = null;
        }
        AppMethodBeat.o(96935);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean tryAuthorize(final Request request) {
        AppMethodBeat.i(96936);
        Bundle parameters = getParameters(request);
        AnonymousClass1 anonymousClass1 = new OnCompleteListener() {
            public void onComplete(Bundle bundle, FacebookException facebookException) {
                AppMethodBeat.i(96930);
                WebViewLoginMethodHandler.this.onWebDialogComplete(request, bundle, facebookException);
                AppMethodBeat.o(96930);
            }
        };
        this.e2e = LoginClient.getE2E();
        addLoggingExtra("e2e", this.e2e);
        FragmentActivity activity = this.loginClient.getActivity();
        this.loginDialog = new AuthDialogBuilder(activity, request.getApplicationId(), parameters).setE2E(this.e2e).setIsChromeOS(Utility.isChromeOS(activity)).setAuthType(request.getAuthType()).setOnCompleteListener(anonymousClass1).build();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.setDialog(this.loginDialog);
        facebookDialogFragment.show(activity.getSupportFragmentManager(), FacebookDialogFragment.TAG);
        AppMethodBeat.o(96936);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void onWebDialogComplete(Request request, Bundle bundle, FacebookException facebookException) {
        AppMethodBeat.i(96937);
        super.onComplete(request, bundle, facebookException);
        AppMethodBeat.o(96937);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        AppMethodBeat.i(96938);
        this.e2e = parcel.readString();
        AppMethodBeat.o(96938);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppMethodBeat.i(96939);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e2e);
        AppMethodBeat.o(96939);
    }

    static {
        AppMethodBeat.i(96940);
        AppMethodBeat.o(96940);
    }
}
