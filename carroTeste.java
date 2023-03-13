package exercioN4;

import static exercioN4.carro.VERMELHO;

import java.util.Scanner;

public class carroTeste {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite a marca do carro: ");
	String marca = entrada.next();
	System.out.print("Digite o modelo do carro: ");
	String modelo = entrada.next();
	System.out.print("Digite quantos cavalos: ");
	int cavalos = entrada.nextInt();
	carro carro =new carro(5,2,modelo,marca,cavalos);
	
	carro.setCor(VERMELHO);
	carro.imprimiValores();
	
	entrada.close();
}

}
