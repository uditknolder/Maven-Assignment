import java.util.Scanner;

public final class Application {
    private Application() {
    }

    /**
     * @param args
     */
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(final String[] args) {
        System.out.println("Enter a string :");
        int cont = 1;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //StringFunctions sf = new StringFunctions();
        do {
            System.out.println("press 1 for Reverse of String");
            System.out.println("press 2 for Length of String");
            System.out.println("press 0 for Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Reverse of string : ");
                    StringFunction.reverseString(str);
                    break;
                case 2:
                    System.out.print("Length of string : ");
                    StringFunction.lengthOfString(str);
                    break;
                case 0:
                    cont = 0;
                    break;
                default:
                    System.out.println("Wrong choice entered:");

            }
        } while (cont == 1);

    }
}
