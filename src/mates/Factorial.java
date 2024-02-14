package mates;

public class Factorial {
//1
    public static int suma(int n)
        {
        int acumulado = 0;
        for (int i=1; i<=n; i++)
                acumulado += i;
         return acumulado;
        }
        
//2
    public static int factorial(int n)
    {
        int acumulado = 1;
        for (int i=1; i<=n; i++)
            acumulado *= i;
        return acumulado;
    }
//3
    public static int potencia(int base, int exponente)
    {
        int acumulado = 1;
        for (int i=1; i<=exponente; i++)
            acumulado *= base;
        return acumulado;
    }
//4    
    public static int sumaLista(int[] lista) {
        int suma = 0;
        for (int i=0; i<lista.length; i++)
            suma += lista[i];
        return suma;
        }
//5
    public static double mediaLista(int[] lista, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return (lista[n - 1] + (n - 1) * mediaLista(lista, n - 1)) / n;
        }
    }

//6 
    public static double desviacionTipica(int[] lista, int n) {
    double media = mediaLista(lista, n);
    double sumatoria = 0;
    for (int i = 0; i < n; i++) {
        sumatoria += Math.pow(lista[i] - media, 2);
    }
    return Math.sqrt(sumatoria / n);
}

//7
    public static int sumaPares(int n) {
    if (n <= 0) {
        return 0;
    } else {
        if (n % 2 == 0) {
            return n + sumaPares(n - 2);
        } else {
            return sumaPares(n - 1);
        }
    }
}

//8
    public static int sumaParesLista(int[] lista) {
    int suma = 0;
    for (int i = 0; i < lista.length; i++) {
        if (lista[i] % 2 == 0) {
            suma += lista[i];
        }
    }
    return suma;
}

//9
    public static int[] obtenerListaPares(int[] lista) {
    int count = 0;
    for (int i = 0; i < lista.length; i++) {
        if (lista[i] % 2 == 0) {
            count++;
        }
    }
    int[] pares = new int[count];
    int index = 0;
    for (int i = 0; i < lista.length; i++) {
        if (lista[i] % 2 == 0) {
            pares[index] = lista[i];
            index++;
        }
    }
    return pares;
}

//10
    public static int[] listaPares(int n) {
    int[] pares = new int[n / 2];
    int index = 0;
    for (int i = n - 1; i > 0; i--) {
        if (i % 2 == 0) {
            pares[index] = i;
            index++;
        }
    }
    return pares;
}

//11
    public static int calcularProductoEscalar(int[] lista1, int[] lista2) {
    int productoEscalar = 0;
    for (int i = 0; i < lista1.length; i++) {
        productoEscalar += lista1[i] * lista2[i];
    }
    return productoEscalar;
}
}
    

