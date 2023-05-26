package java_week_2_writing_hw_ankur;

import java.util.Scanner;

public class Programme_14_AreaAndPerimeter {
    //Calculating area and perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(int height, int width){
        int perimeter = 2 * (height + width);
        int area =  (height * width);
        System.out.println("The area of the rectangle is : "+ area);
        System.out.println("The perimeter to the rectangle is: "+ perimeter);
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of rectangle:  ");
        int height = scanner.nextInt();
        System.out.println("Enter the height pf the rectangle:  ");
        int width = scanner.nextInt();
        areaAndPerimeterOfRectangle(height, width);
        // closing the scanner object
        scanner.close();
    }
}
