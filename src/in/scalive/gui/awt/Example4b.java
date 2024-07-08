/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scalive.gui.awt;

import java.awt.Frame;
import java.util.Date;

/**
 *
 * @author HP
 */
class MyFrame2 extends Frame
{
    public MyFrame2(String title)
    {
        super(title);
        setBounds(50,50,400,400);
        setVisible(true);
    }
}
public class Example4b {
    public static void main(String [] args)
    {
        Date d=new Date();
        MyFrame2 mf=new MyFrame2(d.toString());
    }
}
