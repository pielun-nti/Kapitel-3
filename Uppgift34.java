/*
Simple exercise in java.
Created 2019-09-19
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class Uppgift34{ 
   public static void main(String[] args) {

      String s = JOptionPane.showInputDialog("Amount of minutes per month?");
	  double min = Double.parseDouble(s);
	  s = JOptionPane.showInputDialog("Expense per min?");
	  double minutpris = s;
	  JOptionPane.showMessageDialog(null, "Estimated monthly expense: \n" + min * minutpris);
	  
	   
	   

   }
}