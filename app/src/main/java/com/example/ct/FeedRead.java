package com.example.ct;

import android.provider.BaseColumns;

public final class FeedRead
{
    private FeedRead()
    {

    }

    public static class FeedEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
}
