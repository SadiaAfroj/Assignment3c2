package RectangleArea.java;

public class RectangleAreaRunner {
    public static void main(String[]args){
        RectangleArea rectangle=new RectangleArea(16,21);
        double area=rectangle.getHight()*rectangle.getWidth();
        System.out.println(area);
    }
}
