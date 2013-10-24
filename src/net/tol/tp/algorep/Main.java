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
		
			// Thread Application
		
			Application tapp = new Application() ;
			tapp.start();
		
			// Thread Section critique
		
			SectionCritique tsec = new SectionCritique() ;
			tsec.start();
		
			
			// Thread Network
			
			Network tnet = new Network() ;
			tnet.start();
			
			
				
			
	}

}
