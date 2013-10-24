package net.tol.tp.algorep;


public class Application implements Runnable {
	
	  private X SC;
		
	  public Application(X tsec) {	
		  
		  	SC = tsec;
	}

	public void run() {
		  

		  System.out.println("-- Demarrage du threads Application --- \n  ");
		  
		  while ( true )
		  {
			
			  System.out.println("[A] Code avant la  section critique  ");			
			  System.out.println("[A] Demande d'acces SC  ");
			  SC.requete(Site.siteNb,'r',X.getHorloge());

			  try {
				  
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}	
			  
			 		  
		  }
		  
		  
	  }
	  
}