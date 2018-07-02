package chap02.introduction.to.objects.polymorphism;

import chap02.introduction.to.objects.base.Shape;

public class ShapeClient {
  Class<? extends Shape> doSomething(Shape shape) {
    Class<? extends Shape> result = shape.erase();
    // ...
    shape.draw();

    return result;
  }
}
