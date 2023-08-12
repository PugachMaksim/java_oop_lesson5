package org.example.model;

import java.util.List;

public class StudyGroup {
    private List<Student>studentgroup;
    private Teacher teacher;

    public StudyGroup(Teacher teacher, List<Student> studentgroup) {
        this.studentgroup = studentgroup;
        this.teacher = teacher;
    }

    public List<Student> getStudentgroup() {
        return studentgroup;
    }

    public void setStudentgroup(List<Student> studentgroup) {
        this.studentgroup = studentgroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }





}
