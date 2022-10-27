package Services;

import models.Teachers;

public class ServiceTeachers {
    public static void main(String[] args) {
        Teachers tch1 = new Teachers(1);
        Teachers tch2 = new Teachers(112);
        tch1.printT();
        tch2.printT();
    }
}