package com.example.courseregistrationform;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class FormDBMS extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "FormDBMS";

    public FormDBMS(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table FormDetails (Name TEXT PRIMARY KEY, " +
                "SoORdo TEXT, RegistrationNo TEXT, RollNo TEXT, CourseCode TEXT, CourseTitle TEXT, CourseCH, " +
                "HODRemarks TEXT, HODName TEXT, HODSign TEXT, SSCRemarks TEXT, SSCName TEXT, SSCSign TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop TABLE if exists FormDetails");
    }

    public boolean insertUserData(String name, String registrationNo, String rollNo,
                                  String coursecode, String coursectitle, String coursech,
                                  String hodremrks, String hodname, String hodsign,
                                  String sscremarks, String sscname, String sscsign){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Name", name);
        contentValues.put("RegistrationNo", registrationNo);
        contentValues.put("RollNo", rollNo);
        contentValues.put("CourseCode", coursecode);
        contentValues.put("CourseTitle", coursectitle);
        contentValues.put("CourseCH", coursech);
        contentValues.put("HODRemarks", hodremrks);
        contentValues.put("HODName", hodname);
        contentValues.put("HODSign", hodsign);
        contentValues.put("SSCRemarks", sscremarks);
        contentValues.put("SSCName", sscname);
        contentValues.put("SSCSign", sscsign);

        long result = MyDB.insert("FormDetails", null, contentValues);
        Log.d("data-1", "ininsert: " +result);
        Log.d("data-1", "ininsert: " +contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean updateUserData(String Name, String RegistrationNo, String RollNo,
                                  String CCode, String CTitle, String CCh, String HODRemarks,
                                  String HODName,String HODSign,String SSCRemarks,String SSCName,String SSCSign){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Name", Name);
        contentValues.put("RegistrationNo", RegistrationNo);
        contentValues.put("RollNo", RollNo);
        contentValues.put("CCode", CCode);
        contentValues.put("CTitle", CTitle);
        contentValues.put("CCh", CCh);
        contentValues.put("HODRemarks", HODRemarks);
        contentValues.put("HODName", HODName);
        contentValues.put("HODSign", HODSign);
        contentValues.put("SSCRemarks", SSCRemarks);
        contentValues.put("SSCName", SSCName);
        contentValues.put("SSCSign", SSCSign);
        Cursor cursor = MyDB.rawQuery("Select * from FormDetails where RollNo = ?", new String[] {RollNo});

        if (cursor.getCount() > 0) {
            long result = MyDB.update("FormDetails", contentValues, "RollNo=?", new String[]{RollNo});
            if (result == -1)
                return false;
            else
                return true;
        }else {
            return false;
        }
    }

    public boolean deleteUserData(String rollNotodel){
        SQLiteDatabase MyDB = this.getWritableDatabase();

        Cursor cursor = MyDB.rawQuery("Select * from FormDetails where RollNo = ?", new String[] {rollNotodel});

        if (cursor.getCount() > 0) {
            Log.d("data-1", "onCreate: " +"enter del sql method");
            long result = MyDB.delete("FormDetails", "RollNo=?", new String[] {rollNotodel});
            Log.d("data-1", "onCreate: " +"executed del sql method");
            if (result == -1)
                return false;
            else
                return true;
        }else {
            return false;
        }
    }


    public Cursor viewUserData(){
        SQLiteDatabase MyDB = this.getWritableDatabase();

        Cursor cursor = MyDB.rawQuery("Select * from FormDetails", null);
        return cursor;
    }
    public List<CourseRegistrationModel> ToObject(Cursor cursor){
        List<CourseRegistrationModel> mylist = new ArrayList<>();
        while (cursor.moveToNext()){
            CourseRegistrationModel obj = new CourseRegistrationModel(cursor.getString(0),
                    cursor.getString(1), cursor.getString(2),
                    cursor.getString(3), cursor.getString(4),
                    cursor.getString(5), cursor.getString(6),
                    cursor.getString(7), cursor.getString(8),
                    cursor.getString(9), cursor.getString(10),
                    cursor.getString(11));
            mylist.add(obj);

        }
        return mylist;
    }
}
