package com.anapedra.desafiocontrolefluxo.services;

import com.anapedra.desafiocontrolefluxo.model.Cadidatos;
import com.anapedra.desafiocontrolefluxo.model.ProcessoCeletivo;
import com.anapedra.desafiocontrolefluxo.exceptions.ParametrosInvalidosException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Arrays;
import java.util.Scanner;

@Service
public class ProcessoSelecaoService {


    Cadidatos cadidatos = new Cadidatos();
    static ProcessoCeletivo processoCeletivo = new ProcessoCeletivo();
    Scanner sc = new Scanner(System.in);




    @Transactional
    public void getCriarVagas()  throws ParametrosInvalidosException {

        System.out.println("Digite o número de vagas:");
        processoCeletivo.setNumeroVagas(sc.nextInt());
        System.out.println("Digite o salario máximo a ser negociado: ");
        processoCeletivo.setMaxOfertaSalario(sc.nextDouble());
        System.out.println("Digite a idade minima exigida do cadidato: ");
        processoCeletivo.setMinIdade(sc.nextInt());
        System.out.println("Digite a idade máxima exigida do cadidato: ");
        processoCeletivo.setMaxIdade(sc.nextInt());
        getValidParam(processoCeletivo.getMinIdade(), processoCeletivo.getMaxIdade());


        System.out.println("\n" +

                "Número de vaga: "+ processoCeletivo.getNumeroVagas()+ "\n" +
                "Idade minima exigida do cadidato: "+ processoCeletivo.getMinIdade()+ "\n" +
                "Idade máxima exigida do cadidato: "+ processoCeletivo.getMaxIdade()+ "\n" +
                "Salario máximo a ser negociado: "+ processoCeletivo.getMaxOfertaSalario());


    }


    static void getValidParam(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        parametroUm = processoCeletivo.getMinIdade();
        parametroDois = processoCeletivo.getMaxIdade();
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro!");

        }

    }


    public  void getVervaga() {

         System.out.println("Requisitos de vervagas: ");
         System.out.println("\n" +

                 "Número de vaga: "+ processoCeletivo.getNumeroVagas()+ "\n" +
                 "Idade minima exigida do cadidato: "+ processoCeletivo.getMinIdade()+ "\n" +
                 "Idade minima exigida do cadidato: "+ processoCeletivo.getMaxIdade()+ "\n" +
                 "Salario máximo á ser negociado: "+ processoCeletivo.getMaxOfertaSalario());


    }

    public void getSelecionarCandidatos()  {

         Cadidatos[] aprovados = new Cadidatos[processoCeletivo.getNumeroVagas()];
        System.out.println("Digite o número de candidatos a ser avaliados: ");
        processoCeletivo.setNumMaxCandidatos(sc.nextInt());


        int cont = 0;
        int contAprovados = 0;


        while (contAprovados +1 <= processoCeletivo.getNumeroVagas() && cont +1 <= processoCeletivo.getNumMaxCandidatos()) {

            sc.nextLine();
            System.out.println("Digite o nome do cadidato " + (cont + 1) + ": ");
            cadidatos.setNome(sc.nextLine());
            System.out.println("Digite o salario pretendido de " + cadidatos.getNome()+ ": ");
            cadidatos.setSalarioPretendido(sc.nextDouble());
            System.out.println("Digite a idade de " + cadidatos.getNome() + ": ");
            cadidatos.setIdade(sc.nextInt());


            if (cadidatos.getSalarioPretendido() <= processoCeletivo.getMaxOfertaSalario()
                    && cadidatos.getIdade() >= processoCeletivo.getMinIdade()
                    && cadidatos.getIdade() <= processoCeletivo.getMaxIdade()) {

                System.out.println("O cadidata(o)" + ","+cadidatos.getNome() +" foi aprovado com sucesso :) ");

               Arrays.fill(aprovados, cadidatos);
              contAprovados++;

            }
            else {
                System.out.println("O cadidata(o) "+ ","+cadidatos.getNome() +" foi reprovado :( " );

            }
            cont++;



        }
        System.out.println("\nForam aprovados "+contAprovados+ " de "+cont+" candidatos avaliados.");



    }




}




