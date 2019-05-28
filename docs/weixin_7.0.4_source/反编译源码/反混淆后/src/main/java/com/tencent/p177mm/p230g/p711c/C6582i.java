package com.tencent.p177mm.p230g.p711c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p177mm.sdk.p603e.C4925c;

/* renamed from: com.tencent.mm.g.c.i */
public abstract class C6582i extends C4925c {
    public static final String[] diI = new String[]{"CREATE INDEX IF NOT EXISTS AppBrandAppLaunchRecordUpdateTimeIndex ON AppBrandAppLaunchUsernameDuplicateRecord(updateTime)"};
    private static final int diR = "rowid".hashCode();
    private static final int dlo = "username".hashCode();
    private static final int dlp = "updateTime".hashCode();
    private boolean dlm = true;
    private boolean dln = true;
    public long field_updateTime;
    public String field_username;

    /* renamed from: d */
    public final void mo8995d(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (dlo == hashCode) {
                    this.field_username = cursor.getString(i);
                    this.dlm = true;
                } else if (dlp == hashCode) {
                    this.field_updateTime = cursor.getLong(i);
                } else if (diR == hashCode) {
                    this.xDa = cursor.getLong(i);
                }
            }
        }
    }

    /* renamed from: Hl */
    public final ContentValues mo10098Hl() {
        ContentValues contentValues = new ContentValues();
        if (this.dlm) {
            contentValues.put("username", this.field_username);
        }
        if (this.dln) {
            contentValues.put("updateTime", Long.valueOf(this.field_updateTime));
        }
        if (this.xDa > 0) {
            contentValues.put("rowid", Long.valueOf(this.xDa));
        }
        return contentValues;
    }
}
