package com.example.ecommerce.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Assuming you have a User entity

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cartitem> items = new ArrayList<>();
}
