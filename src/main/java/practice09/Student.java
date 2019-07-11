package practice09;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() { return klass; }

    public void setKlass(Klass klass) { this.klass = klass; }

    @Override
    public String introduce(){
        String introduceString = super.introduce() + " I am a Student.";
        if (this.equals(klass.getLeader())) {
            introduceString += " I am Leader of Class " + klass.getNumber() + ".";
        } else {
            introduceString += " I am at Class " + klass.getNumber() + ".";
        }
        return introduceString;
    }
}
