package co.edu.uco.libreriauco.entidad;

import co.edu.uco.libreriauco.Utilitario.UtilId;
import co.edu.uco.libreriauco.Utilitario.UtilObjeto;
import co.edu.uco.libreriauco.Utilitario.UtilTexto;
import co.edu.uco.libreriauco.dto.PaisDTO;

import java.util.UUID;

public class DepartamentoEntidad {
    private PaisDTO pais;
    private UUID id;
    private String nombre;

    // si creo un departamento sin darle informacion , ennt el departamento se creara de esta manera
    public DepartamentoEntidad(){
        setId(UtilId.valorDefecto(id));//tampoco le puso el id
        setNombre(UtilTexto.vacia);
        setPais(new PaisDTO());
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UtilId.valorDefecto(id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = UtilTexto.getUtilTexto().quitarEspaciosEnBlanco(nombre);
    }

    public PaisDTO getPais() {
        return pais;
    }

    public void setPais(PaisDTO pais) {
        //si el pais es nulo, se le asigna un nuevo PaisDTO, de lo contrario se le asigna el pais que se le pasa como parametro
        this.pais = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(pais, new PaisDTO());
    }
}
