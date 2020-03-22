package techy.java.hw.march;

import java.util.HashMap;

public class HwSetAndHashMap {

    public static void main(String[] args) {

        // Create a HashMap object called Corona Virus Effected States


        HashMap<String, Integer> CoronaVirusEffectedStates = new HashMap<String, Integer>();

        // Create a HashMap object called CoronaVirusEffectedStates that will store String keys and Integer values:

        // Add String (State's Name) and Integer (How many people effected avg. last update 03/20/2020).

        CoronaVirusEffectedStates.put("New York", 8400);
        CoronaVirusEffectedStates.put("Michigan", 730);
        CoronaVirusEffectedStates.put("Virginia", 620);
        CoronaVirusEffectedStates.put("New Jersey", 460);
        CoronaVirusEffectedStates.put("Florida", 570);

        for (String i: CoronaVirusEffectedStates.keySet()) {


            System.out.println("State : " + i +  " People Effected : " + CoronaVirusEffectedStates.get(i));


        }



        System.out.println("InshaAllah Everything will be ok. Allah save us from Corona Virus.......Ameen.");
    }
}
