package exercicioArraylistFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int id;
		int flag=0;
		double preco;
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		Funcionario f1 = new Funcionario(333, "Maria Brown", 4000.00);
		Funcionario f2 = new Funcionario(536, "Alex Grey", 3000.00);
		Funcionario f3 = new Funcionario(772, "Bob Green", 5000.00);
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		System.out.println("Entre com o ID do funcionario: ");
		id = sc.nextInt();
		System.out.println("Entre com a porcentagem de aumento: ");
		preco = sc.nextDouble();
		for (Funcionario x : lista) {
			if (id == x.getId()) {
				x.aumentaSalario(preco);
				flag=1;
			}
			
				
		}
		if(flag==0) {
			System.out.println("Funcionario nao existe");
		}
		for (Funcionario x: lista) {
			System.out.println(x.toString());
		}
	}
}