public class Student {
    private final String name;
    private int score;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void showStudent() {
        System.out.println("我是学生" + getName());
        System.out.println("我的成绩是" + getScore()+ "分");
    }
}
