package Server;

import java.util.Scanner;

public class Start {
    static String port = "2055";

    public static void main(String[] args) {
        new SetPassword(port);

        System.out.printf("Type %Cquit%C to exit\n", 34, 34);
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                System.exit(0);
            }
        }
    }
}
