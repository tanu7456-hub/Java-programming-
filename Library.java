// Library application using multiple inheritance by using interface  
interface Book {
    void searchBook();
    void issueBook();
    void returnBook();
    void renewBook();
    void fineCalculation();
}

interface Magazine {
    void issueMagazine();
    void returnMagazine();
}

interface Journal {
    void issueJournal();
    void returnJournal();
}

class Library implements Book, Magazine, Journal {

    public void searchBook() { System.out.println("Book searched"); }
    public void issueBook() { System.out.println("Book issued"); }
    public void returnBook() { System.out.println("Book returned"); }
    public void renewBook() { System.out.println("Book renewed"); }
    public void fineCalculation() { System.out.println("Fine calculated"); }

    public void issueMagazine() { System.out.println("Magazine issued"); }
    public void returnMagazine() { System.out.println("Magazine returned"); }

    public void issueJournal() { System.out.println("Journal issued"); }
    public void returnJournal() { System.out.println("Journal returned"); }

    public static void main(String[] args) {
        Library l = new Library();
        l.issueBook();
        l.issueMagazine();
        l.issueJournal();
    }
}
