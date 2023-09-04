package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    private String registro;
    private String cracha;

    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    
    public Funcionario(int codigo, String nome, String email, String contaCorrente, String telefone, LocalDate dataNascimento, 
    String usuario, String senha, String registro, String cracha) {
       super(codigo, nome, email, telefone, dataNascimento, contaCorrente, usuario, senha);

        this.registro = registro;
        this.cracha = cracha;
        
    }

}
