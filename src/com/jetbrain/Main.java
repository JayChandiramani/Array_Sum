package com.jetbrain;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String ArrNum,CurrentNumber;
        int ArrNumber,count=0,NumCount,max,min,Total=0;

        do {
            ArrNum = JOptionPane.showInputDialog("How many numbers do you wish to add?");

            if(ArrNum==null)
                System.exit(0);
            if (ArrNum.equals(""))
            JOptionPane.showMessageDialog(null, "Please enter a number.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);

        } while (ArrNum.equals(""));

        ArrNumber = Integer.parseInt(ArrNum);

        int[] Numbers = new int[ArrNumber];

        do {
            NumCount = count + 1;

            do {
                CurrentNumber = JOptionPane.showInputDialog("Please enter number " + NumCount);

                if (CurrentNumber==null)
                    System.exit(0);
                if(CurrentNumber.equals(""))
                    JOptionPane.showMessageDialog(null, "Please enter a number.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);

            }while (CurrentNumber.equals(""));

            Numbers[count] = Integer.parseInt(CurrentNumber);
            count = count + 1;
        } while (count < ArrNumber);

        max=Numbers[0];
        for (count=0; count<ArrNumber; count++) {
            if (max<Numbers[count])
                max=Numbers[count];
            else
                max=max;
        }

        min=Numbers[0];
        for (count=0; count<ArrNumber; count++) {
            if (min>Numbers[count])
                min=Numbers[count];
            else
                min=min;
        }

        for (count=0; count<ArrNumber; count++) {
            Total = Total+Numbers[count];
        }

        JOptionPane.showMessageDialog(null,"Maximum entered value: "+max+"\nMinimum entered value: "+min+"\nTotal value of entered values: "+Total,"Results",JOptionPane.INFORMATION_MESSAGE);
    }
}
