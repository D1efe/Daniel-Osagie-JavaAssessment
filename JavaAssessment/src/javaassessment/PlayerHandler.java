package javaassessment;

import static java.time.Clock.system;
import java.util.Scanner;

public class PlayerHandler {

    Scanner sc = new Scanner(System.in);
    Player p1;

    public PlayerHandler() {

        System.out.println(beginAdventure());
        p1 = new Player(sc.nextLine());
        System.out.println("Your player: " + p1.getName() + " immediately checks themselves only to find a strange compass");
        System.out.println(decision());
        System.out.println("hint: try 'look at compass'\n");

    }

    public boolean firstAction() {
        System.out.println("type 1 to: look at surroundings\ntype 2 to: look at compass");
        String user = sc.next();
        boolean decision = false;

        double choice = Double.parseDouble(user);

        while (choice != 1 && choice != 2) {
            System.err.println("please enter 1 or 2");
            choice = sc.nextInt();

        }
        if (choice == 1) {

            System.out.println(p1.getName() + " explores their surroundings... noticing the swamp surrounding them");
            decision = true;


        } else if (choice == 2) {
            System.out.println("Looking at the compass reveals these characters");

            decision = false;

        }
        return decision;

    }

    public String beginAdventure() {
        String firstMessage = "You awaken to find yourself in a strange location with no memory of how you got here\n";
        String secondMessage = "Enter your name: ";

        return firstMessage + secondMessage;
    }

    private String decision() {
        return "what do you do?";

    }

    public void secondAction() {

        System.out.println("where do you want to move?");
        System.out.println("1 = north, 2 = East, 3 = South, 4 = West");
        String choice = sc.next();
        p1.move(choice);

    }

}
