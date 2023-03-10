/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author nicolaslazaro
 */
public class Mavenproject1 {

    public static void main(String[] args) {    //PUNTO 1
        //Consigna 1- ciclo while que imprime del 1 al 100
        System.out.println("Ciclo While");
        int i = 0,j = 0, k = 0, l = 0; //Inicializo las variables para cada consigna
        while(i<=100){
            
            System.out.println(i); //Imprimo por pantalla el valor i
            i++;    //Incremento el valor de i en 1 cada vuelta del ciclo
        }
        
        //Consigna 2- ciclo for que imprime del 1 al 100
        System.out.println("\nCiclo For");
        for(j=0;j<=100;j++){
            
            System.out.println(j);
    }   
        
        //Consigna 3- ciclo do while que muestra del 1 al 100
        System.out.println("\nCiclo Do While");
        do{
            System.out.println(k);
            k++;
        }while (k<=100); //Mientras k sea distinto a 100 se van a mostrar los numeros
        
        //Consigna 4- ciclo for que muestra del 1 al 100 pero de 2 en 2
        System.out.println("\nCiclo for de 2 en 2");
        for(l=0;l<=100;l++){ //Incremento l en 1 en la condicion
            System.out.println(l);
            l++; //Vuelvo a incrementar l para que me se muestre por pares,
                 //por cada vuelta el valor de l se incrementa 2 veces
        }
}
}
