// Main class to run the program
public class FactoryMethodExample {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}

// Document interface
interface Document {
    void open();
}

// WordDocument class
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document...");
    }
}

// PdfDocument class
class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

// ExcelDocument class
class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}

// Abstract Factory
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// Word factory
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

// PDF factory
class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

// Excel factory
class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
