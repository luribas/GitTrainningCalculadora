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
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Ao quadrado");
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
                break;
            
            case 3:
                System.out.print("Primeiro numero: ");
                num1 = scn.nextInt();
                System.out.print("Segundo número: ");
                num2 = scn.nextInt();
                result = multiplicacao(num1, num2);
                System.out.println("Resultado: " + result);
                break;
            
            case 4:
                System.out.print("Primeiro numero: ");
                num1 = scn.nextInt();
                System.out.print("Segundo número: ");
                num2 = scn.nextInt();
                result = divisao(num1, num2);
                System.out.println("Resultado: " + result);
                break;
            
            case 5:
                System.out.print("Numero: ");
                num1 = scn.nextInt();
                result = quadrado(num1);
                System.out.println("Resultado: " + result);
                break;
                
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

    public static int multiplicacao (int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    
    public static int divisao (int num1, int num2){
        int result = num1 / num2;
        return result;
    }
    
    public static int quadrado (int base){
        int result = base^2;
        return result;
    }
}
