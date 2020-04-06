package com.xyb.clouddemo.product.entity;

import com.google.common.base.MoreObjects;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yebingxu
 */
@Entity
@Table(name = "tbProduct_Comment")
@Setter
@Getter
public class ProductComment implements Serializable {

    private static final Long serialVersionUID = 369L;

    @Id
    @GeneratedValue
    private Long id;

    private Long productId;

    private Long authorId;

    private String content;

    private Date created;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .add("productId", getProductId())
                .add("authorId", getAuthorId())
                .add("content", getContent()).toString();
    }
}
