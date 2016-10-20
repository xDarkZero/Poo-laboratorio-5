package lab5.e;

import java.util.Scanner;

public class Lab5E {

    public static void main(String[] args) {
        int numero = 0;
        int Num = 0;
        double Prom = 0;
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor");
            array[i] = entrada.nextInt();

        }
        for (int j = 0; j < 10; j++) {
            Num = Num + array[j];

        }
        System.out.println("Este es la suma " + Num);
        Prom = Num / 10;
        System.out.println("Este es el promedio " + Prom);
        int mayor = array[1];
        int menor = array[1];
        for (int d = 1; d < 10; d++) {

            if (array[d] > mayor) {
                mayor = array[d];
                if (array[d] < menor) {
                    menor = array[d];
                   
                }

            }
        }
        System.out.println("Este es el mayor " + mayor);
        System.out.println("Este es el menor " + menor);
    }

}
