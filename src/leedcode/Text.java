package leedcode;

public class Text
{
    private String baseName = "base";
    public Text()
    {
        callName();
    }

    public void callName()
    {
        System. out. println(baseName);
    }

    static class Sub extends Text
    {
        private String baseName = "sub";
        @Override
        public void callName()
        {
            System. out. println (baseName) ;
        }
    }
    public static void main(String[] args)
    {
        Text b = new Sub();
    }
}