package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {
    FuncionarioMedico medico;
    FuncionarioEnfermeira enfermeira;
    FuncionarioAuxiliarAdministrativo auxiliarAdministrativo;

    @BeforeEach
    void setUp() {
        medico = new FuncionarioMedico(null);
        enfermeira = new FuncionarioEnfermeira(medico);
        auxiliarAdministrativo = new FuncionarioAuxiliarAdministrativo(enfermeira);
    }

    @Test
    void deveRetornarAuxiliarAdministrativoParaEscritaFixaConsulta() {
        assertEquals("Auxiliar administrativo", auxiliarAdministrativo.escreverDocumento(new Documento(TipoDocumentoFixaConsulta.getTipoDocumentoFixaConsulta())));
    }

    @Test
    void deveRetornarEnfermeiraParaEscritaTriagem() {
        assertEquals("Enfermeira", auxiliarAdministrativo.escreverDocumento(new Documento(TipoDocumentoTriagem.getTipoDocumentoTriagem())));
    }

    @Test
    void deveRetornarMedicoParaEscritaReceita() {
        assertEquals("Médico", auxiliarAdministrativo.escreverDocumento(new Documento(TipoDocumentoReceita.getTipoDocumentoReceita())));
    }

    @Test
    void deveRetornarNenhumDocumentoFoiEscrito() {
        assertEquals("Pessoa desistiu de consultar.", auxiliarAdministrativo.escreverDocumento(new Documento(null)));
    }
}