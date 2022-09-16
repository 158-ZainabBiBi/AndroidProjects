package com.example.assign_1_bscs_19011519_158;

public class CourseRegistrationForm {

    private int ID;
    private String STUDENT_NAME;
    private String STUDENT_ROLLNO;
    private boolean STUDENT_SEMESTER;
    private String STUDENT_YEAR;
    private String STUDENT_DATE;
    private String COURSE_SR;
    private String COURSE_CODE;
    private String COURSE_TITLE;
    private String COURSE_CREDITHOURS;
    private String HOD_REMARKS;
    private String HOD_NAME;
    private String HOD_SIGNATURE;
    private String HOD_DATE;
    private String SSC_REMARKS;
    private String SSC_NAME;
    private String SSC_SIGNATURE;
    private String SSC_DATE;

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public String getSTUDENT_NAME() {
        return STUDENT_NAME;
    }

    public void setSTUDENT_NAME(String student_NAME) {
        this.STUDENT_NAME = student_NAME;
    }

    public String getSTUDENT_ROLLNO() {
        return STUDENT_ROLLNO;
    }

    public void setSTUDENT_ROLLNO(String student_ROLLNO) {
        this.STUDENT_ROLLNO = student_ROLLNO;
    }

    public boolean isSTUDENT_SEMESTER() {
        return STUDENT_SEMESTER;
    }

    public void setSTUDENT_SEMESTER(boolean student_SEMESTER) {
        this.STUDENT_SEMESTER = student_SEMESTER;
    }

    public String getSTUDENT_YEAR() {
        return STUDENT_YEAR;
    }

    public void setSTUDENT_YEAR(String student_YEAR) {
        this.STUDENT_YEAR = student_YEAR;
    }

    public String getSTUDENT_DATE() {
        return STUDENT_DATE;
    }

    public void setSTUDENT_DATE(String student_DATE) {
        this.STUDENT_DATE = student_DATE;
    }

    public String getCOURSE_SR() {
        return COURSE_SR;
    }

    public void setCOURSE_SR(String course_SR) {
        this.COURSE_SR = course_SR;
    }

    public String getCOURSE_CODE() {
        return COURSE_CODE;
    }

    public void setCOURSE_CODE(String course_CODE) {
        this.COURSE_CODE = course_CODE;
    }

    public String getCOURSE_TITLE() {
        return COURSE_TITLE;
    }

    public void setCOURSE_TITLE(String course_TITLE) {
        this.COURSE_TITLE = course_TITLE;
    }

    public String getCOURSE_CREDITHOURS() {
        return COURSE_CREDITHOURS;
    }

    public void setCOURSE_CREDITHOURS(String course_CREDITHOURS) {
        this.COURSE_CREDITHOURS = course_CREDITHOURS;
    }

    public String getHOD_REMARKS() {
        return HOD_REMARKS;
    }

    public void setHOD_REMARKS(String hod_REMARKS) {
        this.HOD_REMARKS = hod_REMARKS;
    }

    public String getHOD_NAME() {
        return HOD_NAME;
    }

    public void setHOD_NAME(String hod_NAME) {
        this.HOD_NAME = hod_NAME;
    }

    public String getHOD_SIGNATURE() {
        return HOD_SIGNATURE;
    }

    public void setHOD_SIGNATURE(String hod_SIGNATURE) {
        this.HOD_SIGNATURE = hod_SIGNATURE;
    }

    public String getHOD_DATE() {
        return HOD_DATE;
    }

    public void setHOD_DATE(String hod_DATE) {
        this.HOD_DATE = hod_DATE;
    }

    public String getSSC_REMARKS() {
        return SSC_REMARKS;
    }

    public void setSSC_REMARKS(String ssc_REMARKS) {
        this.SSC_REMARKS = ssc_REMARKS;
    }

    public String getSSC_NAME() {
        return SSC_NAME;
    }

    public void setSSC_NAME(String ssc_NAME) {
        this.SSC_NAME = ssc_NAME;
    }

    public String getSSC_SIGNATURE() {
        return SSC_SIGNATURE;
    }

    public void setSSC_SIGNATURE(String ssc_SIGNATURE) {
        this.SSC_SIGNATURE = ssc_SIGNATURE;
    }

    public String getSSC_DATE() {
        return SSC_DATE;
    }

    public void setSSC_DATE(String ssc_DATE) {
        this.SSC_DATE = ssc_DATE;
    }

    public CourseRegistrationForm(int id,String student_NAME, String student_ROLLNO, boolean student_SEMESTER, String student_YEAR, String student_DATE,
                                  String course_SR, String course_CODE, String course_TITLE, String course_CREDITHOURS,
                                  String hod_REMARKS, String hod_NAME, String hod_SIGNATURE, String hod_DATE,
                                  String ssc_REMARKS, String ssc_NAME, String ssc_SIGNATURE, String ssc_DATE) {
        ID = id;
        STUDENT_NAME = student_NAME;
        STUDENT_ROLLNO = student_ROLLNO;
        STUDENT_SEMESTER = student_SEMESTER;
        STUDENT_YEAR = student_YEAR;
        STUDENT_DATE = student_DATE;
        COURSE_SR = course_SR;
        COURSE_CODE = course_CODE;
        COURSE_TITLE = course_TITLE;
        COURSE_CREDITHOURS = course_CREDITHOURS;
        HOD_REMARKS = hod_REMARKS;
        HOD_NAME = hod_NAME;
        HOD_SIGNATURE = hod_SIGNATURE;
        HOD_DATE = hod_DATE;
        SSC_REMARKS = ssc_REMARKS;
        SSC_NAME = ssc_NAME;
        SSC_SIGNATURE = ssc_SIGNATURE;
        SSC_DATE = ssc_DATE;
    }

    @Override
    public String toString() {
        return "CourseRegistrationForm{" +
                "ID=" + ID +
                ", Student Name='" + STUDENT_NAME + '\'' +
                ", Student RollNo='" + STUDENT_ROLLNO + '\'' +
                ", Student Semester=" + STUDENT_SEMESTER +
                ", Student Year='" + STUDENT_YEAR + '\'' +
                ", Student Date=" + STUDENT_DATE + '\'' +
                ", Course Sr='" + COURSE_SR + '\'' +
                ", Course Code=" + COURSE_CODE +
                ", Course Title='" + COURSE_TITLE + '\'' +
                ", Course CreditHours=" + COURSE_CREDITHOURS + '\'' +
                ", HOD Remarks='" + HOD_REMARKS + '\'' +
                ", HOD Name='" + HOD_NAME + '\'' +
                ", HOD Signature=" + HOD_SIGNATURE +
                ", HOD Date='" + HOD_DATE + '\'' +
                ", SSC Remarks='" + SSC_REMARKS + '\'' +
                ", SSC Name='" + SSC_NAME + '\'' +
                ", SSC Signature=" + SSC_SIGNATURE +
                ", SSC Date='" + SSC_DATE + '}';
    }

    public CourseRegistrationForm(String student_NAME, String student_ROLLNO, String student_DATE) {
        STUDENT_NAME = student_NAME;
        STUDENT_ROLLNO = student_ROLLNO;
        STUDENT_DATE = student_DATE;
    }
}
