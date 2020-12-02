package practice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Teacher> arrayList = new ArrayList<>();
        Teacher t1 = new Teacher("Инна Марковна");
        Teacher t2 = new Teacher("Зоя Михайловна");
        Teacher t3 = new Teacher("Наталия Олександровна");
        Teacher t4 = new Teacher("Нина Николаевна");

        arrayList.add(t1);
        arrayList.add(t2);
        arrayList.add(t3);
        arrayList.add(t4);


        for (Teacher teacher: arrayList) {
            System.out.println(teacher);
        }

        System.out.println(arrayList);

        System.out.println("Лучший учитель  под индексом - " + arrayList.indexOf(t1));
        System.out.println("Учитель под индексом - " + arrayList.indexOf(t3));
    }
}
