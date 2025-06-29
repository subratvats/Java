class VariableArgument {
    static void display(int x, String ...s){
        System.out.println("The number is "+x);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }


    public static void main(String[] args) {
//        System.out.println(display(3,"my", "name", "is","Subrat","vats"));
        display(3,"my", "name", "is","Subrat","vats");
    }
}
