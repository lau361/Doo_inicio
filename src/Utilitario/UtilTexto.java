package Utilitario;

public class UtilTexto {
    private static UtilTexto instancia;
    public static String vacia = "";

    private UtilTexto() {
    }

    public static UtilTexto getUtilTexto() {
            synchronized (UtilTexto.class) {
                if (UtilObjeto.esNulo(instancia)) {
                    instancia = new UtilTexto();
                }
            }
            return instancia;
    }


    public boolean esNula(String texto) {
        return UtilObjeto.esNulo(texto);
    }
    public boolean esVacia(String texto) {
        if(esNula(texto)){
            texto= vacia;
        }
        return vacia.equals(texto);
    }
    public String obtenerValorDefecto(String valor, String valorDefecto) {
        return UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(valor, valorDefecto);
    }
    public String obtenerValorDefecto(String valor){
        return obtenerValorDefecto(valor,vacia);
    }
    //
    public String quitarEspaciosEnBlanco(String valor){
        return obtenerValorDefecto(valor).trim();
    }
    public int obtenerLongitudCadena(String valor){
        return obtenerValorDefecto(valor).length();
    }
    public int obtenerLongitudCadena(String valor, boolean quitarEspaciosEnBlanco){
        return quitarEspaciosEnBlanco ?
                obtenerLongitudCadena(quitarEspaciosEnBlanco(valor)): obtenerLongitudCadena(valor);
    }


    public boolean longitudCadenaEsValida(String valor, int longitudInicial , int longitudFinal, boolean quitarEspaciosEnBlanco){

        var valorSanitizado = quitarEspaciosEnBlanco ? quitarEspaciosEnBlanco(valor): valor;

        return obtenerLongitudCadena(valorSanitizado)>= longitudInicial && obtenerLongitudCadena(valorSanitizado)<=longitudFinal;
    }

}