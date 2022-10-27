package models;

import java.util.Scanner;

public class Lecture {
    public static int lectureID;
    private static int count;
    private static int countLecture = 2;
    public static int courseID;

    public Lecture ( int lectureID){
        count ++;
//        this.lectureID = lectureID;
//        System.out.println("Id Lecture- "+ lectureID );
    }
    public Lecture ( int courseID, int lectureID){
        count ++;
        this.courseID = courseID;
        this.lectureID = lectureID;

//        System.out.println("Id Lecture- "+ lectureID );
    }

    public Lecture (){
        count ++;
        lectureID ++;
        courseID++;
//        System.out.println("Id Curs- "+ IDCurs + " Id Lecture- "+ IDLecture );
    }
         static Scanner scanner = new Scanner(System.in);

    public static void cikl(int genre23){
            while (genre23<= 1){
                System.out.println("Lecture #= " + countLecture++);
                System.out.println("Введите id Курса - ");
                int curseIDInside = scanner.nextInt();

                System.out.println("Введите id Лекции - ");
                int lectureIDInside = scanner.nextInt();

                Lecture lecture = new Lecture(curseIDInside,lectureIDInside );

                System.out.println("id Курса "+ lecture.courseID  + " id Лекции " + lecture.lectureID);
                System.out.println(" ");
                System.out.println("Создать еще?");
                System.out.println("1 - Yes ");
                System.out.println("2 - No ");
                int genre233 = scanner.nextInt();
                switch (genre233){
                    case 1:
                        cikl(1);
                    case 2:
                        genre23=3;
                        System.out.println("Конец");
                        break;
                    default:
                        genre23=3;
                        System.out.println("Конец");
                        break;

                }

            }
        }



    public static void printCount(){
        System.out.println("Всего было создано объектов лекций = " + count );
    }
    public void printLecture(){
        System.out.println("Id Curs - "+ courseID + " | Id Lecture - "+ lectureID);
    }
}