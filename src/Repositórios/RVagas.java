
package Repositórios;
import java.util.ArrayList;
import java.util.List;
import Objetos.Vaga;

public class RVagas {
    private List<Vaga> repvagas;
    int counter;
    public RVagas(int vagaTotal) {
        this.repvagas = new ArrayList<>();
        for (int i = 1; i <= vagaTotal; i++) {
            repvagas.add(new Vaga(i));
            counter = i;
        }
    }

    public void ocuparVaga(int numero) {
        Vaga vaga = buscarVagas(numero);
        if (repvagas != null && repvagas.getFirst().getStatus()) { // nao entendi o que houve nas funcionou.
            repvagas.getFirst().ocupar();
            System.out.println("Vaga: " + numero + " Status: OCUPADA");
        } else if (repvagas == null) {
            System.out.println("Vaga: " + numero + " Status: INEXISTENTE");
        } else if (numero > counter){
            System.out.println("Vaga: " + numero + " Status: INEXISTENTE");
        }
        else {
            System.out.println("Vaga: " + numero + " Status: LIVRE");
        }
    }
        public void liberarVaga (int numero){
            Vaga vaga = buscarVagas(numero);
            if (repvagas != null && repvagas.getFirst().getStatus()) {
                vaga.liberar();
                System.out.println("Vaga: " + numero + " Status: LIVRE");
            } else if (repvagas == null) {
                System.out.println("Vaga: " + numero + " Status: INEXISTENTE");
            } else if (numero > counter) {
                System.out.println("Vaga: " + numero + " Status: INEXISTENTE");
            } else {
                System.out.println("Vaga: " + numero + " Status: LIVRE");
            }
        }
        public void listarVagas() {
            for (Vaga vaga : repvagas) {
                System.out.println(vaga);
            }
        }
        private Vaga buscarVagas(int numero) {
            for (Vaga vaga : repvagas) {
                if (vaga.getNumero() == numero) {
                    return vaga;
                }
            }
            return null;
        }
    }









