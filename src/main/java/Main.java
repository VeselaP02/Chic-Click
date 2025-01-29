import entities.Book;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fist_Project");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        User user = new User("kals123","lkio145");
        Book book = new Book("After","Anna Todd","loving");

        entityManager.persist(user);
        entityManager.persist(book);


        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
