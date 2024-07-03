package canal.campominado.visao;

import javax.swing.JFrame;

import canal.campominado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelPrincipal extends JFrame {

	public PainelPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50); // para alterar a "dificuldade" modifcar os valores entre ()

		add(new PainelTabuleiro(tabuleiro));

		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new PainelPrincipal();
	}
}
