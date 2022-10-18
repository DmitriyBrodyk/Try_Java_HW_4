package Services;

import Lessons.Teachers;

public class ServiceTeachers {
    public static void main(String[] args) {
        Teachers tch1 = new Teachers(1,"Lisa", " English");
        Teachers tch2 = new Teachers(112, "Luise", " Math");
        tch1.printT();
        tch2.printT();
    }
}