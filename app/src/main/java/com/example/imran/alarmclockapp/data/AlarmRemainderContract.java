package com.example.imran.alarmclockapp.data;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

public class AlarmRemainderContract {

    public AlarmRemainderContract() {
    }

    public  static final String CONTENT_AUTHORITY = "com.example.imran.alarmclockapp";

    public  static  final Uri BASE_CONTENT_URI = Uri.parse("content://"+CONTENT_AUTHORITY);

    public static  final  String PATH_VEHICLE = "remainder-path";

    public  static  final  class AlarmRemainderEntry implements BaseColumns{

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI,PATH_VEHICLE);

        public static  final String COTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" +
                    CONTENT_AUTHORITY + "/" + PATH_VEHICLE;

        public static  final String COTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" +
                CONTENT_AUTHORITY + "/" + PATH_VEHICLE;

        public  final static String TBLE_NAME = "vehicles";

        public  final static String _ID = BaseColumns._ID;
        public  final static String KEY_TITLE = "title";
        public  final static String KEY_DATE = "date";
        public  final static String KEY_TIME = "time";
        public  final static String KEY_REPEAT = "repeat";
        public  final static String KEY_REPEAT_NO = "repeat_no";
        public  final static String KEY_REPEAT_TYPE = "repeat_type";
        public  final static String KEY_ACTIVE = "active";



    }

    public static String getColumnString(Cursor cursor, String columnName){

        return  cursor.getString(cursor.getColumnIndex(columnName));
    }
}
