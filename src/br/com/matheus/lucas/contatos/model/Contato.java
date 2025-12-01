package br.com.matheus.lucas.contatos.model;

import java.util.UUID;

public class Contato {

    public String nome;
    public String email;
    public String telefone;
    public String id = UUID.randomUUID().toString(); // Criando Id



    public String serializarContato() {

        String contatoSerializado = id + ";" + nome + ";" + email + ";" + telefone + "\n"; // Criando o arquivo que irá para o arquivo.csv


        return contatoSerializado; // Sempre deve ser colocado um retorno para a função que chamar ela

    }

}
