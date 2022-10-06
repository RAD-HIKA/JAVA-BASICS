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
class Apply{
public static void main (String args[])
{
B obj=new B();
obj.show();
obj.show1();
}
}