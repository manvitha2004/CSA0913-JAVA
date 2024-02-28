class Employee
{
int sal;
void getSalary()
{
sal=50000;
}
}
class manager extends Employee
{
int ta,hra,totalsal;
void getSalary()
{
super.getSalary()
ta=10000;
hra=1500;
totalsal=sal+ta+hra;
}
void display()
{
system.out.println("employee salary"+sal);
system.out.prinln("manager salary: "+totalsal);
}
public Static void main(String a[])
{
manager n=new manger();
m.getSalary()
m.display();
}