package Lessons;

public class Lecture {
    private int IDLecture;
    private static int count;
    public int IDCurs;

    public Lecture ( int IDLecture){
        count ++;
        this.IDLecture = IDLecture;
        System.out.println("Id Lecture- "+ IDLecture );
    }

    public Lecture ( int IDCurs, int IDLecture){
        count ++;
        this.IDLecture = IDLecture;
        this.IDCurs = IDCurs;
//        System.out.println("Id Curs- "+ IDCurs + " Id Lecture- "+ IDLecture );
    }




    public static void printCount(){
        System.out.println("Всего было создано объектов лекций = " + count );
    }
    public void printLecture(){
        System.out.println("Id Curs - "+ IDCurs + " | Id Lecture - "+ IDLecture);
    }
}