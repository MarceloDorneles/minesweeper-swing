package br.com.Mardor.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

	public void eventoOcorreu(Campo c, CampoEvento e);
}
