package Models;

import javax.persistence.Entity;

@Entity
public class Student{
    private int id;
    private String name;
    private int semester;

    public Student(){}
    public Student(int id, String name, int semester){
        this.id = id;
        this.name = name;
        this.semester = semester;
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
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
}
