package atividade06.josegabriel;
import java.util.Scanner;

public class Atividade06JoseGabriel {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        //Questao 1
        double nota;
        
        do{ System.out.print("Digite uma nota(0 a 10):");
        nota = entrada.nextDouble();
        
        if (nota < 0 || nota > 10){
            System.out.println("valor invalido! tente novamente");
        }
        } while (nota < 0 || nota > 10);
        
        System.out.println("nota valida:" + nota);
        
        //QUESTAO 2 
        int numero; 
        int soma = 0;
        int quantidade = 0;
        
        do { System.out.print("digite um numero(0 encerra):");
        numero = entrada.nextInt();
        
        if(numero != 0){
            soma += numero;
            quantidade ++;
        }
        } while (numero != 0);
        
        if (quantidade > 0){
            double media = (double) soma / quantidade;
            
            System.out.println("Soma:" + soma +" | Quantidade :" + quantidade +" | Media:" + media);
                  
        } else{
            System.out.println("nennhum numero valido foi digitado.");
        }
        
        //QUESTAO 3
        int numeroSecreto = (int)(Math.random()*100) + 1;
        int palpite;
        int tentativas = 0;
                
        do {
            System.out.print("palpite:");
            palpite = entrada.nextInt();
            tentativas ++;
            
            if  (palpite > numeroSecreto){
                System.out.println("muito alto!");
            
            }else if (palpite < numeroSecreto)
            {
                System.out.println("muito baixo!");
                
            }else {
                System.out.println("acertou em" + tentativas+ "tentativas!");
            }
        } while (palpite != numeroSecreto);
        
        //QUESTAO 4 
        String repetir;

        do {
            int n;
           
            do {
                System.out.print("Digite N (>0): ");
                n = entrada.nextInt();
                if (n <= 0) {
                    System.out.println("Valor inválido. Tente novamente.");
                }
            } while (n <= 0);

            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println(); 

            System.out.print("Repetir? (s/n): ");
            repetir = entrada.next();

        } while (repetir.equalsIgnoreCase("s"));
        
        //QUESTAO 5
        final String SENHA_CORRETA = "senai123";
        String senhaDigitada;
        int tentativass = 3;
        
        do {
            System.out.print("digite a senha:");
            senhaDigitada = entrada.nextLine();
            
            if (senhaDigitada.equals(SENHA_CORRETA)){
                System.out.println("Acesso concedido");
                break;
            }else{
                tentativass --;
                if (tentativas > 0){
                    System.out.println("senha incorreta. tentativas restantes:" + tentativas);
                    
                }else{
                    System.out.println("conta bloqueada.");
                }
            }
        }while(tentativass > 0);
        
        // QUESTAO 6
        System.out.print("digite um numero para ver sua tabuada:");
        int n = entrada.nextInt();
        
        System.out.println("tabuada do" + n +" = ");
        
        for (int i = 1; i <= 10; i++){
            System.out.println(n + "x" + i + " = " + (n * i));
        
            
        }



        //QUESTAO 7
        System.out.print("Digite um numero:");
        int N = entrada.nextInt();    
                
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 1; i <= N; i++){
            if (i% 2 == 0){
                somaPares += i;
            } else {
                somaImpares += i;
            }
        }
        System.out.println("soma dos pares" + somaPares);
        System.out.println("soma dos Impares" + somaImpares);
        
        //QUESTAO 8
        System.out.print("digite um numero:");
        int Num = entrada.nextInt();
        System.out.println("Numeros primos de 1 até" + Num + ":");
       
        for (int k = 2; k <= Num; k++){
            boolean ehPrimo = true;
            
            for (int d = 2; d < k; d++) {
                if (k % d == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.print(k + " ");
            }
        }
        
            }
                }