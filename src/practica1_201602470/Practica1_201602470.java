package practica1_201602470;

import java.io.IOException;
import java.util.*;

public class Practica1_201602470 {

    public static void main(String[] args) throws IOException {

        int opcion = 0;
        boolean hola = true;
        Scanner enter = new Scanner(System.in);

        System.out.println("Alejandra Carolina Yupe Hernández");
        System.out.println("201602470");
        System.out.println("IPC1 'A' Práctica 1");
        System.out.println("BUSCAMINAS!!!");
        enter.nextLine();

        System.out.println("----------------------------------");
        System.out.println("BUSCAMINAS");
        System.out.println("1. Principiante");
        System.out.println("2. Intermedio");
        System.out.println("3. Avanzado");
        System.out.println("4. Salir");
        System.out.println("Ingrese opción:");
        enter.nextLine();
        System.out.println("----------------------------------");

        while(hola){
           switch (opcion){
            case 1:
               nivelPrincipiante_201602470 a = new nivelPrincipiante_201602470();
               break;
        }  
           hola=false;
        }
       
              
        }
    }

