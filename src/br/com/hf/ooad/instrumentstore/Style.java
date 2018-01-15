package br.com.hf.ooad.instrumentstore;

public enum Style {

    A, F;

    @Override
    public String toString() {
        switch (this){
            case A:     return "A style";
            case F:     return "F style";
            default:    return "Unspecified";
        }
    }
}
