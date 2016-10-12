# Sugar

A transpiler to make Java a little less bitter. 

## Features

- Implicit `main` method + `Main` class.
```
// This is a vaid program!
{
}
```
- Implicit `Main` static method declarations.
```
int demoFunc() {   // public static int demoFunc() {
  return -1;       //   return -1;
}                  // }

```
- Implicit `Scanner`.
```
line(l);           // String l = scan.nextLine();
int a = int()-1;   // int i = scan.nextInt()-1;
str(s1,s2);        // String s1 = scan.next(), s2 = scan.next();
```
- Simpler print statements. `debug` statements by `sugarpdbg`.
```
print("asdf");           // System.out.print("asdf");
eprintln("foo");         // System.err.println("foo");
printf("%s\n", "bar");   // System.out.printf("%s\n", "bar");

// Requires sugarpdbg
debug(a, b, c);   // System.err.println("a:"+a+" b:"+b+" c:"+c);
```
- Ranged `for` loops. `loop` loops, by `sugarplop`, determine variable names by indentation level (`i`, `j`, `k`, `l`, `o`, and `u`).
```
for (i,10) { println(i); }     // for (int i = 0; i < 10; i++) { ... }
for (j,1,11) { println(j); }   // for (int j = 1; j < 11; j++) { ... }

// Requires sugarplop
loop (10) {                    // for (int i = 0; i < 10; i++) {
  loop (5,9) {                 //   for (int j = 5; j < 9; j++) {
    println(i+" "+j);          //     ...
  }                            //   }
}                              // }
```
- Easier Object and array declarations.
```
new(ArrayList<HashMap<Integer,String>>, a)();   // ArrayList<HashMap<...>> a = new ArrayList<HashMap<...>>();
new(int, b, 10);                                // int[] b = new int[10];
new(int, c, 10, 20);                            // int[][] c = new int[10][20];
```
- Easier class definition (further enhanced by `sugarpctr` and `sugarptpl`).
```
class Foo {                   // pulic static class Foo {
  .int b;                     //   public int b;
  (int a, int b) { c=a+b; }   //   public Foo(int a, int b) { c=a+c; }
}                             // }

// Requires sugarpctr
class ImplicitFields {   // public static class ImplicitFields {
  (int a, int b);        //   public int a;
                         //   public int b;
                         //   public ImplicitFields(int a_, int b_) { a=a_; b=b_; }
}                        // }

// Requires sugarptpl
tuple Tuple(Object a, int b);
ctuple ComparableTuple(String a, int b);
```
- Other small sugar.
```
new(int,a,5);                        // int[] a = new int[5];
println(ats(a));                     // System.out.println(Arrays.toString(a));
int b = 5, c = 10;                   // int b = 5, c = 10;
swap(a,b);                           // b=b^c^(c=b);
BI.valueOf(b).gcd(BI.valueOf(c));   // BigInteger.valueOf(b).gcd(BigInteger.valueOf(c));
```

## Installation (Recommended Order)

- Create all files and set appropriate permissions. Estimated time: TODO.
```
echo 'export PATH=$PATH:~/sugar' >> .bashrc
mkdir sugar
cd sugar
touch sugar{,head,ptpl,pctr,plop,pdbg}
for i in *sugar; do echo cat > $i; done
chmod +x *sugar
```
- Copy `sugar`. Estimated time: TODO.
- Copy `sugarhead`. Estimated time: TODO.
    - At this point, you sugar is minimially functional. Below modules may optionally be added for more sugar.
- Create Python templates. Estimated time: TODO.
```
for i in *psugar; do echo -e '#!/usr/bin/python2
import sys, re, os
def f(m):
  pass
for l in list(sys.stdin):
  print re.sub(r"asdf", r l[:-1])' > $i;
done
```
- Copy `sugarpdbg`. Estimated time: TODO.
- Copy `sugarpctr`. Estimated time: TODO.
- Copy `sugarplop`. Estimated time: TODO.
- Copy `sugarptpl`. Estimated time: TODO. **Requires `pctorsugar`.**
- For vim users, add the following to .vimrc:
```
au BufRead,BufNewFile *.sugar setfiletype java
```
- ...and if you want to be fancy, in ~/.vim/after/syntax/java.vim:
```
syn keyword Keyword loop debug tuple ctuple print println printf eprint eprintf eprintln str line
```
