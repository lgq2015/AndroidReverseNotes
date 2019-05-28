package com.tencent.p177mm.p230g.p711c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p177mm.sdk.p603e.C4925c;

/* renamed from: com.tencent.mm.g.c.e */
public abstract class C32691e extends C4925c {
    public static final String[] diI = new String[0];
    private static final int diR = "rowid".hashCode();
    private static final int djA = "key".hashCode();
    private static final int djB = "mau".hashCode();
    private static final int djC = "dau".hashCode();
    private static final int djD = "useTime".hashCode();
    private boolean djw = true;
    private boolean djx = true;
    private boolean djy = true;
    private boolean djz = true;
    public int field_dau;
    public int field_key;
    public int field_mau;
    public long field_useTime;

    /* renamed from: d */
    public final void mo8995d(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (djA == hashCode) {
                    this.field_key = cursor.getInt(i);
                    this.djw = true;
                } else if (djB == hashCode) {
                    this.field_mau = cursor.getInt(i);
                } else if (djC == hashCode) {
                    this.field_dau = cursor.getInt(i);
                } else if (djD == hashCode) {
                    this.field_useTime = cursor.getLong(i);
                } else if (diR == hashCode) {
                    this.xDa = cursor.getLong(i);
                }
            }
        }
    }

    /* renamed from: Hl */
    public final ContentValues mo10098Hl() {
        ContentValues contentValues = new ContentValues();
        if (this.djw) {
            contentValues.put("key", Integer.valueOf(this.field_key));
        }
        if (this.djx) {
            contentValues.put("mau", Integer.valueOf(this.field_mau));
        }
        if (this.djy) {
            contentValues.put("dau", Integer.valueOf(this.field_dau));
        }
        if (this.djz) {
            contentValues.put("useTime", Long.valueOf(this.field_useTime));
        }
        if (this.xDa > 0) {
            contentValues.put("rowid", Long.valueOf(this.xDa));
        }
        return contentValues;
    }
}
