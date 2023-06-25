package sample.cafekiosk.spring.domain.product;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sample.cafekiosk.spring.domain.BaseEntity;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productNumber;

    @Enumerated(value = EnumType.STRING)
    private ProductType type;

    @Enumerated(value = EnumType.STRING)
    private ProductSellingStatus sellingStatus;

    private String name;

    private int price;

}