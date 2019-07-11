package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass(){
        return klass;
    }

    public String introduce(){
        String introduceString = null;
        if(klass == null){
            introduceString = "No Class";
        }else {
            introduceString = klass.getDisplayName();
        }
        return super.introduce() + " I am a Teacher. I teach " + introduceString + ".";
    }

    public String introduceWith(Student student) {
        String teachDescribe = student.getKlass().getNumber() == klass.getNumber() ? "I teach " + student.getName() + "." : "I don't teach " + student.getName() + ".";
        return super.introduce() + " I am a Teacher. " + teachDescribe;
    }
}
