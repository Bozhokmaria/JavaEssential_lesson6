package task2;

import java.util.ArrayList;

public class Zoo2 {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList();
        zoo.add("lion");
        zoo.add("monkey");
        zoo.add("snakes");
        zoo.add("bear");
        zoo.add("peacock");
        zoo.add("penguin");
        zoo.add("horse");
        zoo.add("swan");

        System.out.println("size before remove = "+zoo.size());



        for (String animal : zoo) {
            System.out.println(animal);
        }

        zoo.remove("snakes");
        zoo.remove("peacock");
        zoo.remove("horse");


        System.out.println("size after remove = "+zoo.size());

        System.out.println(zoo);
    }
}
