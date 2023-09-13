package br.com.meucurso.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {	
	//todos o metodos de uma interface são públicos por definição, não é necessário deixar explícito
	void valorAlterado(String novoValor);
}
