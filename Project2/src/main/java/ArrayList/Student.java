package ArrayList;



import java.util.ArrayList;

public class Student {


    private final String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int[] marks) {
        this.name = name;
        for (int mark: marks){
            this.marks.add(mark);
        }
    }

    public static void main(String[] args) {
        int[] marks = {100, 90, 96,94,89};
        Student student = new Student("Subrat",marks);
        int number = student.getNumberOfMarks();
        System.out.println("no. of marks is "+ number);
//        int sum = student.getTotalSumOfMarks();
//        System.out.println("sum of marks is "+ sum);
//        int maxMark = student.getMaximumMarks();
//        System.out.println("maximim marks is "+ maxMark);
//        int minMark = student.getMinimumMarks();
//        System.out.println("minimum marks is "+ minMark);

//        BigDecimal avarage = student.getAvarage();

    }

//    private BigDecimal getAvarage() {
//    }

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

//    private int getTotalSumOfMarks() {
//        int sum =0;
//        for(int i:marks){
//            sum =sum+i;
//        }
//        return sum;
//    }
    private int getNumberOfMarks() {
        return marks.size();
    }

}
