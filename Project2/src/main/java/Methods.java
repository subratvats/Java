public class Methods {
    int max(int x,int y){
        if (x>y){
            return x;
        }
        else {
            return y;
        }
    }

    public static void main(String[] args) {
        int a=10,b=15,c;
        StringJava obj = new StringJava();
        c=obj.max(a,b);
        System.out.println(c);

    }
}
