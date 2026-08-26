package co.edu.uco.libreriauco.dto;

import Utilitario.UtilId;
import Utilitario.UtilTexto;

import java.util.UUID;

public class PaisDTO {

    private UUID id;
    private String nombre;

    //deberia ser el objeto antinull , obligue a que el nulo no se pueda colocar


    public PaisDTO(){
        setId(id);
        setNombre(UtilTexto.vacia);
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = UtilTexto.getUtilTexto().quitarEspaciosEnBlanco(nombre);
    }
}
