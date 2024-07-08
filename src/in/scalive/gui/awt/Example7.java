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

class MyFrame7 extends Frame implements ActionListener
{
    Button b1,b2,b3,b4;
    public MyFrame7(String title)
    {
        super(title);
        b1=new Button("Close Frame");
        b2=new Button("Red");
        b3=new Button("Blue");
        b4=new Button("Green");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);// this is a refrance it show the current 
        setBounds(40,40,500,500);
        setVisible(true);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(" Clicked occured on "+e.getSource());
       if(e.getSource()==b1)
       {
           System.exit(0);
       }
       else if(e.getSource()==b2)
       {
           setBackground(Color.red);
       }
       else if(e.getSource()==b3)
       {
           setBackground(Color.blue);
       }
       else if(e.getSource()==b4)
       {
           setBackground(Color.green);
       }
    }

}

public class Example7 {
     public static void main(String [] args)
    {
        MyFrame7 mf=new MyFrame7("Avinash ");
    }
}
