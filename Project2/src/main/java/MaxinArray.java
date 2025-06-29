public class MaxinArray {
   static int max(int[] x){
       int max;
       max = x[0];
       for (int i = 1; i < x.length; i++) {
           if (x[i]>max) max = x[i];
       }
       return max;
   }

    public static void main(String[] args) {
        int[] A = {2,4,7,2,1,8,92};
        System.out.println(max(A));
    }
}
