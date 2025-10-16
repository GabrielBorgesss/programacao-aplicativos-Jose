package desafio1.pkg2_josegabriel;

import java.util.Scanner;

public class Desafio12_JoseGabriel {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        ServicoBancario servico = new ServicoBancario(en);
        String sair = servico.sair;
        String retorna = servico.retorna;
        int opcao;

        do {
            retorna = servico.retorna = "N";
            System.out.println("\n=== MENU BANCÁRIO ===");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Ver Extrato");
            System.out.println("4 - Simular Empréstimo");
            System.out.println("5 - Comprar Dólar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            // Ler int + consumir a linha para evitar erro no Scanner
            while (!en.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número.");
                en.next();
            }
            opcao = en.nextInt();
            en.nextLine(); // limpar buffer do teclado
            
            switch (opcao) {
                case 1:
                    servico.mostraSaldo();
                    servico.voltarMenu();
                    break;
                case 2:
                    servico.realizarDeposito();
                    servico.voltarMenu();
                    break;
                case 3:
                    servico.exibirExtrato();
                    servico.voltarMenu();
                    break;
                case 4:
                    servico.simularEmprestimo();
                    servico.voltarMenu();
                    break;
                case 5:
                    servico.comprarDolar();
                    servico.voltarMenu();
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    servico.sair = "S";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            sair = servico.sair;

        } while (!sair.equalsIgnoreCase("S"));

        en.close();
    }
}


package desafio1.pkg2_josegabriel;

    public class ContaBancaria {
    public double saldo;
    public double saldoDolar;

    public ContaBancaria() {
        this.saldo = 100.00;
        this.saldoDolar = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean comprarDolar(double quantidade, double cotacao) {
        double custo = quantidade * cotacao;
        if (saldo >= custo) {
            saldo -= custo;
            saldoDolar += quantidade;
            return true;
        }
        return false;
    }
}



package desafio1.pkg2_josegabriel;

public class ExtratoBancario {
    private Movimentacao[] movimentacoes = new Movimentacao[10];
    private int posicao = 0;
    private int total = 0;

    public void adicionarMovimentacao(String descricao, double valor) {
        movimentacoes[posicao] = new Movimentacao(descricao, valor);
        posicao = (posicao + 1) % 10;
        if (total < 10) total++;
    }

    public void exibirExtrato() {
        System.out.println("\nEXTRATO BANCARIO \n");
        if (total == 0) {
            System.out.println("Nenhum extrato");
        } else {
            int indice = (posicao - total + 10) % 10;
            for (int i = 0; i < total; i++) {
                int atual = (indice + i) % 10;
                System.out.println((i + 1) + ") " + movimentacoes[atual]);
            }
        }
    }
}


package desafio1.pkg2_josegabriel;

public class Movimentacao {
    private String descricao;
    private double valor;

    public Movimentacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao + " - R$ " + String.format("%.2f", valor);
    }
}


package desafio1.pkg2_josegabriel;

import java.util.Scanner;

public class ServicoBancario {
    private Scanner en;
    public String sair = "N";
    public String retorna = "N";
    public contaBancaria conta;
    public ExtratoBancario extrato;
    private final double cotacao = 5.32;

    public ServicoBancario(Scanner scanner) {
        this.en = scanner;
        this.conta = new contaBancaria();
        this.extrato = new ExtratoBancario();
    }

    public void mostraSaldo() {
        System.out.printf("Saldo em reais: R$ %.2f\n", conta.saldo);
        System.out.printf("Saldo em dólares: US$ %.2f\n", conta.saldoDolar);
    }

    public void realizarDeposito() {
        double valor;
        do {
            System.out.print("Informe o valor do deposito (R$):  ");
            while (!en.hasNextDouble()) {
                System.out.println("Valor inválido. Digite um número decimal.");
                en.next();
            }
            valor = en.nextDouble();
            en.nextLine();
            if (valor < 1 || valor > 4999) {
                System.out.println("!!!Valor invalido!!! \nO deposito deve ser maior que R$ 0,00 e até R$ 5.000,00. Digite novamente.");
            }
        } while (valor < 1 || valor > 4999);

        conta.depositar(valor);
        extrato.adicionarMovimentacao("Depósito", valor);
        System.out.println("Depósito realizado com sucesso.");
    }

    public void exibirExtrato() {
        extrato.exibirExtrato();
    }

