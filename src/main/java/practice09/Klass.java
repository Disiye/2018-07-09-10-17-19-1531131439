package practice09;

public class Klass {

    private int number;
    private String displayName;
    private Student leader;

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
    }

    public String getDisplayName() { return displayName; }

    public int getNumber() { return number; }

    public void assignLeader(Student student) {
        if (number == student.getKlass().number) {
            leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() { return leader; }

    public void appendMember(Student student) { student.setKlass(this); }
}