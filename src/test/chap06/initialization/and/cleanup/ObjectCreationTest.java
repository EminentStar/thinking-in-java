package chap06.initialization.and.cleanup;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * # 오브젝트 생성 과정(Dog class를 예로)
 *
 * 1. Dog 타입인 오브젝트가 처음 생성되는 시점이나, Dog클래스의 static field/method에 처음으로 access하는 경우에
 *   Java Interpreter가 classpath를 훑어서 Dog.class를 locate시켜야함.
 *
 * 2. Dog.class가 loaded 됐을 때(`Class` object 생성을 수반함.) 모든 static initializer가 실행됨.
 *  - static initialization은 딱 한번 실행됨.( Dog의 `Class` object가 처음으로 loaded될 때.)
 *
 * 3. new Dog() 문장을 수행할 때, Dog object를 위한 storage가 `Heap`에 생성됨.
 *
 * 4. storage가 초기에 할당될 때는 primitive type은 default value를 가지고
 *    object reference들은 null(올바른 메모리 주소를 가지고 있지 않다는 상태표현값)로 세팅됨
 *
 * 5. field definition 시점에서 일어나는 initialization이 수행됨.
 *
 * 6. 생성자가 수행됨.
 *
 */
public class ObjectCreationTest {

  @Test
  public void staticFieldsInitializationDoneWhenFirstAccessedToStaticField() {
    // Given
    // When
    int staticCount = Book.staticCount; //

    // Then
    assertThat(staticCount, is(1));
  }

  @Test
  public void staticFieldsInitializationDoneWhenFirstAccessedToStaticMethod() {
    // Given
    // When
    Book.staticMethod();

    // Then
    assertThat(Book.staticCount, is(1));
  }

  @Test
  public void staticFieldsInitializationDoneWhenObjectOfTheClassFirstCreated() {
    // Given
    // When
    new Book(true);

    // Then
    assertThat(Book.staticCount, is(1));
  }

  @Test
  public void staticFieldsInitializationDoneOnlyOnce() {
    // Given
    new Book(true); // static initialization occured.

    // When
    int staticCount = Book.staticCount;
    Book.staticMethod();
    new Book(true);


    // Then
    assertThat(Book.staticCount, is(1));
  }

}