    public void simularEmprestimo() {
        SimuladorEmprestimo sim = new SimuladorEmprestimo();

        double valorEmprestimo;
        do {
            System.out.print("Informe o valor do emprestimo (R$): ");
            while (!en.hasNextDouble()) {
                System.out.println("Valor inválido. Digite um número decimal.");
                en.next();
            }
            valorEmprestimo = en.nextDouble();
            en.nextLine();
        } while (valorEmprestimo < 200 || valorEmprestimo > 100000);

        System.out.print("Informe o seu salario bruto (R$):  ");
        double salario;
        while (!en.hasNextDouble()) {
            System.out.println("Valor inválido. Digite um número decimal.");
            en.next();
        }
        salario = en.nextDouble();
        en.nextLine();

        int parcelas;
        int[] opcoesValidas = {6, 12, 18, 24, 30, 36, 40, 48, 56, 60, 72};
        boolean valido;
        do {
            System.out.print("Quantidade de parcelas (6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72x): ");
            while (!en.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número inteiro.");
                en.next();
            }
            parcelas = en.nextInt();
            en.nextLine();
            valido = false;
            for (int op : opcoesValidas) {
                if (op == parcelas) {
                    valido = true;
                    break;
                }
            }
            if (!valido) {
                System.out.println("Insira uma quantidade de parcela válida.");
            }
        } while (!valido);

        sim.simular(salario, valorEmprestimo, parcelas);
    }

    public void comprarDolar() {
        System.out.printf("Seu saldo bancário é de R$ %.2f \n", conta.saldo);
        do {
            retorna = "N";
            System.out.print("Quantos dólares deseja comprar (US$)?  ");
            while (!en.hasNextDouble()) {
                System.out.println("Valor inválido. Digite um número decimal.");
                en.next();
            }
            double quantidade = en.nextDouble();
            en.nextLine();

            double custo = quantidade * cotacao;
            if (conta.saldo < custo) {
                System.out.printf("Custo em Reais: R$ %.2f\nSeu saldo atual é insuficiente.\n", custo);
                return;
            }
            System.out.printf("Custo em Reais: R$ %.2f \n", custo);
            System.out.print("Confirma compra? (S/N): ");
            String resposta = en.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                conta.comprarDolar(quantidade, cotacao);
                extrato.adicionarMovimentacao("Compra de Dólar", custo);
                System.out.printf("\nCompra realizada com sucesso. \nNovo saldo: \n- Reais: R$ %.2f \n- Dólares: US$ %.2f\n", conta.saldo, conta.saldoDolar);
            } else if (resposta.equalsIgnoreCase("N")) {
                System.out.print("Deseja simular novamente (R), voltar ao menu (V) ou encerrar o programa (E)? ");
                retorna = en.nextLine();
            }
        } while (retorna.equalsIgnoreCase("R"));
    }

    public void voltarMenu() {
        do {
            if (sair.equalsIgnoreCase("S") || retorna.equalsIgnoreCase("E")) {
                sair = "S";
            } else if (retorna.equalsIgnoreCase("V")) {
                // Voltar ao menu
            } else {
                System.out.print("\nDeseja retornar ao menu inicial (V) ou encerrar o programa (E): ");
                retorna = en.nextLine();
                if (retorna.equalsIgnoreCase("E")) {
                    System.out.println("Encerrando programa...");
                    sair = "S";
                } else if (retorna.equalsIgnoreCase("V")) {
                    // Continua no menu
                } else {
                    System.out.println("Opção inválida.");
                }
            }
        } while (!sair.equalsIgnoreCase("S") && !retorna.equalsIgnoreCase("V"));
    }
}


package desafio1.pkg2_josegabriel;

import java.util.Random;

public class SimuladorEmprestimo {
    public void simular(double salario, double valorEmprestimo, int parcelas) {
        double parcelaMax = salario * 0.3;
        double juros = valorEmprestimo * 0.02;
        double total = valorEmprestimo + juros;
        double valorParcela = total / parcelas;

        System.out.printf("Valor da parcela: R$ %.2f x %d \n", valorParcela, parcelas);
        System.out.printf("Valor do empréstimo: R$ %.2f \n", valorEmprestimo);
        System.out.printf("Valor total do empréstimo a ser pago: R$ %.2f \n", total);

        if (valorParcela > parcelaMax) {
            System.out.println("Empréstimo indisponível! O valor da parcela não pode ultrapassar o valor de R$ " + String.format("%.2f", parcelaMax));
        } else {
            int protocolo = new Random().nextInt(99999);
            System.out.println("Empréstimo disponível! \nEntre em contato com a central e informe o número do protocolo EM" + protocolo);
        }
    }
}

