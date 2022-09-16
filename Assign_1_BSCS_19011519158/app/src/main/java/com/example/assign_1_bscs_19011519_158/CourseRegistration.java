package com.example.assign_1_bscs_19011519_158;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CourseRegistration extends AppCompatActivity {

    EditText txt_studentname, txt_studentrollno, txt_studentyear, txt_studentdate,
            txt_coursesr,txt_coursecode,txt_coursetitle, txt_coursecr,
            txt_hodremarks, txt_hodname, txt_hodsignature, txt_hoddate,
            txt_sscremarks, txt_sscname, txt_sscsignature, txt_sscdate;

    RadioButton rb_studentfall, rb_studentspring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courseregistration);

        txt_studentname = findViewById(R.id.txtstudentname);
        txt_studentrollno = findViewById(R.id.txtstudentrollno);
        txt_studentyear = findViewById(R.id.txtstudentyear);
        txt_studentdate = findViewById(R.id.txtstudentdate);
        rb_studentfall = findViewById(R.id.rbstudentfall);
        rb_studentspring = findViewById(R.id.rbstudentspring);

        txt_hodremarks = findViewById(R.id.txthodremarks);
        txt_hodname = findViewById(R.id.txthodname);
        txt_hodsignature = findViewById(R.id.txthodsignature);
        txt_hoddate = findViewById(R.id.txthoddate);

        txt_sscremarks = findViewById(R.id.txtsscremarks);
        txt_sscname = findViewById(R.id.txtsscname);
        txt_sscsignature = findViewById(R.id.txtsscsignature);
        txt_sscdate = findViewById(R.id.txtsscdate);


    }

    public void onSendClick(View view) {
        String StudentName = txt_studentname.getText().toString();
        String StudentRollNo = txt_studentrollno.getText().toString();
        String StudentYear = txt_studentyear.getText().toString();
        String StudentDate = txt_studentdate.getText().toString();

        String CourseSr = txt_coursesr.getText().toString();
        String CourseCode = txt_coursecode.getText().toString();
        String CourseTitle = txt_coursetitle.getText().toString();
        String CourseCR = txt_coursecr.getText().toString();

        String HODRemarks = txt_hodremarks.getText().toString();
        String HODName = txt_hodname.getText().toString();
        String HODSignature = txt_hodsignature.getText().toString();
        String HODDate = txt_hoddate.getText().toString();

        String SSCRemarks = txt_sscremarks.getText().toString();
        String SSCName = txt_sscname.getText().toString();
        String SSCSignature = txt_sscsignature.getText().toString();
        String SSCDate = txt_sscdate.getText().toString();

        boolean radio1 = rb_studentfall.isChecked();
        boolean radio2 = rb_studentspring.isChecked();


        switch (view.getId()) {
            case R.id.rbstudentfall:
                if (radio1)
                    break;
            case R.id.rbstudentspring:
                if (radio2)
                    break;
        }

        Intent intent = new Intent();
        intent.putExtra("Student Name", StudentName);
        intent.putExtra("Student RollNo", StudentRollNo);
        intent.putExtra("Student Year", StudentYear);
        intent.putExtra("Student Date", StudentDate);

        intent.putExtra("Course Sr", CourseSr);
        intent.putExtra("Course Code", CourseCode);
        intent.putExtra("Course Title", CourseTitle);
        intent.putExtra("Course CR", CourseCR);

        intent.putExtra("HOD Remarks", HODRemarks);
        intent.putExtra("HOD Name", HODName);
        intent.putExtra("HOD Signature", HODSignature);
        intent.putExtra("HOD Date", HODDate);

        intent.putExtra("SSC Remarks", SSCRemarks);
        intent.putExtra("SSC Name", SSCName);
        intent.putExtra("SSC Signature", SSCSignature);
        intent.putExtra("SSC Date", SSCDate);

        CourseRegistration.this.setResult(RESULT_OK, intent);
        CourseRegistration.this.finish();
    }

    public void onClickWrite(View view) {
        String StudentName = txt_studentname.getText().toString();
        String StudentRollNo = txt_studentrollno.getText().toString();
        String StudentYear = txt_studentyear.getText().toString();
        String StudentDate = txt_studentdate.getText().toString();
        String CourseSr = txt_coursesr.getText().toString();
        String CourseCode = txt_coursecode.getText().toString();
        String CourseTitle = txt_coursetitle.getText().toString();
        String CourseCR = txt_coursecr.getText().toString();
        String HODRemarks = txt_hodremarks.getText().toString();
        String HODName = txt_hodname.getText().toString();
        String HODSignature = txt_hodsignature.getText().toString();
        String HODDate = txt_hoddate.getText().toString();
        String SSCRemarks = txt_sscremarks.getText().toString();
        String SSCName = txt_sscname.getText().toString();
        String SSCSignature = txt_sscsignature.getText().toString();
        String SSCDate = txt_sscdate.getText().toString();
        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_APPEND | MODE_PRIVATE); //can also write as MODE_APPEND | MODE_PRIVATE
            fos.write(StudentName.getBytes());
            fos.write(StudentRollNo.getBytes());
            fos.write(StudentYear.getBytes());
            fos.write(StudentDate.getBytes());
            fos.write(CourseSr.getBytes());
            fos.write(CourseCode.getBytes());
            fos.write(CourseTitle.getBytes());
            fos.write(CourseCR.getBytes());
            fos.write(HODRemarks.getBytes());
            fos.write(HODName.getBytes());
            fos.write(HODSignature.getBytes());
            fos.write(HODDate.getBytes());
            fos.write(SSCRemarks.getBytes());
            fos.write(SSCName.getBytes());
            fos.write(SSCSignature.getBytes());
            fos.write(SSCDate.getBytes());

            fos.flush();
            fos.close();

            Toast.makeText(this, "Saved to" + getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}