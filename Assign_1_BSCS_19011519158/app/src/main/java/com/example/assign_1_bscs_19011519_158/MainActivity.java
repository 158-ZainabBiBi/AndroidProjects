package com.example.assign_1_bscs_19011519_158;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CourseRegistrationForm> mylist ;
    RecyclerView recyclerView;
    CourseRegistrationFormAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.FormRecord);
        mylist = new ArrayList<>();
        CourseRegistrationForm mymodel = new CourseRegistrationForm("ZainabBibi", "19011519-158", "25-03-2001");
        mylist.add(mymodel);
        Log.i("student", "\nForm Data\n" + mymodel.toString());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new CourseRegistrationFormAdapter();
        adapter.setCourseRegistrationFormList(mylist);
        recyclerView.setAdapter(adapter);
    }

    public void onAddClick(View view) {
        Intent intent = new Intent(MainActivity.this, CourseRegistration.class);
        startActivityForResult(intent, 345);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 345)
        {
            if(resultCode != RESULT_CANCELED) {

                String STUDENT_NAME = data.getStringExtra("STUDENT_NAME");
                String STUDENT_ROLLNO = data.getStringExtra("STUDENT_ROLLNO");
                String STUDENT_DATE = data.getStringExtra("STUDENT_DATE");
                String STUDENT_YEAR = data.getStringExtra("STUDENT_YEAR");

                String COURSE_CODE = data.getStringExtra("COURSE_CODE");
                String COURSE_TITLE = data.getStringExtra("COURSE_TITLE");
                String COURSE_SR = data.getStringExtra("COURSE_SR");
                String COURSE_CREDITHOURS = data.getStringExtra("COURSE_CREDITHOURS");

                String HOD_REMARKS = data.getStringExtra("HOD_REMARKS");
                String HOD_NAME = data.getStringExtra("HOD_NAME");
                String HOD_SIGNATURE = data.getStringExtra("HOD_SIGNATURE");
                String HOD_DATE = data.getStringExtra("HOD_DATE");

                String SSC_REMARKS = data.getStringExtra("SSC_REMARKS");
                String SSC_NAME = data.getStringExtra("SSC_NAME");
                String SSC_SIGNATURE = data.getStringExtra("SSC_SIGNATURE");
                String SSC_DATE = data.getStringExtra("SSC_DATE");
                String Accept = data.getStringExtra("Accept");


                mylist.add(new CourseRegistrationForm(mylist.size()+1,STUDENT_NAME, STUDENT_ROLLNO, false, STUDENT_YEAR, STUDENT_DATE,
                        COURSE_SR, COURSE_CODE, COURSE_TITLE, COURSE_CREDITHOURS,
                        HOD_REMARKS, HOD_NAME, HOD_SIGNATURE, HOD_DATE,
                        SSC_REMARKS, SSC_NAME, SSC_SIGNATURE, SSC_DATE));
                adapter.notifyDataSetChanged();
            }
        }
    }
}