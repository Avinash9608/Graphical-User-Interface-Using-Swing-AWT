
package in.scalive.gui.awt;

import java.awt.Frame;
import java.util.Date;


public class Example2 {
    public static void main(String [] args)
    {
        Frame fr=new Frame();
        Date d=new Date();
        String str=d.toString();
         fr.setTitle(str); 
//        fr.setTitle("Avinash's Frame");
        fr.setBounds(50,50,400,300);
        fr.setVisible(true);
    }
}
