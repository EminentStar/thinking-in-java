package chap06.initialization.and.cleanup;

/**
 *
 */
public class Content {

  public Content(String message, boolean isStaticCreation) {
    System.out.println(message);
    Book.staticCount++;

  }

  public Content(String message) {
    System.out.println(message);
  }
}
