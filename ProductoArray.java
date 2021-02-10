public class Recursion {
    
    /*  Aitor Ventura Delgado
        .03.2019
        Haremos un método que realizará el producto de dos arrays de manera
        recursiva.  */
    
    private static void arrayaux(int[] a, int[] b, int[] res, int c){
        /* Cuando lleguemos al último índice del array (índice 0), dejaremos de
        llamar a la función, mientras no lo hagamos, lo seguiremos haciendo */
        if (c == 1){
            res[c-1] = a[c-1] * b[c-1];
        } else {
            res[c-1] = a[c-1] * b[c-1];
            arrayaux(a, b, res, c-1);
        }
    }
    
    public static int[] arrayProd(int[] a, int[] b, int c){
        int[] res = new int[c];
        /* Llamamos a un método auxiliar con 4 parámetros, los dos arrays que nos dan,
        el array resultante, y el número de elementos */
        arrayaux(a, b, res, c);
        return res;
    }
}