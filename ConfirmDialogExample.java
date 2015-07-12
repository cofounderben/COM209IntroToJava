//Learning about the Confirm Dialog box
//Written by Benjamin Smith
// July 5, 2015

import javax.swing.JOptionPane;
public class ConfirmDialogExample
{
   public static void main(String[] args)
   {
      int selection;
      boolean isYes;
      selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?");
      isYes = (selection == JOptionPane.YES_OPTION);
      JOptionPane.showMessageDialog(null, "You responded " + isYes);
   }
}