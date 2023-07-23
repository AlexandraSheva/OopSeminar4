package Task3;

public class Gen<T> {
  T obi;

  public Gen(T o) {
    obi = o;
  }
}

class UseTest {
  static void test(Gen <? extends A> a ) {
    //
  }

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();

    Gen<A> ga = new Gen<A>(a);
    Gen<B> gb = new Gen<B>(b);
    Gen<C> gc = new Gen<C>(c);
    Gen<D> gd = new Gen<D>(d);

    test(ga);
    test(gb);
    test(gc);
    test(gd);
  }
}
