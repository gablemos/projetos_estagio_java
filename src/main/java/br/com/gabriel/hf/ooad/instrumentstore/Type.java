package br.com.gabriel.hf.ooad.instrumentstore;

public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch (this){
            case ACOUSTIC: return "Acoustic";
            case ELECTRIC: return "Electric";
            default:    return "Unspecified";
        }
    }
}
