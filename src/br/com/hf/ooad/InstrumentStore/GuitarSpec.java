package br.com.hf.ooad.InstrumentStore;

public class GuitarSpec extends InstrumentSpec{

    private int numStrings;

    public GuitarSpec(String model, Builder builder, Type type,
                      Wood backWood, Wood topWood, int numStrings){
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)){
            return false;
        }
        if (!(otherSpec instanceof GuitarSpec)){
            return false;
        }
        GuitarSpec spec = (GuitarSpec)otherSpec;
        if(numStrings != spec.numStrings){
            return false;
        }
        return true;
    }
}