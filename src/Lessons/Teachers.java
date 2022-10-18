package Lessons;

public class Teachers {

    private static int id;
    private String firstName;
    private String nameCourse;

    public Teachers(int id, String firstName, String nameCourse) {
        this.id = id;
        this.firstName = firstName;
        this.nameCourse = nameCourse;

    }
    public void printT(){
        System.out.println("Id Teacher-"+ id+ " Name-"+ firstName + " Course#-" + nameCourse);
    }
}