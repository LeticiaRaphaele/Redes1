package model;

public class CFTransmissao{

  private String mensagem;
  private String num = "";
  private TextArea bin;

  

  public static void AplicacaoTransmissora (String mensagem, int choice) {


    CamadaDeAplicacaoTransmissora(mensagem);
  }

  public static void CamadaFisicaTransmissora (int quadro[], int choice) {
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

  public static void CamadaDeAplicacaoTransmissora (string mensagem) {
    int quadro [] = mensagem //trabalhar com bits!!!
    //chama a proxima camada
    CamadaFisicaTransmissora(quadro);
  }//fim do metodo CamadaDeAplicacaoTransmissora

  public static int[] CamadaFisicaTransmissoraCodificacaoBinaria (int quadro []) {
    //implementacao do algoritmo
  }//fim do metodo CamadaFisicaTransmissoraCodificacaoBinaria

  public static int[] CamadaFisicaTransmissoraCodificacaoManchester (int quadro []) {
    //implementacao do algoritmo
  }//fim do metodo CamadaFisicaTransmissoraCodificacaoManchester

  public static int[] CamadaFisicaTransmissoraCodificacaoManchesterDiferencial(int quadro []){
    //implementacao do algoritmo
  }//fim do CamadaFisicaTransmissoraCodificacaoManchesterDiferencial
}