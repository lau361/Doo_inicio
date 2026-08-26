package co.edu.uco.libreriauco.dto;

import co.edu.uco.libreriauco.Utilitario.UtilId;
import co.edu.uco.libreriauco.Utilitario.UtilObjeto;
import co.edu.uco.libreriauco.Utilitario.UtilTexto;


import java.util.UUID;

public class DepartamentoDTO {
    private PaisDTO pais;
    private UUID id;
    private String nombre;

    public DepartamentoDTO(){
        setId(UtilId.valorDefecto(id));
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

    public void setPais(PaisDTO pais) {
        this.pais = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(pais, new PaisDTO());
    }
}
