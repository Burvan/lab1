package bsu.rfe.java.group6.lab1.Burvan.varB3;

public class Milk extends Food   {

    private String fat;

    public Milk(String fat) {
        super("������");
        this.fat = fat;
    }
    @Override
    public void consume() {
        System.out.println(this + " ������ ");
    }

    public String getFlavour() {
        return fat;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Milk)) return false;
            return fat.equals(((Milk)arg0).fat);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " �������� " + fat.toUpperCase();
    }
}


