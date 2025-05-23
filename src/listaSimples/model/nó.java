package listaSimples.model;


public class nó<T> {
	private int valor;
	private nó<T> proximo;
	
	
	public nó(int valor) {
		this.valor = valor;
		this.proximo = null;
	}
	
	public nó(int valor, nó<T> proximo){
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public int getValor(){
		return valor;
	}
	
	public void setValor(int valor){
		this.valor = valor;
	}
	
	public nó<T> getProximo(){
		return proximo;
	}
	public void setProximo(nó<T> proximo){
		this.proximo = proximo;
	}
}
