package O1;

public class One {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 4 - i || j == 3 || i == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
