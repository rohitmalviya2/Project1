class A
{
    int a; String b; 
    A()
    {
        a=10; b="super";

    }
    void Show()
    {
        System.out.println(a+ " "+b);
    }
}
class B
{
    public static void main(String[] args) {
        A r=new A();
        r.Show();
    }
}
