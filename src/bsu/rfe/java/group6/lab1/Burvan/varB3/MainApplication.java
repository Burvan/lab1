package bsu.rfe.java.group6.lab1.Burvan.varB3;



import java.util.ArrayList;
import java.util.List;

public class  MainApplication {
    public static void main(String[] args) throws Exception {

        Cheese cheese = new Cheese();

        Milk milk1_5 = new Milk("1.5%");
        Milk milk2_5 = new Milk("2.5%");
        Milk milk5 = new Milk("5%");
        
        
        Apple appleSmall = new Apple("�����");
        Apple appleMiddle = new Apple("�������");
        Apple appleBid = new Apple("�������");

        List<Food> foodList = new ArrayList<>(20);

        for (String arg : args) {
            String[] parts = arg.split("/");
            switch (parts[0]) {
            case "Cheese":
                foodList.add(new Cheese());
                break;
            case "Apple":
                foodList.add(new Apple(parts[1]));
                break;
            case "Milk":
                foodList.add(new Milk(parts[1]));
                break;
            default:
                System.out.println("������ �������� ���");
                }
        }
        int appleSmallCount = 0;
        int appleMiddleCount = 0;
        int appleBigCount = 0;
        int cheesCount = 0;
        int milk1_5Count = 0;
        int milk2_5Count = 0;
        int milk5Count = 0;
     
        for (int i =0 ; i < foodList.size(); i++){
            if (cheese.equals(foodList.get(i))){
                cheesCount++;
            }
            if (appleSmall.equals(foodList.get(i))){
                appleSmallCount++;
            }
            if (appleMiddle.equals(foodList.get(i))){
                appleMiddleCount++;
            }
            if (appleBid.equals(foodList.get(i))){
                appleBigCount++;
            }
            if (milk1_5.equals(foodList.get(i))){
            	milk1_5Count++;
            }
            if (milk2_5.equals(foodList.get(i))){
            	milk2_5Count++;
            }
            if (milk5.equals(foodList.get(i))){
            	milk5Count++;
            }
            
        }

        for (Food item : foodList) {
            if (item != null) {
                item.consume();
            } else
                break;
        }
        if (cheesCount > 0)       System.out.println("�� ����� ��� � ���������� " + cheesCount );
        if (appleBigCount > 0)    System.out.println("�� ����� ������ �������� ������� � ���������� " + appleBigCount );
        if (appleMiddleCount > 0) System.out.println("�� ����� ������ �������� ������� � ���������� " + appleMiddleCount );
        if (appleSmallCount > 0)  System.out.println("�� ����� ������ �������� ����� � ���������� " + appleSmallCount );
        if (milk1_5Count > 0)   System.out.println("�� ������ ������ ������� 1.5% � ���������� " + milk1_5Count );
        if (milk2_5Count > 0)   System.out.println("�� ������ ������ ������� 2.5% � ���������� " + milk2_5Count );
        if (milk5Count > 0)   System.out.println("�� ������ ������ ������� 5% � ���������� " + milk5Count );

        System.out.println("����� ��������!");
        }
    }

