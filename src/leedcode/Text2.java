package leedcode;

public class Text2{
    public static synchronized void main(String[] a){
        Thread t=new Thread(){
            @Override
            public void run(){Sogou();}
        };
        t.start();

        System.out.print("Hello");
    }
    static synchronized void Sogou(){
        System.out.print("Sogou");
    }
}

