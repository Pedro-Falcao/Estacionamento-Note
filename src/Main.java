import Objetos.Vaga;
import Objetos.Veiculo;
import Repositórios.RVagas;
import Repositórios.RVeiculos;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("PARQUIMÊTRO-ESTACIONAMENTO");
        System.out.println("POR FAVOR DIGITE O MODELO DO SEU CARRO");
        String modelo= "Nissan Kicks";
        String placa = "POV13FT53";
        String cor = "PRETO";
        Veiculo veiculo = new Veiculo(5345,modelo,placa,cor);
        RVeiculos rveiculos = new RVeiculos();
        RVagas rvagas = new RVagas(10); // quantidades de vagas criadas no repositorio
        rvagas.liberarVaga(2);
        rvagas.liberarVaga(3);
        rvagas.liberarVaga(4);
        rvagas.liberarVaga(5);
        rvagas.ocuparVaga(6);
        rvagas.ocuparVaga(8);
        rvagas.ocuparVaga(9);
        rvagas.ocuparVaga(10);

        System.out.println(" ");

        rvagas.buscarVagas(2);

        System.out.println(" ");

        System.out.println("\nEstado atual das Vagas: ");
        rvagas.listarVagas();






    }}
