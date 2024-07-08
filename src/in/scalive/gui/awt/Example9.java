/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scalive.gui.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyFrame9 extends Frame implements ActionListener
{
    Button b1,b2,b3;
    int count;
    public MyFrame9 (String title)
    {
        super(title);
        b1=new Button("Close Frame");
        b2=new Button("Increment");
        b3=new Button("Decrement");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this); 
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
          count=(e.getSource()==b2)?count+1:count-1;
          setTitle(String.valueOf(count));
       }
    }

}
public class Example9 {
    public static void main(String [] args)
    {
        MyFrame9 mf=new MyFrame9("0");
    }
}
