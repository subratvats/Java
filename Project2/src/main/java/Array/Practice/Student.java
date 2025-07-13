//package Array.Practice;
//
//import java.math.BigDecimal;
//import java.util.Arrays;
//
//public class Student {
//
//
//    private  String name;
//    private  int[] marks;
//
//    public Student(String name, int[] marks) {
//        this.name = name;
//        this.marks = marks;
//    }
//
//    public static void main(String[] args) {
//        int[] marks = {100, 90, 96,94,89};
//        Student student = new Student("Subrat",marks);
//        int number = student.getNumberOfMarks();
//        System.out.println("no. of marks is "+ number);
//        int sum = student.getTotalSumOfMarks();
//        System.out.println("sum of marks is "+ sum);
//        int maxMark = student.getMaximumMarks();
//        System.out.println("maximim marks is "+ maxMark);
//        int minMark = student.getMinimumMarks();
//        System.out.println("minimum marks is "+ minMark);
//
////        BigDecimal avarage = student.getAvarage();
//
//    }
//
////    private BigDecimal getAvarage() {
////    }
//
//    private int getMinimumMarks() {
//        int min = marks[0];
//        for (int i = 1; i < marks.length; i++) {
//            if (marks[i]< min){
//                min = marks[i];
//            }
//        }
//        return min;
//    }
//
//    private int getMaximumMarks() {
//        int max = marks[0];
//        for (int i = 1; i < marks.length; i++) {
//            if (marks[i]> max){
//                max = marks[i];
//            }
//        }
//        return max;
//    }
//
//    public int getTotalSumOfMarks() {
//        int sum =0;
//        for(int i:marks){
//            sum =sum+i;
//    }
//        return sum;
//}
//    public int getNumberOfMarks() {
//        return marks.length;
//    }
//
//}
