public class Main {

    public static void main(String[] args) {
        int numToExamine = 4;
        int numToExamine2 = 5;
        int numToExamine3 = 6;
        int numModulo = 0;
        System.out.println("If your number is " + numToExamine);
        numModulo = numToExamine % 2;
        if (numModulo != 0) {
            System.out.println("Your number is odd.");
        } else {
            System.out.println("Your number is even.");
        }
        System.out.println("If your number is " + numToExamine2);
        numModulo = numToExamine2 % 2;
        if (numModulo != 0) {
            System.out.println("Your number is odd.");
        } else {
            System.out.println("Your number is even.");
        }
        System.out.println("If your number is " + numToExamine3);
        numModulo = numToExamine3 % 2;
        if (numModulo != 0) {
            System.out.println("Your number is odd.");
        } else {
            System.out.println("Your number is even.");
        }
    }
}