package chap02.introduction.to.objects.base;

public class Square extends Shape {
  @Override
  public Class<? extends Shape> draw() {
    System.out.println("Square.draw()");
    return this.getClass();
  }

  @Override
  public Class<? extends Shape> erase() {
    System.out.println("Square.erase()");
    return this.getClass();
  }
}
