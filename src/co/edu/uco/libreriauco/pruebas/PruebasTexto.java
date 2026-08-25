package co.edu.uco.libreriauco.pruebas;

//import Utilitario.UtilTexto;
import static Utilitario.UtilTexto.getUtilTexto;

public class PruebasTexto {
    public static void main(String[] args) {
        String miVariable = "   mi casa es azul          dx";

        System.out.println(miVariable);
        System.out.println(getUtilTexto().obtenerLongitudCadena(miVariable, false));
        System.out.println(getUtilTexto().obtenerLongitudCadena(miVariable, true));



    }
}

