class Area{
 void area(int a, int b)
{
int area= a*b;
System.out.println(area);
}
void area (double r)
{
double area=3.14*r*r;
System.out.println(area);

}
}
class Apply_Area{
public static void main(String args[])
{
Area obj= new Area();
obj.area(7.0);
}
}