package Utilitario;

import java.util.UUID;
public class UtilId {
    //defiinir valor por defecto para el id


        public static  UUID VALOR_DEFECTO  = UUID.fromString("00000000-0000-0000-0000-000000000000");

        private UtilId () {
        }

        public static  UUID valorDefecto(final UUID id, final UUID valorDefecto) {
            return UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(id, valorDefecto);
        }

        public static  UUID valorDefecto(final UUID id) {
            return valorDefecto(id, VALOR_DEFECTO);
        }

}
//asegurar que el modelo de dominio quedo finalizado

