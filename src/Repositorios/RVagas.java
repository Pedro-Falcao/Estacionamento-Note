
package Repositorios;
import java.util.ArrayList;
import java.util.List;
import Objetos.Vaga;

    public class RVagas{
    private List<Vaga> repvagas;
    int counter;

    public RVagas(int vagaTotal){
        this.repvagas = new ArrayList<>();
        for (int i = 1; i <= vagaTotal; i++) {
            repvagas.add(new Vaga(i));
            counter = i;
        }
    }

    public void adicionarVaga(Vaga vaga){
        repvagas.add(vaga);
        System.out.println("Vaga adicionada: " + vaga);
    }

    public void removerVaga(Vaga vaga){
        repvagas.remove(vaga);
    }


    public void ocuparVaga(int numero){
        Vaga vaga = buscarVagas(numero);
        if (vaga.getStatus()){
            System.out.println("Vaga: " + numero + " Status: OCUPADA");
        } else if (repvagas == null){
            System.out.println("Vaga: " + numero + " Status: INEXISTENTE");
        } else {
            vaga.ocupar();
            System.out.println("Vaga: " + numero + " Status: OCUPADA");
        }
    }

    public void liberarVaga(int numero){
        Vaga vaga = buscarVagas(numero);
        if (repvagas != null && vaga.getStatus()) {
            vaga.liberar();
            System.out.println("Vaga: " + numero + " Status: LIVRE");
        } else if (repvagas == null){
            System.out.println("Vaga: " + numero + " Status: INEXISTENTE");
        } else {
            System.out.println("Vaga: " + numero + " Status: LIVRE");
        }
    }

    public void listarVagas(){
        for (Vaga vaga : repvagas){
            System.out.println("Vaga: " + vaga.getNumero() + " - " + (vaga.getStatus() ? "OCUPADA" : "LIVRE"));
        }
    }

    public Vaga buscarVagas(int numero){
        for (Vaga vaga : repvagas){
            if (vaga.getNumero() == numero){
                return vaga;
            }
        }
        return null;
    }
}












