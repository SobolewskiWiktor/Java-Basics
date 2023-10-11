// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book first = new Book("W pustyni i w puszczy", 200);
        Book second = new Book("Dziady", 400);

        System.out.printf("Name: "+first.name+" Pages: "+first.numberOfPages+"\n");
        System.out.printf("Name: "+second.name+" Pages: "+second.numberOfPages+"\n");

        System.out.printf("Readed pages in first: "+first.readedPages+"\n");
        System.out.printf("Readed pages in second: "+second.readedPages+"\n");

        if(first.readed == 1)
        {
            System.out.printf("First book is readed"+"\n");
        }
        else
        {
            System.out.printf("First book is not readed"+"\n");
        }

        if(second.readed == 1)
        {
            System.out.printf("Second book is readed"+"\n");
        }
        else
        {
            System.out.printf("Second book is not readed"+"\n");
        }

        first.addReadPages(200);
        second.addReadPages(150);

        System.out.printf("Readed pages in first: "+first.readedPages+"\n");
        System.out.printf("Readed pages in second: "+second.readedPages+"\n");

        if(first.readed == 1)
        {
            System.out.printf("First book is readed"+"\n");
        }
        else
        {
            System.out.printf("First book is not readed"+"\n");
        }

        if(second.readed == 1)
        {
            System.out.printf("Second book is readed"+"\n");
        }
        else
        {
            System.out.printf("Second book is not readed"+"\n");
        }
    }
}