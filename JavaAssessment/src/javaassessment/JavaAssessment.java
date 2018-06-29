package javaassessment;

public class JavaAssessment {

    public static void main(String[] args) {

        PlayerHandler ph = new PlayerHandler();
        Compass c1 = null;
        double escapeNum = 100;

        GreatSwamp gs = new GreatSwamp();
        System.out.println(ph.decision());

        if (ph.firstAction() == false) {
            c1 = new Compass();
            c1.showDirection();
        }
        ph.secondAction();
        gs.consequence(ph.p1.getMovement());

        for (int i = 5; i > 0; i--) {
            System.out.println(i + " turns remaining. Distance to escape: " + escapeNum + "m");
            ph.secondAction();

            switch (ph.p1.getMovement()) {
                case "north":
                    escapeNum = escapeNum - c1.getNorth();
                    break;
                case "east":
                    escapeNum = escapeNum - c1.getEast();
                    break;
                case "south":
                    escapeNum = escapeNum - c1.getSouth();
                    break;
                case "west":
                    escapeNum = escapeNum - c1.getWest();
                    break;
            }

        }
        if (escapeNum <= 0) {
            System.out.println("you have escaped");
        } else {
            System.out.println("you are dead. Deep");
        }

    }
}
