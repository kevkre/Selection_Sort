package SelectionSort;

import javax.swing.*;

public class selSort_uebung {

    public static void main(String[] args) {


        //Eingabe

        String s = JOptionPane.showInputDialog("Geben Sie Anzahl der Elemente ein: ");
        int zahl = Integer.parseInt(s);

        int[] reihe = new int[zahl];

        for (int i = 0; i < zahl; i++) {
            String eingabe = JOptionPane.showInputDialog("Geben Sie " + (i + 1) + " Element ein ");
            int y = Integer.parseInt(eingabe);

            reihe[i] = y;
        }

        // Anzeige ungeordnete Elemente
        System.out.println("ungeordnete Elemente: ");

        for (int i = 0; i < zahl; i++) {

            System.out.print(" " + reihe[i] + " ");

        }
        System.out.println();
        //Selection Sort

        //Anzeigen geordnete Elemente
        System.out.println(" geordnete Elemente: ");
        for (int x = 0; x < zahl; x++) {

            System.out.print(" " + reihe[x] + " ");
        }
    }
}

