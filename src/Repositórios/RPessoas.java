package Repositórios;
import java.util.ArrayList;
import java.util.List;
import Objetos.Pessoa;

public class RPessoas {

    private List<Pessoa> reppessoas;

    public RPessoas() {
        this.reppessoas = new ArrayList<>();
    }

    public void addPessoa (Pessoa pessoa){
        reppessoas.add(pessoa);
    }
}
