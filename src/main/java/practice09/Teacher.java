package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() { return klass; }

    @Override
    public String introduce() {
        String introduceString = super.introduce() + " I am a Teacher. ";
        if(klass == null){
            introduceString += "I teach No Class.";
        } else{
            introduceString += "I teach Class " + klass.getNumber() + ".";
        }
        return introduceString;
    }

    public String introduceWith(Student student){
        String introduceWithString = super.introduce() + " I am a Teacher. ";
        if(student.getKlass().getNumber() == klass.getNumber()){
            introduceWithString += "I teach " + student.getName() + ".";
            introduceWithString += "I don't teach " + student.getName() + ".";
        }
        return introduceWithString;
    }
}
