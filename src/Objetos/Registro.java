package Objetos;

public class Registro {
    private int id;

    // Construtor
    public Registro(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Registro" + "id= " + id;
    }
}
