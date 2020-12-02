package task4;

import java.util.ArrayList;

public class MethodsArray {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("homework");
        tasks.add("cleaning");
        tasks.add("work");
        tasks.add("learning");
        tasks.add(1, "sleep");
        tasks.remove(1);
        tasks.remove("work");

        System.out.println(tasks);

        System.out.println(tasks.get(2));

        tasks.set(2, "sleep");

        System.out.println(tasks);

        System.out.println(tasks.size());

        System.out.println(tasks.indexOf("sleep"));

        System.out.println(tasks.contains("homework"));

        String[] arrTasks = tasks.toArray(new String[0]);

        for (String task :arrTasks) {
            System.out.print(task + " ");
        }





    }
}
