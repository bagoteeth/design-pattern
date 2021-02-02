package com.jrf.designPattern.MVC;

/**
 * @Author ruofa
 * @Date 2021/2/1 18:41
 */
public class Test {
    public static void main(String[] args) {
        Student student=getFromDB();
        StudentView studentView=new StudentView();

        StudentController studentController=new StudentController(student,studentView);
        studentController.updateView();
        studentController.setName("bago");
        studentController.updateView();
    }
    public static Student getFromDB(){
        Student student=new Student();
        student.setId(1);
        student.setName("teeth");
        student.setAge(20);
        return student;
    }
}
