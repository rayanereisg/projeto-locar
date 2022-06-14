package locar; //fazer cadastro da pessoa

import java.util.ArrayList;
import java.util.Scanner;

public class cadastro {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS!");
			
			System.out.println("Digite os dados "+"\nNome:  ");
			String nome =sc.nextLine();
			
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			
			System.out.println("CPF:  ");
			String CPF = sc.nextLine();
			
			System.out.println("Digite o número do seu celular:  ");
			String celular = sc.nextLine();
			
			System.out.println("Insira sua data de nascimento: "); 
			String nascimento1 = sc.nextLine();
			
			System.out.println("Gênero:  ");
			String genero = sc.nextLine();
			
			System.out.println("Insira a senha desejada: "); 
			String senha = sc.nextLine();
			
			System.out.println("--------------------------------------- "); 
			dados usuario;
			
			usuario = new dados();
			
			usuario.setNome(nome);
			usuario.setCPF(CPF);
			usuario.setNascimento(nascimento1);
			usuario.setEmail(email);
			usuario.setCelular(celular);
			usuario.setGenero(genero);
			usuario.setSenha(senha);
			
			ArrayList<dados> usuarios = new ArrayList<dados>();
			
			usuarios.add(usuario);
			
			System.out.println("nome: "+usuario.getNome()+"\ne-mail: "+usuario.getEmail()+"\nCPF: " + usuario.getCPF()+ "\ncelular: "+usuario.getCelular()+"\nnascimento: "+usuario.getNascimento()+ "\ngenero: "+ usuario.getGenero() + "\nsenha: ********* " );
			System.out.println("--------------------------------------- ");
			System.out.println("CADASTRO REALIZADO COM SUCESSO! ");
		}
     
}
	}


