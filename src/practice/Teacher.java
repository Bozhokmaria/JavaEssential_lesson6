package practice;

public class Teacher {
   private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "teacher - " + name;
    }
}
