/*
Simple exercise in java.
Created 2019-09-19
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class Uppgift35{ 
   public static void main(String[] args) {

      int varapris;
	  int moms;
	  int prismedmoms;
      varapris = Integer.parseInt(JOptionPane.showInputDialog("Varans pris?"));
	  moms = Integer.parseInt(JOptionPane.showInputDialog("Moms (%)"));
	  prismedmoms = varapris + (moms / 10);
	
	  JOptionPane.showMessageDialog(null, "Varans pris utan moms:" + varapris);
	  JOptionPane.showMessageDialog(null, "Varans pris med " + moms + "% moms:" + prismedmoms);
	   
	   

   }
}