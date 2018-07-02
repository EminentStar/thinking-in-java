package chap02.introduction.to.objects.base;

public class Triangle extends Shape {
  @Override
  public Class<? extends Shape> draw() {
    System.out.println("Triangle.draw()");
    return this.getClass();
  }

  @Override
  public Class<? extends Shape> erase() {
    System.out.println("Triangle.erase()");
    return this.getClass();
  }
}
