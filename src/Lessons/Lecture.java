package Lessons;

public class Lecture {
    private int lectureID;
    private static int count;
    public int courseID;

    public Lecture ( int lectureID){
        count ++;
        this.lectureID = lectureID;
        System.out.println("Id Lecture- "+ lectureID );
    }

    public Lecture ( int courseID, int lectureID){
        count ++;
        this.lectureID = lectureID;
        this.courseID = courseID;
//        System.out.println("Id Curs- "+ IDCurs + " Id Lecture- "+ IDLecture );
    }




    public static void printCount(){
        System.out.println("Всего было создано объектов лекций = " + count );
    }
    public void printLecture(){
        System.out.println("Id Curs - "+ courseID + " | Id Lecture - "+ lectureID);
    }
}