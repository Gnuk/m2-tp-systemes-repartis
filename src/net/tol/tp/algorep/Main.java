/**
 * 
 */
package net.tol.tp.algorep;

/**
 * @author seb
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creation des threads pour initialiser les objets
		

			// Thread Section critique
		
			X mutex = new X();
			
			Thread tapp = new Thread(new Application(mutex));
			tapp.start();
			
			Thread tsec = new Thread(mutex) ;	
			tsec.start();
		
			// Thread Application
			
				
	
			
				
			
	}

}
