package Level800;
import java.util.*;
public class LineTrip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            List<Integer> v = new ArrayList<>(n+1);
            v.add(0);
            for(int i=0; i<n; i++){
                v.add(sc.nextInt());
            }

            solve(n,x,v);
            t--;
        }
        sc.close();
    }

    public static void solve(int n, int x, List<Integer> v){
        int maxi = 0;
        for(int i=0; i<n; i++){
            int diff = v.get(i+1) - v.get(i);
            maxi = Math.max(maxi, diff);
        }
        int diff = 2 * (x - v.get(v.size()-1));
        maxi = Math.max(maxi, diff);
        System.out.println(maxi);
    }
}
