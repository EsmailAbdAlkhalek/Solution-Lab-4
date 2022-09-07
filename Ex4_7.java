
package ex4_7;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;



class SqComp extends JComponent  
{
    private static final long serialVersionUID = 1L;
        
public void paint(Graphics sq)
   {
       sq.setColor(Color.PINK);
       sq.fillRect(20, 20, 95, 95);

       sq.setColor(new Color(0.7F, 0, 0.7F));
       sq.fillRect(100, 100, 50, 50);
   }
}

public class Ex4_7 {
    

    public static void main(String[] args) {
        
        JFrame win = new JFrame();

        win.setSize(400, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        win.add(new SqComp());

        win.setVisible(true);
   }
}




        
    
    

