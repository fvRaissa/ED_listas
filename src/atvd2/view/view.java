package atvd2.view;

import atvd2.controller.encadDuplaController;

public class view {

	public static void main(String[] args) {
		encadDuplaController encad = new encadDuplaController();
		
		encad.inserirInicio(2);
		encad.inserirInicio(1);
		encad.inserirInicio(3);
		
		encad.exibir();
		
		encad.inserirInicio(0);
		System.out.println(" ");
		encad.exibir();
		
		System.out.println(" ");
		
		encad.inserirFinal(4);
		encad.exibir();
		
		System.out.println(" ");
		encad.remover(1);
		encad.exibir();
		System.out.println(" ");
		encad.exibirReverse();
		
		System.out.println(" ");
		encad.insetionSort();
		encad.exibir();
		

	}

}
