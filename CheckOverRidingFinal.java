class C
{
    static void check()
    {
        System.out.println("Statement 1");
    }
}
class B extends C{
    static void check(){
        System.out.println("Statement 2");
    }
}
class CheckOverRidingStatic{
    public static void main(String[] args)
    {
        B k = new B();
        k.check();

    }
}