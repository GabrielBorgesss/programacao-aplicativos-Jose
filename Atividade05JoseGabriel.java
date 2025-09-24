package atividade05.josegabriel;
import java.util.Scanner;
public class Atividade05JoseGabriel {

    public static void main(String[] args) {

//questao01
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int N = sc.nextInt();
       if (N < 1) {
            System.out.println("Número inválido. Digite um número maior ou igual a 1.");
        } else {
            int i = 1;
           while (i <= N) {
                System.out.println(i);
                i++;
            }
        }
        sc.close();
    }
    
    //questao02    
public class Atividade05_Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;
        System.out.println("Digite números inteiros (digite -1 para parar):");    
       while (true) {
            numero = sc.nextInt();
            if (numero == -1) {
                break; 
            }
            soma += numero;   
            contador++;       
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Quantidade de valores lidos: " + contador);
        sc.close();
    }
}

    //questao03
public class Atividade05_Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "Java123";
        String tentativa = "";
        while (!tentativa.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            tentativa = sc.nextLine();
            if (!tentativa.equals(senhaCorreta)) {
                System.out.println("senha incorreta");
            }
        }
        System.out.println("acesso permitido");
        sc.close();
    }
}

   // Questao 4 
    public class Atividade05_Questao04 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int opcao = 1, num1, num2, soma;  
   while (opcao != 0) {
        System.out.println("Menu");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("0 - Sair");       
        opcao = input.nextInt();       
       switch (opcao) {
            case 1:
                System.out.print("Digite um número: ");
                num1 = input.nextInt();
                System.out.print("Digite outro número: ");
                num2 = input.nextInt();
                soma = num1 + num2;
                System.out.println("A soma dos valores é: " + soma);
                break;          
            case 2:             
        }        
    } 
}
    
//questao05
    public class Atividade05_Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro n (n >= 0): ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Número inválido! O valor de n deve ser >= 0.");
        } else {
            long fatorial = 1; 
            int i = 1;
           while (i <= n) {
                fatorial *= i; 
                i++;
            }
            System.out.println(n + "! = " + fatorial);
        }
        sc.close();
    }
}

//questao06
public class Atividade05_Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro N (> 0): ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Número inválido! N deve ser > 0.");
        } else {
            int a = 0; 
            int b = 1; 
            System.out.print("Sequência de Fibonacci até " + N + ": ");            
           while (a <= N) {
                System.out.print(a + " ");
                int proximo = a + b; 
                a = b;               
                b = proximo;
            }
        }
        sc.close();
    }
}

//questao07
public class Atividade05_Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro n (≥ 2): ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Número inválido! n deve ser ≥ 2.");
        } else {
            boolean primo = true;
            int divisor = 2;
           while (divisor * divisor <= n) {
                if (n % divisor == 0) {
                    primo = false;
                    break;
                }
                divisor++;
            }
            if (primo) {
                System.out.println("primo");
            } else {
                System.out.println("não primo");
            }
        }
        sc.close();
    }
}

//questao08
public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;
        System.out.println("Digite um número (negativo para encerrar):");
        numero = scanner.nextInt();       
       while (numero >= 0) {
            soma += numero;
            System.out.println("Digite outro número (negativo para encerrar):");
            numero = scanner.nextInt();
        }
        System.out.println("A soma dos números digitados é: " + soma);
        scanner.close();
    }
}

//questao09
public class AnalisaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro (pode ser negativo): ");
        int n = scanner.nextInt();                      
        int original = n;              
        int x = Math.abs(n);   
        int somaDigitos = 0;
        int numDigitos = 0;
        int reverso = 0;              
       if (x == 0) {
            numDigitos = 1;
            somaDigitos = 0;
            reverso = 0;
        } else {
            while (x > 0) {
                int digito = x % 10;
                somaDigitos += digito;                            
                reverso = reverso * 10 + digito;          
                x = x / 10;
                numDigitos++;
            }
        }             
        if (original < 0) {
            reverso = -reverso;
        }      
        System.out.println("Número de dígitos: " + numDigitos);
        System.out.println("Soma dos dígitos: " + somaDigitos);
        System.out.println("Reverso do número: " + reverso);
    }
}

//questao10
public class SequenciaCollatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um inteiro n > 0: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Erro: n deve ser maior que zero.");
        } else {
            System.out.println("Sequência de Collatz começando em " + n + ":");        
            System.out.print(n);            
          
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                System.out.print(" -> " + n);
            }          
            System.out.println(); 
        }
        
        scanner.close();
    }
}
    }
}