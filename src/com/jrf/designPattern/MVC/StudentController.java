package com.jrf.designPattern.MVC;

/**
 * @Author ruofa
 * @Date 2021/2/1 18:33
 */
public class StudentController {
    Student student;
    StudentView studentView;
    public StudentController(Student student,StudentView studentView){
        this.student=student;
        this.studentView=studentView;
    }

    public long getId() {
        return student.getId();
    }

    public void setId(long id) {
        student.setId(id);
    }

    public String getName() {
        return student.getName();
    }

    public void setName(String name) {
        student.setName(name);
    }

    public int getAge() {
        return student.getAge();
    }

    public void setAge(int age) {
        student.setAge(age);
    }
    public void updateView(){
        studentView.showStudent(student.getId(),student.getName(),student.getAge());
    }
}
