package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        System.out.println("Menú: ");
        System.out.println("1. Recorrer un array. ");
        System.out.println("2. Mostrar el número más grande del array");
        System.out.println("3. Mostrar el número más pequeño del array");
        System.out.println("4. Salir");
        System.out.println("Selecciona una opción:");

        int seleccion;

        Scanner sca = new Scanner(System.in);
        seleccion = sca.nextInt();

        switch (seleccion) {
            case 1:
                recorrer(numeros);
                break;
            case 2:
                mostrarNumeroGrande(numeros);
                break;
            case 3:
                mostrarNumeroPequeño(numeros);
                break;
            case 4:
                System.out.println("Saliendo");
        }

    }

    public static void recorrer(int[] numeros) {
        System.out.println("Contenido del array: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            System.out.print(numeros[i]);
        }

    }


    public static void mostrarNumeroGrande(int[] numeros) {
        int numGrande = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numGrande > numeros.length) {
                numGrande = numeros[i];
            } else {
                System.out.println("Error en ejecución");
            }
        }
        System.out.println("El número más grande del array es: " + numGrande);
    }

    public static void mostrarNumeroPequeño(int[] numeros) {
        int numPequeño = 11;
        for (int i = 0; i < numeros.length; i++) {
            if (numPequeño > numeros.length) {
                numPequeño = numeros[i];
            } else {
                System.out.println("Error en ejecución");
            }
        }
            System.out.println("El número más pequeño del array es: " + numPequeño);
    }
}


