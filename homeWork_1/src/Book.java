public class Book {
    public String name;
    public int numberOfPages;
    public int readed;
    public int readedPages;

    public Book(String newName, int newNumberOfPage)
    {
       name = newName;
       numberOfPages = newNumberOfPage;
       readed = 0;
       readedPages =0;
    };
    public void addReadPages(int increment)
    {
        if(readedPages + increment >= numberOfPages)
        {
            readed = 1;
            readedPages = readedPages + increment;
        }
        else
        {
            readedPages = readedPages + increment;
        }
    }
}
