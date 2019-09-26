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
	  int prismoms;
      varapris = Integer.parseInt(JOptionPane.showInputDialog("Varans pris?"));
	  moms = Integer.parseInt(JOptionPane.showInputDialog("Moms (%)"));
	  prismoms = varapris / moms;
	  prismoms = varapris + moms;
	  JOptionPane.showMessageDialog(null, "Varans pris utan moms:" + varapris);
	  JOptionPane.showMessageDialog(null, "Varans pris med " + moms + "% moms:" + prismoms);
	   
	   

   }
}