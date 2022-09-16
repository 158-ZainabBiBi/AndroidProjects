package com.example.courseregistrationform;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FormActivity extends AppCompatActivity {

    List<CourseRegistrationModel> mylist ;
    FormAdapter myadapter;
    RecyclerView recyclerView;
    FormDBMS db;
    public void calldelondetail(String roll){
        db.deleteUserData(roll);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        recyclerView = findViewById(R.id.rvListItems);
        mylist = new ArrayList<>();
        db = new FormDBMS(this);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Cursor cursor = new  FormDBMS(this).viewUserData();
        myadapter = new FormAdapter();

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
        myadapter.setNocModels(mylist);
        recyclerView.setAdapter(myadapter);

        findViewById(R.id.btnadd).setOnClickListener(v ->{
            Intent intent = new Intent(FormActivity.this,CourseRegistration.class);
            startActivityForResult(intent,345);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 345 )
        {
            if(resultCode != RESULT_CANCELED) {

                String Name = data.getStringExtra("Name");
                String RegistrationNo = data.getStringExtra("RegistrationNo");
                String RollNo = data.getStringExtra("RollNo");

                String CourseCode = data.getStringExtra("CourseCode");
                String CourseTitle = data.getStringExtra("CourseTitle");
                String CourseCH = data.getStringExtra("CourseCH");
                String HODRemarks = data.getStringExtra("HODRemarks");
                String HODName = data.getStringExtra("HODName");
                String HODSign = data.getStringExtra("HODSign");
                String SSCRemarks = data.getStringExtra("SSCRemarks");
                String SSCName = data.getStringExtra("SSCName");
                String SSCSign = data.getStringExtra("SSCSign");

                mylist.add(new CourseRegistrationModel(Name, RegistrationNo, RollNo,
                        CourseCode,CourseTitle,CourseCH,HODRemarks, HODName,HODSign,
                        SSCRemarks,SSCName,SSCSign));
                Boolean checkInsertData = db.insertUserData(Name,RegistrationNo,RollNo,
                        CourseCode,CourseTitle,CourseCH, HODRemarks, HODName,HODSign,
                        SSCRemarks,SSCName,SSCSign);

                if (checkInsertData == true){
                    Toast.makeText(FormActivity.this, "Data Inserted Successfully!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(FormActivity.this, "Data Not Inserted!", Toast.LENGTH_SHORT).show();
                }

                myadapter.notifyDataSetChanged();
            }
        }


    }

}