import java.util.Scanner;


public class Account {
	
	//Class Variables
	
	int balanca;
	int transaksioniKaluar;
	String klientiEmri;
	String klientiID;
	
	//Class constructor
	Account(String kemri, String kid) {
		klientiEmri = kemri;
		klientiID = kid;
	}
	
	//Function for Depositing money
	void depozito(int shuma) {
		if (shuma !=0) {
			balanca =+ shuma;
			transaksioniKaluar = shuma;
		}
	}
	
	//Function for Withdrawing money
	void terheq(int shuma) {
		if (shuma !=0) {
			balanca = balanca - shuma;
			transaksioniKaluar = -shuma;
		}
	}
	
	//Funksioni per te shfaqur transaksionin e kaluar
	
	void getTransaksioniKaluar() {
		if (transaksioniKaluar > 0) {
			System.out.println("Depozituar: "+ transaksioniKaluar);
		}
		else if (transaksioniKaluar < 0) {
			System.out.println("Terhequr: " + Math.abs(transaksioniKaluar));
		}
		else {
			System.out.println("Asnje transaksion nuk ka ndodhur");
		}
	}
	
	//Funksioni qe kalkulon interesin te te hollave momentale pas disa viteve
	
	void kalkuloInteresin(int vitet) {
		double rataInteresit = .1085;
		double balancaeRe = (balanca * rataInteresit * vitet) + balanca;
		System.out.println("Rata momentale e interesit eshte " + (100 * rataInteresit));
		System.out.println("Pas "+ vitet + " viteve, balanca juaj do te jete: " + balancaeRe);
	}
	
	//Funksioni qe tregon main menu
	void tregoMenun() {
		char option = '\0';
		Scanner skaneri = new Scanner(System.in);
		System.out.println("Mire se vjen, " + klientiEmri + "!" );
		System.out.println("ID juaj eshte: " + klientiID);
		System.out.println();
		System.out.println("Cfare deshiron te besh?");
		System.out.println();
		System.out.println("A. Shiko balancen e te hollave");
		System.out.println("B. Depozito para");
		System.out.println("C. Terheq para");
		System.out.println("D. Shiko transaksionin e kaluar");
		System.out.println("E. Kalkulo interesin");
		System.out.println("F. Perfundo");
		
		do {
			System.out.println();
			System.out.println("Futni nje opsion: ");
			char option1 = skaneri.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			//Rasti A lejon klienti te shikon balancen e llogarise
			
			case 'A':
				System.out.println("======================");
				System.out.println("Balanca = $" + balanca);
				System.out.println("======================");
				System.out.println();
				break;
			//Rasti B lejon klientin te depozitoj para ne llogarine e vet
			
			case 'B':
				System.out.println("Fute shumen qe deshiron te depozitosh: ");
				int shuma = skaneri.nextInt();
				depozito(shuma);
				System.out.println();
				break;
			
			//Rasti C e lejon perdorusin te terheq para prej llogarise se tij  
				
			case 'C':
				System.out.println("Fute nje shume qe deshiron ta terheqesh");
				int shuma2 = skaneri.nextInt();
				terheq(shuma2);
				System.out.println();
				break;
				
			//Rasti D e lejon perdorusin te shikon transaksionin me aktual 
				
			case 'D':
				System.out.println("===================");
				getTransaksioniKaluar();
				System.out.println("===================");
				System.out.println();
				break;
				
			//Rasti E e kalkulon interesin ne nje llogari pas disa viteve	
				
			case 'E':
				System.out.println("Fute numrin e vitete te interesit ");
				int vitet = skaneri.nextInt();
				kalkuloInteresin(vitet);
				break;
				
			// Rasti F e largon klienti nga llogaria ose e ban logout	
				
			case 'F':
				System.out.println("Gabim: Ke futur nje opsion gabim. Te lutem fute njeren nga keto opsione: A, B, C, D, E, F");
				break;
				
	
			} 
			
		}while(option != 'F');
		System.out.println("Ju faleminderit qe zgjedhet banken tone");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
