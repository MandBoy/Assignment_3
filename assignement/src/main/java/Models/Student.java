package Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student{
    private int semester;

    public Student(){}
    public Student(int semester){
        this.semester = semester;
    }
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
}
