package task3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(12);
        nums.add(55);
        nums.add(121);
        nums.add(43);
        nums.add(23);

        System.out.println(nums);

        ListIterator <Integer> iterator = nums.listIterator();

        int i = 0;

        while (iterator.hasNext()){
           nums.set(iterator.nextIndex(), nums.get(i++) +1);
           System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(nums);


    }
}
