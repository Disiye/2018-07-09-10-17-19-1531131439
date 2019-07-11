package practice08;

public class Person {
    private int id;
    private String name;
    private int age;
    public Person(int id, String name, int age) {
        this.age = age;
        this.name= name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object object){
        return object instanceof Person;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
