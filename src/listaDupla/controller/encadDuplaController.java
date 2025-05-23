package listaDupla.controller;

import listaDupla.model.No;
public class encadDuplaController {
	private No inicio = null;
	private No fim = null;
	
	
	
	public void inserirInicio(int valor) {
		No novoNo = new No(valor);
		
		if(inicio == null) {
			inicio = fim = novoNo;
		}else {
			novoNo.setProximo(inicio);
			inicio.setAnterior(novoNo);
			novoNo.setAnterior(null);
			inicio = novoNo;
		}
		
		
	}
	
	public void inserirFinal(int valor) {
		No novoNo = new No(valor);
		if(inicio == null) {
			inicio = fim = novoNo;
		}else {
			fim.setProximo(novoNo);
			novoNo.setAnterior(fim);
			fim = novoNo;
		}
		
		
	}
	
	public void remover(int valor) {
		No atual = inicio;
		
		while(atual != null) {
			if(atual.getValor() == valor) {
				if(atual.getAnterior() != null) {
				    atual.getAnterior().setProximo(atual.getProximo());
				} else {
				    inicio = atual.getProximo();
				    if (inicio != null) {
				        inicio.setAnterior(null); 
				    }
				}
				
				if(atual.getProximo() != null) {
					atual.getProximo().setAnterior(atual.getAnterior());
				}else {
					fim = atual.getAnterior();
				}
				return;
			}
			atual = atual.getProximo();
		}
		
		
	}
	
	public void exibir() {
		No atual = inicio;
		
		while(atual != null) {
			System.out.print(atual.getValor() + " -> ");
			atual = atual.getProximo();
		}
		
		System.out.print("null");
	}
	
	public void exibirReverse() {
		No atual = fim;
		
		while(atual != null) {
			System.out.print(atual.getValor() + " -> ");
			atual = atual.getAnterior();
		}
		
		System.out.print("null");
	}
	
	public void insetionSort() {
		if(inicio == null) return;
		
		No atual = inicio.getProximo();
		
		while(atual !=null) {
			int key = atual.getValor();
			No anterior  = atual.getAnterior();
			
			while (anterior != null && anterior.getValor() > key) {
				anterior.getProximo().setValor(anterior.getValor());
				anterior = anterior.getAnterior();
			}
			
			if(anterior == null) {
				inicio.setValor(key);
			}else {
				anterior.getProximo().setValor(key);
			}
			
			atual = atual.getProximo();
		}
	}
	
}
