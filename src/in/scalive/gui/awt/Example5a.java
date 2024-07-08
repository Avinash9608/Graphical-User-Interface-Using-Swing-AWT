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
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class MyFrame4 extends Frame
{
    Button b1,b2;
    public MyFrame4(String title)
    {
        super(title);
        setBounds(40,40,500,500);
        b1=new Button("Change Color");
        b2=new Button("Close Frame");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        CloseFrame obj=new CloseFrame();
        b2.addActionListener(obj);
        setVisible(true);
    }    
}
    class CloseFrame implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
    }


public class Example5a {
    public static void main(String [] args)
    {
        Date d=new Date();
        MyFrame4 mf=new MyFrame4(d.toString());
    }
}
