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
        setId(UtilId.valorDefecto(id));//lo dejo sin id
        setNombre(UtilTexto.vacia);
    }
    //get and set de id
    // el get me permite leer la informacion y el set es para asignar o cambiar un valor al atributp
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id =UtilId.valorDefecto(id);
    }
    //get and set de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //Hago control , ent no quiero que un nombre de un pasi tenga espacios en blanco al inicio o al final
        this.nombre = UtilTexto.getUtilTexto().quitarEspaciosEnBlanco(nombre);
    }
}
