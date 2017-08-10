package Practic_JUnit;

import lombok.Data;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Data
public class Student {
    private String name;
    private String surname;
    private Group group;
    private List<Exams> exams;

    public Student(String name, String surname, int course, String faculty, List<Exams> exams) {
        this.name = name;
        this.surname = surname;
        this.group = new Group(course, faculty);
        this.exams = exams;
    }

    public int maxScore(String nameExam) {
        int maxScore = 0;
        for(Exams s : exams) {
            if(s.getNameExam().equals(nameExam)) {
                if(s.getScore() > maxScore) {
                    maxScore = s.getScore();
                }
            }
        }
        return maxScore;
    }

    public void scoreExams(String nameExams, int score) {
        Exams s = new Exams(nameExams, score);
        exams.add(s);
    }

    public void deleteScoreExams(String nameExams, int score) {
        int i = 0;
        for(Exams s : exams) {
            if(s.getNameExam().equals(nameExams)) {
                if(s.getScore() == score) {
                    exams.remove(i);
                    break;
                }
            }
            i++;
        }
//        if(exams.size() == (i+1)) {
//            throw new NoExams;
//        }
    }

    public int markExams(int score) {
        int i = 0;
        for(Exams s : exams) {
            if(s.getScore() == score) {
                i++;
            }
        }
        return i;
    }


}
