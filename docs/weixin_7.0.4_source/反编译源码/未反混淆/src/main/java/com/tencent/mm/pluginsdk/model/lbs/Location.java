package com.tencent.mm.pluginsdk.model.lbs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class Location implements Parcelable {
    public static final Creator<Location> CREATOR = new Creator<Location>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Location[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AppMethodBeat.i(79407);
            Location location = new Location();
            location.fBr = parcel.readFloat();
            location.fBs = parcel.readFloat();
            location.accuracy = parcel.readInt();
            location.cGo = parcel.readInt();
            location.mac = parcel.readString();
            location.cGq = parcel.readString();
            AppMethodBeat.o(79407);
            return location;
        }
    };
    public int accuracy;
    public int cGo;
    public String cGq;
    public float fBr;
    public float fBs;
    public String mac;

    public Location(float f, float f2, int i, int i2, String str, String str2) {
        this.fBr = f;
        this.fBs = f2;
        this.accuracy = i;
        this.cGo = i2;
        this.mac = str;
        this.cGq = str2;
    }

    public final boolean dhR() {
        AppMethodBeat.i(79408);
        if (this.fBr == -85.0f || this.fBs == -1000.0f) {
            ab.d("MicroMsg.Radar.Location", "mac and cellId is null");
            AppMethodBeat.o(79408);
            return true;
        }
        AppMethodBeat.o(79408);
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppMethodBeat.i(79409);
        parcel.writeFloat(this.fBr);
        parcel.writeFloat(this.fBs);
        parcel.writeInt(this.accuracy);
        parcel.writeInt(this.cGo);
        parcel.writeString(this.mac);
        parcel.writeString(this.cGq);
        AppMethodBeat.o(79409);
    }

    static {
        AppMethodBeat.i(79410);
        AppMethodBeat.o(79410);
    }
}
