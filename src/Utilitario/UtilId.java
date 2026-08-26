package Utilitario;

import java.util.UUID;
public class UtilId {
    //defiinir valor por defecto para el id
    public class UtilUUID {

        public static final UUID VALOR_DEFECTO  = UUID.fromString("11200000-0000-1000-0000-000001001011");

        private UtilUUID () {
        }

        public static final UUID ValorDefecto(final UUID id, final UUID valorDefecto) {
            return UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(id, valorDefecto);
        }

        public static  UUID ValorDefecto(final UUID id) {
            return ValorDefecto(id, VALOR_DEFECTO);
        }

    }

}
