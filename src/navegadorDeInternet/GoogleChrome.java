package navegadorDeInternet;

public class GoogleChrome implements NavegadorDeInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Mostrando página atual");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Carregando página");
	}

	@Override
	public void fecharAba() {
		System.out.println("Fechando aba");
	}

}
