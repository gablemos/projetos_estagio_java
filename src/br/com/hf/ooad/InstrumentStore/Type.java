package br.com.hf.ooad.InstrumentStore;

public enum Type {
    ACOUSTIC, ELETRIC;

    @Override
    public String toString() {
        switch (this){
            case ACOUSTIC: return "acoustic";
            case ELETRIC: return "eletric";
            default:    return "unspecified";
        }
    }
}
