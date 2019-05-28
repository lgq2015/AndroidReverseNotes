package com.tencent.d.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends JceStruct {
    public String AsX = "";
    public String AsY = "";
    public int AsZ = 0;
    public String Ata = "";
    public int Atb = 0;
    public String fwM = "";
    public String model = "";
    public String platform = "";

    public final JceStruct newInit() {
        AppMethodBeat.i(114498);
        d dVar = new d();
        AppMethodBeat.o(114498);
        return dVar;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        AppMethodBeat.i(114499);
        if (this.AsX != null) {
            jceOutputStream.write(this.AsX, 0);
        }
        if (this.AsY != null) {
            jceOutputStream.write(this.AsY, 1);
        }
        if (this.fwM != null) {
            jceOutputStream.write(this.fwM, 2);
        }
        if (this.model != null) {
            jceOutputStream.write(this.model, 3);
        }
        if (this.AsZ != 0) {
            jceOutputStream.write(this.AsZ, 4);
        }
        if (this.Ata != null) {
            jceOutputStream.write(this.Ata, 5);
        }
        if (this.platform != null) {
            jceOutputStream.write(this.platform, 6);
        }
        if (this.Atb != 0) {
            jceOutputStream.write(this.Atb, 7);
        }
        AppMethodBeat.o(114499);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        AppMethodBeat.i(114500);
        this.AsX = jceInputStream.readString(0, false);
        this.AsY = jceInputStream.readString(1, false);
        this.fwM = jceInputStream.readString(2, false);
        this.model = jceInputStream.readString(3, false);
        this.AsZ = jceInputStream.read(this.AsZ, 4, false);
        this.Ata = jceInputStream.readString(5, false);
        this.platform = jceInputStream.readString(6, false);
        this.Atb = jceInputStream.read(this.Atb, 7, false);
        AppMethodBeat.o(114500);
    }
}
