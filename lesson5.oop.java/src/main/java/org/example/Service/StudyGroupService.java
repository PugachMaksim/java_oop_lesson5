package org.example.Service;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;



import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;

    public void createSG(Teacher teacher, List<Student> studentgroup){
        this.studyGroup = new StudyGroup(teacher, studentgroup);
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
    public List<Student> studentgroup(){
        return studyGroup.getStudentgroup();
    }
    public void getTeacher(){
        studyGroup.getTeacher();
    }


    public List<Student> getStudentgroup() {
        return studyGroup.getStudentgroup();
    }
}
