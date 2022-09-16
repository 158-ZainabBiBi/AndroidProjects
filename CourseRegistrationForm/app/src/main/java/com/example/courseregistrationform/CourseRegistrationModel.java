package com.example.courseregistrationform;

public class CourseRegistrationModel extends Application{
    private int FormID;
    private String CourseCode, CourseTitle, CourseCH , HODRemarks, HODName, HODSign,
            SSCRemarks, SSCName, SSCSign;

    public int getFormID() {
        return FormID;
    }

    public void setFormID(int formID) {
        FormID = formID;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }

    public String getCourseCH() {
        return CourseCH;
    }

    public void setCourseCH(String courseCH) {
        CourseCH = courseCH;
    }

    public String getHODRemarks() {
        return HODRemarks;
    }

    public void setHODRemarks(String HODremarks) {
        this.HODRemarks = HODremarks;
    }

    public String getHODName() {
        return HODName;
    }

    public void setHODName(String HODname) {
        this.HODName = HODname;
    }

    public String getHODSign() {
        return HODSign;
    }

    public void setHODSign(String HODsign) {
        this.HODSign = HODsign;
    }

    public String getSSCRemarks() {
        return SSCRemarks;
    }

    public void setSSCRemarks(String SSCremarks) {
        this.SSCRemarks = SSCremarks;
    }

    public String getSSCName() {
        return SSCName;
    }

    public void setSSCName(String SSCname) {
        this.SSCName = SSCname;
    }

    public String getSSCSign() {
        return SSCSign;
    }

    public void setSSCSign(String SSCsign) {
        this.SSCSign = SSCsign;
    }

    public CourseRegistrationModel(int formID,String name, String registrationNo, String rollNo,
                       String courseCode, String courseTitle, String courseCH,
                       String HODremarks, String HODname, String HODsign,
                       String SSCremarks, String SSCname, String SSCsign) {
        FormID = formID;

        super.setName(name);
        super.setRegistrationNo(registrationNo);
        super.setRollNo(rollNo);
        CourseCode = courseCode;
        CourseTitle = courseTitle;
        CourseCH = courseCH;
        HODRemarks = HODremarks;
        HODName = HODname;
        HODSign = HODsign;
        SSCRemarks = SSCremarks;
        SSCName = SSCname;
        SSCSign = SSCsign;
    }

    public CourseRegistrationModel(String name, String registrationNo, String rollNo,
                       String courseCode, String courseTitle, String courseCH,
                       String HODremarks, String HODname, String HODsign,
                       String SSCremarks, String SSCname, String SSCsign) {
        super.setName(name);
        super.setRegistrationNo(registrationNo);
        super.setRollNo(rollNo);
        CourseCode = courseCode;
        CourseTitle = courseTitle;
        CourseCH = courseCH;
        HODRemarks = HODremarks;
        HODName = HODname;
        HODSign = HODsign;
        SSCRemarks = SSCremarks;
        SSCName = SSCname;
        SSCSign = SSCsign;
    }

    public CourseRegistrationModel(String name,String Regno,String Rollno){
        super.setName(name);
        super.setRollNo(Rollno);
        super.setRegistrationNo(Regno);
    }

    @Override
    public String toString() {
        return
                FormID + ", " + super.getName() + ", " + super.getRegistrationNo() + ", " + super.getRollNo() +
                        CourseCode + ", " + CourseTitle + ", " + CourseCH + ", " +
                        HODRemarks + ", " + HODName + ", " + HODSign + ", " +
                        SSCRemarks + ", " + SSCName + ", " + SSCSign;


    }

    public String forRead() {
        return
                FormID + ",Student Name = " + super.getName() + ", Registration No = " + super.getRegistrationNo() +
                        ", Roll No = " + super.getRollNo() +
                        ", Course Code = " + CourseCode + ", Course Title = " + CourseTitle +
                        ", Course CH = " + CourseCH + ", HOD Remarks = " + HODRemarks +
                        ", HOD Name = " + HODName + ", HOD Sign = " + HODSign + ", SSC Remarks = " + SSCRemarks +
                        ", SSC Name = " + SSCName + ", SSC Sign = " + SSCSign;
    }
}
