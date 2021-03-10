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

        String cor = "\u001B[";

        System.out.print(cor + "33" + "m");
        System.out.println("------------------------------");
        System.out.print(cor + "m");
        System.out.println(getNome_do_banco());
        System.out.printf("Numero da agência: %d", getNumero_da_agencia());
        System.out.println();
        System.out.println("Seja bem vindo: " + getNome_cliente());
        System.out.printf("Seu saldo atual é: %.2f", getSaldo_da_conta());
        System.out.println();
        System.out.printf("Seu rendimento no final do mês será: %.2f", calculaRendimento());
        System.out.println();
        System.out.print(cor + "33" + "m");
        System.out.println("------------------------------");
        System.out.print(cor + "m");

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

            String cor2 = "\u001B[";

            System.out.print(cor2 + "34" + "m");
            System.out.println("------------------------------");
            System.out.print(cor2 + "m");
            System.out.println(getNome_do_banco());
            System.out.printf("Numero da agência: %d", getNumero_da_agencia());
            System.out.println();
            System.out.println("Seja bem vindo: " + getNome_cliente());
            System.out.printf("Seu saldo atual é: %.2f", getSaldo_da_conta());
            System.out.println();
            System.out.println("Digite o valor para sacar: ");
            double saq = teclado1.nextDouble();
            System.out.print(cor2 + "34" + "m");
            System.out.println("------------------------------");
            System.out.print(cor2 + "m");

            double saque = saq;

            if (getSaldo_da_conta() == 0) {

                System.out.print(cor2 + "31" + "m");
                System.out.println("------------------------------");
                System.out.print(cor2 + "m");
                System.out.println("Você não tem dinheiro suficiente "
                        + "para realizar o saque!");
                System.out.print(cor2 + "31" + "m");
                System.out.println("------------------------------");
                System.out.print(cor2 + "m");

            } else if (saque > getSaldo_da_conta()) {

                System.out.print(cor2 + "31" + "m");
                System.out.println("------------------------------");
                System.out.print(cor2 + "m");
                System.out.println("O valor que você solicitou para saque"
                        + " é maior que o dinheiro em conta");
                System.out.print(cor2 + "31" + "m");
                System.out.println("------------------------------");
                System.out.print(cor2 + "m");

            } else {

                DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date data1 = new Date();

                double novo_saque = getSaldo_da_conta() - saque;

                System.out.print(cor2 + "32" + "m");
                System.out.println("------------------------------");
                System.out.print(cor2 + "m");
                System.out.println("Saque realizado!");
                System.out.printf("Saldo atual: %.2f", novo_saque);
                System.out.println();
                System.out.printf("Valor sacado: %.2f", saque);
                System.out.println();
                System.out.print("Data e hora local: ");
                System.out.println(df1.format(data1));
                System.out.print(cor2 + "32" + "m");
                System.out.println("------------------------------");
                System.out.print(cor2 + "m");

            }

        } catch (Exception e) {

            DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date data2 = new Date();
            String cor3 = "\u001B[";

            System.out.print(cor3 + "34" + "m");
            System.out.println("------------------------------");
            System.out.print(cor3 + "m");
            System.out.print(cor3 + "31" + "m");
            System.out.println("------------------------------");
            System.out.print(cor3 + "m");
            System.out.println(getNome_do_banco());
            System.out.println("Você digitou um campo errado :( ");
            System.out.println("Operação de saque foi cancelada!");
            System.out.printf("Saldo atual: %.2f", getSaldo_da_conta());
            System.out.println();
            System.out.print("Data e hora local: ");
            System.out.println(df2.format(data2));
            System.out.print(cor3 + "31" + "m");
            System.out.println("------------------------------");
            System.out.print(cor3 + "m");

        }

    }

    public void depositar() {

        try {

            Scanner teclado2 = new Scanner(System.in);

            String cor4 = "\u001B[";
            System.out.print(cor4 + "33" + "m");
            System.out.println("------------------------------");
            System.out.print(cor4 + "m");
            System.out.println(getNome_do_banco());
            System.out.printf("Numero da agência: %d", getNumero_da_agencia());
            System.out.println();
            System.out.println("Seja bem vindo: " + getNome_cliente());
            System.out.printf("Seu saldo atual é: %.2f ", getSaldo_da_conta());
            System.out.println();
            System.out.println("Digite o valor para depositar: ");
            double dep = teclado2.nextDouble();
            System.out.print(cor4 + "33" + "m");
            System.out.println("------------------------------");
            System.out.print(cor4 + "m");

            double deposito = dep;

            if (deposito > 0) {

                DateFormat df3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date data3 = new Date();

                double novo_deposito = getSaldo_da_conta() + deposito;

                System.out.print(cor4 + "32" + "m");
                System.out.println("------------------------------");
                System.out.print(cor4 + "m");
                System.out.println("Deposito realizado!");
                System.out.printf("Saldo atual: %.2f", novo_deposito);
                System.out.println();
                System.out.printf("Valor depositado: %.2f", deposito);
                System.out.println();
                System.out.print("Data e hora local: ");
                System.out.println(df3.format(data3));
                System.out.print(cor4 + "32" + "m");
                System.out.println("------------------------------");
                System.out.print(cor4 + "m");

            } else {
                System.out.println("Erro!!!");
            }

        } catch (Exception e) {

            DateFormat df4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date data4 = new Date();
            String cor5 = "\u001B[";

            System.out.print(cor5 + "33" + "m");
            System.out.println("------------------------------");
            System.out.print(cor5 + "m");
            System.out.print(cor5 + "31" + "m");
            System.out.println("------------------------------");
            System.out.print(cor5 + "m");
            System.out.println(getNome_do_banco());
            System.out.println("Você digitou um campo errado :( ");
            System.out.println("Operação de deposito foi cancelada!");
            System.out.printf("Saldo atual: %.2f", getSaldo_da_conta());
            System.out.println();
            System.out.print("Data e hora local: ");
            System.out.println(df4.format(data4));
            System.out.print(cor5 + "31" + "m");
            System.out.println("------------------------------");
            System.out.print(cor5 + "m");

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
