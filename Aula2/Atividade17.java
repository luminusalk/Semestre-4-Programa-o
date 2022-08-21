/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 17 de Programas e Soluções Computacionais
 * Ler uma temperatura em ºC e converter em ºF
 */
import javax.swing.JOptionPane;

public class Atividade17 {
    public static void main(String[] args){
        double GrausC, GrausF;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Irei converter a temperatura de Graus Celsius para Fahrenheit!");
        
        //Insere o valor da Temperatura em ºC
        GrausC = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da temperatura em ºC! Exemplo: 23.7"));
        
        //A temperatura não pode ser abaixo do zero absoluto!
        if(GrausC < -273.15)
        {
            JOptionPane.showMessageDialog(null,"Muito frio para eu conseguir calcular!");
            return;
        }
        
        //Converte para Fahrenheit ºF
        GrausF = (GrausC*(9.0/5.0))+32.0;
        
        //Exibe a mensagem com a ordem crescente dos números
        JOptionPane.showMessageDialog(null,"A temperatura de "+GrausC+" ºC equivale a: "+GrausF+" ºF.");
    }
}
