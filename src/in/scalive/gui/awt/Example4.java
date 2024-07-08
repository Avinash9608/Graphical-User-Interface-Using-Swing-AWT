/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scalive.gui.awt;

import java.awt.Frame;

/**
 *
 * @author HP
 */
class MyFrame extends Frame
{
    public MyFrame()
    {
    setTitle("Avinash");
    setBounds(50,50,400,400);
    setVisible(true);
    }
}
public class Example4 {
    public static void main(String [] args)
    {
        MyFrame fr=new MyFrame();
    }
}
