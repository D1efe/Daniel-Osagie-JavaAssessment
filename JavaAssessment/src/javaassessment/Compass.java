package javaassessment;

import java.util.Scanner;

public class Compass {

    private double north;
    private double east;
    private double south;
    private double west;

    public Compass() {

        this.north = 20;
        this.east = 15;
        this.south = 34;
        this.west = 19;
        System.out.println("North: " + north + "m, " + "East: " + east + "m, " + "South: " + south + "m, " + "West: " + west + "m, ");

    }

    public double getNorth() {
        return north;
    }

    public double getEast() {
        return east;
    }

    public double getSouth() {
        return south;
    }

    public double getWest() {
        return west;
    }

    public void setNorth(double north) {
        this.north = north;
    }

    public void setEast(double east) {
        this.east = east;
    }

    public void setSouth(double south) {
        this.south = south;
    }

    public void setWest(double west) {
        this.west = west;
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

        {

            if (direction.matches("north")) {
                System.out.println(pointNorth());
            } else if (direction.matches("east")) {
                System.out.println(pointEast());
            } else if (direction.matches("south")) {
                System.out.println(pointSouth());
            } else if (direction.matches("west")) {
                System.out.println(pointWest());
            } else {
                showDirection();
            }

        }
    }

    private String pointNorth() {
        
        return "To the north, the compass shows: " + north;

    }

    private String pointEast() {
        
        return "To the east, the compass shows: " + east;

    }

    private String pointSouth() {
        
        return "To the south, the compass shows: " + south;

    }

    private String pointWest() {
        
        return "To the west, the compass shows: " + west;

    }

}

