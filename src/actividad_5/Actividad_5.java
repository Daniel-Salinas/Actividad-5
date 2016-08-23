/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_5;
import java.util.Scanner;

/**
 *
 * @author Daniel Salinas
 */
public class Actividad_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n; Scanner lee = new Scanner(System.in);
        System.out.println("ola ke ase?");
        System.out.println("Escribe el tamaño del vector");
        n =  lee.nextInt();
        int v[] = new int[n];
        
        for(int dip=0; dip < v.length; dip ++){
            System.out.println("introduce el valor numero "+ (dip + 1));
            n =  lee.nextInt();
            v[dip] = n;
        }
        System.out.println("El arreglo actual");
        for(int letti = 0; letti < v.length; letti ++){
            System.out.print("["+v[letti]+"]");
        }
        System.out.println("");
        System.out.println("El arreglo ordenado");
        SelectSort.Seleccion(v);
    }
    
}
