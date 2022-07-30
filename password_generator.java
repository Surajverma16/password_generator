import java.util.*;

class password_generator {

    public static String getPasswordStrength(int length) {
        if (length < 8) {
            return "weak";
        } else if (length < 16) {
            return "medium";
        } else {
            return "strong";
        }

    }

    public static void printPasswords(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("---> " + arr[i]);
        }
    }

    public static char randomCharacter() {
        int rand = (int) (Math.random() * 62);

        if (rand <= 9) {
            int ascii = rand + 48;
            return (char) (ascii);
        } else if (rand <= 35) {
            int ascii = rand + 55;
            return (char) (ascii);
        } else {
            int ascii = rand + 61;
            return (char) (ascii);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many random passwords do you want to generate ?");
        int total = in.nextInt();

        System.out.println("Enter length of password to be generated! ");
        int length = in.nextInt();

        String[] randomPasswords = new String[total];

        for (int i = 0; i < total; i++) {
            String randomPassword = "";
            for (int j = 0; j < length; j++) {
                randomPassword += randomCharacter();
            }

            randomPasswords[i] = randomPassword;
        }
        printPasswords(randomPasswords);

        System.out.println("You'r password is " + getPasswordStrength(length));
    }

}