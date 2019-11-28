package Models;

import javax.persistence.Entity;
import java.util.LinkedList;

@Entity
public class Klasse{
    private int id;
    private String name;
    private LinkedList<Teacher> teachers;
    private String description;
    private String requirements;
    private int minStudents;
    private int maxStudents;
    private LinkedList<Student> students;

    public Klasse(int id, String name, LinkedList<Teacher> teachers, String description, String requirements, int minStudents, int maxStudents, LinkedList<Student> students){
        this.id = id;
        this.name = name;
        this.teachers = teachers;
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
    public LinkedList getTeacher() {
        return teachers;
    }
    public void setTeacher(LinkedList<Teacher> teachers) {
        this.teachers = teachers;
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
