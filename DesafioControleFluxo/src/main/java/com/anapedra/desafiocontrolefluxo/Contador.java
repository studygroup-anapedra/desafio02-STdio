package com.anapedra.desafiocontrolefluxo;

import com.anapedra.desafiocontrolefluxo.exceptions.ParametrosInvalidosException;
import com.anapedra.desafiocontrolefluxo.services.ProcessoSelecaoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Locale;
import java.util.Scanner;


@SpringBootApplication
public class Contador implements CommandLineRunner {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    private final ProcessoSelecaoService parametrosInvalidosException;
    public Contador(ProcessoSelecaoService parametrosInvalidosException) {
        this.parametrosInvalidosException = parametrosInvalidosException;
    }


    public static void main(String[] args) {
        SpringApplication.run(Contador.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int opcao=0;

        while (opcao != 4) {
            System.out.println("\nEscolha uma opção más crie vagas antes de acessar a opções 2 ou 3.\n" +
                    "1 - Criar vagas\n" +
                    "2 - Ver vaga\n" +
                    "3 - Cadastro e seleçãooo de cadidatos\n" +
                    "4 - Sair\n");


            opcao = sc.nextInt();
            switch (opcao) {

                case 1:
                    try {
                     parametrosInvalidosException.getCriarVagas();
                    }catch (ParametrosInvalidosException e) {
                        System.out.println(e.getMessage());

                    }
                     break;

                case 2:
                    parametrosInvalidosException.getVervaga();

                    break;

                case 3:
                    try {
                    parametrosInvalidosException.getSelecionarCandidatos();
                    }catch (NullPointerException e) {
                        System.out.println("Não tem vagas! Vá para opção 1 e crie uma vagas!");
                    }
                    break;

                case 4:
                    System.out.println("Sair");
                    System.exit(0);

                    break;
                default:
                    System.out.println("opção invalida!");

                break;
            }

        }


    }
}
