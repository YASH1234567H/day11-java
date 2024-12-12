import java.util.*;
class main{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(30);
        a.add(20);
        a.add(10);
        System.out.println(a);
        //to check element 
        System.out.println(a.contains(30));
        System.out.println(a.contains(900));
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}