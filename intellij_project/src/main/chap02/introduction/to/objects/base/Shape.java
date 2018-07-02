package chap02.introduction.to.objects.base;

public class Shape {
  public Class<? extends Shape> draw() {
    System.out.println("Shape.draw()");
    return this.getClass();
  }

  public Class<? extends Shape> erase() {
    System.out.println("Shape.erase()");
    return this.getClass();
  }

  public void move() {
  }

  public void getColor() {
  }

  public void setColor() {
  }

}
