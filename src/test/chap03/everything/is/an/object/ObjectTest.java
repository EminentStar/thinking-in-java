package chap03.everything.is.an.object;

import org.junit.Test;

public class ObjectTest {

  @Test
  public void reference() {
    String s1; // 여기선 object를 생성하지 않고 단지 reference를 생성함.

    String s2 = "asdf"; // reference 's2'가 String object 참조

    String s3 = new String("asdf"); // new 연산자: 특정 클래스의 새로운 오브젝트를 생성

    String s4 = null; // Java는 null을 reference가 아무 object도 가리키지 않는 것으로 인식함.
  }

  /**
   * primitive type은 size가 매우 작아서
   * `new` 연산자로 heap에 object를 생성하고 reference를 던지는 작업이 매우 비효율적임.
   *
   *  아래와 같은 primitive type은 reference로 만들어지지 않음.
   *  바로 stack에 저장됨.(FIXME: 이건 논란의 소지가 있을 듯. primitive라도 class의 필드이면 heap에 있겠지: 추후 정리.)
   *
   *  primitive type object의 lifetime은 생성된 {}를 벗어날 때.
   *  (non-primitive object는 다름; garbage collector가 new로 생성된 모든 object를 파악하고 있다가,
   *  더이상 referenced 되지 않는 object를 찾아서 메모리를 해제함.)
   */
  @Test
  public void primitiveTypes() {
    boolean b = false;
    char c = '\0'; // 16 bits
    byte by = 0; // 16 bits
    short sh = 0; // 16 bits
    int i = 0; // 32 bits
    long l = 0L; // 64 bits
    float f = 0.0f; // 32 bits
    double d = 0.0d; // 64 bits
  }

  /**
   * primitive의 Wrapper는 primitive object가 heap에 저장할 수 있게 함
   */
  @Test
  public void primitiveWrapper() {
    Boolean b = new Boolean(false);
    Character c = new Character('\0'); // 16 bits
    Byte by = new Byte("0"); // 16 bits
    Short sh = new Short("0"); // 16 bits
    Integer i = new Integer(0); // 32 bits
    Long l = new Long(0L); // 64 bits
    Float f = new Float(0.0f); // 32 bits
    Double d = new Double(0.0d); // 64 bits

    Character ch = 'x'; // SE5에서부터 autoboxing 지원
  }

}
