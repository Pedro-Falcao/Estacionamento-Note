package Objetos;

public class Vaga {

    private int numero;
    private boolean status = false; // Status == Ocupada
    private boolean preferencial;

    public Vaga(int numero) {
        this.numero = numero;
        this.status = true;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void ocupar() {
            this.status = true;
        }
    public void liberar(){
        this.status = false;
        }
    public boolean isPreferencial() {
        return preferencial;
    }
    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    @Override
    public String toString() {
        return "{Vaga: " + numero + " Ocupada? " + status + "}";
    }
}
