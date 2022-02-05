package chainofresponsability;

public class TipoDocumentoFixaConsulta implements TipoDocumento {
    private static TipoDocumentoFixaConsulta tipoDocumentoFixaConsulta = new TipoDocumentoFixaConsulta();

    private TipoDocumentoFixaConsulta() {};

    public static TipoDocumentoFixaConsulta getTipoDocumentoFixaConsulta() {
        return tipoDocumentoFixaConsulta;
    }
}
