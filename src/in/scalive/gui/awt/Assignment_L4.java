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

class Assignment extends Frame implements ActionListener
{
    Button b1,b2;
    Random rd;
    int count;
    public Assignment(String title)
    {
        super(title);
        b1=new Button("Close Frame");
        b2=new Button("Click Me");
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
           ++count;
           setTitle(String.valueOf(count));
       }
    }

}
public class Assignment_L4 {
     
    public static void main(String [] args)
    { 
     Assignment as=new Assignment("0");
}  
}
