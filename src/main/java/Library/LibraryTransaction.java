package Library;

import java.util.Scanner;

public class LibraryTransaction {

    boolean flag = true;

    Scanner scan = new Scanner(System.in);

    public void process() {
        System.out.print("\tWelcome to SKY LIBRARY!\n\n" +
                         "\tBefore accessing all the books in our library, you must specify your name.\n" +
                         "\tYour name: ");
        String clientName = scan.nextLine().toUpperCase();
        Client client = new Client(clientName);

        System.out.println();
        System.out.println("Mr&Mrs " + client.getClientName() + ", you can start choosing books.\n" +
                           "These are the books in our library: ");

        System.out.println();
        client.pickBook();

        while (flag) {
            System.out.println();
            System.out.println("If you want to borrow more books press 'Y': ");
            String decision = scan.next();
            System.out.println();

            if(decision.equalsIgnoreCase("Y")) {
                client.pickBook();
                System.out.println();
            } else {
                System.out.println("Thank you for choosing us.\n" +
                                   "See you again.");
                break;
            }
        }
    }
}
