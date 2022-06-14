	package locar; //fazer aluguel
	
	import java.util.Locale;
	import java.util.Scanner;
	
	public class aluguel {
	
	public static void main(String[] args) {
	
	int escolha;
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	do {
	System.out.println("Escolha o automovel:");
	System.out.println("1- Nissan versa note");
	System.out.println("2 - gol");
	System.out.println("0 - Sair do sistema");;				
	escolha = sc.nextInt();
	
	if (escolha == 0) {
	System.out.println("\nAté Logo!");
	sc.close();			
	}
			
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
	break; 
	case 2:
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
	while (escolha != 0);		
	sc.close();	
	while (escolha != 0);		
	sc.close();	
	}
	}
	
