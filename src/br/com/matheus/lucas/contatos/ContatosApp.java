package br.com.matheus.lucas.contatos;

import br.com.matheus.lucas.contatos.model.Contato;
import br.com.matheus.lucas.contatos.repository.ContatoRepository;

import java.util.Scanner;

public class ContatosApp {

    public static void main(String[] args) {
        System.out.println("CONTATOS!");

//        Contato c1 = new Contato();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o nome do contato: ");
//        c1.nome = sc.nextLine();
//
//        System.out.println("Digite o email do contato: ");
//        c1.email = sc.nextLine();
//
//        System.out.println("Digite o telefone do contato: ");
//        c1.telefone = sc.nextLine();

        ContatoRepository cr = new ContatoRepository(); // Salvando os arquivos id/nome/email/telefone no ContatoRepository
//        cr.contato = c1;
//        cr.gravar();
        cr.listarContatos();


    }
}
