package Level800;
import java.util.*;

public class Halloumi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            List<Integer> v = new ArrayList<>(n);
            for(int i=0; i<n; i++){
                v.add(sc.nextInt());
            }
            solve(n,k,v);
            t--;
        }
        sc.close();
    }

    public static void solve(int n, int k, List<Integer> v){
        if(k > 1){
            System.out.println("YES");
        }else{
            if(isSorted(v,n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static boolean isSorted(List<Integer> v, int n){
        for(int i=0; i<n-1; i++){
            if(v.get(i) < v.get(i+1)){
                return false;
            }
        }
        return true;
    }
}