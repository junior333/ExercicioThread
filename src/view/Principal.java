package view;

import controller.ThreadOrdenada;

public class Principal {

	public static void main(String[] args) {
		int id;
		
		for(id=1;id<101;id++) {
			Thread td=new ThreadOrdenada(id);
			td.start();
		}
	}
	
	

}
