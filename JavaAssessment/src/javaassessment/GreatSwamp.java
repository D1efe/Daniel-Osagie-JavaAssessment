package javaassessment;

public class GreatSwamp extends BarrenMoor {

    String size;

    public GreatSwamp(String size) {
        super(size);
        this.setNumberOfClouds("Too many clouds for the eyes to count.");
        this.setWater("The water is, despite being a swamp, clean. Very unusual");
        this.setNumberOfPlants("Surrounding the water are wilted plants, they've been dead for a while");
        System.out.println(surroundings());

    }
    private String scenarioSize() {
        return getNumberOfClouds() + "\n" + getWater() + "\n" + getNumberOfPlants();
              
    }
    private String surroundings() {
        return getNumberOfClouds() + "\n" + getWater() + "\n" + getNumberOfPlants();
              
    }
   
    
    

   

}
