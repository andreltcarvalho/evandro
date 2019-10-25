package curso;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentenca = sc.nextLine();
		String divide[] =sentenca.split(" ");
		System.out.println(divide[0]);
		sc.close();
	}

}
