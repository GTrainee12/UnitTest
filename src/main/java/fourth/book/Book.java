package fourth.book;



public class Book {
    private String id;
    private String title;
    private String author;
    private String content;

    public Book(String id) {
        this.id = id;
    }

    public Book(String id, String title, String author,String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getСontent(){return content;}
    public void setСontent(String content){this.content = content;}

}
