package com.example.sucette;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The product JPA entity.
 */
@Entity
@Table(name = "products")
public class Search implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Integer ProductNo;

    @Column(name = "product_name", length = 50)
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "product_stock")
    private Integer productStock;

    @Column(name = "product_description", length = 200)
    private String productDescription;

    public Integer getProductNo() {
        return ProductNo;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductId() {
        return ProductNo;
    }

    public void setProductNo(final Integer productNo) {
        this.ProductNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(final Double productPrice) {
        this.productPrice = productPrice;
    }

}