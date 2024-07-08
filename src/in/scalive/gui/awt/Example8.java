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
import java.util.Random;

class MyFrame8 extends Frame implements ActionListener
{
    Button b1,b2;
    Random rd;
    public MyFrame8(String title)
    {
        super(title);
        b1=new Button("Close Frame");
        b2=new Button("Change Color");
        setLayout(new FlowLayout());
        rd=new Random();
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this); 
        setBounds(40,40,500,500);
        setVisible(true);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1)
       {
           System.exit(0);
       }
       else 
       {
           int Red=rd.nextInt(256);
           int Green=rd.nextInt(256);
           int Blue=rd.nextInt(256);
           Color c=new Color(Red,Green,Blue);
           setBackground(c);
       }
    }

}

public class Example8 {
    public static void main(String [] args)
    {
        MyFrame8 mf=new MyFrame8("Avinash ");
    }
}
