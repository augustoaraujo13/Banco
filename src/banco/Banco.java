package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        try {
            
            Scanner teclado = new Scanner(System.in);
            ContaCliente c1 = new ContaCliente();
            
            System.out.println("------------------------------");
            System.out.println("1 - para depositar");
            System.out.println("2 - para sacar");
            System.out.println("3 - para ver o saldo atual");
            System.out.println("4 - para encerrar a consulta");
            System.out.println();
            System.out.println("Digite um numero para continuar");
            int numero = teclado.nextInt();
            System.out.println("------------------------------");

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
                    System.out.println("Consulta encerrada");
                    break;

                default:
                    System.out.println("Numero invalido! Digite um "
                            + "numero entre 1 e 4");
                    break;

            }
        } catch (Exception e) {
            System.out.println("Você digitou um caractere invalidado!"
                    + " Consulta encerrada");
        }
    }

}
