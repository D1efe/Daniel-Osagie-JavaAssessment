package javaassessment;

import java.util.Scanner;

public class Player {

    private String name;
    private Scanner sc = new Scanner(System.in);
    private String movement;

    public Player(String name) {

        this.name = name;

    }

    public String move(String x) {

        int choice = Integer.parseInt(x);
        movement = null;

        if (choice == 1) {
            System.out.println(moveNorth());
            movement = "north";
        } else if (choice == 2) {
            System.out.println(moveEast());
            movement = "east";
        } else if (choice == 3) {
            System.out.println(moveSouth());
            movement = "south";
        } else if (choice == 4) {
            System.out.println(moveWest());
            movement = "west";
        } else {
            System.out.println("You refuse to move");
            movement = "";
        }
        return movement;

    }

    public String getName() {
        return name;
    }
    public String getMovement() {
        return movement;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String moveNorth() {
        return getName() + " moves North";

    }

    private String moveEast() {
        return getName() + " moves East";

    }

    private String moveSouth() {
        return getName() + " moves South";

    }

    private String moveWest() {
        return getName() + " moves West";

    }

}
