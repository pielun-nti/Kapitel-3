/*
Simple exercise in java.
Created 2019-09-19
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class Uppgift33{ 
   public static void main(String[] args) {

	   String diameter = JOptionPane.showInputDialog("Diameter for the circle?");
	   double omkrets = 3.1415926536 * Integer.parseInt(diameter);
	   
	   JOptionPane.showMessageDialog(null, "Omkrets:" + "\n" + omkrets);
	   double radie = Integer.parseInt(diameter) / 2;
	   double radieupp = radie * radie;
	   double area = 3.1415926536 * radieupp;
	   	   JOptionPane.showMessageDialog(null, "Area:" + "\n" + area);
	   
	   

   }
}