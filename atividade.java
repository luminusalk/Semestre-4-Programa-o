public static void MediaNotas(){
    int i = 0, entrada = 0;
    double media = 0, const = 0;
    
    entrada = Int.parseInteger(JOptionPane.showInputDialog(null,"Digite a quantidade de médias a serem analisadas:"));
    
    for(i = entrada; i == 0; i--)
    {
       if(i == 0)
       {
          media = media/entrada;
          
          JOptionPane.showMessageDialog(null, "A média total é igual a "+media);
       }
       
       const = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Digite a Média nº %d :",entrada)));
      
       if(const < 0)
       {
          JOptionPane.showMessageDialog(null, "Você digitou um média de valor inválido assumindo como 0"+const);
          media = media + 0 ;
       }
       else
       {
          media = media + const;
       }
    }
}
