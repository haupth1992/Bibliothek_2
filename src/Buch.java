public class Buch {
    
    //Variablen in der Klasse Buch
    //private beduetet das nur die Klasse Buch darauf zugreifen kann
    
    private String title;
    private String author;
    private long isbn;
    
    
    //Konstruktor
    
    Buch(String author, long isbn, String title){
        this.isbn = isbn;       //hier wird der übergabe wert isbn diesem isbn übergeben.
        this.title = title;     //hier wird der übergabe title isbn diesem title übergeben.
        this.author = author;
    }
    
    public Buch borrowBook(){
        return this;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
    	this.title = title;
    }
    
    public Long getIsbn(){
        return this.isbn;
    }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    
}
