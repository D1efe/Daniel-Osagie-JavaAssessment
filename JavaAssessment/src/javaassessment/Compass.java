package javaassessment;

import java.util.Scanner;

public class Compass {

    private double north;
    private double east;
    private double south;
    private double west;

    public Compass() {

        this.north = 72.4;
        this.east = 63.8;
        this.south = 32.7;
        this.west = 89.2;
        System.out.println("North: " + north + "m, " + "East: " + east + "m, " + "South: " + south + "m, " + "West: " + west + "m, ");

    }

    public Compass(int north, int east, int south, int west) {

        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
        System.out.println(north + "m, " + east + "m, " + south + "m, " + west + "m, ");

    }

    public void showDirection() {

        System.out.println("What direction do you want to look in?\n north, east, south or west");
        Scanner sc = new Scanner(System.in);
        String direction = sc.nextLine();
        if (direction.matches("north")) {
            System.out.println(pointNorth());
        } else if (direction.matches("east")) {
            System.out.println(pointEast());
        } else if (direction.matches("south")) {
            System.out.println(pointSouth());
        } else if (direction.matches("west")) {
            System.out.println(pointWest());
        }

    }

    public double changeDistance(double x) {

        double newDistance = x;
        return x;
    }

    private String pointNorth() {
        return "To the north, the compass shows: " + north;

    }

    private String pointEast() {
        return "To the north, the compass shows: " + east;

    }

    private String pointSouth() {
        return "To the north, the compass shows: " + south;

    }

    private String pointWest() {
        return "To the north, the compass shows: " + west;

    }

}

//    private String showDistance() {
//        return north + " " + east + " " + south + " " + west;
//    } 

