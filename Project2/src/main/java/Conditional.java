public class Conditional {

    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other Day");
        }



        int age = 25;
        int salary = 40000;

        if (age >= 18) {
            if (salary >= 30000) {
                System.out.println("Eligible for loan");
            } else {
                System.out.println("Not eligible due to low salary");
            }
        } else {
            System.out.println("Not eligible due to age");
        }
    }

}
