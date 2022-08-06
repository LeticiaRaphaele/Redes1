package model;

public class CFTransmissao{

  private String mensagem;
  private String num = "";
  private TextArea bin;


  

  public void AplicacaoTransmissora (String mensagem, int choice) {


    CamadaDeAplicacaoTransmissora(mensagem);
  }

  public void CamadaFisicaTransmissora (int quadro[], int choice) {
    int tipoDeCodificacao = choice; //alterar de acordo o teste
    int fluxoBrutoDeBits []; //ATENÇÃO: trabalhar com BITS!!!
    switch (tipoDeCodificacao) {
      case 0 : //codificao binaria
        fluxoBrutoDeBits = CamadaFisicaTransmissoraCodificacaoBinaria(quadro);
        break;
      case 1 : //codificacao manchester
        fluxoBrutoDeBits = CamadaFisicaTransmissoraCodificacaoManchester(quadro);
        break;
      case 2 : //codificacao manchester diferencial
        fluxoBrutoDeBits = CamadaFisicaTransmissoraCodificacaoManchesterDiferencial(quadro);
        break;
      }//fim do switch/case
    MeioDeComunicacao(fluxoBrutoDeBits);
    }//fim do metodo CamadaFisicaTransmissora

  public void CamadaDeAplicacaoTransmissora (string mensagem) {
    int quadro [] = mensagem //trabalhar com bits!!!
    //chama a proxima camada
    CamadaFisicaTransmissora(quadro);
  }//fim do metodo CamadaDeAplicacaoTransmissora

  public int[] CamadaFisicaTransmissoraCodificacaoBinaria (int quadro []) {
    //implementacao do algoritmo
  }//fim do metodo CamadaFisicaTransmissoraCodificacaoBinaria

  public int[] CamadaFisicaTransmissoraCodificacaoManchester (int quadro []) {
    //implementacao do algoritmo
  }//fim do metodo CamadaFisicaTransmissoraCodificacaoManchester

  public int[] CamadaFisicaTransmissoraCodificacaoManchesterDiferencial(int quadro []){
    //implementacao do algoritmo
  }//fim do CamadaFisicaTransmissoraCodificacaoManchesterDiferencial


  public int[] getAscii(String mensagemTA){
    char[] mensag = mensagemTA.toCharArray();//Converte a string para um array de caracteres
    int [] ascii = "";
    for(int i = 0; i < mensag.lenght;i++)
      ascii[i] = (int) mensag[i];
    
   return ascii;
  }


  public static int[] toBinary(String text) {
    char[] charText = text.toCharArray();
    int[] intText = new int[(int) Math.ceil(((double) charText.length) / 4)];
    for (int i = 0; i < intText.length; i++) {
      for (int j = 0; j < 4; j++) {
        if (charText.length <= 4 * i + j)
          return intText;
        if (j != 0)
          intText[i] <<= 7;
        intText[i] |= (int) charText[4 * i + j];
      } // for loop ends here
    } // for loop ends here
    return intText;
  } // toBinary method ends here

}