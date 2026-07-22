package parcial;
// Estudiantes: Brandon Carranza / Jhoan Iglesias

public class ContarPrimos {

    public static boolean tieneDivisorDesde(int n, int d) {
        if (d * d > n) {
            return false;
        }
        if (n % d == 0) {
            return true;
        }
        return tieneDivisorDesde(n, d + 1);
    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        return !tieneDivisorDesde(n, 2);
    }

    public static int contarPrimos(int[] a, int i) {
        if (i == a.length) {
            return 0;
        }
        
        boolean primo = esPrimo(a[i]);
        
        if (primo) {
            System.out.println("El numero " + a[i] + " SI es primo.");
        } else {
            System.out.println("El numero " + a[i] + " NO es primo.");
        }
        
        return (primo ? 1 : 0) + contarPrimos(a, i + 1);
    }

    public static void main(String[] args) {
        int[] datos = {4, 7, 10, 13, 15, 2, 9, 11};
        int Prim = contarPrimos(datos, 0);
        System.out.println("\n");
        System.out.println("Primos: " + Prim);
    }
}