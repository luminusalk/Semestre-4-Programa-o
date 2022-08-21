/*
* Atividade 01 - Questão 01
* Pedro Henrique Torres de Alencar
*
* Ler a cotação do dolar, informar a quantidade de doláres, converter para real e mostrar o resultado
*/

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
     
        Scanner ler = new Scanner(System.in);
        
        Double cotacao, dolar, real;
      
        System.out.println("Digite o valor da cotação:");
        
        cotacao = ler.nextDouble();
      
        if (cotacao <= 0)
        {
          System.out.println("Digite um valor de cotação maior que zero e tente novamente!");
          return;
        }
        
      System.out.println("Digite a quantidade de dólar que você considerando também o valor em centavos:");
      dolar = ler.nextDouble();
        
      if (dolar <= 0)
      {
          System.out.println("Digite um valor em dólar maior que zero e tente novamente!");
          return;
      }
        
      //Efetua a multiplicação da quantidade de dólar pela cotação.
      real = dolar*cotacao;
      
      System.out.printf("Você possui %.2f R$!!\n", real);
      return;
    }
}
