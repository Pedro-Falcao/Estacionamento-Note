import Objetos.Pessoa;
import Objetos.Servicos;
import Objetos.Vaga;
import Objetos.Veiculo;
import Repositorios.RVagas;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Servicos serv = new Servicos();
        System.out.println("PARQUIMÊTRO-ESTACIONAMENTO");

        System.out.println("--CADASTRO DO CONDUTOR--");
        System.out.println("DIGITE O SEU NOME");
        String nome = sc.next();
        System.out.println("AGORA, INSIRA SUA IDADE: ");
        int idade = sc.nextInt();
        System.out.println("DIGITE SEU SEXO: (M/F) ");
        String sexo = sc.next();
        System.out.println("DIGITE A NUMERAÇÃO DA SUA CNH: ");
        String doc = sc.next();
        System.out.println(" E DIGITE SUA COMANDA: ");
        int gerador = sc.nextInt();
        int id = serv.gerarId(gerador);
        Pessoa pessoa = new Pessoa(id, nome, idade, sexo, doc);

        System.out.println("--CADASTRO VEICULO--");
        System.out.println("POR FAVOR DIGITE O MODELO DO SEU CARRO: ");
        String modelo = sc.next();
        System.out.println("AGORA DIGITE A PLACA DO SEU VEICULO: ");
        String placa = sc.next();
        System.out.println("POR FIM, DIGITE A COR DELE: ");
        String cor = sc.next();
        Veiculo veiculo = new Veiculo(modelo, placa, cor);

        Vaga vaga1;
        RVagas rvagas = new RVagas(10); // quantidades de vagas criadas no repositorio
        rvagas.ocuparVaga(5);
        rvagas.ocuparVaga(6);

        //ocupação automática.


        System.out.println("--SELEÇÃO DE VAGAS ABAIXO-- ");

        System.out.println("\nEstado atual das Vagas: ");
        rvagas.listarVagas();

        System.out.println("QUAL VAGA DESEJA OCUPAR? ");
        int leitor = 0;
        boolean validar = false;
        while (!validar) {
            int leitorVagas = sc.nextInt();
            vaga1 = rvagas.buscarVagas(leitorVagas);

            if (vaga1.getStatus()) {
                System.out.println("VAGA OCUPADA TENTE OUTRA");
            } else {
                 validar = true;
                 leitor = leitorVagas;
            }
        }
        System.out.println(leitor);
        rvagas.ocuparVaga(leitor);
        System.out.println("\nEstado atual das Vagas: ");
        rvagas.listarVagas();

        serv.printValores();
        int horas = sc.nextInt();
        System.out.println("VOCE VAI PARA A VAGA:");
        System.out.println(leitor);
        serv.pagamento(horas);
        System.out.println("QUANTIDADE DE HORAS:");
        System.out.println(horas);
        System.out.println("VALOR PAGO:");
        serv.mostrarPagamento(horas);
        System.out.println(" ");
        System.out.println("PARA O CONDUTOR:");
        System.out.println(pessoa);
        System.out.println(" ");
        System.out.println("DE VEICULO: ");
        System.out.println(veiculo);

        System.out.println("  ");
        System.out.println("JÁ PODE IR PRA A SUA VAGA, OBRIGADO! ");



    }}
