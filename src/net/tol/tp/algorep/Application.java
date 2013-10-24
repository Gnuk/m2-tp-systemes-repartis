package net.tol.tp.algorep;


public class Application extends Thread {
	  public void run() {


		  System.out.println("-- Demarrage du threads Application --- \n  ");
		  
		  while ( true )
		  {
			
			  System.out.println(" Code de section critique  ");
			  System.out.println("Demande de rentrée en section critique ");
			  try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}			  
		  }
		  
	  }
}