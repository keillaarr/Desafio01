package com.example;

import java.util.Scanner;

public class Desafio01 {
    public static double saldo = 2500.00; 


    public static void recebeValor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor você quer receber?");
                double val = scanner.nextDouble();
                saldo = saldo + val;
                System.out.println(String.format("Novo saldo é R$ %.2f", saldo));
                menu();
                scanner.close();
    }

 


   

    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        

        System.out.println(String.format("""
            ***********************
            Dados iniciais do cliente:
            Nome: Keilla Arruda
            Tipo conta: Corrente
            Saldo inicial: R$ %.2f
            ***********************
            
            Operações
            
            1- Consultar saldos
            2- Receber valor
            3- Transferir valor
            4- Sair
            
            Digite a opção desejada:
            """, saldo));


        int op = scanner.nextInt(); 

        switch (op) {
            case 1:
                System.out.println(String.format("Seu saldo é R$ %.2f", saldo));
                menu();
                break;
            case 2: 
                recebeValor();
                break;
            case 3: 
                transferir(scanner);
                break;
            case 4:
            break; 
            default:
                System.out.println("Opção Inválida !!");;
        }
                
    }
    public static void transferir(Scanner scanner) {
        System.out.println("Qual valor você quer transferir?");
        double val = scanner.nextDouble();
        System.out.println(val);

        if (saldo < val) {
            System.out.println("******************************Saldo Insuficiente!******************************");
        } else {
            saldo = saldo - val;
            System.out.println(String.format("Novo saldo é R$ %.2f", saldo));
        }
        menu();
    }
    

    public static void main(String[] args) {

        menu();
    }
}
