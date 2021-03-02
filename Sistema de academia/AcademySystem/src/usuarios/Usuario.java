package usuarios;

public class Usuario {
	
	// CRIANDO AS VARIÁVEIS DO USUÁRIO
	private String name, cpf, status, plans;
	private int years;
	private float height, weight;
	
	// CRIANDO O CONSTRUTOR PARA O USUARIO
	public Usuario(String name, String cpf, int years, float height, float weight, String status, String plans) {
		this.setName(name);
		this.setCpf(cpf);
		this.setYears(years);
		this.setHeight(height);
		this.setWeight(weight);
		this.setStatus(status);
		this.setPlans(plans);
	}

	// CRIANDO O MÉTODO GET E SET PARA AS VARIÁVEIS DO USUARIO
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPlans() {
		return plans;
	}
	

	public void setPlans(String plans) {
		this.plans = plans;
	}
	
	@Override
	public String toString() {
		return "\n" + "ALUNOS CADASTRADOS" + "\n\n" + "Aluno: " + this.name + "\n" + "Status: "+ this.status + "\n" + "Plano: " + this.plans.toUpperCase();
	}
	
}