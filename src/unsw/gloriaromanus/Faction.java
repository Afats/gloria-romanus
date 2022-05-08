package unsw.gloriaromanus;
import java.util.ArrayList;

//list of all possible names a faction can have
public enum FactionName {
    Romans, Carthaginians, Gauls, 
    CelticBritons, Spanish, Numidians, 
    Egyptians, SeleucidEmpire, Pontus, 
    Amenians, Parthians, Germanics, GreekCityStates, 
    Macedonians, Thracians, Dacians
}

//publisher/subject in observer pattern
interface FactionBehaviour {
    public void addProvince(Province p);
    public void removeProvince(Province p);
    public void notifyProvinces(Province p);
    public void calcFactionWealth();
    public void calcTreasury();
}


public class Faction {

    //faction's name
    private FactionName name;
    //list of conquered factions
    private ArrayList<Faction> conquered = new ArrayList<Faction>();
    //faction treasury
    private int treasury;
    //total faction wealth
    private int wealth; //not sure we need this tbh


    public void addProvince(Province p) {
        //
    }

    public void removeProvince(Province p) {
        //
    }

    public void notifyProvinces(Province p){
        //
    }

    public void calcFactionWealth() {
        //
    }

    public void calcTreasury() {
        //
    }

    //add constructor
    //add getter setter functions
}
