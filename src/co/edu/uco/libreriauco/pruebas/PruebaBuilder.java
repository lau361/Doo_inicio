package co.edu.uco.libreriauco.pruebas;

import co.edu.uco.libreriauco.dominio.PaisDominio;

public class PruebaBuilder {
    public  dominiioPaisUno = new PaisDominio.Builder().build();
    PaisDominio dominioPaisConId= new PaisDominio.Builder().id(UUID.generar()).build();
    PaisDominio dominioPaisConNombre= new PaisDominio.Builder().nombre("C").build();
    PaisDominio dominioPaisCompleto= new PaisDominio.Builder().nombre("C").id(UUID.generar()).build();


}
