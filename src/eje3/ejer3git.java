package eje3;

public class ejer3git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayPersonas = {"ANA", "LUIS", "ANTONIO", "MANUEL"};
		contVocales(arrayPersonas);
	}
	public static void contVocales (String [] arrayPersonas) {
		int contA=0,contE=0,contI=0,contO=0,contU=0,cont;
			for(int i=0;i<arrayPersonas.length;i++) {
				 if (arrayPersonas[i].charAt(i)=='A') {
					 contA++;
				 }else if(arrayPersonas[i].charAt(i)=='E') {
					 contE++;
				 }else if(arrayPersonas[i].charAt(i)=='I') {
					 contI++;
				 }else if(arrayPersonas[i].charAt(i)=='O') {
					 contO++;
				 }else if(arrayPersonas[i].charAt(i)=='U'){ 
					 contU++;
				 }else {
					  cont=0;
				  }  
			}
			System.out.println("Numero de vocales A:" + contA);
			System.out.println("Numero de vocales E:" + contE);
			System.out.println("Numero de vocales I:" + contI);
			System.out.println("Numero de vocales O:" + contO);
			System.out.println("Numero de vocales U:" + contU);
	}
}
