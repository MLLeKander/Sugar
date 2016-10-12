import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
  public static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    int a=scan.nextInt() , s=scan.nextInt() , d=scan.nextInt() ; scan.nextInt();
    long q=scan.nextLong() , w=scan.nextLong() , e=scan.nextLong() ;
    String z=scan.next() , x=scan.next() , c=scan.next() ;
    String v=scan.nextLine() , f=scan.nextLine() , r=scan.nextLine() ;
    System.err.println("a:"+a+"  q:"+q+"  z:"+z+"  v:"+v);
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
  }
  public static class Tmp implements Comparable<Tmp> {
    public int a;
    public int b;
    public Tmp(int a_, int b_) { a=a_; b=b_; }
    public int a() { return a; }
    public int b() { return b; }
    public static Comparator<Tmp> cmp = Comparator.comparing(Tmp::a).thenComparing(Tmp::b);
    public boolean equals(Object o) { return cmp.compare(this, (Tmp)o) == 0; }
    public int compareTo(Tmp o) { return cmp.compare(this, o); }
    public int hashCode() { return Objects.hash(a,b); }
    public String toString() { return ""+a+","+b; }
  }
}
