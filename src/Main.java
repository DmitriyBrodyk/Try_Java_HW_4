import models.Course;
import models.Lecture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер необходимой категории:");
            System.out.println("1 - Курс");
            System.out.println("2 - Лекции  ");
            System.out.println("3 - Студенты");
            System.out.println("4 - Преподователи");
            System.out.println("5 - Закончить программу");

            int genre = scanner.nextInt();

            //choose category
            switch (genre)
            {
                // Category Course
                case 1:
                    System.out.println("Выбронна категория |Курс| ");
                    System.out.println("Дополнительно выберите: 1 - Преподователь, 2 - Студент, 3 - Лекция, 4 - закончить программу");
                    int genre1 = scanner.nextInt();

                    //second level of Course
                    switch (genre1)
                    {
                        case 1:
                            System.out.println("Дополнительно выбронна  категория |Преподователь|");
                            break;
                        case 2:
                            System.out.println("Дополнительно выбронна категория |Студент|");
                            break;
                        case 3:
                            System.out.println("Дополнительно выбронна  категория |Лекция|");
                            System.out.println("Жилаете создать новую лекцию?");
                            System.out.println("1 - Да");
                            System.out.println("2 - Нет");
                            int genre2 = scanner.nextInt();

                            //choose make new Lecture or no
                            switch (genre2)
                            {
                                // make new Lecture
                                case 1:
                                    System.out.println("Введите id Курса - ");
                                    int curseIDInside = scanner.nextInt();
                                    System.out.println("Введите id Лекции - ");
                                    int lectureIDInside = scanner.nextInt();
                                    Lecture lecture = new Lecture(curseIDInside, lectureIDInside);
                                    System.out.println("id Курса " + lecture.courseID + " id Лекции " + lecture.lectureID);
                                    System.out.println("Создать еще?");
                                    System.out.println("1 - Yes ");
                                    System.out.println("2 - No ");
                                    int genre23 = scanner.nextInt();
                                    Lecture.cikl(genre23);
                                    break;

                                //Exit program
                                case 2:
                                    System.out.println("Конец");
                                    break;
                            }
                            break;
                        case 4:
                            a=8;
                            break;
                        default:
                            System.out.println("Что-то пошло не так, попробуйте ввести корректное число");
                            break;
                    }
                    break;
                // main category of Lecture
                case 2:
                    System.out.println("Выбронна категория |Лекции| ");
                    System.out.println("Жилаете создать новую лекцию?");
                    System.out.println("1 - Да");
                    System.out.println("2 - Нет");
                    int genre2 = scanner.nextInt();

                    //choose make new Lecture or no
                    switch (genre2)
                    {
                        // make new Lecture
                        case 1:
                            System.out.println("Введите id Курса - ");
                            int curseIDInside = scanner.nextInt();

                            System.out.println("Введите id Лекции - ");
                            int lectureIDInside = scanner.nextInt();

                            Lecture lecture = new Lecture(curseIDInside, lectureIDInside);

                            System.out.println("id Курса " + lecture.courseID + " id Лекции " + lecture.lectureID);
                            System.out.println("Создать еще?");
                            System.out.println("1 - Yes ");
                            System.out.println("2 - No ");
                            int genre23 = scanner.nextInt();
                            Lecture.cikl(genre23);
                            break;
                        case 2:
                            System.out.println("Конец");
                            break;
                        default:
                            System.out.println("Что-то пошло не так, попробуйте ввести корректное число");
                            break;

                    }
                    break;
                // main choose students
                case 3:
                    System.out.println("Выбронна категория |Студенты| ");
                    break;
                // main choose teacher
                case 4:
                    System.out.println("Выбронна категория |Преподователи| ");
                    break;
                case 5:
                    //Exit program
                    a=8;
                    break;
                    //controll of corrects numbers
                default:
                    System.out.println("Что-то пошло не так, попробуйте ввести корректное число");
                    break;

            }
        a++;

        }while(a<8);
    }
}























// 1
//        Course course1 = new Course(33);
//        Lecture math1 = new Lecture( course1.courseID,1);
//        // 2
//        Lecture math2 = new Lecture( 2,2);
//        //3
//        Lecture math3 = new Lecture( 3,3);
//        //4
//        Lecture math4 = new Lecture( 4,4);
//        //5
//        Lecture math5 = new Lecture( 5,5);
//        //6
//        Lecture math6 = new Lecture(666, 6);
//        math6.printLecture();
//        Lecture.printCount();
//Course course1 = new Course();
//    Course course2 = new Course();
//    Course course3 = new Course();
////        course3.printCountCourseID;
//        System.out.println("Всего было создано объектов лекций = " + course3.courseID);