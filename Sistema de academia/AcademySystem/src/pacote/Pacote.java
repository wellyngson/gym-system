package pacote;

public class Pacote {

	private String plan;
	private int value;
	private String anualPlanPropertie, acceptCard, visitor = "";

//	CRIANDO CONSTRUTOR PARA A CLASSE PACOTE
	public Pacote(String plan) {
		super();
		
		this.setPlan(plan);
		
		this.planoAnual();
	}

//	CRIANDO M�TODO GET E SET PARA AS VARI�VEIS
	public String getPlan() {
		return plan;
	}
	
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public String getAnualPlanPropertie() {
		return anualPlanPropertie;
	}

	public void setAnualPlanPropertie(String anualPlanPropertie) {
		this.anualPlanPropertie = anualPlanPropertie;
	}

	public String getAcceptCard() {
		return acceptCard;
	}

	public void setAcceptCard(String acceptCard) {
		this.acceptCard = acceptCard;
	}

	public String getVisitor() {
		return visitor;
	}

	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private void planoAnual() {
		if (this.plan.toLowerCase().trim().equals("planoa")) {
			this.value = 100;
			this.acceptCard = "Aceita parcelamento por cart�o";
			this.visitor = "Aceita levar 4 visitantes mensais";
			this.anualPlanPropertie = "� um plano anual";
		} else {
			this.value = 80;
			this.acceptCard = "N�o aceita parcelamento por cart�o";
			this.visitor = "N�o aceita levar visitantes";
			this.anualPlanPropertie = "N�o � um plano anual";
		}
	}
	
	
	@Override
	public String toString() {
		return "Pacotes ofertados pelo " + this.plan + "\n" + "Valor mensal: " + value + "\n" + anualPlanPropertie + "\n" + visitor + "\n" + acceptCard + "\n";
	}
}
