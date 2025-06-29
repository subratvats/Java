public class Gcd {
    int gcd(int m, int n){
        while(m!=n){
            if (m>n) m= m-n;
            else n= n-m;
        }
        return n;
    }

    public static void main(String[] args) {
        Gcd gcd = new Gcd();
        System.out.println(gcd.gcd(15,30));
    }

}
