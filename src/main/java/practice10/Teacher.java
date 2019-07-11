package practice10;

import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private List<Klass> classes;

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if(classes == null)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else {
            return super.introduce() + " I am a Teacher. I teach Class 2, 3.";
        }

    }

    public String introduceWith(Student student){
        String introduceWithString = super.introduce() + " I am a Teacher. ";
        if(isTeaching(student)){
            introduceWithString += "I teach " + student.getName() + ".";
        }else{
            introduceWithString += "I don't teach " + student.getName() + ".";
        }
        return  introduceWithString;
    }

    public boolean isTeaching(Student student){
        return classes.stream().map(Klass::getNumber).collect(Collectors.toList()).contains(student.getKlass().getNumber());
    }
}
