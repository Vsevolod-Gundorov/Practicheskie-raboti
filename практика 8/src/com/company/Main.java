package com.company;
public class Main {

    public static void main(String[] args) {
        WaitList<Integer> lst1 = new BoundedWaitList<Integer>(5);
        lst1.add(1);
        lst1.add(3);
        lst1.add(77);
        lst1.add(14);
        System.out.print("Correct List: " + lst1.content + "\n");

        WaitList<Integer> lst2 = new BoundedWaitList<>(3);
        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst2.add(4);
        lst2.add(5);
        System.out.print("Uncorrect List(only elements with capacity = 3): " + lst2.content + "\n");

        WaitList<Integer> lst3 = new UnfairWaitList<>();
        lst3.content.add(4);
        lst3.content.add(2);
        lst3.content.add(6);
        System.out.print("Full list " + lst3.content + "\n");
        lst3.content.remove(2);
        lst3.content.remove(6);
        System.out.print("List with removes elements: " + lst3.content + "\n");

        WaitList<Integer> lst4 = new WaitList<Integer>();
        lst4.content.add(1);
        lst4.content.add(8);
        lst4.content.add(3);
        lst4.content.add(12);
        lst4.content.add(5);
        System.out.print("Current List: " + lst4.content + "\n");
        lst4.content.remove(12);
        System.out.print("Current List: " + lst4.content + "\n");
        System.out.print("List Contains 5 " + lst4.content.contains(5) + "\n");


        System.out.print("List is empty - " + lst4.content.isEmpty() + "\n");

    }
}