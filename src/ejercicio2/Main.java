package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File file = new File("fichero.txt");
        escribir(file);
        leer(file);
    }
    public static void escribir(File file){
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Tania");
            printWriter.println("Ruiz");
            printWriter.println("Garrido");
            printWriter.println("Daw");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.flush();
            printWriter.close();
        }
    }

    public static void leer(File file){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        // Con string builder
        StringBuilder builder = new StringBuilder();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String lectura = null;
            while ((lectura = bufferedReader.readLine())!= null){
                System.out.println(lectura);
                // Con string builder
                builder.append(lectura);
            }
            // Con string builder
            System.out.println(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
