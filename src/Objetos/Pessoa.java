package Objetos;

public class Pessoa extends Registro{

    private String nome;
    private int idade;
    private String sexo;
    private String documento;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Pessoa(int id, String nome, int idade, String sexo, String documento){
        super(id);
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.documento = documento;
    }
    @Override
    public String toString() {
        return "\n" +
                "Id: " + getId() + "\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Sexo: " + sexo + "\n" +
                "Documento: " + documento;

}}
