package practice05;

public class Student {
    private String name;
    private int age;
    private int klass;
    public Student(String name, int age, int klass) {
        this.age = age;
        this.klass = klass;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return "My name is Tom. I am 21 years old. I am a Student. I am at Class 2.";
    }
}
