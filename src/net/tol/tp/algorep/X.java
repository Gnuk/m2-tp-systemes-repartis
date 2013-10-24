package net.tol.tp.algorep;

import java.util.ArrayList;
import java.util.HashMap;

public class X implements Runnable {
	
	private boolean attenteSC = false;
	private boolean csRuning = false;
	private ArrayList<Line> vue;
	private int horloge = 0 ;
	
	public synchronized boolean isAttenteSC() {
		return attenteSC;
	}

	public synchronized void setAttenteSC(boolean attenteSC) {
		this.attenteSC = attenteSC;
	}

	public synchronized ArrayList<Line> getVue() {
		return vue;
	}

	public synchronized void setVue(ArrayList<Line> vue) {
		this.vue = vue;
	}

	public synchronized int getHorloge() {
		return horloge;
	}

	public synchronized void setHorloge(int horloge) {
		this.horloge = horloge;
	}

	public void run() {
		  
		  System.out.println("-- Demarrage du threads Mutex --- \n  ");
		  vue.add(1,new Line(' ',-1));
		  vue.add(2,new Line(' ',-1));
		  vue.add(3,new Line(' ',-1));


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
	  
	  public  void requete(int siteNb , char demande , int horloge)
	  {
		  if (demande == 'r')
		  {
			  			  
		  vue.set(siteNb, new Line(demande,horloge));
		  this.diffuse(siteNb,demande,horloge);
		  this.setHorloge(this.getHorloge() +1 );
		  this.setAttenteSC(false);
		 		  
		  
			  for (Line obj : vue){
			  
				  if (horloge > obj.horloge )
				  {
					  this.attenteSC = true;
				  } 
					 
			  }
		 
		  //
			  
		  }
		 
	  }
	  
	  
	  
	 
	  private void diffuse(int siteNb, char demande, int horloge2) {
		// TODO Auto-generated method stub
		
	}

	public  void l()
	  {
		  this.attenteSC = false;
	  }
	  
	  
	  
	  
	}
