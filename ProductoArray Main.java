import java.util.Arrays;

public class Main {
    /**
     * Prueba el método Recursion.arrayProd
     * @param input1 - array a tratar
     * @param input2 - array a tratar
     * @param n - nº de elementos a tratar
     * @param expected - resultado esperado
     */
    static void test(int[] input1, int[] input2, int n, int[] expected) {
        // Se informa del caso que se está probando
        System.out.println("probando: arrayProd(" + Arrays.toString(input1) + 
            ", " + Arrays.toString(input2) + ")");
    	
        // Llamada al método a probar
        int[] result = Recursion.arrayProd(input1, input2, n);
        
        // Comprobación de los resultados
        if (!Arrays.equals(result, expected)) {
            System.out.print(">> Resultado erróneo, deberia ser: " + Arrays.toString(expected) + "");
            System.out.println(" y es: " + Arrays.toString(result) + "");
        } else {
            System.out.println(">> Resultado correcto: " + Arrays.toString(result) + "");
        }        
    }

    /**
     * Invoca a test para realizar múltiples pruebas
     * @param args
     */
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {2, 4, 6, 8};
        int n = 3;
        int[] v3 = {2, 8, 18};
        test(v1, v2, n, v3);
   }
}
