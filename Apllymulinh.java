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
class C extends A , B{
void show2(){
System.out.println("HELLO SHOW C");
}
}

class Apllymulinh{
public static void main (String args[])
{
C obj=new C();
obj.show();
obj.show1();
obj.show2();
}
}