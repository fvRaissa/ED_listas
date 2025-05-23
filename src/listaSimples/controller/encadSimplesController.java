package listaSimples.controller;

import listaSimples.model.nó;

public class encadSimplesController<T> {
	private nó<T> inicio = null;
	
	
	public encadSimplesController() {
		this.inicio = null;
	}
	
	//para testar o ciclo
	public void setInicio(nó<T> inicio) {
	    this.inicio = inicio;
	}
	
	
	public void inserirInicio(int valor) {
		nó<T> novoNo = new nó<>(valor);
		novoNo.setProximo(inicio);
		inicio = novoNo;
	}
	
	
	public void inserirNoFinal(int valor){
		nó<T> novoNo = new nó<>(valor);
		if (inicio == null) {
			inicio = novoNo;
		}else {
			nó <T>atual = inicio;
			while (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			atual.setProximo(novoNo);
		}
	}
	
	public boolean remove(int valor) {
		nó<T> atual = inicio;
		nó<T> anterior = null;
		
		while (atual != null && atual.getValor() != valor) {
			anterior = atual;
			atual = atual.getProximo();
		}
		
		if (atual == null) {
			return false;
		}
		
		if (anterior == null) {
			inicio = atual.getProximo();
		}else {
			anterior.setProximo(atual.getProximo());
		}
		
		return true;
	}
	
	public void inverte () {
		nó<T> ant = null;
		nó<T> seg;
		nó<T> atual = inicio;
		
		while (atual != null) {
			
			seg = atual.getProximo();
			atual.setProximo(ant);
			ant = atual;
			atual = seg;
			
		}
		inicio = ant;
		
	}
	
	public boolean ciclo() {
		nó<T> aux = inicio;
		if (aux == null) return false;
		
		nó<T> lento = aux;
		nó<T> rapido = aux.getProximo();
		
		while (rapido != null && rapido.getProximo() != null) {
			if (rapido == lento) {
				return true;
			}
			lento = lento.getProximo();
			rapido = rapido.getProximo().getProximo();
			
		}
		return false;
	}
	
	/*public void exibir() {
		nó atual = inicio;
		
		while (atual != null) {
			System.out.print(atual.getValor() + " -> ");
			atual = atual.getProximo();
		}
		
		System.out.print("null");
	}*/
	
	public void exibir() {
	    nó atual = inicio;
	    int contador = 0;
	    int limite = 20;

	    while (atual != null && contador < limite) {
	        System.out.print(atual.getValor() + " -> ");
	        atual = atual.getProximo();
	        contador++;
	    }

	    if (contador == limite) {
	        System.out.print("... (possível ciclo detectado)");
	    } else {
	        System.out.print("null");
	    }

	    System.out.println();
	}

}
