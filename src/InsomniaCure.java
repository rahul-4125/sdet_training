import java.util.*;
public class InsomniaCure {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int l = s.nextInt();
        int m = s.nextInt();
        int n = s.nextInt();
        int d = s.nextInt();
        Set<Integer> dd = new HashSet<>();
        for(int i=1;i<=d;++i){
            if(i%k==0||i%l==0||i%m==0||i%n==0){
                dd.add(i);
            }
        }
        System.out.println(dd.size());
    }
}
