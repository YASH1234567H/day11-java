import java.util.*;
class main{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(30);
        a.add(20);
        a.add(10);
        int l=0;
        int r=a.size()-1;
        while(l<r)
        {
            int temp=a.get(l);
            a.set(l,a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
        System.out.println(a);
    }
}