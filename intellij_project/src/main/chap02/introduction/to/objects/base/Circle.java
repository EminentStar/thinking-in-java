package chap02.introduction.to.objects.base;

public class Circle extends Shape {
  @Override
  public Class<? extends Shape> draw() {
    System.out.println("Circle.draw()");
    return this.getClass();
  }

  @Override
  public Class<? extends Shape> erase() {
    System.out.println("Circle.erase()");
    return this.getClass();
  }
}
