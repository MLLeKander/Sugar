import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.geom.*;
public class Main {
  public static final BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
  public static final PrintWriter outWriter = new PrintWriter(System.out);
  public static void main() {
    int a = nextInt(), s = nextInt();
    int d = nextInt()-1;
    long q = nextLong(), w = nextLong(), e = nextLong();
    String z = next(), x = next(), c = next();
    String v = nextLine(), f = nextLine(), r = nextLine();
    System.err.println("a:"+(a)+"  q:"+(q)+"  z:"+(z)+"  v:"+(v));
    for (int i = 0; i < 4; i++) {
      outWriter.println("for2 "+i);
    }
    for (int i = 2; i < 4; i++) {
      outWriter.println("for3 "+i);
    }
  }
  public static class Tmp {
    public int a;
    public int b;
    public int a() { return a; }
    public int b() { return b; }
    Tmp(int a_, int b_) { a=a_; b=b_; }
    public static Comparator<Tmp> cmp = Comparator.comparing(Tmp::a).thenComparing(Tmp::b);
    public int compareTo(Tmp o) { return cmp.compare(this, o); }
    public boolean equals(Object oo) {
      @SuppressWarnings("unchecked")
      Tmp o = (Tmp)oo;
      return a==o.a&&b==o.b;
    }
    public int hashCode() { return Objects.hash(a,b); }
    public String toString() { return ""+a+","+b; }
  }
  public static class Tmp2 {
    public int a;
    public int a() { return a; }
    Tmp2(int a_) { a=a_; }
    public boolean equals(Object oo) {
      @SuppressWarnings("unchecked")
      Tmp2 o = (Tmp2)oo;
      return a==o.a;
    }
    public int hashCode() { return Objects.hash(a); }
    public String toString() { return ""+a; }
    public int tmp() { return a-5; }
  }
  public static class Foo {
    public int a;
    public int b;
    public int a() { return a; }
    public int b() { return b; }
    Foo(int a_, int b_) { a=a_; b=b_; }
  }
  public static HashMap<Integer,Integer> foo = new HashMap<Integer,Integer>();
  public static void main(String[] args) { main(); outWriter.flush(); }
  public static StringTokenizer tokenizer = null;
  public static String nextLine() {
    try { return buffer.readLine(); } catch (IOException e) { throw new UncheckedIOException(e); }
  }
  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreElements()) { tokenizer = new StringTokenizer(nextLine()); }
    return tokenizer.nextToken();
  }
  public static int nextInt() { return Integer.parseInt(next()); }
  public static long nextLong() { return Long.parseLong(next()); }
  public static double nextDouble() { return Double.parseDouble(next()); }
}
