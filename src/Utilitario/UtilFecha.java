package Utilitario;

import static Utilitario.UtilTexto.vacia;

public class UtilFecha {
    private UtilFecha(){
    }
    //quiero traer el metodo obtenervalordefecto , para que en caso de que la persona no ingrese el valor ent que sea 0
    //este metodo esta en Util numero
    //que se pueda utilizar sin crear un objeto de tipo fecha
    // como es te metodo es de la clase numero recordemos que lla nos va a devolver un tipo Number ent debo poner el double
    public static boolean DiaPosible(int variable ){
        return UtilNumero.obtenerValorDefecto(variable).doubleValue()>0 && UtilNumero.obtenerValorDefecto(variable).doubleValue() <32;
    }
    public static boolean MesPosible(int variable ){
        return UtilNumero.obtenerValorDefecto(variable).doubleValue()>0 && UtilNumero.obtenerValorDefecto(variable).doubleValue() <13;
    }

    //ahora si el año es posible
    public static boolean YearPosible(int year){
        return UtilNumero.obtenerValorDefecto(year).doubleValue() >1000 && UtilNumero.obtenerValorDefecto(year).doubleValue() < 2100;
    }
    public static boolean FechaValida(int dia, int mes,int year){
        return DiaPosible(dia) && MesPosible(mes) && YearPosible(year);
    }

    //quiero una del control de vacios , para dar un buen formato ,




}

