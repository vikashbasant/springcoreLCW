package org.springcore;


public class Student {
    private int studentId;
    private String studentName;
    private String studentCity;
    
    public Student() {
        
    }
    
    public Student(int id, String name, String city){
        this.studentId = id;
        this.studentName = name;
        this.studentCity = city;
    }

    public int getStudentId () {
        return studentId;
    }

    public void setStudentId (int studentId) {
        System.out.println("Setting student id");
        this.studentId = studentId;
    }

    public String getStudentName () {
        return studentName;
    }

    public void setStudentName (String studentName) {
        System.out.println("Setting student name");
        this.studentName = studentName;
    }

    public String getStudentCity () {
        return studentCity;
    }

    public void setStudentCity (String studentCity) {
        System.out.println("Setting student city");
        this.studentCity = studentCity;
    }

    @Override
    public String toString () {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
