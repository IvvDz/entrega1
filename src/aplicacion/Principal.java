package aplicacion;

import mates.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("La suma de los 5 primeros números es: " + Factorial.suma(5));
        System.out.println("El factorial de 5 es: " + Factorial.factorial(5));
        System.out.println("La potencia de 2^3 es: " + Factorial.potencia(2, 3));
        int[] lista = {1, 2, 3, 4, 5};
        System.out.println("La suma de los elementos de la lista es: " + Factorial.sumaLista(lista));
        System.out.println("La media aritmética de la lista es: " + Factorial.mediaLista(lista, lista.length));
        System.out.println("La desviación típica de la lista es: " + Factorial.desviacionTipica(lista, lista.length));
        System.out.println("La suma de los primeros números pares hasta 9 es: " + Factorial.sumaPares(9));
        int[] lista2 = {1, 2, 3, 4};
        System.out.println("La suma de los elementos pares de la lista es: " + Factorial.sumaParesLista(lista2));
        int[] lista3 = {1, 2, 6, 11};
        System.out.println("La lista de números pares es: " + java.util.Arrays.toString(Factorial.obtenerListaPares(lista3)));
        System.out.println("La lista de los primeros números pares hasta 9 es: " + java.util.Arrays.toString(Factorial.listaPares(9)));
        int[] lista4 = {1, 2, 3};
        int[] lista5 = {2, 4, 6};
        System.out.println("Producto escalar de dos listas es: " + Factorial.calcularProductoEscalar(lista4, lista5));
    }
}
