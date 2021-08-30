/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsoArreglosMatrices;

/**
 *
 * @author jairo
 */
public class EjemploArreglos {
    public static void main(String[] args) {
        
       int [] numeros = new int[10]; // definicion de variable tipo arreglos (con 10 posiciones);
       
       int[] digitos = {0,1,2,3,4,5,6,7,8,9}; // inicializador arreglo
       System.out.print("Arreglo de digitos: ");
       imprimirArreglo(digitos);
       
       System.out.println("");
        
       System.out.print("Arreglo enteros: ");       
       int[] numerosImpares  = new int[10];
       inicializarArreglo(numerosImpares);
       imprimirArreglo(numerosImpares);
       
       System.out.println("");
       String nombres[][] = {{"jairo", "seoanes"},{"luis", "dias"},{"radamel", "falcao"}};
       recorrerMatriz(nombres); 
    }
    
    public static void inicializarArreglo(int[] lista){
        for(int i=1; i<=lista.length;i++){
            lista[i-1] = 2 *i-1;
        }
    }
    
   
    public static void imprimirArreglo(int[] lista){
        for(int i=0; i<lista.length;i++){
            System.out.print(lista[i]+" ");
        }
    }
    
    public static void recorrerMatriz(String lista[][]){
        for(int i=0; i<lista.length; i++){
            for(int j=0; j<lista[i].length;j++){
                System.out.print(lista[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
