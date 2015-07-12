//Learning about the Dialog box and accepting input
//Written by Benjamin Smith
// July 11, 2015

import javax.swing.JOptionPane;
public class HelloNameDialog
{
   public static void main(String[] args)
   {
// Declarations
      String result;
      result = 
      JOptionPane.showInputDialog(null, "What is your name?", "Name Information", JOptionPane.QUESTION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
   }
}