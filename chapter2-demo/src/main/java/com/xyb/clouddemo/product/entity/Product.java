package com.xyb.clouddemo.product.entity;

import com.google.common.base.MoreObjects;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yebingxu
 */
@Entity
@Table(name = "tbProduct")
@Setter
@Getter
public class Product implements Serializable {

    private static final Long serialVersionUID = 246L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String coverImage;

    private int price;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .add("name", getName()).toString();
    }

}
