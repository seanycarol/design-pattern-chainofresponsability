package chainofresponsability;

public class FuncionarioMedico extends Funcionario {

    public FuncionarioMedico(Funcionario proximo) {
        listaDocumentos.add(TipoDocumentoReceita.getTipoDocumentoReceita());
        setProximoFuncionario(proximo);
    }

    public String getDescricaoCargo() {
        return "Médico";
    }
}
