/*
Simple exercise in java.
Created 2019-09-19
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class Uppgift37{ 
   public static void main(String[] args) {

      int tid;
	  int min;
	  int tim;
	  int minrest;
	  int timrest;
	  tid = 8730;
	  min = tid / 60;
	  minrest = tid % 60;
	  
	  if (tid >= 60 && min < 60) { 
	  		  JOptionPane.showMessageDialog(null, min + " minutes " + minrest + " seconds");
	  } else if (tid < 60) {
		  JOptionPane.showMessageDialog(null, tid + " seconds");
	  } else if (min >= 60) { 
	  tim = min / 60;
	  timrest = min % 60;
	  JOptionPane.showMessageDialog(null, tim + " hours " + timrest + " minutes " + minrest + " seconds");
	  } else {
		  JOptionPane.showMessageDialog(null, "Error");
      }
	  
	  
	   
	   

   }
}