package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

       try {

            Scanner teclado = new Scanner(System.in);
            ContaCliente c1 = new ContaCliente();
            String cor6 = "\u001B[";

            System.out.print(cor6 + "32" + "m");
            System.out.println("------------------------------");
            System.out.print(cor6 + "m");
            System.out.println("1 - para depositar");
            System.out.println("2 - para sacar");
            System.out.println("3 - para ver o saldo atual");
            System.out.println("4 - para encerrar a consulta");
            System.out.println();
            System.out.println("Digite um numero para continuar");
            int num = teclado.nextInt();
            System.out.print(cor6 + "32" + "m");
            System.out.println("------------------------------");
            System.out.print(cor6 + "m");

            int numero = num;

            switch (numero) {

                case 1:
                    c1.depositar();
                    break;

                case 2:
                    c1.sacar();
                    break;

                case 3:
                    c1.saldo();
                    break;

                case 4:
                    System.out.print(cor6 + "36" + "m");
                    System.out.println("------------------------------");
                    System.out.print(cor6 + "m");
                    System.out.println("Consulta encerrada");
                    System.out.print(cor6 + "36" + "m");
                    System.out.println("------------------------------");
                    System.out.print(cor6 + "m");
                    break;

                default:
                    System.out.print(cor6 + "32" + "m");
                    System.out.println("------------------------------");
                    System.out.print(cor6 + "m");
                    System.out.println("Numero invalido! Digite um "
                            + "numero entre 1 e 4");
                    System.out.print(cor6 + "32" + "m");
                    System.out.println("------------------------------");
                    System.out.print(cor6 + "m");
                    break;

            }
        } catch (Exception e) {

            String cor7 = "\u001B[";

            System.out.print(cor7 + "32" + "m");
            System.out.println("------------------------------");
            System.out.print(cor7 + "m");
            System.out.print(cor7 + "31" + "m");
            System.out.println("------------------------------");
            System.out.print(cor7 + "m");
            System.out.println("Você digitou um caractere invalidado!"
                    + " Consulta encerrada");
            System.out.print(cor7 + "31" + "m");
            System.out.println("------------------------------");
            System.out.print(cor7 + "m");

        }

}
    
}
