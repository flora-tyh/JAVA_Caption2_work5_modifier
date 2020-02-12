import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

      Student stu1 = new Student("Cindy", 80);
      Student stu2 = new Student("Mary", 95);

      ArrayList<Student> studentsOfTeacher1 = new ArrayList<>();
      ArrayList<Student> studentsOfTeacher2 = new ArrayList<>();

      studentsOfTeacher1.add(stu2);
      studentsOfTeacher2.add(stu1);

      Teacher tec1 = new Teacher("Solider", studentsOfTeacher1);
      Teacher tec2 = new Teacher("Bob", studentsOfTeacher2);

      stu1.showStudent();
      stu2.showStudent();
      System.out.println("============================");

      tec1.addScore();
      tec2.addScore();

      stu1.showStudent();
      stu2.showStudent();
      System.out.println("============================");

      tec1.showTeacher();
      tec2.showTeacher();
    }

}
