package br.com.Mardor.cm.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.Mardor.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
	
		tabuleiro.registrarObservadores(e ->{
			//TODO mostrar resultado para o usu�rio!
		});
	}
}
