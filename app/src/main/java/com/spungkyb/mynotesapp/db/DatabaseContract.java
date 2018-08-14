package com.spungkyb.mynotesapp.db;

import android.provider.BaseColumns;

/**
 * Created by user on 06/08/2018.
 */

public class DatabaseContract {
    static String TABLE_NOTE = "note";
    static final class NoteColumns implements BaseColumns {
        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String DATE = "date";
    }
}
