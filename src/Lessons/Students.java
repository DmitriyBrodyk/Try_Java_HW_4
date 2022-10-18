package Lessons;

public class Students {
    private String firstName;
    private int Id;
    private int numberCourses;
    private String namesOfCourses;

    public Students(int Id, String firstName, int numberCourses, String namesOfCourses){
        this.Id = Id;
        this.firstName = firstName;
        this.numberCourses = numberCourses;
        this.namesOfCourses = namesOfCourses;
    }
    public void printS(){
        System.out.println("Id Student-"+ Id+ " Name-"+ firstName + " Course#-" + numberCourses+" Course(s): "+ namesOfCourses);
    }
}