package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int nbr = 5;
        System.out.println(nbr % 2 == 0 ? "Nombre pair" : "Nombre impair");

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i<=5; i++) System.out.println("Iter "+i+": "+i);

        System.out.println("------------------------------------------------------------");

        int j = 0;
        System.out.println("Les carrees des nombre de 1 jusqu'a 3");
        while (j<=3) {
            System.out.println(j + " ^2=" + Math.pow(j, 2));
            j++;
        }

        System.out.println("------------------------------------------------------------");

        int[] tab = new int[5];
        int range = 50 - 5 + 1;
        for (int i = 0; i<5; i++){
            tab[i] = 5 + (int) (Math.random() * range);
        }
        for (int i = 0; i<5; i++){
            System.out.print(tab[i]+ " || ");
        }
        int max = tab[0];
        int min = tab[0];
        for (int i = 1; i<5; i++){
            for (int k = 0; k<5; k++){
                if(tab[k] > max) max = tab[k];
                if(tab[k] < min) min = tab[k];
            }
        }
        System.out.println();
        System.out.println("max:" + max);
        System.out.println("min:" + min);

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i<tab.length - 1; i++){
            int index = i;
            for (int k = i+1; k<tab.length; k++){
                if(tab[k]<tab[index]) index=k;
            }
            int temp = tab[index];
            tab[index] = tab[i];
            tab[i] = temp;
        }
        for (int i = 0; i<tab.length; i++){
            System.out.print(tab[i]+ " || ");
        }

    }
}