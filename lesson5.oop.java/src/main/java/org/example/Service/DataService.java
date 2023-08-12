package org.example.Service;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.Type;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public List<User> getUsersAll() {
        return userList;
    }
    public List<User> getStudentAll(){
        List<User> resultList = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student){
                resultList.add(user);
            }
        }
        return resultList;
    }
    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeId(type);
        if (Type.STUDENT == type){
            Student student = new Student(lastName, firstName, secondName, id);
            userList.add(student);
        }
        if (Type.TEACHER == type){
            Teacher teacher = new Teacher(lastName, firstName, secondName, id);
            userList.add(teacher);
        }
    }
    public User getUserId(Type type, int id){
        User resultUser = null;
        boolean isStudent = Type.STUDENT == type;
        for (User user: userList) {
            if (isStudent && user instanceof Student && ((Student) user).getStudentId() == id){
                resultUser = user;
            }
            if (!isStudent && user instanceof Teacher && ((Teacher) user).getTeacherId() == id){
                resultUser = user;
            }
        }
        return resultUser;
    }
    private int getFreeId(Type type){
        int lastId = 1;
        boolean isStudent = Type.STUDENT == type;
        for (User user: userList) {
            if (isStudent && user instanceof Student){
                lastId = ((Student) user).getStudentId() + 1;
            }
            if (!isStudent && user instanceof Teacher){
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }
}
