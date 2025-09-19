package atividade03.jose.gabriel;

import java.util.Scanner;

public class Atividade03JoseGabriel {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         //Questao 1
         
         double acucar = 200;
         
         int porcoes = 8;
         
         System.out.print("Digite o numero de porcoes desejadas:");
         
         int pedidos = entrada.nextInt();
 
         double acucarNecessario = (acucar * pedidos) / porcoes;
         
         System.out.println("Para" + pedidos + "porcoes, voce precisara de " + acucarNecessario + "gramcas de acucar.");
         
         //Questao 2
         
         int impressoras = 3, minutos = 12;
         
         System.out.print("Digite o numero de impressoreas");
         
         int numImpressoras = entrada.nextInt();
        
         double tempoNecess = (impressoras * minutos) / (double) numImpressoras;
         
         System.out.println("Para "+ numImpressoras +" impressoras, o tempo necessario e:"+ minutos+"minutos.");
         
         //Questao 3
         
         double distancia, consumo;
         
         System.out.print("Digite a distancia em km:");
         distancia = entrada.nextDouble();
         
        consumo = (18.0 / 240.0) * distancia;
        System.out.printf("Combustivel necessario: %.2f L.%n", consumo );
        
        //Questao 4
        System.out.print("Digite o numero de maquinas");
        
        int m, h;
        
        m = entrada.nextInt();
        
        System.out.print("Digite o valor hora:");
        h = entrada.nextInt();
        
        double calc, prod;
        
        prod = 900 / (6 * 5);
        
        calc = m * h * prod;   
        
        System.out.print("Resultado com base no numero de maquinas e horas inseridos:"+ calc);
        
        //Questao 5
        
        double c, u, r; 
        
        
        c = entrada.nextDouble();
        
        System.out.print("Digite a cotacao do dolar:");
        u = entrada.nextDouble();
        
        System.out.print("Digite a quantia em dolares:");
        r = c * u;
        
        System.out.printf("voce precisa de %.2f reais .%n", r);
        
        //Questao 6
        
        double a, b, x;
        System.out.print("Digite o valor de a:");
        a = entrada.nextDouble();
        System.out.print("Digite o valor de b");
        b = entrada.nextDouble();

        x = -b / a;
        System.out.println("solucao da equacao: x =" + x);
        
        //Questao 7
        
        double mm, x0, y0;
        
        System.out.print("Digite o valor de m:");
        mm = entrada.nextDouble();
        
        System.out.print("Digite o valor de b:");
        b = entrada.nextDouble();
        
        System.out.print("Digite o valor de x0:");
        x0 = entrada.nextDouble();
        
        y0 = mm * x0 + b ;
        
        System.out.printf("Resultado: y = %.4f%n", y0);
              
        //questao 8
        
        double x1, y1, x2, y2;
        System.out.print("Digite x1: ");
        x1 = entrada.nextDouble();
        System.out.print("Digite y1: ");
        y1 = entrada.nextDouble();
        System.out.print("Digite x2: ");
        x2 = entrada.nextDouble();
        System.out.print("Digite y2: ");
        y2 = entrada.nextDouble();

        double AA = y1 - y2;
        double BB = x2 - x1;
        double CC = x1*y2 - x2*y1;

        System.out.println("Equacao da reta: " + AA + " * x + " + BB + " * y + " + CC + " = 0");

            
        // questao 9

       double m1, b1, m2, b2, xi, yi;

       System.out.print("\nDigite m1: ");
       m1 = entrada.nextDouble();

       System.out.print("Digite b1: ");
       b1 = entrada.nextDouble();

       System.out.print("Digite m2: ");
       m2 = entrada.nextDouble();

       System.out.print("Digite b2: ");
       b2 = entrada.nextDouble();
       
       xi = (b2 - b1) / (m1 - m2); 
       
       yi = m1 * xi + b1;
       
       System.out.println("Ponto de interacao: (" + xi +","+ yi +")");
       
       //questao 10
       double A, B, C, delta, x1r, x2r;

       System.out.print("\nDigite a: ");
       A = entrada.nextDouble();
       System.out.print("Digite b: ");
       B = entrada.nextDouble();
       System.out.print("Digite c: ");
       C = entrada.nextDouble();

       delta = B * B - 4 * A * C;
       x1r = (-B + Math.sqrt(delta)) / (2 * A);
       x2r = (-B - Math.sqrt(delta)) / (2 * A);

       System.out.println("Delta: " + delta);
       System.out.println("x1: " + x1r);
       System.out.println("x2: " + x2r);

       //Questao 11
       
       
       double distanciaa = Math.sqrt(delta) / Math.abs(A);
       System.out.println("Distancia entre raizes:" + distanciaa);
       
       //Questao 12
       
       double xq, fx, fpx;
       System.out.print("Digite um valor para x0:");
       xq = entrada.nextDouble();
       fx = A * Math.pow(xq, 2) + B * xq + C;
       fpx = 2 * A * xq + B;
       System.out.printf("f(x0) = %.6f%n", fx);
       System.out.printf("f'(x0) = %6f%n", fpx);
      
       
      // Questao 13
        int cod_prod;
        double soma = 0.0;

        System.out.print("Digite o codigo do produto: ");
        cod_prod = entrada.nextInt();

        switch (cod_prod) {
            case 100:
                System.out.println("Detergente - R$1,59");
                soma += 1.59;
                break;
            case 101:
                System.out.println("Esponja - R$4,59");
                soma += 4.59;
                break;
            case 102:
                System.out.println("Lã de aço - R$1,79");
                soma += 1.79;
                break;
            default:
                System.out.println("Código inválido");
        }

        System.out.println("Total: R$" + soma);
        entrada.close();
    }
}

      
    