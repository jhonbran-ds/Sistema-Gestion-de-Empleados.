package javaapplication4;

import java.util.*;

public class JavaApplication4 {

    static Scanner sc = new Scanner(System.in);

    static int mesas2 = 10;
    static int mesas4 = 8;
    static int mesas6 = 7;
    static Queue<Integer> colaEspera = new LinkedList<>();

    public static void main(String[] args) {
        pilasNumericas();
        pilaPalabras();
        restaurante();
    }

    // ===PILAS NUMÉRICAS ====
    public static void pilasNumericas() {

        Stack<Integer> pilaA = new Stack<>();
        Stack<Integer> pilaB = new Stack<>();

        System.out.print("Cantidad de números: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            pilaA.push(sc.nextInt());
        }

        for (int x : pilaA) {
            if (x % 2 != 0) {
                pilaB.push(x);
            }
        }

        pilaB.sort(Collections.reverseOrder());

        System.out.println("PilaA: " + pilaA);
        System.out.println("PilaB (impares desc): " + pilaB);
    }

    // ================= PILA DE PALABRAS =================
    public static void pilaPalabras() {

        Stack<String> pila = new Stack<>();

        System.out.print("\nCantidad de palabras: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            pila.push(sc.nextLine());
        }

        System.out.print("Buscar palabra: ");
        String buscar = sc.nextLine();

        if (pila.contains(buscar)) {
            System.out.println("Está en posición: " + (pila.indexOf(buscar) + 1));
        } else {
            System.out.println("No está en la pila");
        }
    }

  
    public static void restaurante() {

        asignarMesa(2);
        asignarMesa(4);
        asignarMesa(6);
        asignarMesa(8);

        liberarMesa(4);
        liberarMesa(2);
    }

    public static void asignarMesa(int personas) {

        if (personas <= 2 && mesas2 > 0) {
            mesas2--;
            System.out.println("Mesa para 2 asignada");
        } else if (personas <= 4 && mesas4 > 0) {
            mesas4--;
            System.out.println("Mesa para 4 asignada");
        } else if (personas <= 6 && mesas6 > 0) {
            mesas6--;
            System.out.println("Mesa para 6 asignada");
        } else {
            colaEspera.add(personas);
            System.out.println("Cliente en espera");
        }
    }

    public static void liberarMesa(int capacidad) {

        if (capacidad == 2) mesas2++;
        if (capacidad == 4) mesas4++;
        if (capacidad == 6) mesas6++;

        System.out.println("Mesa liberada para " + capacidad);

        if (!colaEspera.isEmpty()) {
            asignarMesa(colaEspera.poll());
        }
    }
}
