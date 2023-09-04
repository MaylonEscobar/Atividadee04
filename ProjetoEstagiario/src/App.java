import java.time.LocalDate;

import uniderp.poo.estagiario.dominio.*
;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario p1 = new Funcionario();
        p1.setCodigo(1);
        p1.setTelefone("97873211");
        p1.setDataNascimento(LocalDate.of(2018, 07, 22));

        
    }
}
