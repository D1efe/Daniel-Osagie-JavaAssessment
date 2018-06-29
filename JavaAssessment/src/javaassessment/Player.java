package javaassessment;

import java.util.Scanner;

public class Player {

    private String name;
    private Scanner sc = new Scanner(System.in);
    

    public Player(String name) {

        this.name = name;

    }

    public void move(String x) {
        
        
        int choice = Integer.parseInt(x);      
                
        switch (choice) {
            case 1:
                System.out.println(moveNorth());
                break;
            case 2:
                System.out.println(moveEast());
                break;
            case 3:
                System.out.println(moveSouth());
                break;
            case 4:
                System.out.println(moveWest());
                break;

        }

    }

    public String getName() {
        return name;
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
