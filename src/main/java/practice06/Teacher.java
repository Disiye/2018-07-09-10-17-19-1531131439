package practice06;

public class Teacher extends Person{
    private int klass = 0;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass(){
        return klass;
    }

    public String introduce(){
        String introduce = null;
        if(klass == 0){
            introduce = "No Class";
        }else {
            introduce = "Class " + klass;
        }
        return super.introduce() + " I am a Teacher. I teach " + introduce + ".";
    }
}
