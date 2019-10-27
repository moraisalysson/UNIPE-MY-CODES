package main;

import conversores.*;
import leitores.LeitorRTF;

public class Cliente {

 	public static void main(String[] args) {

 		ConversorTexto conversor;
 		if (args[0].equals("pdf")) {
 			conversor = new ConversorPDF();
 		} else if (args[0].equals("tex")) {
 			conversor = new ConversorTeX();
 		} else {
 			conversor = new ConversorASCII();
 		}
 		LeitorRTF leitor = new LeitorRTF(conversor);
 		
 		leitor.lerRTF();
 	}
 }
