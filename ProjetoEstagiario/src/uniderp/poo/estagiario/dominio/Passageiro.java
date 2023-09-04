package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{

    private String documento;
    private String poltrona;
    private String destino;
    
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getPoltrona() {
        return poltrona;
    }
    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public Passageiro(int codigo, String nome, String email, String contaCorrente, String telefone, 
    LocalDate dataNascimento, String usuario, String senha, String registro, String cracha, String documento,
    String poltrona, String destino) {
     super (codigo, nome, email, telefone, dataNascimento, contaCorrente, usuario, senha);
     this.documento = documento;
     this. poltrona = poltrona;
     this.destino = destino;
    }
}