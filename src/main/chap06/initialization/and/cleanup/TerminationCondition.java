package chap06.initialization.and.cleanup;

/**
 * Java에서는 C++의 destructor처럼 object를 개발자가 의도적으로 제거할 수 있는 방법이 없음.
 *
 * 더이상 object가 참조되지않고 Garbage Collector에 의해 소멸될 때
 * finalize()또한 같이 호출되어 object 제거시 부가 작업을 진행함.
 */
public class TerminationCondition {
  public static void main(String[] args) {
    Book novel = new Book(true);

    novel.checkIn();

    new Book(true);

    System.gc();
  }
}
