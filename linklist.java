import java.util.*;
class main{
    public static void main(String args[]){
        LinkedList<Integer> a=new LinkedList<>();
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a);
        a.addFirst(a);
        System.out.println(a);
    }
}