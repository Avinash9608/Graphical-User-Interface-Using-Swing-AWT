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

class MyFrame6 extends Frame implements ActionListener
{
    Button b1,b2;
    public MyFrame6(String title)
    {
        super(title);
        b1=new Button("Close Frame");
        b2=new Button("Change Color");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        CloseFrame obj=new CloseFrame();
        b1.addActionListener(this);
        b2.addActionListener(this);  // this is a refrance it show the current 
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
           setBackground(Color.ORANGE);
       }
    }

}

public class Example6 {
     public static void main(String [] args)
    {
        Date d=new Date();
        MyFrame6 mf=new MyFrame6(d.toString());
    }
}
