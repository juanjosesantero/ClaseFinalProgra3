package com.usal;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson=new Gson();
        Persona p=new Persona("Alvaro","Lozano");
        String personaJSON=gson.toJson(p);
        System.out.println(personaJSON);
    }
}