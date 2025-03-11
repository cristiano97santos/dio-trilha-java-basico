package com.cristiano;


import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Vamos criar sua conta bancaria; para isso precisamos que nos informe seu nome completo, CPF, e endereço");

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("por favor, digite o seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("por favor, digite o número de seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Sua conta foi criada com sucesso!");
        System.out.println("Para mais informações;");


        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();


        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();



        System.out.println("\n Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();




    }
}