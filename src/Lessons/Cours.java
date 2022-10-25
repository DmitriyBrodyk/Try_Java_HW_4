package Lessons;

public class Cours {
    public int  IDCurs;
    private String nameCours;
    private Teachers teacher;
    private Students students;
    private Lecture lectures;
    private HomeWork homeWOrk;
    private AddTask addTask;

    public Cours(){
    }

    public Cours(int IDCurs){
        this.IDCurs = IDCurs;
//        System.out.println("Id Cours- "+ IDCurs);
    }

}