package reprodutorMidia;

public class MusicaPlayer implements ReprodutorMidia{

	@Override
	public void tocar() {
		System.out.println("Tocando música");
	}

	@Override
	public void pausar() {
		System.out.println("Musíca pausada");
	}

	@Override
	public void selecionarMusica(String nomeMusica) {
		System.out.println("Você selecionou a música: "+nomeMusica);
	}

	@Override
	public void avancarMusica() {
		System.out.println("Avançou para a próxima música");
	}

	@Override
	public void voltarMusica() {
		System.out.println("Voltou à música anterior");
	}

}
