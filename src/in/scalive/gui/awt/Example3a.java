/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scalive.gui.awt;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Example3a {
       public static void main(String [] args)
       {
        Frame fr=new Frame();
        Date d=new Date();
        String str=d.toString();
        fr.setTitle(str);
        fr.setBounds(50,40,400,400);
//        fr.setBackground(new Color(255,0,255));
        fr.setBackground(Color.red);
        fr.setVisible(true);
       }
}
