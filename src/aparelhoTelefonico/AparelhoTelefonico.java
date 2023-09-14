package aparelhoTelefonico;

public class AparelhoTelefonico {
	private int numero;

	public AparelhoTelefonico(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	public void ligar() {
		System.out.println("Tuuh tuuh tuuh");
	}
	
	public void atender() {
		System.out.println("Olá quem fala?");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Sua ligação não foi atendida no momento após o sinal você pode deixe uma mensagem de vóz, Biiiip!");
	}
	
	public void recusarLigação() {
		System.out.println("Ligação recusada");
	}
}
