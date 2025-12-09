package com.usal;

/**
 * 
 * Esta clase define una persona por nombre y apellido
 */
public class Persona {

    private String nombre;
    private String apellidos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
/**
 * Metodo factory para crear una Persona a partir de un String separado por comas
 * @param personaString String separador por comas 
 * @return retorna una Persona o lanza una @IllegalArgumentException
 */
    public static Persona fromCSVString(String personaString) {
        String chunks[] = personaString.split(",");
        if (chunks.length != 2) {
            throw new IllegalArgumentException("Parametros no validos");
        } else {
            return new Persona(chunks[0], chunks[1]);   // Esto no puede petar
        }
    }
}
