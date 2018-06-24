package chap06.initialization.and.cleanup;

/**
 * Initialzation/TerminationCondition.java
 *
 * Using finalize() to detect an object that has't been properly cleaned up.
 */
public class Book {
  boolean checkedOut = false;
  static int staticCount;
  static int nonStaticCount;

  Book(boolean checkout) {
    System.out.println("Object: " + this.toString());
    checkedOut = checkout;
  }

  void checkIn() {
    checkedOut = false;
  }

  @Override
  protected void finalize() {
    if (checkedOut) {
      System.out.println("Error: checked out. Object: " + this.toString());
    }

  }
  private static Content content = new Content("Static class object created.", true);
  private Content content2 = new Content("Normal class object created.");

  public static void staticMethod() {
    System.out.println("static method called.");
  }

}
