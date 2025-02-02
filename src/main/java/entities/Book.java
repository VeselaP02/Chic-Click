//package entities;
//
//import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;
//
//import java.time.LocalDate;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity(name = "books")
//public class Book {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String title;
//
//    @Column(nullable = false)
//    private String author;
//
//    private String genre;
//
//    private Boolean isAvailable = true;
//
//
//    @OneToMany(mappedBy = "book",targetEntity = BorrowRecord.class)
//    private Set<BorrowRecord> borrowRecords;
//
//    public Book() {
//        this.borrowRecords = new HashSet<>();
//    }
//
//    public Book(String title, String author, String genre) {
//        this();
//        this.title = title;
//        this.author = author;
//        this.genre = genre;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public Boolean getAvailable() {
//        return isAvailable;
//    }
//
//    public void setAvailable(Boolean available) {
//        isAvailable = available;
//    }
//
//    public Set<BorrowRecord> getBorrowRecords() {
//        return borrowRecords;
//    }
//
//    public void setBorrowRecords(Set<BorrowRecord> borrowRecords) {
//        this.borrowRecords = borrowRecords;
//    }
//}
