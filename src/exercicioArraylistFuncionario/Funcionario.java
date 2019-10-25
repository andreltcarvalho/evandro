package exercicioArraylistFuncionario;

public class Funcionario {
	private String name;
	private int id;
	private double salario;
 
	public Funcionario(int id, String name, double salario) {
		super();
		this.name = name;
		this.id = id;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentaSalario(double porcent) {
		this.salario = this.salario +this.salario * (porcent / 100);
	}

	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", id=" + id + ", salario=" + salario + "]";
	}
	
}
