package models;

public class Course {
    public static int  courseID;
    private String nameCours;
    private Teachers teacher;
    private Students students;
    private Lecture lectures;
    private HomeWork homeWOrk;
    private AddTask addTask;

    public Course(){
        courseID++;
    }
//    public static void printCountCourseID(){
//        System.out.println("Всего было создано объектов лекций = " + courseID );
//    }

//    public Course(int IDCurs){
//        this.courseID = IDCurs;
//        courseID++;
////        System.out.println("Id Cours- "+ IDCurs);
//    }

}