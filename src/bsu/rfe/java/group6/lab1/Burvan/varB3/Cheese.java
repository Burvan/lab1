package bsu.rfe.java.group6.lab1.Burvan.varB3;

public class Cheese extends Food implements Nutritious {

    public Cheese() {
        super("ׁûנ");

    }
    public void consume() {
        System.out.println(this.name + " סתוהום"+" ךאככמנטי "+calculateCalories());
    }

    @Override
    public int calculateCalories() {
        return 50;
    }
}
