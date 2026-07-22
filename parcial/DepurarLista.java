package parcial;

// Estudiantes: Brandon Carranza / Jhoan Iglesias

public class DepurarLista {
    Nodo cabeza;

    public void insertarFinal(int v) {
        Nodo nuevo = new Nodo(v);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void recorrer() {
        Nodo actual = cabeza;
        int i = 1;
        while (actual != null) {
            System.out.print(i + ". " + actual.valor + "   \n");
            actual = actual.siguiente;
            i++;
        }
        System.out.println();
    }

    public int contar() {
        int cantidad = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            cantidad++;
            actual = actual.siguiente;
        }
        return cantidad;
    }

    public void eliminarMayoresA(int umbral) {
        while (cabeza != null && cabeza.valor > umbral) {
            cabeza = cabeza.siguiente;
        }
        
        Nodo actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.valor > umbral) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                actual = actual.siguiente;
            }
        }
    }

    public static void main(String[] args) {
        DepurarLista lista = new DepurarLista();
        int[] valores = {30, 80, 45, 90, 20, 60};
        
        for (int v : valores) {
            lista.insertarFinal(v);
        }
        
        System.out.println("Antes (" + lista.contar() + "):");
        lista.recorrer();
        
        lista.eliminarMayoresA(50);
        
        System.out.println("Despues (" + lista.contar() + "):");
        lista.recorrer();
    }
}