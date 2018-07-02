package chap02.introduction.to.objects.polymorphism;

import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import chap02.introduction.to.objects.base.Circle;
import chap02.introduction.to.objects.base.Line;
import chap02.introduction.to.objects.base.Triangle;

public class ShapeClientTest {
  private ShapeClient shapeClient; // ShapeClient object의 reference를 정의.

  @Before
  public void setUp() {
    /*
     * `new`를 calling하여 새로운 ShapeClient type의 object를 request함.
     */
    shapeClient = new ShapeClient();
  }

  @Test
  public void domSomething() {
    // Given
    Circle circle = new Circle();
    Triangle triangle = new Triangle();
    Line line = new Line();

    /*
     * OOP에서 프로그램은 runtime이 되기 전까지는 실행되는 코드의 address를 정확히 알 수 없음.
     * `late binding`: object에 message를 보내면, runtime 이전까지는 코드의 address를 결정할 수 없음.
     * late binding이 동작하기 위해서 Java는 absolute call 대신에,
     * object에 저장되는 info를 사용해서 method body의 address를 계산하는 코드를 사용함.
     *
     * compiler는 ShapeClient의 doSomething()에서 호출 될
     * erase(), draw()가 정확히 어떤 코드를 실행하는지 compile time에서 알 수 없음
     *
     * 또한 doSomething(Shape shape)는 파라미터가 Shape인데,
     * Shape를 inheritted한 Circle, Triangle, Line 또한 Shape이므로 파리미터로 넘길 수 있음
     * 이때 파라미터가 전달되면서 upcasting이 일어남.
     * (cast into a mold: 주조 / up: 상속 관계에서 자식이 부모로 올라가는
     * upcasting을 통해 정확히 어떤 type이 들어와야하는지 몰라도 됨.
     */

    // When
    Class result01 = shapeClient.doSomething(circle); // ShapeClient object에 doSomething message를 request함.
    Class result02 = shapeClient.doSomething(triangle);
    Class result03 = shapeClient.doSomething(line);

    // Then
    assertThat(result01, Is.<Class>is(Circle.class));
    assertThat(result02, Is.<Class>is(Triangle.class));
    assertThat(result03, Is.<Class>is(Line.class));
  }
}
