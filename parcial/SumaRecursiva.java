package parcial;

// Estudiantes: Brandon Carranza / Jhoan Iglesias

public class SumaRecursiva {

    public int sumaRecursiva(Nodo n) {
        if (n == null) {
            return 0;
        }
        return n.valor + sumaRecursiva(n.siguiente);
    }

    public static void main(String[] args) {
        Nodo cabeza = new Nodo(30);
        cabeza.siguiente = new Nodo(45);
        cabeza.siguiente.siguiente = new Nodo(20);

        SumaRecursiva sumador = new SumaRecursiva();
        int total = sumador.sumaRecursiva(cabeza);

        System.out.println("Suma de la lista: " + total);
    }
}