package devef.challenge1.seeddesafiocdc.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String description;
    @Column(name = "created_at")
    private Instant createdAt;

    public Author() {
    }

    private Author(String name, String email, String description, Instant createdAt) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.createdAt = createdAt;
    }

    public static Author create(String name, String email, String description) {
        return new Author(name, email, description, Instant.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
