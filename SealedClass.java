//Sub classes of a sealed class. it can be non-sealed,final,sealed

sealed class A extends Thread permits B,C{

}
non-sealed class B extends A{

}

final class C extends A{

}
class D extends B{

}


public class SealedClass {
  public static void main(String[] args) {
    
  }
}
