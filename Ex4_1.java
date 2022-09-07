
package ex4_1;

import java.awt.Rectangle;

public class Ex4_1 {
  
   

    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(5, 10, 20, 30);
        double perimeter = 2 * r1.getWidth() + 2 * r1.getHeight();
		
        System.out.println("perimeter: " + perimeter);
       
        
    }
    
}
