class S_Static {

    static int a=100;

    public static void m1(int a1)
    {
        System.out.println("Hello World"+a1);
    }

    public static void main(String[] args) {

        System.out.println(a);

        m1(23);

    }
}
