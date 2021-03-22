package leedcode;

class Value{
    public int i=15;
}
public class Text6{
    public static void main(String argv[]){
        Text6 t=new Text6( );
        t.first( );
    }

    public void first( ){
        int i=5;
        Value v=new Value( );
        v.i=25;
        second(v,i);
        System.out.println(v.i);
    }

    public void second(Value v,int i){
        i = 0;
        v.i = 20;
        Value val = new Value( );
        v = val;
        System.out.println(v.i+" "+i);
    }
}
