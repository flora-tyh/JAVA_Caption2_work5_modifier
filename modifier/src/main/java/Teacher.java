import java.util.ArrayList;

public class Teacher {
    private final String name;
    private ArrayList<Student> students;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addScore() {
        for (Student stu : getStudents()) {
            stu.setScore(stu.getScore() + 5);
        }
    }

    public void showTeacher() {
        System.out.println("我是老师" + getName());
        System.out.println("我的学生有");
        for (Student stu : getStudents()) {
            System.out.println(stu.getName() + ",成绩是" + stu.getScore());
        }
    }
}
