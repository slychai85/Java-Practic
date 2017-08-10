package Practic_JUnit;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Exams {
    private String nameExam;
    private int score;
//    private Date data;
//
//    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
//
//    public Exams(String nameExam, int score, String data) {
//        setNameExam(nameExam);
//        setScore(score);
//        try {
//            setData(format.parse(data));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }


    public Exams(String nameExam, int score) {
        this.nameExam = nameExam;
        this.score = score;
    }
}
