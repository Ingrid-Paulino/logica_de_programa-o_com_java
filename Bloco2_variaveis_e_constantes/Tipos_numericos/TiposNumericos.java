public class TiposNumericos {
  public static void main(String[] args) {
    Byte numeroByte = 1; // Armazena numero de -128 até 127

    Short numeroShort = 1; // Armazena numero de -32768 até 32767

    // De sempre preferencia para usar o Interger
    Integer numeroInterger = 1; // Armazena numero de -2147483648 até 2147483647

    // No Long é necessario sinalizar o numero com a letra L
    Long numeroLong = 1L; // Armazena numero de -9,223372037×10¹⁸ até 9,223372037×10¹⁸

    Float numeroFloat = 1.0f; //f indica numero que é numero Float

    Double numeroDouble = 1.0;

    System.out.println(" Byte " + numeroByte + " Short " + numeroShort + " Interger "  +numeroInterger + " Long " + numeroLong + " Float " + numeroFloat + " Double " + numeroDouble);
  }
}

