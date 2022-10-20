/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Unidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean fuerza = true;
        
        
        Scanner scn=new Scanner(System.in);
        //System.out.println("Valor de la Fuerza");
        //int F=scn.nextInt();
        System.out.println("Valor de la Masa");
        int m=scn.nextInt();
        System.out.println("Valor de la Aceleracion");
        int a=scn.nextInt();
        
        if(fuerza){
            
            double x=(m*a) ;
            System.out.println("La fuerza es " +x+ " N");
           
        }
        
    }
    
}
