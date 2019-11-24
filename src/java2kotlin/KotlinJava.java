package java2kotlin;

import java2kotlin2.JavaKotlinKt;
import java2kotlin2.K1;

public class KotlinJava {

  public static void main(String[] args) {
    JavaKotlinKt.main();
    K1 k1 = new K1("sasa");
    K1 copy = k1.copy(2);
    System.out.println(k1.equals(copy));
    System.out.println(k1.toString());
    System.out.println(JavaKotlinKt.ctop);
    System.out.println(JavaKotlinKt.getTop());
    JavaKotlinKt.efun(new K1());
  }
}
