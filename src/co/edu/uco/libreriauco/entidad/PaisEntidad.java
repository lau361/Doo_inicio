package co.edu.uco.libreriauco.entidad;

import co.edu.uco.libreriauco.Utilitario.UtilId;
import co.edu.uco.libreriauco.Utilitario.UtilTexto;

import java.util.UUID;

public class PaisEntidad {

    private UUID id;
    private String nombre;

    //deberia ser el objeto antinull , obligue a que el nulo no se pueda colocar

    //definir valor por defecto para pais

    public PaisEntidad(){
        setId(UtilId.valorDefecto(id));
        setNombre(UtilTexto.vacia);
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id =UtilId.valorDefecto(id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = UtilTexto.getUtilTexto().quitarEspaciosEnBlanco(nombre);
    }
}
