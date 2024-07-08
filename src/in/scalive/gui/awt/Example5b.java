/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scalive.gui.awt;

/**
 *
 * @author HP
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class MyFrame5 extends Frame implements ActionListener
{
    Button b1,b2;
    public MyFrame5(String title)
    {
        super(title);
        b1=new Button("Close Frame");
        b2=new Button("Change Color");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        CloseFrame obj=new CloseFrame();
        b1.addActionListener(obj);
        b2.addActionListener(this);  // this is a refrance it show the current 
        setBounds(40,40,500,500);
        setVisible(true);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.YELLOW);
    }

}
    class CloseFrame1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
    }

// This gives error because setBackground is the method of component and it comes with frame so that why it show error
//class ChangeColor implements ActionListener
//{
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        setBackground(Color.YELLOW);
//    }
//}

public class Example5b {
     public static void main(String [] args)
    {
        Date d=new Date();
        MyFrame5 mf=new MyFrame5(d.toString());
    }
}
