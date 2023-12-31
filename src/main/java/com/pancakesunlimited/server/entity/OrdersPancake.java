package com.pancakesunlimited.server.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

/**
 * @author Arnes Poprzenovic
 * Entity class for the orders_pancake table
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "orders_pancake")
public class OrdersPancake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "orders_id")
    @JsonBackReference("orders-ordersPancakes")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "pancake_id")
    private Pancake pancake;
}
