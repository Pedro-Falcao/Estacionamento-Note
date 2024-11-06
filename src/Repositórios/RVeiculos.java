package Repositórios;
import java.util.ArrayList;
import java.util.List;
import Objetos.Veiculo;

public class RVeiculos {
    private List<Veiculo> repveiculo;

    public RVeiculos() {
        this.repveiculo = new ArrayList<Veiculo>();
    }

    public void addVeiculo (Veiculo veiculo) {
        repveiculo.add(veiculo);
        // adicionar um veiculo ao repositório repveiculo
    }

    public void delVeiculo (String placa) {
        for (Veiculo v : repveiculo) {
            if (v.getPlaca().equals(placa)) {
                repveiculo.remove(v);
            }
        } // removendo um veículo usando a placa como verificação de exclusividade.
    }
    public void editVeiculo (String modelo, String placa, String cor) {
       // isso não vai dar certo porque estou fazendo uma proucura de um objeto diferente do que o que ja existe e não estou sendo obrigado a digitar isso.
        int localEditar = repveiculo.indexOf(new Veiculo(modelo,placa,cor));
         repveiculo.set(localEditar, new Veiculo(modelo,placa,cor));
    }




    // faltam metodos para editar e ler.
    //
}

