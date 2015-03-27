package sdu.capstone.wastenot;

import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;


/**
 * Created by Holden on 3/15/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    static final String dbName="WasteNot";


    public DatabaseHelper(Context context) {
        super(context, dbName, null,0);
    }

    public void onCreate(SQLiteDatabase db) {

    }

    public void onUpgrade(SQLiteDatabase db, int x, int y) {

    }
}
