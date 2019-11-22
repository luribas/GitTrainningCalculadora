/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

import java.util.Scanner;

/**
 *
 * @author BR40044422
 */
public class CalculadoraJava {

   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1, num2, result, op;
        
        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.print("Opção desejada: ");
        op = scn.nextInt();
        
        switch (op){
            case 1:
                System.out.print("Primeiro numero: ");
                num1 = scn.nextInt();
                System.out.print("Segundo número: ");
                num2 = scn.nextInt();
                result = soma(num1, num2);
                System.out.println("Resultado: " + result);
                break;
            
            case 2:
                System.out.print("Primeiro numero: ");
                num1 = scn.nextInt();
                System.out.print("Segundo número: ");
                num2 = scn.nextInt();
                result = subtracao(num1, num2);
                System.out.println("Resultado: " + result);
                
            default:
                break;
        
             
        }
        
    }
    
     public static int soma(int num1, int num2){
          int result = num1 + num2;
          return result;
        }
     
     public static int subtracao (int num1, int num2){
         int result = num1 - num2;
         return result;
    }


    
}
