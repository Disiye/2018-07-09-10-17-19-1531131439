package practice04;

public class Worker {
    private String name;
    private int age;
    public Worker(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is Tom. I am 21 years old. I am a Worker. I have a job.";
    }
}
