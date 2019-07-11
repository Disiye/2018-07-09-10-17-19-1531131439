package practice08;

public class Klass {
    private int number;
    private Student leader;

    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public Student getLeader() {
        return this.leader;
    }
}
