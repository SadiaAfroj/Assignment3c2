package PerimeterTester.java;

public class PerimeterTesterRuner {
    public static void main(String[]args){
        PerimeterTester rectangle=new PerimeterTester(24.6,17.97);
        double perimeter=(rectangle.getHeight()*2)+(rectangle.getWidth()*2);
        System.out.println(perimeter);
    }
}
