package javaassessment;

public abstract class BarrenMoor {

    private String worldSize;
    private String numberOfClouds;
    private String numberOfPlants;
    private String water;

    public BarrenMoor(String worldSize) {
        
        this.worldSize = worldSize;
        this.numberOfClouds = numberOfClouds;
        this.numberOfPlants = numberOfPlants;
        this.water = water;

    }
    public BarrenMoor() {

        this.numberOfClouds = numberOfClouds;
        this.numberOfPlants = numberOfPlants;
        this.water = water;

    }

    public String getWorldSize() {
        return worldSize;
    }
    public String getNumberOfClouds() {
        return numberOfClouds;
    }

    public void setNumberOfClouds(String numberOfClouds) {
        this.numberOfClouds = numberOfClouds;
    }

    public String getNumberOfPlants() {
        return numberOfPlants;
    }

    public void setNumberOfPlants(String numberOfPlants) {
        this.numberOfPlants = numberOfPlants;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }
    
    public String strangeVoice() {
        return "Leave this place human";
    }
    
    

}
