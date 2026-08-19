package Utilitario;

public class UtilNumero {
    public static int cero=0;
    private UtilNumero(){

    }
    public static <n extends Number> n obtenerValorDefecto(n valor, n valorDefecto){
        return UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(valor, valorDefecto);
    }
    public static <n extends Number> Number obtenerValorDefecto(n valor){
        return UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(valor, cero);
    }

    //por que con doubleValue()
    public static <n extends Number> boolean mayorQue(n numeroUno, n numeroDos){
        return obtenerValorDefecto(numeroUno).doubleValue() > obtenerValorDefecto(numeroDos).doubleValue();
    }
    public static <n extends Number> boolean menorQue(n numeroUno, n numeroDos){
        return obtenerValorDefecto(numeroUno).doubleValue() < obtenerValorDefecto(numeroDos).doubleValue();
    }
    public static <n extends Number> boolean mayorIgual(n numeroUno, n numeroDos){
        return obtenerValorDefecto(numeroUno).doubleValue() >= obtenerValorDefecto(numeroDos).doubleValue();
    }
    public static <n extends Number> boolean menorIgual(n numeroUno, n numeroDos){
        return obtenerValorDefecto(numeroUno).doubleValue() <= obtenerValorDefecto(numeroDos).doubleValue();
    }
    public static <n extends Number> boolean diferente(n numeroUno, n numeroDos){
        return obtenerValorDefecto(numeroUno).doubleValue() != obtenerValorDefecto(numeroDos).doubleValue();
    }
    
    //  , esta entre x y y
    //inccluye rango inicial o si incluye rango final
    //utilitarios de fecha , del identificador unico universal
    //Modelo de dominio refinado




}
