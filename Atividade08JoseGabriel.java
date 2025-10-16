package atividade08.josegabriel;
import java.util.Scanner;
public class Atividade08JoseGabriel {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        double resultado = somar(num1, num2);
        System.out.println("A soma é: " + resultado);

        entrada.close();
    }
}


public class ParOuImpar {
    public static String verificar(int n) {
        if (n % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        System.out.println("O número é " + verificar(numero));
        entrada.close();
    }
}


public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 25);
        p1.exibirDados();
    }
}

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Uno", 2020);
        carro1.exibirInfo();
    }
}




public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 6) {
            System.out.println(nome + " foi aprovado com média " + media);
        } else {
            System.out.println(nome + " foi reprovado com média " + media);
        }
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 7.5, 8);
        a1.verificarAprovacao();
    }
}


public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total em estoque: R$" + calcularValorTotal());
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2500.0, 4);
        p1.exibirProduto();
    }
}


public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Ana", 1000.0);
        conta1.exibirSaldo();
        conta1.depositar(500);
        conta1.sacar(300);
        conta1.exibirSaldo();
    }
}
    
    

