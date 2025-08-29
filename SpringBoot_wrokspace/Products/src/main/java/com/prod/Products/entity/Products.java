package com.prod.Products.entity;

import com.prod.Products.AutoGenerate.ProductIdGenerator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_table")
public class Products {
    @Id
    @GeneratedValue(generator = "product-id")
    @GenericGenerator(
            name = "product-id",
            strategy = "com.prod.Products.AutoGenerate.ProductIdGenerator" // full package path
    )
    @Column(name = "Product_Id")
    private String id;

    @Column(name = "Product_Name")
    private String productName;

    @Column(name = "Description")
    private String productDescripition;

    @Column(name = "Price")
    private double price;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "Category")
    private String category;

    @CreationTimestamp
    @Column(name = "Created_At")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "Updated_At")
    private Date updatedAt;
}
