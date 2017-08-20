package practica1_201602470;

import java.util.*;

public class Practica1_201602470 {

    public static char[][] matriz = new char[9][9];
    public static char[][] aux = new char[9][9];
    public static int filas = 0;
    public static int columnas = 0;
    public static int minas = 0;
    public static int mov1 = 0;
    public static int mov2 = 0;
    public static int win = 0;
    public static boolean finpartida = false;
    public static boolean debug = false;
    public static int count = 0;
    public static boolean fi = false;
    public static char op, op2;

    public static void Inicio() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Alejandra Carolina Yupe Hernández");
        System.out.println("201602470");
        System.out.println("IPC1 'A' Práctica 1");
        System.out.println("BUSCAMINAS!!!");

        leer.nextLine();
    }

    public static void Menu() {

        Scanner enter = new Scanner(System.in);
        int opcion = 0;

        System.out.println("----------------------------------");
        System.out.println("BUSCAMINAS");
        System.out.println("1. Principiante");
        System.out.println("2. Intermedio");
        System.out.println("3. Avanzado");
        System.out.println("4. Salir");
        System.out.println("Ingrese opción:");
        opcion = enter.nextInt();
       

        switch (opcion) {
            case 1:
                System.out.println("-------------------------------");
                System.out.println("NIVEL PRINCIPIANTE");
                filas = 5;
                columnas = 5;
                minas = 5;
                win = (8 * 8) - 19;
                break;
            case 2:
                System.out.println("-------------------------------");
                System.out.println("NIVEL INTERMEDIO");
                filas = 7;
                columnas = 7;
                minas = 9;
                win = (16 * 16) - 40;
                break;
            case 3:
                System.out.println("-------------------------------");
                System.out.println("NIVEL AVANZADO");
                filas = 9;
                columnas = 9;
                minas = 13;
                win = (16 * 30) - 99;
                break;

            case 4:
                fi = true;
                System.exit(0);
                break;
            default:
                System.out.println("Introduce una opción valida!!");
                break;

        }

    }

    public static void Mat(int tamañoF, int tamañoC, char[][] matriz) {
      
        System.out.println("       ");
        for (int i = 1; i < tamañoF; i++) {
            if (i == 1) {
                System.out.println("");
            }

            for (int j = 1; j < tamañoC; j++) {
                System.out.printf("[" + matriz[i][j] + "]");
            }
            if (i == tamañoF - 1) {
                System.out.println(" ");
                
            }
            System.out.println(" ");
        }
        System.out.println("----------------");
    }

    public static int NumeroAleatorio(int max) {
        Random r = new Random();
        int num = (int) (Math.random() * max);
        return num;
    }

    public static void iniciarMatriz() {
        for (int l = 1; l < filas; l++) {
            for (int m = 1; m < columnas; m++) {
                aux[l][m] = 'X';
            }
        }
        for (int l = 1; l < filas; l++) {
            for (int m = 1; m < columnas; m++) {
                matriz[l][m] = 'X';
            }
        }
    }

    public static void intrMinas() {
        boolean full = false;
        int i = 0;
        out:
        while (i <= minas) {
            for (int j = 1; j < filas; j++) {
                for (int k = 1; k < columnas; k++) {
                    int mina = NumeroAleatorio(columnas);
                    if ((k == mina) && (matriz[j][k] == 'X') && (j != mov1 && k != mov2)) {
                        matriz[j][k] = '*';
                        ++i;
                        if (i == minas) {
                            break out;
                        }
                    }
                }
            }
        }
    }

    public static void Minas() {
        int count = 0;
        for (int n = 2; n <= matriz.length - 2; ++n) {
            for (int o = 2; o <= matriz[0].length - 2; ++o) {
                count = 0;
                if ((matriz[n + 1][o + 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n - 1][o - 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n - 1][o + 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n + 1][o - 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n - 1][o] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n + 1][o] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n][o + 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n][o - 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if (matriz[n][o] == 'X') {
                    if (count > 0) {
                        matriz[n][o] = Integer.toString(count).charAt(0);
                    } else if (count == 0) {
                        matriz[n][o] = Integer.toString(count).charAt(0);
                    }
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 'X') {
                    matriz[i][j] = Integer.toString(0).charAt(0);
                }
            }
        }
    }

    public static void Movimientos() {

        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        System.out.println("Voltear: V");
        System.out.println("Reiniciar: R");
        System.out.println("Salir: S");
        System.out.println("Ingrese una opción");
        op = sc.next().charAt(0);
        
        switch (op) {
            case 'V':
                while (!valid) {

                   
                    System.out.print("Introduce la fila y la columna");
                    mov1 = sc.nextInt();
                    mov2 = sc.nextInt();
                   
                    System.out.println("");
                    System.out.println("Acepta los datos ingresados?");
                    op2=sc.next().charAt(0);
                    switch (op2){
                        case 'N':
                           Practica1_201602470.Movimientos();
                            break;
                        case 'Y':
                       if ((mov1 < filas && mov2 < columnas) && (mov1 > 0 && mov2 > 0)) {
                        valid = true;
                    } else {
                        valid = false;
                        break;
                    }
                }     
                    }
                    
                break;
            case 'R':
                Practica1_201602470.iniciarMatriz();
                break;
            case 'S':
                Practica1_201602470.Menu();
        }

    }

    public static void Voltear(int f, int c) {
        int op1 = mov1;
        int op2 = mov2;
        if (f > filas - 1 || f < 0 || c > columnas - 1 || c < 0) {
            return;
        }
        if (matriz[op1][op2] == '*') {
            finpartida = true;
            System.out.println("Ha perdido la partida");
            System.out.println("");
            System.out.println(matriz[f][c]);
        } else if (matriz[f][c] == '0') {
            if (aux[f][c] != matriz[f][c]) {
                aux[f][c] = matriz[f][c];
                ++count;
                Voltear(f + 1, c);
                Voltear(f, c + 1);
                Voltear(f + 1, c + 1);
            }
            if (f > filas - 1 || f < 0 || c > columnas - 1 || c < 0) {
                Voltear(f, c - 1);
                Voltear(f - 1, c);
                Voltear(f - 1, c - 1);
                Voltear(f - 1, c + 1);
                Voltear(f + 1, c - 1);
            }
        } else if ((matriz[f][c] > '0')) {
            if (aux[f][c] != matriz[f][c]) {
                aux[f][c] = matriz[f][c];
                ++count;
            }
        }
        if (count == win) {
            System.out.println("Ha ganado la partida!!!");
            finpartida = true;
        }
    }

    public static void main(String[] args) {
       
        while (!fi) {
            count = 0;
            finpartida = false;
            Inicio();
            Menu();
            iniciarMatriz();
            Mat(filas, columnas, aux);
            System.out.println("");

            Movimientos();
            intrMinas();
            Minas();
            Voltear(mov1, mov2);
            while (!finpartida) {

                Mat(filas, columnas, aux);
                System.out.println("");
                Movimientos();
                Voltear(mov1, mov2);
            }
        }

    }
}