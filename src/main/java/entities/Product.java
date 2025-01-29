package entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

    @Entity(name = "products")
    @Inheritance(strategy = InheritanceType.JOINED)
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        private Long id;

        @Column(name = "product_name",nullable = false,length = 100)
        private String productName;

        @Column(name = "type_of_product")
        private String typeOfProduct;

        @Column(length = 100)
        private String brand;

        @Column(length = 60)
        private String color;

        @Column(nullable = false,length = 10)
        private String size;

        @Column(nullable = false)
        private int quantity;

        @Column(nullable = false)
        private BigDecimal price;

        @Column(nullable = false,length = 100)
        private String material;

        @Lob
        @Column(length = 1000)
        private String description;

        @ManyToMany(mappedBy = "products")
        private Set<User> users;

        protected Product() {
            this.users = new HashSet<>();
        }

        public Product(String productName, String typeOfProduct, String brand, String color, String size, int quantity, BigDecimal price, String material, String description, Set<User> users) {
            this();
            this.productName = productName;
            this.typeOfProduct = typeOfProduct;
            this.brand = brand;
            this.color = color;
            this.size = size;
            this.quantity = quantity;
            this.price = price;
            this.material = material;
            this.description = description;
            this.users = users;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getQuantity() {

            return quantity--;
        }

        public void setQuantity(int quantity) {
            if (quantity <= 0){
                throw new NoSuchElementException("The product is currently out of stock");
            }
            this.quantity = quantity;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTypeOfProduct() {
            return typeOfProduct;
        }

        public void setTypeOfProduct(String typeOfProduct) {
            this.typeOfProduct = typeOfProduct;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public Set<User> getUsers() {
            return users;
        }

        public void setUsers(Set<User> users) {
            this.users = users;
        }
    }
