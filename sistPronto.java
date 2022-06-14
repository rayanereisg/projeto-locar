		package locar; //juntar tudo aqui quando terminar
		
		import java.util.ArrayList;
		import java.util.Locale;
		import java.util.Scanner;
		
		public class sistPronto {
		
		public static void main(String[] args) {
	
		int escolha;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		do {
	System.out.println("Escolha o que deseja fazer agora:");
	System.out.println("1- Fazer cadastro");
	System.out.println("2 - Escolher pacote para aluguel de automóvel");
	System.out.println("0 - Sair do sistema");
					
		escolha = sc.nextInt();
		
			
		switch (escolha){
		case 1:{ //fazer cadastro
	System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS!");
	
	System.out.println("Nome: ");
	String nome = sc.nextLine();
		
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
	    		
		break;	    	
	    		
	//escolher automovel
		case 2: {

	
	System.out.println("Escolha o automovel:");
	System.out.println("1- Nissan versa note");
	System.out.println("2 - gol");
	System.out.println("0 - Sair do sistema");;				
		escolha = sc.nextInt();
		switch (escolha){
		case 1:{
	System.out.println("=========COMPONENTES DO VEICULO========="); 
	System.out.println("MODELO: Nissan versa note" + ("\nCOR: PRETO") + ("\nPRECO (POR MES): R$ 431.18")+("\nAR - CONDICIONADO")+("\nPLACA: ABS-1255")+("\nDISPONÍVEL: SIM")+("\nQUILOMTRAGEM: LIVRE"));
	System.out.println("------------------------------------------");
	System.out.println("Deseja alugar este veiculo?"+ "\n1-sim"+ "\n2-não");
		int resp = sc.nextInt();
	
		if (resp == 1) {
	System.out.println("escolha quantos meses voce deseja ficar com o automovel: ");
		double meses = sc.nextDouble();
		double valorcarro = 500.00;
		double totalaluguel = valorcarro * meses;
	System.out.println("------------------------------------------");
	System.out.println("Total do aluguel: " + totalaluguel);
	System.out.println("Codigo do aluguel: Loc457" + meses);
	System.out.println("APOS O PAGAMENTO, VOCE PODERA RETIRAR O VEÍCULO NA LOJA INFORMANDO O CODIGO QUE FOI PASSADO.");
	System.out.println("------------------------------------------");
	}
		else if(resp == 2)
   	System.out.println("Saindo do sistema");
   	 	else 
   	System.out.println("Opcao invalida");
   	}
	//fim
		break; 
		case 2: // informações do aluguel
	System.out.println("=========COMPONENTES DO VEICULO========="); 
	System.out.println(("MODELO: GOL") + ("\nCOR: BRANCO") + ("\nPRECO (POR MES): R$ 500.00")+("\nAR - CONDICIONADO")+("\nPLACA: PCP-4578")+("\nDISPONÍVEL: SIM")+("\nQUILOMTRAGEM: LIVRE"));
	System.out.println("------------------------------------------");
	System.out.println("Deseja alugar este veiculo?"+ "\n1-sim"+ "\n2-não");
		int resp = sc.nextInt();
		if (resp == 1) {
	System.out.println("------------------------------------------");
	System.out.println("escolha quantos meses voce deseja ficar com o automovel: ");
		double meses = sc.nextDouble();
		double valorcarro = 500.00;
		double totalaluguel = valorcarro * meses;
	System.out.println("------------------------------------------");
	System.out.println("Total do aluguel: " + totalaluguel);
	System.out.println("Codigo do aluguel: Loc457" + meses);
	System.out.println("APOS O PAGAMENTO, VOCE PODERA RETIRAR O VEÍCULO NA LOJA INFORMANDO O CODIGO QUE FOI PASSADO.");
	System.out.println("------------------------------------------");
}
		else if(resp == 2)
	System.out.println("Saindo do sistema");
		else 
	System.out.println("Opcao invalida");
}
		break;}	
}	

		if (escolha == 0) {
	System.out.println("\nAte Logo!");
	sc.close();			
}
}	while (escolha != 0);		
	sc.close();	
}
}