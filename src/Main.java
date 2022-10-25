import Lessons.Course;
import Lessons.Lecture;

public class Main {
    public static void main(String[] args) {
        // 1
        Course course1 = new Course(33);
        Lecture math1 = new Lecture( course1.courseID,1);
        // 2
        Lecture math2 = new Lecture( 2,2);
        //3
        Lecture math3 = new Lecture( 3,3);
        //4
        Lecture math4 = new Lecture( 4,4);
        //5
        Lecture math5 = new Lecture( 5,5);
        //6
        Lecture math6 = new Lecture(666, 6);
        math6.printLecture();



        Lecture.printCount();
    }
}