package banco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ContaCliente {

    private final String nome_cliente = "Josimar Ribeiro";
    private final int numero_da_conta = 10190;
    private final double saldo_da_conta = 3500;
    private final int numero_da_agencia = 3348;
    private final String nome_do_banco = ">>>>Banco Nacional<<<<";

    public void saldo() {

        System.out.println("------------------------------");
        System.out.println();
        System.out.println(getNome_do_banco());
        System.out.printf("Numero da agência: %d", getNumero_da_agencia());
        System.out.println();
        System.out.println("Seja bem vindo: " + getNome_cliente());
        System.out.printf("Seu saldo atual é: %.2f", getSaldo_da_conta());
        System.out.println();
        System.out.printf("Seu rendimento no final do mês será: %.2f", calculaRendimento());
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
    }

    private double calculaRendimento() {

        double rendimento = 0.1;
        double novo_rendimento;

        novo_rendimento = getSaldo_da_conta() * rendimento;

        return novo_rendimento;

    }

    public void sacar() {

        try {

            Scanner teclado1 = new Scanner(System.in);
            
            System.out.println("------------------------------");
            System.out.println();
            System.out.println(getNome_do_banco());
            System.out.printf("Numero da agência: %d", getNumero_da_agencia());
            System.out.println();
            System.out.println("Seja bem vindo: " + getNome_cliente());
            System.out.printf("Seu saldo atual é: %.2f", getSaldo_da_conta());
            System.out.println();
            System.out.println("Digite o valor para sacar: ");
            double saque = teclado1.nextDouble();
            System.out.println("------------------------------");
            System.out.println();

            if (getSaldo_da_conta() == 0) {

                System.out.println("------------------------------");
                System.out.println("Você não tem dinheiro suficiente "
                        + "para realizar o saque!");
                System.out.println("------------------------------");

            } else if (saque > getSaldo_da_conta()) {

                System.out.println("------------------------------");
                System.out.println("O valor que você solicitou para saque"
                        + " é maior que o dinheiro em conta");
                System.out.println("------------------------------");

            } else {

                DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date data1 = new Date();

                double novo_saque = getSaldo_da_conta() - saque;

                System.out.println("------------------------------");
                System.out.println("Saque realizado!");
                System.out.println();
                System.out.printf("Saldo atual: %.2f", novo_saque);
                System.out.println();
                System.out.printf("Valor sacado: %.2f", saque);
                System.out.println();
                System.out.print("Data e hora local: ");
                System.out.println(df1.format(data1));
                System.out.println();
                System.out.println("------------------------------");

            }

        } catch (Exception e) {

            DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date data2 = new Date();

            System.out.println("------------------------------");
            System.out.println();
            System.out.println(getNome_do_banco());
            System.out.println("Você digitou um campo errado :( ");
            System.out.println("Operação de saque foi cancelada!");
            System.out.printf("Saldo atual: %.2f", getSaldo_da_conta());
            System.out.println();
            System.out.print("Data e hora local: ");
            System.out.println(df2.format(data2));
            System.out.println();
            System.out.println("------------------------------");

        }

    }

    public void depositar() {

        try {

            Scanner teclado2 = new Scanner(System.in);
            
            System.out.println("------------------------------");
            System.out.println();
            System.out.println(getNome_do_banco());
            System.out.printf("Numero da agência: %d", getNumero_da_agencia());
            System.out.println();
            System.out.println("Seja bem vindo: " + getNome_cliente());
            System.out.printf("Seu saldo atual é: %.2f ", getSaldo_da_conta());
            System.out.println();
            System.out.println("Digite o valor para depositar: ");
            double deposito = teclado2.nextDouble();
            System.out.println("------------------------------");
            System.out.println();

            if (deposito > 0) {

                DateFormat df3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date data3 = new Date();

                double novo_deposito = getSaldo_da_conta() + deposito;

                System.out.println("------------------------------");
                System.out.println("Saque realizado!");
                System.out.println();
                System.out.printf("Saldo atual: %.2f", novo_deposito);
                System.out.println();
                System.out.printf("Valor depositado: %.2f", deposito);
                System.out.println();
                System.out.print("Data e hora local: ");
                System.out.println(df3.format(data3));
                System.out.println();
                System.out.println("------------------------------");

            } else {
                System.out.println("Erro!!!");
            }

        } catch (Exception e) {

            DateFormat df4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date data4 = new Date();

            System.out.println("------------------------------");
            System.out.println();
            System.out.println(getNome_do_banco());
            System.out.println("Você digitou um campo errado :( ");
            System.out.println("Operação de deposito foi cancelada!");
            System.out.printf("Saldo atual: %.2f", getSaldo_da_conta());
            System.out.println();
            System.out.print("Data e hora local: ");
            System.out.println(df4.format(data4));
            System.out.println();
            System.out.println("------------------------------");

        }

    }

    private String getNome_cliente() {
        return nome_cliente;
    }

    private int getNumero_da_conta() {
        return numero_da_conta;
    }

    private double getSaldo_da_conta() {

        return saldo_da_conta;
    }

    private int getNumero_da_agencia() {
        return numero_da_agencia;
    }

    private String getNome_do_banco() {
        return nome_do_banco;
    }

}
