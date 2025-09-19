package atividade04.josegabriel;

import java.util.Scanner;

public class Atividade04JoseGabriel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Questão 1
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        if (numero < 0) {
            System.out.println("Você digitou um número negativo.");
        } else {
            System.out.println("Você digitou um número positivo.");
        }

        //Questão 2
        System.out.print("\nDigite outro número: ");
        int num2 = entrada.nextInt();
        if (num2 < 0) {
            System.out.println("Você digitou um número negativo.");
        } else if (num2 > 0) {
            System.out.println("Você digitou um número positivo.");
        } else {
            System.out.println("Você digitou zero.");
        }

        //Questão 3
        System.out.print("\nDigite 3 notas: ");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        if (media >= 7) {
            System.out.println("ALUNO APROVADO");
        } else {
            System.out.println("ALUNO REPROVADO");
        }

        //Questão 4
        System.out.print("\nDigite 3 notas: ");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();
        media = (n1 + n2 + n3) / 3;
        if (media >= 7) {
            System.out.println("ALUNO APROVADO");
        } else if (media >= 5) {
            System.out.println("ALUNO EM RECUPERAÇÃO");
        } else {
            System.out.println("ALUNO REPROVADO");
        }

        //Questão 5
        System.out.print("\nDigite um número: ");
        int num3 = entrada.nextInt();
        if (num3 % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        //Questão 6
        System.out.print("\nDigite 3 números: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        System.out.println("O maior número é: " + maior);

        //Questão 7
        System.out.print("\nDigite a idade do nadador: ");
        int idade = entrada.nextInt();
        if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 14) {
            System.out.println("Juvenil");
        } else if (idade >= 9) {
            System.out.println("Infantil");
        } else {
            System.out.println("Mirim");
        }

        // Questão 8
        System.out.print("\nDigite dois números: ");
        int nA = entrada.nextInt();
        int nB = entrada.nextInt();
        int soma = nA + nB;
        if (soma > 20) {
            soma += 8;
        } else {
            soma -= 5;
        }
        System.out.println("Resultado: " + soma);

        //Questão 9
        System.out.print("\nDigite o valor do produto: ");
        double valor = entrada.nextDouble();
        double venda;
        if (valor < 20) {
            venda = valor + (valor * 0.45);
        } else {
            venda = valor + (valor * 0.30);
        }
        System.out.println("Valor de venda: R$ " + venda);

        // Questão 10
        System.out.print("\nDigite a quantidade de maçãs: ");
        int qtd = entrada.nextInt();
        double preco;
        if (qtd < 12) {
            preco = qtd * 0.30;
        } else {
            preco = qtd * 0.25;
        }
        System.out.println("Valor total da compra: R$ " + preco);

        //Questão 11
        System.out.print("\nDigite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.print("Digite o sexo (1=feminino, 2=masculino): ");
        int sexo = entrada.nextInt();
        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }
        System.out.println("Peso ideal: " + pesoIdeal);

        //Questão 12
        System.out.print("\nDigite um número de 1 a 7 para o dia da semana: ");
        int dia = entrada.nextInt();
        switch (dia) {
            case 1: System.out.println("Domingo - Final de semana"); break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Dia útil"); break;
            case 7: System.out.println("Sábado - Final de semana"); break;
            default: System.out.println("Dia inválido");
        }

        //Questão 13
        System.out.print("\nDigite o código do produto (1-3): ");
        int codigo = entrada.nextInt();
        double precoProd;
        switch (codigo) {
            case 1: precoProd = 5.0; break; // exemplo
            case 2: precoProd = 8.5; break;
            case 3: precoProd = 3.75; break;
            default: precoProd = 0; System.out.println("Código inválido");
        }
        if (precoProd > 0) {
            System.out.println("Preço do produto: R$ " + precoProd);
        }

        //Questão 14
        System.out.println("\nEscolha a operação: 1=Soma, 2=Subtração, 3=Multiplicação, 4=Divisão");
        int opcao = entrada.nextInt();
        System.out.print("Digite dois números: ");
        double op1 = entrada.nextDouble();
        double op2 = entrada.nextDouble();
        double resultado = 0;
        switch (opcao) {
            case 1: resultado = op1 + op2; break;
            case 2: resultado = op1 - op2; break;
            case 3: resultado = op1 * op2; break;
            case 4: 
                if (op2 != 0) {
                    resultado = op1 / op2;
                } else {
                    System.out.println("Divisão por zero não permitida!");
                }
                break;
            default: System.out.println("Opção inválida");
        }
        if (opcao >= 1 && opcao <= 4 && !(opcao == 4 && op2 == 0)) {
            System.out.println("Resultado: " + resultado);
        }

        entrada.close();
    }
}
  
    
