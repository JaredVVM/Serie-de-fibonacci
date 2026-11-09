/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author Eddy
 */
public class Fibonacci {

    public static void main(String[] args) {

        clsfibonacci miFibonacci = new clsfibonacci();
        int N = 40;
        
        long inicioIngenuo = System.nanoTime();
        long resIngenuo = miFibonacci.fibonacciIngenuo(N);
        long finIngenuo = System.nanoTime();
        double tiempoIngenuo = (finIngenuo - inicioIngenuo) / 1000000.0;

        System.out.println("Metodo ingenuo");
        System.out.println("Resultado: " + resIngenuo);
        System.out.println("Tiempo : " + tiempoIngenuo);
        System.out.println("Total llamadas: " + miFibonacci.llamadasIngenuo);

        
        long[] libreta = new long[N + 1];

        
        for (int i = 0; i < libreta.length; i++) {
            libreta[i] = -1;
        }

        long inicioMemo = System.nanoTime();
        long resMemo = miFibonacci.fibonacciMemo(N, libreta);
        long finMemo = System.nanoTime();
        double tiempoMemo = (finMemo - inicioMemo) / 1000000.0;

        System.out.println("Metodo memo");
        System.out.println("Resultado: " + resMemo);
        System.out.println("Tiempo (ms): " + tiempoMemo);
        System.out.println("Total llamadas: " + miFibonacci.llamadasMemo);
    }
}