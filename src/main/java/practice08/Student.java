package practice08;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. " + getKlassDescription();
    }

    private String getKlassDescription(){
        String klassDescription = null;
        if(klass.getLeader() == this){
            klassDescription = "I am Leader of ";
        }else{
            klassDescription = "I am at ";
        }
        return klassDescription + "Class 2.";
    }
}
