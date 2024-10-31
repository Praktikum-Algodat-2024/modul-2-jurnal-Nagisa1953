package PACKAGE_NAME;

class Buku extends Node {
    private String buku = "";
    private String author = "";
    private String genre = "";
    private String status = "";

    public Buku(String buku, String author, String genre, String status) {
        this.buku = buku;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    // Getters and Setters
    public void setBuku(String buku) {
        this.buku = buku;
    }

    public String getBuku() {
        return this.buku;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    // Override getData to display all information about the book
    @Override
    public String getData() {
        return "Judul Buku: " + this.buku + "\n" +
                "Pengarang: " + this.author + "\n" +
                "Genre: " + this.genre + "\n" +
                "Status Buku: " + this.status;
    }
}