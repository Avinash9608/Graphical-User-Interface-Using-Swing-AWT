/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scalive.gui.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.Date;

/**
 *
 * @author HP
 */
class MyFrame3 extends Frame
{
    Button b1,b2;
    public MyFrame3(String title)
    {
        super(title);
        setBounds(40,40,500,500);
        b1=new Button("Change Color");
        b2=new Button("Close Frame");
//        FlowLayout fl=new FlowLayout();
//        setLayout(fl);
        setLayout(new FlowLayout()); // Anynomous object pass , if we comment this line then java by default use BorderLayout to display the button on frame, this will cover your whole frame with button
        add(b1);
        add(b2);
        setVisible(true);
    }
}
public class Example5 {
    public static void main(String [] args)
    {
        Date d=new Date();
        MyFrame3 mf=new MyFrame3(d.toString());
    }
}
