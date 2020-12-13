package bsu.rfe.java.group6.lab1.Burvan.varB3;

public class Milk extends Food implements Nutritious {

    private String fat;

    public Milk(String fat) {
        super("Молоко");
        this.fat = fat;
    }
    @Override
    public void consume() {
        System.out.println(this + " выпито "+ " каллорий " + calculateCalories());
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
        return super.toString() + " жирность " + fat.toUpperCase();
    }
    public int calculateCalories() {
        if (this.fat == null) {
            return 0;
        }
        switch (this.fat.toLowerCase()) {
            case "1.5%":
                return 44;
            case "2.5%":
                return 52;
            case "5%":
                return 64;
            default: return 0;
        }
    }
}


