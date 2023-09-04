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
    
    public Passageiro( String documento, String poltrona, String destino)
     super (codigo, destino, destino, destino, dataNascimento, documento, poltrona, destino);
     this.documento = documento;
     this. poltrona = poltrona;
     this.destino = destino;
}
