package com.example.ecommerce.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Cartitem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private CartEntity cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;
}
