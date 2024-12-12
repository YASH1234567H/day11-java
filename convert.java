import java.util.*;
class main{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>(10);
        a.add(2);
        a.add(3);
        Object b[]=a.toArray();
        System.out.println(Arrays.toString(b));
        //size is not fixed
        System.out.println(a.size());
    }
}