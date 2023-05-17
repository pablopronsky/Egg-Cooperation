package Entitie;

public class Quote {
  private String quote;
  private int quoteLength;
  
  public Quote(String quote) {
    this.quote = quote;
    this.quoteLength = quote.length();
  }
  
  public Quote() {}
  
  public String getQuote() {
    return quote;
  }
  
  public void setQuote(String quote) {
    this.quote = quote;
  }
  
  public int getQuoteLength() {
    return quoteLength;
  }
  
  public void setQuoteLength(int quoteLength) {
    this.quoteLength = quoteLength;
    
  }
}
/*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters.
El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
 */