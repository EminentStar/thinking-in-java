package chap03.everything.is.an.object;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class StaticTest {
  static int i = 47;

  /**
   * static을 사용함으로써 얻을 수 있는 효과
   *   1. 수많은 object가 생성되더라도 특정 필드에 대해 하나의 storage를 유지하고 싶을 때
   *   2. 클래스의 수많은 오브젝트중 특정 오브젝트와 연관되지 않은 메서드가 필요할 때.
   *     - object를 생성하지 않고도 method를 calling할 수 있다는 것이 중요.
   */
  @Test
  public void staticTest() {
    StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();

    assertThat(st1.i, is(47));
    assertThat(st2.i, is(47));

    StaticTest.i++;

    assertThat(st1.i, is(48));
    assertThat(st2.i, is(48));
  }
}
