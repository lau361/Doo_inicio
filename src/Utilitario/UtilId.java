package Utilitario;

import java.util.UUID;
public class UtilId {
    //defiinir valor por defecto para el id
    public class UtilUUID {

        public static final UUID VALOR_DEFECTO  = UUID.fromString("11111111-1111-1111-1111-111111111111");

        private UtilUUID () {
        }

        public static final UUID valorDefecto(final UUID id, final UUID valorDefecto) {
            return UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(id, valorDefecto);
        }

        public static  UUID valorDefecto(final UUID id) {
            return valorDefecto(id, VALOR_DEFECTO);
        }

    }

}
