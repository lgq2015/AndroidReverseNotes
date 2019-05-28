package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CredentialsOptions extends AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT = ((CredentialsOptions) new Builder().zzh());

    public static final class Builder extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder {
        public final CredentialsOptions build() {
            AppMethodBeat.m2504i(50340);
            CredentialsOptions credentialsOptions = new CredentialsOptions(this, null);
            AppMethodBeat.m2505o(50340);
            return credentialsOptions;
        }

        public final Builder forceEnableSaveDialog() {
            this.zzar = Boolean.TRUE;
            return this;
        }

        public final /* synthetic */ AuthCredentialsOptions zzh() {
            AppMethodBeat.m2504i(50341);
            CredentialsOptions build = build();
            AppMethodBeat.m2505o(50341);
            return build;
        }
    }

    static {
        AppMethodBeat.m2504i(50343);
        AppMethodBeat.m2505o(50343);
    }

    private CredentialsOptions(Builder builder) {
        super(builder);
    }

    /* synthetic */ CredentialsOptions(Builder builder, zzi zzi) {
        this(builder);
    }
}
