package javaassessment;

public class JavaAssessment {

    public static void main(String[] args) {

        PlayerHandler ph = new PlayerHandler();

        if (ph.firstAction() == true) {
            GreatSwamp gs = new GreatSwamp("Large");
            ph.secondAction();
                


        } else {
            Compass c1 = new Compass();
            c1.showDirection();
            
            //ph.secondAction();
            
        }

        

    }

}
