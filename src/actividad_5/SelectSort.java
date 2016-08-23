/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_5;

/**
 *
 * @author Daniel Salinas
 */
public class SelectSort {
    public static void Seleccion (int v[]){ 
        for (int parga = 0; parga < v.length; parga ++){
               int m = parga; // el apuntador
            for (int j= parga+1; j < v.length; j ++ ){
                if(v[j] < v[m]){ // si el valor en la "j" es menor ue el apuntador
                    m = j; //entonces se captura este valor en el apuntador
                }
                int auxiliar = v[parga]; //se guarda el valor actual en el auxiliar
                v[parga] = v[m]; // esto es lo que cambia los valores
                v[m] = auxiliar; //para ordenarlos
            }
        }
        for (int ceta=0; ceta < v.length; ceta ++){ //esto imprime el arreglo ordenado
            System.out.print("["+v[ceta]+"]");
        }
        
    }
    
}
