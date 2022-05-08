package unsw.gloriaromanus;

//obersever in observer pattern
abstract class ProvinceBehaviour {
    float taxLevel;

    public abstract int calcProvinceWealth();
    public abstract int calcTaxRevenue();
    public abstract void update(FactionBehaviour f);
}

public class Province extends ProvinceBehaviour {

    //province wealth
    private int wealth;

    //faction that owns province
    private FactionName name;

    public int calcProvinceWealth() {
        //
    }

    public int calcTaxRevenue() {
        //
    }

    public void update(FactionBehaviour f) {
        // 
    }

    //add constructor
    //add getter setter functions
    
}
