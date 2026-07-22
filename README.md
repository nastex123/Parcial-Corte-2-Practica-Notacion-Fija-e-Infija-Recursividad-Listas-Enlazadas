content = """# Parcial Corte 2 - Programación de Estructuras de Datos

## Información General
* **Módulo:** COM25 · Programación de Estructuras de Datos
* **Grupo:** 3_SIN_G1_UAB_ALEJANDROOBREGON
* **Período:** 2026-2 · Corte 2 · RA2
* **Estudiantes:** Brandon Carranza y Jhan Iglesias
* **Institución:** Institución Universitaria de Barranquilla (IUB)

## Descripción del Proyecto
Este repositorio contiene la resolución de la parte práctica del Parcial 2. El objetivo principal es demostrar el manejo de recursividad y de listas enlazadas simples implementadas manualmente en Java, sin utilizar estructuras predefinidas como `ArrayList` o `LinkedList`.

## Estructura de Archivos
El código se encuentra organizado dentro del paquete `parcial`. A continuación, se detallan los archivos incluidos:

### Ejercicio 1: `ContarPrimos.java`
* **Descripción:** Cuenta cuántos números de un arreglo son primos utilizando métodos exclusivamente recursivos, sin ciclos en la lógica principal.
* **Funciones principales:** `tieneDivisorDesde`, `esPrimo`, `contarPrimos`.

### Ejercicio 2: `Nodo.java` y `DepurarLista.java`
* **Descripción:** Implementación de una lista enlazada simple desde cero. Permite insertar elementos al final, recorrer la lista y contar sus elementos. Incluye una función especializada para eliminar de forma masiva los nodos cuyo valor supere un umbral dado (50).
* **Funciones principales:** `insertarFinal`, `recorrer`, `contar`, `eliminarMayoresA`.

### Ejercicio 3: `SumaRecursiva.java`
* **Descripción:** Método recursivo que recorre una lista enlazada ya depurada y calcula la suma total de sus valores.
* **Funciones principales:** `sumaRecursiva`.

## Requisitos de Ejecución
* **Entorno:** Visual Studio Code o NetBeans.
* **Versión de Java:** JDK 17.

## Instrucciones de Uso
1. Asegúrese de que la carpeta raíz del proyecto y el paquete `parcial` estén correctamente configurados en su IDE.
2. Compile y ejecute cada archivo de manera independiente.
3. Cada clase contiene su propio método `main` con los datos de prueba solicitados en las instrucciones del examen, generando la salida por consola esperada.
"""

with open('README.md', 'w', encoding='utf-8') as f:
    f.write(content)

print("File generated successfully.")
