package org.example.controller;


import org.example.Service.DataService;
import org.example.Service.StudyGroupService;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.Type;
import org.example.model.User;
import org.example.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    StudentView view = new StudentView();
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public void getAllStudent(){
        List<User> userList = dataService.getStudentAll();
        for (User user: userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    StudyGroupService studyGroupService = new StudyGroupService();
    public void createStudyGroup(Teacher teacher, List<Student> studentgroup){
        studyGroupService.createSG(teacher, studentgroup);
    }
    public void getStudentId(){
        List<Student>studentgroup = studyGroupService.getStudentgroup();
        for (Student student: studentgroup) {
            System.out.println("StudentId: " + student.getStudentId());
        }
    }
    public void getTeacherId(){
        studyGroupService.getTeacher();
    }
}