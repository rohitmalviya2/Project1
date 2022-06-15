class A{
    int a; String b; boolean c;
    
    A()
    {
        a=18;
        b="Rohit";
        c=false;
        System.out.println(a+ " "+b+ " "+c);
    }
    A(A ref)
    {
        a = ref.a;
        b = ref.b;
        c = ref.c;
        System.out.println(a+ " " +b+ " "+c);
    }
}
    class B {
        public static void main(String[] args) {
            A r = new A();
            A r2 = new A(r);
        }
    
    
}

