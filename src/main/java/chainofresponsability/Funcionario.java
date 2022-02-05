package chainofresponsability;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    protected List listaDocumentos = new ArrayList<>();
    private Funcionario proximoFuncionario;

    public Funcionario getProximoFuncionario() {
        return proximoFuncionario;
    }

    public void setProximoFuncionario(Funcionario proximoFuncionario) {
        this.proximoFuncionario = proximoFuncionario;
    }

    public abstract String getDescricaoCargo();

    public String escreverDocumento(Documento documento) {
        if (listaDocumentos.contains(documento.getTipoDocumento())) {
            return getDescricaoCargo();
        } else {
            if (proximoFuncionario != null) {
                return proximoFuncionario.escreverDocumento(documento);
            } else {
                return "Pessoa desistiu de consultar.";
            }
        }
    }
}
