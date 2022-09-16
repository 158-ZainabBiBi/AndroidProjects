package com.example.courseregistrationform;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FormDB {
    private static final String FILE_NAME = "FormDB.txt";

    public static void writeToFile(Context context, CourseRegistrationModel model) {
        File path = context.getFilesDir();
        try {
            BufferedWriter bo = new BufferedWriter(new FileWriter(new File(path, FILE_NAME), true));
            bo.write(model.toString());
            bo.newLine();
            bo.flush();
            bo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<CourseRegistrationModel> readFromFile(Context context) {
        List<CourseRegistrationModel> nocModelsss = new ArrayList<>();
        File path = context.getFilesDir();
        File readFrom = new File(path, FILE_NAME);
        try {
            BufferedReader br = new BufferedReader(new FileReader(readFrom));
            String line = "";
            while ((line = br.readLine()) != null) {
                CourseRegistrationModel nocMymodel = nocLinetoModel(line);
                nocModelsss.add(nocMymodel);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nocModelsss;
    }
    public static CourseRegistrationModel nocLinetoModel(String data){
        String[] values = data.split(",");
        int crID =Integer.parseInt(values[0].trim());
        String crName = values[1].trim();
        String crReg  = values[2].trim();
        String crRoll  = values[3].trim();
        String crCourseCode  = values[4].trim();
        String crCourseTitle = values[5].trim();
        String crCourseCH  = values[6].trim();
        String crHODRemarks = values[7].trim();
        String crHODName  = values[8].trim();
        String crHODSign = values[9].trim();
        String crSSCRemarks =  values[10].trim();
        String crSSCName = values[11].trim();
        String crSSCSign =  values[12].trim();
        CourseRegistrationModel mymodel = new CourseRegistrationModel(crID, crName, crReg, crRoll,
                crCourseCode, crCourseTitle, crCourseCH, crHODRemarks,
                crHODName, crHODSign, crSSCRemarks, crSSCName, crSSCSign);
        return mymodel;
    }
    public static CourseRegistrationModel FindOne(int nocModel_ID,Context context){

        List<CourseRegistrationModel> nocmodels = new ArrayList<CourseRegistrationModel>();
        String line;
        File path = context.getFilesDir();
        File readFrom = new File(path, FILE_NAME);
        try {
            @SuppressWarnings("resource")
            BufferedReader br = new BufferedReader(new FileReader(readFrom));

            while ((line = br.readLine()) != null) {
                CourseRegistrationModel nocMymodel = nocLinetoModel(line);
                if (nocMymodel.getFormID() == nocModel_ID)
                    nocmodels.add(nocMymodel);


                return nocMymodel;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static CourseRegistrationModel DelOne(int nocModel_ID) {

        FileWriter filewriter;
        List<CourseRegistrationModel> persons = FindAll();
        Context context = null;
        CourseRegistrationModel person = FormDB.FindOne(nocModel_ID,context);
        try {
            filewriter = new FileWriter(FILE_NAME);

            for(int i=0;i<persons.size();i++) {
                if(persons.get(i).getFormID()!=nocModel_ID) {
                    filewriter.append(persons.get(i).toString());
                    filewriter.append("\n");
                }
            }
            persons.add(person);
            filewriter.flush();
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }
    public static List<CourseRegistrationModel> FindAll(){
        List<CourseRegistrationModel> nocmodels= new ArrayList<CourseRegistrationModel>();
        String line ;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            while((line=bufferedReader.readLine()) != null) {
                CourseRegistrationModel nocMymodel = nocLinetoModel(line);
                nocmodels.add(nocMymodel);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        return nocmodels;
    }
}