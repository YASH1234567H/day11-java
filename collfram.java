import java.util.*;
class main{
    public static void main(String[] args){
        ArrayList<Integer>a=new ArrayList<>();
        a.add(356);
        a.add(999);
        //adding at a particula index
        a.add(1,10);
        System.out.println(a);
        //m0dification
        a.set(2,100);
        System.out.println(a);
    }
}