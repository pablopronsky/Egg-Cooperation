package Main;

import Entitie.Quote;
import Services.QuoteService;

public class Main {
  public static void main(String[] args) {
    QuoteService qs = new QuoteService();
    qs.createQuote();
  }
}
