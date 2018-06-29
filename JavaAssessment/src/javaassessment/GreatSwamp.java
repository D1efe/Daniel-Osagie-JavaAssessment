package javaassessment;

public class GreatSwamp extends BarrenMoor {

    String size;

    public GreatSwamp() {

        this.setNumberOfClouds("Too many clouds for the eyes to count.");
        this.setWater("The water is, despite being a swamp, clean. Very unusual");
        this.setNumberOfPlants("Surrounding the water are wilted plants, they've been dead for a while");
        this.size = "Overall, The beginning or the end cant this swamp can't be seen.";
        System.out.println(surroundings());

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void consequence(String x) {

        {

            if (x.matches("north")) {
                System.out.println(atNorth());
            } else if (x.matches("east")) {
                System.out.println(atEast());
            } else if (x.matches("south")) {
                System.out.println(atSouth());
            } else if (x.matches("west")) {
                System.out.println(atWest());
            } else
                System.out.println("by failing to choose a direction, you are trapped in the swamp");
        }
        System.out.println("Escape the swamp now!");

    }

    private String surroundings() {
        return getNumberOfClouds() + "\n" + getWater() + "\n" + getNumberOfPlants() + "\n" + getSize();

    }

    private String atNorth() {
        setNumberOfClouds("The clouds begin to clear up");
        setWater("The water is getting cloudy");
        
        
        return getNumberOfClouds() + " \n" + getWater();
    }

    private String atEast() {
        setNumberOfPlants("the plants seem to show a path way out");
        setSize("It looks like the swamp might actually end");
        return getNumberOfPlants() + " \n" + getSize();
    }

    private String atSouth() {
        setSize("This swamp may actually be getting bigger");
        setWater("This side is Surrounded by waterfalls");
        return getSize() + " \n" + getWater();
    }

    private String atWest() {
        setNumberOfPlants("The plants are turning black?");
        setNumberOfClouds("The clouds are black too?");
        return getNumberOfPlants() + " \n" + getNumberOfClouds();
    }

}
