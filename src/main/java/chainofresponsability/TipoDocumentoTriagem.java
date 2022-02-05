package chainofresponsability;

public class TipoDocumentoTriagem implements TipoDocumento {
    private static TipoDocumentoTriagem tipoDocumentoTriagem = new TipoDocumentoTriagem();

    private TipoDocumentoTriagem() {};

    public static TipoDocumentoTriagem getTipoDocumentoTriagem() {
        return tipoDocumentoTriagem;
    }
}
