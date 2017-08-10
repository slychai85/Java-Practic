package Practic_JUnit;

import lombok.Data;

@Data
public class Group {
    private int course;
    private String faculty;

    public Group(int i, String psy) {
        setCourse(i);
        setFaculty(psy);
    }
}
