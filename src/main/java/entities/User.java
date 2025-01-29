package entities;
import validations.ValidationsForUserClass;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


    @Entity(name = "users")
    public class User extends ValidationsForUserClass {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false,length = 200)
        private String username;

        @Column(nullable = false,length = 80)
        private String password;

        @Column(nullable = false,length = 50)
        private String email;

        @Column(name = "card_number",nullable = false,length = 100)
        private String cardNumber;

        private BigDecimal balance;

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "user_product",
                joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "product_id",referencedColumnName = "id"))
        private Set<Product> products;

        public User() {
            this.products = new HashSet<>();
        }

        public User(String username, String password, String email,String cardNumber) {
            this();
            this.setUsername(username);
            this.setPassword(password);
            this.setEmail(email);
            this.setCardNumber(cardNumber);
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            validationUserRegister(username,"^[a-zA-Z][a-zA-Z0-9_]{3,}$","username");
            this.username = username;

        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            validationUserRegister(password,"^[a-zA-Z0-9]{8,}$","password");
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            validationUserRegister(email,"^[a-z][a-zA-Z0-9_]+@[a-z]{2,5}.[a-z]{2,3}$","email");
            this.email = email;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            validationUserRegister(cardNumber,"^(?:\\d{4}[ ]?){3}\\d{4}$","cardNumber");
            this.cardNumber = cardNumber;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void setBalance(BigDecimal balance) {
            this.balance = balance;
        }

        public Set<Product> getProducts() {
            return products;
        }

        public void setProducts(Set<Product> products) {
            this.products = products;
        }
    }
