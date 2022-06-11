class A{
    int x,y;
    A(int a,int b)
    {
    x=b; y=a;
    }
    void show()
    {
        System.out.println(x+ " " +y);
    }
}
    class B {
        public static void main(String[] args) {
            A r = new A(100,234);
            r.show();
        }
    
    
}
