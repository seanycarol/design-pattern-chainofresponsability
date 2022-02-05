package chainofresponsability;

public class FuncionarioAuxiliarAdministrativo extends Funcionario {

    public FuncionarioAuxiliarAdministrativo(Funcionario proximo) {
        listaDocumentos.add(TipoDocumentoFixaConsulta.getTipoDocumentoFixaConsulta());
        setProximoFuncionario(proximo);
    }

    public String getDescricaoCargo() {
        return "Auxiliar administrativo";
    }
}
