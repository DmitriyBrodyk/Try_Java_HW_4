package Lessons;

public class Course {
    public int  courseID;
    private String nameCours;
    private Teachers teacher;
    private Students students;
    private Lecture lectures;
    private HomeWork homeWOrk;
    private AddTask addTask;

    public Course(){
    }

    public Course(int IDCurs){
        this.courseID = IDCurs;
//        System.out.println("Id Cours- "+ IDCurs);
    }

}