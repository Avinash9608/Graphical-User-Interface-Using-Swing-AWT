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
class MyFrame1 extends Frame
{
    public MyFrame1(String title)
    {
        setTitle(title);
        setBounds(50,50,500,500);
        setVisible(true);
    }
}
public class Example4a {
    public static void main(String [] args)
    {
        Date d=new Date();
        MyFrame1 fr=new MyFrame1(d.toString());
        
    }
}
