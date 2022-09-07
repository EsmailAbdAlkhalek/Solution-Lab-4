
package ex4_8;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

class NameComp extends JComponent
{
   private static final long serialVersionUID = 1L;

   public void paint(Graphics n)
   {
      n.setColor(Color.BLUE);
      n.drawRect(25, 25, 100, 50);
      
      n.setColor(Color.RED);
      n.drawString("ismail mofareh", 35, 45);
   }
}

public class Ex4_8 {

    
    
    public static void main(String[] args) {
       
        JFrame win = new JFrame();
      
        win.setSize(400, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        win.add(new NameComp());
        win.setVisible(true);
   }
}


