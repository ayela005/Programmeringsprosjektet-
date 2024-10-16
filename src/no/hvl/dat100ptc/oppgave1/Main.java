package no.hvl.dat100ptc.oppgave1;

public class Main {

	public static void main(String[] args) {
		
		//Opprett et GPSPoint-objekt 
		
	GPSPoint punkt = new GPSPoint(1, 2.0, 3.0, 5.0);
	
	
	//Skriv ut tidspunktet ved å bruke getTime() der punkt er det nye navnet.
	System.out.println( "Tidspunkt: " + punkt.getTime());
	
	
	//Endre tidpunktet til 2 
	punkt.setTime(2);
	
	
	//skriv ut informasjon om objektet ved bruk toString()
	System.out.println(" Informasjon om GPSPoint" + punkt.toString());
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
