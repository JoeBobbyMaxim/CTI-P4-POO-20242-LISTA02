package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_i, min_i, hora_f, min_f, hora_d, min_d;
		System.out.println("Digite o horário inicial");
		System.out.println("Hora:");
		hora_i = sc.nextInt();
		System.out.println("Minuto:");
		min_i = sc.nextInt();
		System.out.println("Digite o horário Final");
		System.out.println("Hora:");
		hora_f = sc.nextInt();
		System.out.println("Minuto:");
		min_f = sc.nextInt();
		
		if(min_i>min_f) {
			min_f = min_f+60;
			hora_f = hora_f-1;
		}
		else if(hora_i>hora_f) {
			hora_f = hora_f+24;
		}
		min_d = min_f-min_i;
		hora_d = hora_f-hora_i;
		System.out.println("O jogo durou "+hora_d+" hora(s) e "+min_d+" minuto(s)");
		}


	}
