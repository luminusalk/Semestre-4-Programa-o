/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 4 - Aula 5
 * Simula a ocupação de um Hotel
 * Existem 5 andares com 10 quartos cada um
 * O objetivo é saber se um quarto está ocupado ou não
 * Deve possuir um menu com as opções:
 *  1 - Imprimir lista de quartos
 *  2 - Definir ocupação
 *  3 - Sair
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class Atividade04 {
    public static void main(String args[]) {
        int[][] quartos = new int[5][10];
        int menu, menuocup, andar, quarto, estado, i, j;
        
        do
        {
            //Digite as opções que o programa fornece
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Bem-vindo ao Unifacs Hotel, "
                    + "Digite 1: Para imprimir a lista de quartos. "
                    + "Digite 2: Para definir a ocupação dos quartos. "
                    + "Digite 3: Para sair do programa."));

            switch(menu)
            {
                case 1://Imprime a lista de quartos
                    for(i = 0; i < 5; i++)
                    {
                        for(j = 0; j < 10; j++)
                        {
                            if(quartos[i][j] == 0)
                                System.out.println("Andar: "+(i+1)+"º, Quarto Nº: "+(j+1)+" está desocupado.");
                            else
                                System.out.println("Andar: "+(i+1)+"º, Quarto Nº: "+(j+1)+" está ocupado.");
                        }
                    }
                    break;
                case 2://Define a ocupação
                    {
                        menuocup = Integer.parseInt(JOptionPane.showInputDialog(null,"De que forma você deseja definir a ocupação? "
                                    + "Digite 1: Manual. "
                                    + "Digite 2: Automática. "
                                    + "Digite 3: Apagar todas as entradas. "
                                    + "Digite 4: Para sair do programa."));
                        switch(menuocup)
                        {
                            //Modo manual - Define de forma manual a ocupação dos quartos
                            case 1:
                                andar = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o nº do andar que o quarto está localizado: (Insira valores entre 0 e 4)"));
                                if (andar < 0 || andar > 4)
                                {
                                    JOptionPane.showMessageDialog(null,"Você digitou um valor não permitido!");
                                    break;
                                }

                                quarto = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o nº do quarto correspondente que você deseja consultar: (Insira valores entre 0 e 9)"));
                                if (quarto < 0 || quarto > 9)
                                {
                                    JOptionPane.showMessageDialog(null,"Você digitou um valor não permitido!");
                                    break;
                                }

                                estado = Integer.parseInt(JOptionPane.showInputDialog(null,"Como o quarto está? 0 - Livre, 1 - Ocupado"));
                                if (estado < 0 || estado > 1)
                                {
                                    JOptionPane.showMessageDialog(null,"Você digitou um valor não permitido!");
                                    break;
                                }

                                //Grava as informações
                                quartos[andar][quarto] = estado;
                                break;

                            //Modo automático - Define de forma randômica se os quartos estão ocupados ou não
                            case 2:
                                //Instância um objeto da classe Random usando o construtor básico
                                Random rand = new Random();

                                for(i = 0; i < 5; i++)
                                {
                                    for(j = 0; j < 10; j++)
                                    {
                                       //Grava as informações
                                       quartos[i][j] = rand.nextInt(2); 
                                    }
                                }
                                break;

                            //Limpa todas as entradas do array
                            case 3:
                                for(i = 0; i < 5; i++)
                                {
                                    for(j = 0; j < 10; j++)
                                    {
                                       //Grava as informações
                                       quartos[i][j] = 0; 
                                    }
                                }
                                break;
                                
                            //Fecha o programa
                            case 4:
                                System.exit(0);
                                break;
                                
                            default:
                                break;
                        }
                    }
                    break;
                    
                default:
                    break;
            }

        }while( menu != 3);
       
        //Exibe a mensagem que não teve nome sorteado!
        JOptionPane.showMessageDialog(null,"O programa foi encerrado!");
    }
}