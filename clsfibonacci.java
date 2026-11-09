/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

/**
 *
 * @author Eddy
 */
public class clsfibonacci {

    
    public long llamadasIngenuo = 0;
    public long llamadasMemo = 0;
    
    public long fibonacciIngenuo(int n) {
        this.llamadasIngenuo++; 

        if (n <= 1) return n; 
        

        return fibonacciIngenuo(n - 1) + fibonacciIngenuo(n - 2);
    }

   
    public long fibonacciMemo(int n, long[] libreta) {
        this.llamadasMemo++; 

        if (n <= 1) {
            return n;
        }

        
        if (libreta[n] != -1) {
            return libreta[n];
        }

       
        libreta[n] = fibonacciMemo(n - 1, libreta) + fibonacciMemo(n - 2, libreta);
        return libreta[n];
    }
}