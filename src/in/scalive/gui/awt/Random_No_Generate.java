/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scalive.gui.awt;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Random_No_Generate {
    public static void main(String [] args)
    {
        Random rd=new Random();
        int x=rd.nextInt(50);
        System.out.println("Random Number is "+x);
    }
}
