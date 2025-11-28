interface Printable{
    void printData();
}

interface Savable{
    void saveData();
}

class Document implements Printable,Savable{
    public void printData(){
        System.out.println("Document is printing");
    }
    
    public void saveData(){
        System.out.println("Document is Saving");
    }
}


public class Main
{
	public static void main(String[] args) {
	    Document d = new Document();
	    d.saveData();
	    d.printData();
	}
}
