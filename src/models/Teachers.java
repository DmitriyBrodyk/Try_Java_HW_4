package models;

public class Teachers {

    private static int id;

    public Teachers(int id) {
        this.id = id;

    }
    public void printT(){
        System.out.println("Id Teacher-"+ id);
    }
}