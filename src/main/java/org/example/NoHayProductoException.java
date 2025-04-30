package org.example;

public class NoHayProductoException extends Exception {
    public NoHayProductoException(String Errormessage) {
        super(Errormessage);
    }
}
