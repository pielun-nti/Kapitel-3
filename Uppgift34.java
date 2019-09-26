/*
Simple exercise in java.
Created 2019-09-19
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class Uppgift34{ 
   public static void main(String[] args) {

      int min;
	  int minpris;
      min = Integer.parseInt(JOptionPane.showInputDialog("Amount of minutes per month?"));
	  minpris = Integer.parseInt(JOptionPane.showInputDialog("Expense per min?"));
	  JOptionPane.showMessageDialog(null, "Estimated monthly expense: \n" + min * min);
	  
	   
	   

   }
}