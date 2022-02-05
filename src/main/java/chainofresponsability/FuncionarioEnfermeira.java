package chainofresponsability;

public class FuncionarioEnfermeira extends Funcionario {

    public FuncionarioEnfermeira(Funcionario proximo) {
        listaDocumentos.add(TipoDocumentoTriagem.getTipoDocumentoTriagem());
        setProximoFuncionario(proximo);
    }

    public String getDescricaoCargo() {
        return "Enfermeira";
    }
}
