package controller;

public class ThreadOrdenada extends Thread{
private int id;
	
	public  ThreadOrdenada(int id) {
		this.id=id;
			
	}
	
	@Override
	public void run() {
		Criar();
	}

	private void Criar() {
		System.out.println(getId()+" id = "+id);
		
	}
	

}
