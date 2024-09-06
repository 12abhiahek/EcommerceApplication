package com.example.ecommerce.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Productdto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private Integer stock;
}
