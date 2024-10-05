package Level800;
import java.util.*;

public class CoverInWater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            String s = sc.next();
            solve(n,s);
            t--;
        }
        sc.close();
    }

    public static void solve(int n, String s){
        int countCons = 0;
        int countTotal = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '.'){
                countCons += 1;
                countTotal += 1;
                if(countCons == 3){
                    System.out.println("2");
                    return;
                }
            }else{
                countCons = 0;
            }
        }
        System.out.println(countTotal);
        return;
    }
}
