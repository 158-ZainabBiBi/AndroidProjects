package com.example.courseregistrationform;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseRegistration extends AppCompatActivity {

    FormDBMS db;
    List<CourseRegistrationModel> mylist = new ArrayList<>();
    EditText name,RegistrationNo,RollNo,CourseCode, CourseTitle, CourseCH,
            HODRemarks, HODName, HODSign, SSCRemarks, SSCName, SSCSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_registration);

        name = findViewById(R.id.txtstudentname);
        RegistrationNo  = findViewById(R.id.txtstudentregno);
        RollNo = findViewById(R.id.txtstudentrollno);
        CourseCode = findViewById(R.id.txtcoursecode);
        CourseTitle = findViewById(R.id.txtcoursetitle);
        CourseCH = findViewById(R.id.txtcoursech);
        HODRemarks = findViewById(R.id.txthodremarks);
        HODName = findViewById(R.id.txthodname);
        HODSign = findViewById(R.id.txthodsignature);
        SSCRemarks = findViewById(R.id.txtsscremarks);
        SSCName = findViewById(R.id.txtsscname);
        SSCSign = findViewById(R.id.txtsscsignature);


        findViewById(R.id.btnDone).setOnClickListener(v ->{

            String Name = name.getText().toString();
            String Registrationnu = RegistrationNo.getText().toString();
            String Rollno = RollNo.getText().toString();
            String CCode = CourseCode.getText().toString();
            String CTitle = CourseTitle.getText().toString();
            String CCH = CourseCH.getText().toString();
            String HRemarks = HODRemarks.getText().toString();
            String HName = HODName.getText().toString();
            String HSign = HODSign.getText().toString();
            String SRemarks = SSCRemarks.getText().toString();
            String SName = SSCName.getText().toString();
            String SSign = SSCSign.getText().toString();

            Intent intent = new Intent();

            intent.putExtra("Name",Name);
            intent.putExtra("RegistrationNo",Registrationnu);
            intent.putExtra("RollNo",Rollno);
            intent.putExtra("CourseCode",CCode);
            intent.putExtra("CourseTitle",CTitle);
            intent.putExtra("CourseCH",CCH);
            intent.putExtra("HODRemarks",HRemarks);
            intent.putExtra("HODName",HName);
            intent.putExtra("HODSign",HSign);
            intent.putExtra("SSCRemarks",SRemarks);
            intent.putExtra("SSCName",SName);
            intent.putExtra("SSCSign",SSign);

            CourseRegistration.this.setResult(RESULT_OK, intent);
            CourseRegistration.this.finish();
        });

    }
}