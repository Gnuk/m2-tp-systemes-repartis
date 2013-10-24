package net.tol.tp.algorep;

public class X implements Runnable {
	
	private boolean attenteSC = false;
	
	  public void run() {
		  
		  System.out.println("-- Demarrage du threads Mutex --- \n  ");
		  
		  while (true)
		  {
		   
			  if ( attenteSC == true)
			  {
				  System.out.println("[M] Acces a la section critique par l'app  \n \n ");
				  System.out.println("[M] Execution de la section critique  \n ");
				  this.l();
				  System.out.println("[M] Liberation de la section critique  \n ");
				  
				  
			  }
			
			  try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  } 
		    
		  }
	  
	  public  void r()
	  {
		  
		  this.attenteSC = true;
	  }
	  
	  public  void l()
	  {
		  this.attenteSC = false;
	  }
	  
	  
	}
