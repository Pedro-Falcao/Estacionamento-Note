package Objetos;

import java.sql.SQLOutput;

public class Servicos {

    public Servicos(){

    }
    public void mostrarPagamento (int horas){
        double valor = 0;
        if (horas>=5){
            valor = 10.00;
        } else {
            valor = 5 + horas;
        }
        System.out.println(valor);
    }

    public double pagamento (int horas){
        double valor;
        if (horas>=5){
            valor = 10.00;
        } else {
            valor = 5 + horas;
        }
        return valor;
    }

    public void printValores(){
        System.out.println("VALORES DO ESTACIONAMENTO");
        System.out.println("Valor 5,00 + hora");
        System.out.println(" 1 hora = 6,00 , 2 horas = 7 reais...");
        System.out.println("5 HORAS OU MAIS O VALOR FIXA EM 10,00");
        System.out.println();
    }

    public int gerarId(int gerador){
        int id = 202400 + gerador;
        return id;
    }
}
