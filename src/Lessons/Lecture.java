package Lessons;

public class Lecture {
    private int Id;
    private int numberLecture;
    private String nameLecture;
    private  String homeWork;
    private  String homeWorkStuff;
    private static int count;

    public Lecture (int Id, String nameLecture,int numberLecture, String homeWork, String homeWorkStuff){
        count ++;
        this.Id = Id;
        this.nameLecture = nameLecture;
        this.numberLecture = numberLecture;
        this.homeWork = homeWork;
        this.homeWorkStuff = homeWorkStuff;
        System.out.println("Id Lecture-"+ Id+ " Lesson-"+ numberLecture + " " + nameLecture + " / " + homeWork +" / "+ homeWorkStuff + "  Лічільник= "+ count);
    }
    public static void printQ(){
        System.out.println("Всего было создано объектов= " + count);
    }
}