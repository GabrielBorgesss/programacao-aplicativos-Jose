package atividade02pedroejose;
import java.util.Scanner;
import java.lang.Math;

public class Atividade02PedroeJOse {

    public static void main(String[] args) 
    {
      // Questao 1   
      Scanner entrada = new Scanner(System.in);
      double raio,area,circunf;
      
      System.out.print("Digite o valor de raio do circulo:");
      raio = entrada.nextDouble();
      
      area = Math.PI*(Math.pow(raio,2));
      circunf = 2*Math.PI*raio;
      
      System.out.println("Resultado area"+area);
      System.out.println("Resultado circunferencia:"+circunf);
      
    
      // questao 2
      double imc, peso, altura;
            
      System.out.print("\nDigite seu peso em kg: ");
      peso = entrada.nextDouble();
            
      System.out.print("Digite sua altura em metros: ");
      altura = entrada.nextDouble();
            
      imc = peso / (altura * altura);
      System.out.println("Seu IMC é: " + imc);
      
      
      // Questao 3
      double cateto1, cateto2, hipotenusa;
      
      System.out.print("Digite o valor do primeiro cateto");
      cateto1 = entrada.nextDouble();
      System.out.print("Digite o valor do segundo cateto");
      cateto2 = entrada.nextDouble();
      
      hipotenusa = Math.sqrt(Math.pow(cateto1, 2)) + Math.pow(cateto2, 2);
      
      System.out.printf("O valor da hipotenusa e: %.3f\n,", hipotenusa);
           

      // Questao 4
      double valorReais, cotacao, trocoReais;
             
      System.out.print("Digite o valor em reais:");
      valorReais = entrada.nextDouble();    
      System.out.print("Digite a cotação do dolares:");
      cotacao = entrada.nextDouble();
      
      int dolaresInteiros = (int) ( valorReais / cotacao );
              
      trocoReais = valorReais - (dolaresInteiros * cotacao);
      
      System.out.println("Voce pode comprar" + dolaresInteiros + "dolaras inteiros.");
     
      System.out.printf("O troco em reais sera: %.2f\n", trocoReais);
      
     
   // Questao 5
      int n, valor, soma = 0, menor, maior;
      
      System.out.print("Digite a quantidade de números: ");
      n = entrada.nextInt();

      System.out.print("Digite o primeiro valor: ");
      valor = entrada.nextInt();

      soma = valor;
      menor = valor;
      maior = valor;

      for (int i = 1; i < n; i++) {
      System.out.print("Digite outro valor: ");
      valor = entrada.nextInt();
      soma += valor;
      if (valor < menor) menor = valor;
      if (valor > maior) maior = valor;
}

      double media = (double) soma / n;

      System.out.println("Média: " + media);
      System.out.println("Menor valor: " + menor);
      System.out.println("Maior valor: " + maior);

                            
      //questao 6
      double graus, rad, sen, cos, tan;
      
      graus = entrada.nextDouble();
      rad = Math.toRadians(graus);
      sen = Math.sin(rad); 
      cos = Math.cos(rad);
      tan = Math.tan(rad);

            
      //questao 7
      double x1, y1, x2, y2, distancia;
      System.out.print("\nDigite x1: ");
      x1 = entrada.nextDouble();
      System.out.print("Digite y1: ");
      y1 = entrada.nextDouble();
      System.out.print("Digite x2: ");
      x2 = entrada.nextDouble();
      System.out.print("Digite y2: ");
      y2 = entrada.nextDouble();
      distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      System.out.println("Distância entre os pontos: " + distancia);
            
      //questao 8
      double n1, n2, n3, media3, somaAbs, dif1, dif2, dif3, maiorDif;
      System.out.print("\nDigite o primeiro número: ");
      n1 = entrada.nextDouble();
      
      System.out.print("Digite o segundo número: ");
      n2 = entrada.nextDouble();
      
      System.out.print("Digite o terceiro número: ");
      n3 = entrada.nextDouble();
      media3 = (n1 + n2 + n3) / 3;
      somaAbs = Math.abs(n1) + Math.abs(n2) + Math.abs(n3);
      dif1 = Math.abs(n1 - n2);
      dif2 = Math.abs(n1 - n3);
      dif3 = Math.abs(n2 - n3);
      maiorDif = Math.max(dif1, Math.max(dif2, dif3));
      
      System.out.println("Média: " + media3);
      System.out.println("Soma dos valores absolutos: " + somaAbs);
      System.out.println("Maior diferença: " + maiorDif);
            
      //questao 9 
      double A, B, C, delta, x1r, x2r;
      System.out.print("\nDigite a: ");
      A = entrada.nextDouble();
      
      System.out.print("Digite b: ");
      B = entrada.nextDouble();
      
      System.out.print("Digite c: ");
      C = entrada.nextDouble();
      
      delta = (B * B) - (4 * A * C);
      if (delta < 0) {
      System.out.println("Não existem raízes reais.");
      } else {
      x1r = (-B + Math.sqrt(delta)) / (2 * A);
      x2r = (-B - Math.sqrt(delta)) / (2 * A);
      System.out.println("x1: " + x1r);
      System.out.println("x2: " + x2r);
            }   
            
      //questao 10
      double f, c;
      System.out.print("\nDigite a temperatura em Fahrenheit: ");
      f = entrada.nextDouble();
      c = (f - 32) * 5 / 9;
      System.out.println("Fahrenheit: " + f);
      System.out.println("Celsius: " + c);
        }
    }

