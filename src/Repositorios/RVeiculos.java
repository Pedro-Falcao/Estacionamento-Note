package Repositorios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Objetos.Veiculo;

public class RVeiculos {
    private List<Veiculo> repveiculo;


    public RVeiculos() {
        this.repveiculo = new ArrayList<Veiculo>();
    }

    // Adicionar um veículo ao repositório
    public void addVeiculo(Veiculo veiculo) {
        repveiculo.add(veiculo);
        System.out.println("Veículo adicionado: " + veiculo);
    }

    // Remover um veículo pela placa
    public void delVeiculo(String placa) {
        Iterator<Veiculo> iterator = repveiculo.iterator();
        while (iterator.hasNext()) {
            Veiculo v = iterator.next();
            if (v.getPlaca().equals(placa)) {
                iterator.remove(); // Remove o veículo de forma segura
                System.out.println("Veículo removido com placa: " + placa);
                return;
            }
        }
        System.out.println("Veículo com placa " + placa + " não encontrado.");
    }

    // Editar um veículo pela placa
    public void editVeiculo(String placa, String novoModelo, String novaCor) {
        for (Veiculo veiculo : repveiculo) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculo.setModelo(novoModelo); // Atualiza o modelo
                veiculo.setCor(novaCor);       // Atualiza a cor
                System.out.println("Veículo atualizado: " + veiculo);
                return;
            }
        }
        System.out.println("Veículo com placa " + placa + " não encontrado.");
    }

    // listagem de veiculos

    public void listarVeiculos() {
        System.out.println("Lista de Veículos:");
        for (Veiculo veiculo : repveiculo) {
            System.out.println(veiculo);
        }
    }
}
