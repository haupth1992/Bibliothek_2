/**
 *
 * @author Thomas Hauptvogel
 */
 
public class Bibliothek {
	
	Buch[][] bibliothek;
	
	public Bibliothek(){
		this.bibliothek = new Buch[10][100];
	}
	
	public void zeigeBestand(){
		for(int i=0; i<10; i++){
    		for(int j=0; j<100; j++){
    			if(this.bibliothek[i][j] != null){
    				System.out.println(this.bibliothek[i][j].getAuthor() + ", " + this.bibliothek[i][j].getTitle());
    			}
    		}
    	}
	}
		
	//Zusatz
	public void pruefe_Titel(){
		for(int i=0; i<10; i++){
    		for(int j=0; j<100; j++){
    			if(this.bibliothek[i][j] != null){
    				if(this.bibliothek[i][j].getTitle() == ""){
    					this.bibliothek[i][j].setTitle("unbekannt");
    				}
    			}
    		}
    	}
		
	}
	
	public void pruefe_Autor(){
		for(int i=0; i<10; i++){
    		for(int j=0; j<100; j++){
    			if(this.bibliothek[i][j] != null){
	    			if(this.bibliothek[i][j].getAuthor() == ""){
	    				this.bibliothek[i][j].setAuthor("unbekannt");
	    			}
    			}
    		}
    	}
		
	}
	
    public static void main(String[] args) {
    	Bibliothek bibo = new Bibliothek();
    	
    	for(int i=0; i<10; i++){
    		for(int j=0; j<75; j++){
    			bibo.bibliothek[i][j] = new Buch("", 123456789010L, "Hamlet");
    		}
    	}
    	
    	bibo.pruefe_Titel();
    	bibo.pruefe_Autor();
    	
    	bibo.zeigeBestand();
    }
    
    
    
}
