/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
   autor: Luan Castoldi
*/
package univates_2019b;

import java.util.Scanner;

/**
 *
 * @author luan.castoldi
 */
public class UNIVATES_2019B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MAIN PRINCIPAL");
        soma(2, 3);
        subtrai(10, 5);

        //teste condicional
        /*if (2 == 3) {
            System.out.println("2 É IGUAL A 2 ");
        } else {
            System.out.println("2 NÃO É IGUAL A 2");
        }*/
        
        //mais teste
        
        String var1 = "JUCA"; 
        String var2 = "JUCA";
        
        if (var1.equals(var2) && (1 == 1)) {
            System.out.println(("É IGUAL"));
        } else {
            System.out.println("É DIFERENTE");
        }
        
        
        //laços repetição
        for(int i = 0; i <= 10; i++){
        System.out.println("Valor de i = " + i);
        }
       
        int i = 0;
            while(i < 10){
                System.out.println(i + " menor que 10");
                i += 1;
            }
        
            
            //executa pelo menos 1 vez
            i = 0;
            do{
                System.out.println(i + " menor que 18");
                i += 1;    
            }while(i <= 18);
            
            
           
            
        
    }

    public static void soma(int var1, int var2) {
        int result = var1 + var2;
        System.out.println("Resultado da soma = " + result);
    }

    public static void subtrai(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Resultado da subtração = " + result);

    }
}
