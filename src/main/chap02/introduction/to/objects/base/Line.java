package chap02.introduction.to.objects.base;

public class Line extends Shape {
  @Override
  public Class<? extends Shape> draw() {
    System.out.println("Line.draw()");
    return this.getClass();
  }

  @Override
  public Class<? extends Shape> erase() {
    System.out.println("Line.erase()");
    return this.getClass();
  }
}
