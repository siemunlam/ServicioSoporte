package com.proyecto.prueba;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExampleModel")
public class ExampleModel {
    private String string;
    private int anInt;
 
    public ExampleModel() {}
 
    public ExampleModel(String string, int anInt) {
        this.string = string;
        this.anInt = anInt;
    }
 
    @GET
    @Path("{cadena}")
    public String getString() {
        return string;
    }
 
    public void setString(String string) {
        this.string = string;
    }
    @GET
    @Path("{numero}")
    public int getAnInt() {
        return anInt;
    }
 
    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
 
    @Override
    public String toString() {
        return "ExampleModel{" +
                "string='" + string + '\'' +
                ", anInt=" + anInt +
                '}';
    }
}