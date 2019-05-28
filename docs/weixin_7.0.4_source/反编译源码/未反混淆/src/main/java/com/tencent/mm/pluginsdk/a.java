package com.tencent.mm.pluginsdk;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.samsung.android.sdk.look.airbutton.SlookAirButtonFrequentContactAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {
    public static boolean aij(String str) {
        AppMethodBeat.i(79186);
        if (str.length() <= 0) {
            AppMethodBeat.o(79186);
            return false;
        }
        AppMethodBeat.o(79186);
        return true;
    }

    public static String ws(String str) {
        String str2;
        AppMethodBeat.i(79187);
        CharSequence trim = str.trim();
        boolean startsWith = trim.startsWith("+");
        if (startsWith && trim.length() > 1) {
            trim = trim.substring(1, trim.length());
        }
        Matcher matcher = Pattern.compile("[^0-9]").matcher(trim);
        if (startsWith) {
            str2 = "+" + matcher.replaceAll("").trim();
        } else {
            str2 = matcher.replaceAll("").trim();
        }
        AppMethodBeat.o(79187);
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0123 A:{SYNTHETIC, Splitter:B:51:0x0123} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0183 A:{Splitter:B:9:0x003f, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0183 A:{Splitter:B:9:0x003f, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0183 A:{Splitter:B:9:0x003f, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:41:0x00f6, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:43:?, code skipped:
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AddressBookUtil", r0, "getContactsInfo2:", new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing block: B:44:0x0103, code skipped:
            r2 = null;
     */
    /* JADX WARNING: Missing block: B:81:0x0183, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:84:0x0188, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:85:0x0189, code skipped:
            r3 = r7;
            r0 = null;
            r1 = null;
     */
    /* JADX WARNING: Missing block: B:86:0x018d, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:87:0x018e, code skipped:
            r3 = r7;
            r0 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static String[] f(Context context, Uri uri) {
        Cursor query;
        CharSequence charSequence;
        CharSequence charSequence2;
        String[] strArr;
        Throwable e;
        Cursor cursor;
        Throwable th;
        AppMethodBeat.i(79188);
        if (uri == null) {
            ab.d("MicroMsg.AddressBookUtil", "uri == null");
            AppMethodBeat.o(79188);
            return null;
        } else if (b.j(context, "android.permission.READ_CONTACTS", false)) {
            try {
                query = context.getContentResolver().query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.getCount() > 0) {
                            query.moveToFirst();
                            int columnIndex = query.getColumnIndex("has_phone_number");
                            if (columnIndex <= 0 || query.getInt(columnIndex) > 0) {
                                Cursor query2 = context.getContentResolver().query(Phone.CONTENT_URI, null, "contact_id = ".concat(String.valueOf(query.getString(query.getColumnIndex("_id")))), null, null);
                                if (query2 != null) {
                                    if (query2.moveToFirst()) {
                                        charSequence = null;
                                        charSequence2 = null;
                                        while (!query2.isAfterLast()) {
                                            int columnIndex2 = query2.getColumnIndex("data1");
                                            int columnIndex3 = query2.getColumnIndex(SlookAirButtonFrequentContactAdapter.DISPLAY_NAME);
                                            String string = query2.getString(columnIndex2);
                                            String string2 = query2.getString(columnIndex3);
                                            ab.d("MicroMsg.AddressBookUtil", "username : ".concat(String.valueOf(string2)));
                                            if (string != null) {
                                                ab.d("MicroMsg.AddressBookUtil", "phoneNumber : ".concat(String.valueOf(string)));
                                                if (string == null) {
                                                    charSequence = null;
                                                } else {
                                                    charSequence = string.replaceAll("\\D", "");
                                                    if (charSequence.startsWith("86")) {
                                                        charSequence = charSequence.substring(2);
                                                    }
                                                }
                                                ab.d("MicroMsg.AddressBookUtil", "phoneNumber : ".concat(String.valueOf(charSequence)));
                                                if (PhoneNumberUtils.isGlobalPhoneNumber(charSequence)) {
                                                    charSequence2 = charSequence;
                                                }
                                                ab.d("MicroMsg.AddressBookUtil", "phoneResult : ".concat(String.valueOf(charSequence2)));
                                            }
                                            query2.moveToNext();
                                            Object charSequence3 = string2;
                                        }
                                        if (query2 != null) {
                                            if (!query2.isClosed()) {
                                                query2.close();
                                            }
                                        }
                                        if (!(query == null || query.isClosed())) {
                                            query.close();
                                        }
                                        if (TextUtils.isEmpty(charSequence3) || !TextUtils.isEmpty(charSequence2)) {
                                            strArr = new String[]{charSequence3, charSequence2};
                                            AppMethodBeat.o(79188);
                                            return strArr;
                                        }
                                        AppMethodBeat.o(79188);
                                        return null;
                                    }
                                }
                                charSequence3 = null;
                                charSequence2 = null;
                                if (query2 != null) {
                                }
                                query.close();
                                if (TextUtils.isEmpty(charSequence3)) {
                                }
                                strArr = new String[]{charSequence3, charSequence2};
                                AppMethodBeat.o(79188);
                                return strArr;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cursor = query;
                    } catch (Throwable th2) {
                    }
                }
                charSequence3 = null;
                charSequence2 = null;
                query.close();
            } catch (Exception e3) {
                e = e3;
                cursor = null;
                charSequence3 = null;
                charSequence2 = null;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                query.close();
                AppMethodBeat.o(79188);
                throw th;
            }
            if (TextUtils.isEmpty(charSequence3)) {
            }
            strArr = new String[]{charSequence3, charSequence2};
            AppMethodBeat.o(79188);
            return strArr;
        } else {
            ab.e("MicroMsg.AddressBookUtil", "no contact permission");
            AppMethodBeat.o(79188);
            return null;
        }
        try {
            ab.printErrStackTrace("MicroMsg.AddressBookUtil", e, "getContactsInfo1:", new Object[0]);
            if (!(cursor == null || cursor.isClosed())) {
                cursor.close();
            }
            if (TextUtils.isEmpty(charSequence3)) {
            }
            strArr = new String[]{charSequence3, charSequence2};
            AppMethodBeat.o(79188);
            return strArr;
        } catch (Throwable th4) {
            th = th4;
            query = cursor;
            query.close();
            AppMethodBeat.o(79188);
            throw th;
        }
    }

    public static List<String[]> fz(Context context) {
        AppMethodBeat.i(79189);
        LinkedList linkedList = new LinkedList();
        ContentResolver contentResolver = context.getContentResolver();
        if (b.o(context, "android.permission.READ_CONTACTS")) {
            Cursor query;
            try {
                query = contentResolver.query(Phone.CONTENT_URI, null, null, null, null);
            } catch (Exception e) {
                ab.e("MicroMsg.AddressBookUtil", "getMobileInfo: exception occured [%s]", e.getMessage());
                ab.printErrStackTrace("MicroMsg.AddressBookUtil", e, "", new Object[0]);
                query = null;
            }
            if (query == null) {
                ab.e("MicroMsg.AddressBookUtil", "getMobileInfo: mobile is null");
                AppMethodBeat.o(79189);
                return linkedList;
            }
            try {
                if (query.getCount() <= 0 || !query.moveToFirst()) {
                    query.close();
                    AppMethodBeat.o(79189);
                    return linkedList;
                }
                do {
                    String string = query.getString(query.getColumnIndex(SlookAirButtonFrequentContactAdapter.DISPLAY_NAME));
                    String string2 = query.getString(query.getColumnIndex("contact_id"));
                    String string3 = query.getString(query.getColumnIndex("data1"));
                    String string4 = query.getString(query.getColumnIndex("raw_contact_id"));
                    Long valueOf = Long.valueOf(query.getLong(query.getColumnIndex("photo_id")));
                    linkedList.add(new String[]{string2, string, string3, string4, String.valueOf(valueOf)});
                } while (query.moveToNext());
                query.close();
                AppMethodBeat.o(79189);
                return linkedList;
            } catch (Exception e2) {
                ab.e("MicroMsg.AddressBookUtil", "getMobileInfo: exception2 occured [%s]", e2.getMessage());
                ab.printErrStackTrace("MicroMsg.AddressBookUtil", e2, "", new Object[0]);
                query.close();
            } catch (Throwable th) {
                query.close();
                AppMethodBeat.o(79189);
            }
        } else {
            ab.e("MicroMsg.AddressBookUtil", "no contact permission");
            AppMethodBeat.o(79189);
            return linkedList;
        }
    }

    public static List<String[]> cJ(Context context) {
        AppMethodBeat.i(79190);
        LinkedList linkedList = new LinkedList();
        ContentResolver contentResolver = context.getContentResolver();
        if (b.o(context, "android.permission.READ_CONTACTS")) {
            Cursor query;
            try {
                query = contentResolver.query(Phone.CONTENT_URI, null, null, null, "sort_key_alt");
            } catch (Exception e) {
                ab.printErrStackTrace("MicroMsg.AddressBookUtil", e, "", new Object[0]);
                ab.e("MicroMsg.AddressBookUtil", "exception in getMoblieOrderInfo(), [%s]", e.getMessage());
                query = contentResolver.query(Phone.CONTENT_URI, null, null, null, null);
            }
            if (query == null) {
                ab.e("MicroMsg.AddressBookUtil", "getMobileInfo: mobile is null");
                AppMethodBeat.o(79190);
                return linkedList;
            }
            try {
                if (query.getCount() <= 0 || !query.moveToFirst()) {
                    query.close();
                    AppMethodBeat.o(79190);
                    return linkedList;
                }
                do {
                    String string = query.getString(query.getColumnIndex(SlookAirButtonFrequentContactAdapter.DISPLAY_NAME));
                    String string2 = query.getString(query.getColumnIndex("contact_id"));
                    String string3 = query.getString(query.getColumnIndex("data1"));
                    String string4 = query.getString(query.getColumnIndex("raw_contact_id"));
                    linkedList.add(new String[]{string2, string, string3, string4});
                } while (query.moveToNext());
                query.close();
                AppMethodBeat.o(79190);
                return linkedList;
            } catch (Exception e2) {
                ab.printErrStackTrace("MicroMsg.AddressBookUtil", e2, "", new Object[0]);
                ab.e("MicroMsg.AddressBookUtil", "exception in getMoblieOrderInfo()2, [%s]", e2.getMessage());
                query.close();
            } catch (Throwable th) {
                query.close();
                AppMethodBeat.o(79190);
            }
        } else {
            ab.e("MicroMsg.AddressBookUtil", "no contact permission");
            AppMethodBeat.o(79190);
            return linkedList;
        }
    }

    public static List<String[]> fA(Context context) {
        AppMethodBeat.i(79191);
        LinkedList linkedList = new LinkedList();
        ContentResolver contentResolver = context.getContentResolver();
        if (b.o(context, "android.permission.READ_CONTACTS")) {
            try {
                Cursor query = contentResolver.query(Email.CONTENT_URI, null, null, null, null);
                if (query == null) {
                    AppMethodBeat.o(79191);
                    return linkedList;
                }
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(query.getColumnIndex("data1"));
                        String string2 = query.getString(query.getColumnIndex("contact_id"));
                        String string3 = query.getString(query.getColumnIndex("data4"));
                        String string4 = query.getString(query.getColumnIndex("raw_contact_id"));
                        String string5 = query.getString(query.getColumnIndex("photo_id"));
                        linkedList.add(new String[]{string2, string3, string, string4, string5});
                    } while (query.moveToNext());
                }
                query.close();
                AppMethodBeat.o(79191);
                return linkedList;
            } catch (Exception e) {
                ab.printErrStackTrace("MicroMsg.AddressBookUtil", e, "getEmailInfo", new Object[0]);
            }
        } else {
            ab.e("MicroMsg.AddressBookUtil", "no contact permission");
            AppMethodBeat.o(79191);
            return linkedList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static List<String> fB(Context context) {
        Exception e;
        Throwable th;
        AppMethodBeat.i(79192);
        LinkedList linkedList = new LinkedList();
        ContentResolver contentResolver = context.getContentResolver();
        if (b.o(context, "android.permission.READ_CONTACTS")) {
            Cursor query;
            try {
                query = contentResolver.query(Phone.CONTENT_URI, null, null, null, null);
                if (query == null) {
                    try {
                        ab.e("MicroMsg.AddressBookUtil", "getPhonesCursor: cursor is null.");
                        if (query != null) {
                            query.close();
                        }
                        AppMethodBeat.o(79192);
                        return linkedList;
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            ab.e("MicroMsg.AddressBookUtil", "exception in getMobileList, [%s]", e.getMessage());
                            ab.printErrStackTrace("MicroMsg.AddressBookUtil", e, "", new Object[0]);
                            if (query != null) {
                                query.close();
                            }
                            AppMethodBeat.o(79192);
                            return linkedList;
                        } catch (Throwable th2) {
                            th = th2;
                            if (query != null) {
                            }
                            AppMethodBeat.o(79192);
                            throw th;
                        }
                    }
                }
                if (query.moveToFirst()) {
                    do {
                        linkedList.add(query.getString(query.getColumnIndex("data1")));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
                AppMethodBeat.o(79192);
                return linkedList;
            } catch (Exception e3) {
                e = e3;
                query = null;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                AppMethodBeat.o(79192);
                throw th;
            }
        }
        ab.e("MicroMsg.AddressBookUtil", "no contact permission");
        AppMethodBeat.o(79192);
        return linkedList;
    }

    public static String i(String str, Context context) {
        AppMethodBeat.i(79193);
        String str2 = "";
        if (b.o(context, "android.permission.READ_CONTACTS")) {
            Cursor query;
            try {
                query = context.getContentResolver().query(Contacts.CONTENT_URI, new String[]{SlookAirButtonFrequentContactAdapter.DISPLAY_NAME}, "_id = ?", new String[]{str}, null);
            } catch (Exception e) {
                ab.printErrStackTrace("MicroMsg.AddressBookUtil", e, "getContactNameById:", new Object[0]);
                query = null;
            }
            if (query == null) {
                AppMethodBeat.o(79193);
                return str2;
            }
            String string;
            if (query.moveToFirst()) {
                string = query.getString(0);
            } else {
                string = str2;
            }
            query.close();
            AppMethodBeat.o(79193);
            return string;
        }
        ab.e("MicroMsg.AddressBookUtil", "no contact permission");
        AppMethodBeat.o(79193);
        return str2;
    }

    public static Uri dgN() {
        try {
            return Contacts.CONTENT_URI;
        } catch (Exception e) {
            return null;
        }
    }

    public static Bitmap a(String str, Context context, boolean z) {
        AppMethodBeat.i(79194);
        if (str == null || str.equals("")) {
            AppMethodBeat.o(79194);
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            InputStream openContactPhotoInputStream = Contacts.openContactPhotoInputStream(contentResolver, ContentUris.withAppendedId(Contacts.CONTENT_URI, bo.anl(str)), z);
            if (openContactPhotoInputStream == null) {
                AppMethodBeat.o(79194);
                return null;
            }
            Bitmap decodeStream = d.decodeStream(openContactPhotoInputStream);
            if (decodeStream != null) {
                decodeStream = d.a(decodeStream, true, 4.0f);
            }
            AppMethodBeat.o(79194);
            return decodeStream;
        } catch (Exception e) {
            ab.printErrStackTrace("MicroMsg.AddressBookUtil", e, "getAvatar, contactId:%s", str);
            AppMethodBeat.o(79194);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(String str, Context context, byte[] bArr) {
        Throwable e;
        AppMethodBeat.i(79195);
        if (str == null || str.equals("")) {
            AppMethodBeat.o(79195);
            return false;
        } else if (b.o(context, "android.permission.READ_CONTACTS")) {
            Cursor query;
            try {
                ContentResolver contentResolver = context.getContentResolver();
                long anl = bo.anl(str);
                ContentValues contentValues = new ContentValues();
                ab.d("MicroMsg.AddressBookUtil", "where is %s", String.format("%s=%d and %s='%s'", new Object[]{"raw_contact_id", Long.valueOf(anl), "mimetype", "vnd.android.cursor.item/photo"}));
                query = contentResolver.query(Data.CONTENT_URI, null, r3, null, null);
                if (query == null) {
                    if (query != null) {
                        query.close();
                    }
                    AppMethodBeat.o(79195);
                    return false;
                }
                try {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                    if (query.moveToFirst()) {
                        columnIndexOrThrow = query.getInt(columnIndexOrThrow);
                    } else {
                        columnIndexOrThrow = -1;
                    }
                    contentValues.put("raw_contact_id", Long.valueOf(anl));
                    contentValues.put("is_super_primary", Integer.valueOf(1));
                    contentValues.put("data15", bArr);
                    contentValues.put("mimetype", "vnd.android.cursor.item/photo");
                    if (columnIndexOrThrow >= 0) {
                        boolean z;
                        if (contentResolver.update(Data.CONTENT_URI, contentValues, "_id = ".concat(String.valueOf(columnIndexOrThrow)), null) > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (query != null) {
                            query.close();
                        }
                        AppMethodBeat.o(79195);
                        return z;
                    }
                    contentResolver.insert(Data.CONTENT_URI, contentValues);
                    if (query != null) {
                        query.close();
                    }
                    AppMethodBeat.o(79195);
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        ab.printErrStackTrace("MicroMsg.AddressBookUtil", e, "", new Object[0]);
                        if (!(query == null || query.isClosed())) {
                            query.close();
                        }
                        if (query != null) {
                            query.close();
                        }
                        AppMethodBeat.o(79195);
                        return false;
                    } catch (Throwable th) {
                        e = th;
                        if (query != null) {
                        }
                        AppMethodBeat.o(79195);
                        throw e;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                query = null;
            } catch (Throwable th2) {
                e = th2;
                query = null;
                if (query != null) {
                    query.close();
                }
                AppMethodBeat.o(79195);
                throw e;
            }
        } else {
            ab.e("MicroMsg.AddressBookUtil", "no contact permission");
            AppMethodBeat.o(79195);
            return false;
        }
    }
}
