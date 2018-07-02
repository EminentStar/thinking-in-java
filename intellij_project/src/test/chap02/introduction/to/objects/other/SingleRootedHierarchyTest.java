package chap02.introduction.to.objects.other;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

import chap02.introduction.to.objects.base.Shape;

public class SingleRootedHierarchyTest {
  @Test
  public void objectClassTest() {
    // Given
    /*
     * object를 heap이라는 memory pool에 동적으로 생성함
     *
     * 이 방식에서는 runtime 이전까지는 얼마나 많은 objects가 필요할 지
     * objects의 lifecycle이 어떤지 object가 정확히 어떤 타입인지 파악을 할 수 없음.
     *
     * storage가 동적으로 managed되기에 runtime에선 heap에 storage를 할당하는 시간이
     * stack에 storage를 할당하는 시간보다 길어질 수 있음.
     *
     */
    Shape shape = new Shape();

    // When
    boolean isObjectClass = shape instanceof Object;

    // Then
    assertThat(isObjectClass, is(true));
  }
}
