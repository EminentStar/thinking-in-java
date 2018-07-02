Thinking in Java
=============================================================

Introduction to Objects
-------------------------------------------------------------



Everything is an Object
-------------------------------------------------------------

### 데이터 저장공간
1. Register: 
  - 가장 빠름. processor에 존재. 제한된 갯수. 프로그램이 register를 직접 컨틀로할 수 없음.
2. Stack: 
  - RAM에 존재. processor가 stack pointer를 통해서 직접 접근 가능.
  - stack pointer가 아래로 가면서 새로운 메모리를 할당할 수 있고, 올라가며 메모리를 해제.
  - 자바 시스템은 프로그램이 생성되는 동안에 스택에 저장되는 모든 item의 정확한 lifetime을 알아야만함.(?)
  - stack은 프로그램의 유연성에 제한을 두기에(?) object reference와 같은 것들은 스택에 존재하지만, object 자체는 stack에 저장되지 않음.
3. Heap: 
  - 모든 java object가 존재하는 일반적인 용도의 메모리 풀.
  - stack과는 다르게 컴파일러가 할당된 storage가 얼마나 오래 heap에서 존재하는지 알필요가 없음.
  - new를 통해 storage가 heap에 할당됨.
  - stack보단 storage를 할당하고 해제하는데 시간이 더 걸림.
4. Constant storage
  - constant는 프로그램에서 빈번하게 직접적으로 배치되는데, 이들은 변하지 않기때문에 안전함.
5. Non-RAM storage
  - example
    - streamed objects: 일반적으로 다른 머신에 보내기 위해 바이트 스트림으로 변환된 오브젝트
    - persistent objects: object가 disk에 위치해서 프로그램이 꺼지더라도 상태를 유지할 수 있는.
