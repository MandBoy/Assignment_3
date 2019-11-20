package Models;

import javax.persistence.Entity;
import java.util.LinkedList;

@Entity
public class Class{
    private int id;
    private String name;
    private Teacher teacher;
    private String description;
    private String requirements;
    private int minStudents;
    private int maxStudents;
    private LinkedList<Student> students;

    public Class(int id, String name, Teacher teacher, String description, String requirements, int minStudents, int maxStudents, LinkedList<Student> students){
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.description = description;
        this.requirements = requirements;
        this.minStudents = minStudents;
        this.maxStudents = maxStudents;
        this.students = students;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getRequirements() {
        return requirements;
    }
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
    public int getMinStudents() {
        return minStudents;
    }
    public void setMinStudents(int minStudents) {
        this.minStudents = minStudents;
    }
    public int getMaxStudents() {
        return maxStudents;
    }
    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
    public LinkedList<Student> getStudents() {
        return students;
    }
    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }
}
