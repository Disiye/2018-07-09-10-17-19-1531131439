package practice07;

public class Teacher extends Person{
    private Klass klass ;
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass(){
        return this.klass;
    }

    public String introduce(){
        String introduceString = null;
        if(this.klass == null) {
            introduceString = "I am a Teacher. I teach No Class.";
        }else {
            introduceString = "I am a Teacher. I teach Class 2.";
        }
        return super.introduce() + introduceString;
    }

    public String introduceWith(Student student) {
        String introduceWithString = null;
        if(this.klass == student.getKlass()){
            introduceWithString = "I teach Jerry.";
        }else {
            introduceWithString = "I don't teach Jerry.";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. " + introduceWithString;
    }
}
