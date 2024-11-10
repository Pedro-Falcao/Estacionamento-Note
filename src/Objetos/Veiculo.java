package Objetos;

public class Veiculo extends Registro{

    private String modelo;
    private String placa;
    private String cor;

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public Veiculo(int id,String modelo, String placa, String cor) {
        super(id);
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
}
