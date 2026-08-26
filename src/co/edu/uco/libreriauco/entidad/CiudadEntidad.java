package co.edu.uco.libreriauco.entidad;

import co.edu.uco.libreriauco.Utilitario.UtilId;
import co.edu.uco.libreriauco.Utilitario.UtilObjeto;
import co.edu.uco.libreriauco.Utilitario.UtilTexto;
import co.edu.uco.libreriauco.dto.DepartamentoDTO;
import co.edu.uco.libreriauco.dto.PaisDTO;

import java.util.UUID;

public class CiudadEntidad {
    private PaisDTO pais;
    private DepartamentoDTO departamento;
    private UUID id;
    private String nombre;

    public CiudadEntidad(){
        setId(UtilId.valorDefecto(id));
        setNombre(UtilTexto.vacia);
        setPais(new PaisDTO());
        setDepartamento(new DepartamentoDTO());
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
    public void setDepartamento(DepartamentoDTO departamento) {
        this.departamento = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(departamento, new DepartamentoDTO());
    }

}
