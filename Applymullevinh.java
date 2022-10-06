class A{
void show(){
System.out.println("HELLO SHOW A");
}
}
class B extends A{
void show1(){
System.out.println("HELLO SHOW B");
}
}
class C extends A {
void show2(){
System.out.println("HELLO SHOW C");
}
}

class Apllymullevinh{
public static void main (String args[])
{
B obj=new B();
obj.show();
obj.show1();
C o=new C();
o.show();
o.show2();
}
}