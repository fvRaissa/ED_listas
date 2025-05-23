package listaSimples.view;

import listaSimples.controller.encadSimplesController;
import listaSimples.model.nó;

public class view {

	public static void main(String[] args) {
		encadSimplesController<Integer> encad = new encadSimplesController<>();

		encad.inserirInicio(8);
		encad.inserirInicio(7);
		encad.inserirNoFinal(9);
		encad.exibir();
		
		System.out.println(" ");
		
		encad.remove(9);
		encad.exibir();
		
		System.out.println(" ");
		
		encad.inverte();
		encad.exibir();
		
		System.out.println(" ");
		
		//TESTAR CICLO
		/*nó<Integer> no1 = new nó<>(2);
        nó<Integer> no2 = new nó<>(3);
        nó<Integer> no3 = new nó<>(4);

        no1.setProximo(no2);
        no2.setProximo(no3);
        no3.setProximo(no1);
        
        encad.setInicio(no1);*/
        encad.exibir();
		if(encad.ciclo()) {
			System.out.println("A lista tem um ciclo");
		}else {
			System.out.println("A lista não tem um ciclo");
		}
	}

}
