package br.com;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência: ");
        ContaTerminal novaConta = new ContaTerminal();
        novaConta.setAgencia(sc.nextLine());

        System.out.println("Por favor, digite o número da conta: ");
        novaConta.setNumero(sc.nextInt());
        sc.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        novaConta.setNomeCliente(sc.nextLine());

        System.out.println("Por favor, digite o seu saldo: ");
        novaConta.setSaldo(BigDecimal.valueOf(sc.nextFloat()));
        sc.nextLine();

        System.out.println(novaConta.printNomeAgencia());
    }
}