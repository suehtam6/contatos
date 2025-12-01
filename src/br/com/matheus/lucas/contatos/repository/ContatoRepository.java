package br.com.matheus.lucas.contatos.repository;

import br.com.matheus.lucas.contatos.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    public Contato contato;
    private  Path arquivo = Paths.get("/Users/25203742/ds1t/contatos.csv"); // Colocando ele privado e fora das outras coisas, pq ele não precisa ser visto pelos outros



    public void gravar(){


        try {
            Files.writeString(arquivo, contato.serializarContato(), StandardOpenOption.APPEND); //Colocado o contato serializado
            System.out.println("Contato " + contato.nome + " gravado com sucesso!!");
        } catch (IOException erro) {
            erro.printStackTrace(); // mostra os erros para o programador
        }



    }

    public void listarContatos(){

        try {
           List<String> contatos = Files.readAllLines(arquivo); // Criando uma lista de strings e salvando em contatos


            int contador = 0;
            while (contador < contatos.size()) { // Fazendo um loop para a nossa lista
                String[] linha = contatos.get(contador).split(";"); // Com isso podemos pegar uma linha so do vetor
                System.out.println("Nome: " + linha[1]);
                System.out.println("E-mail: " + linha[2]);
                System.out.println("Telefone: " + linha[3]);
                System.out.println("------------------------");


//                System.out.println(contatos.get(contador));
                contador++; // Fazendo isso o codigo não fica em loop infinito

            }

        } catch (IOException erro) {
            erro.printStackTrace();
        }

    }

}
