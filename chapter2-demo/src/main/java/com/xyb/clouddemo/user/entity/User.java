package com.xyb.clouddemo.user.entity;

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
@Table(name = "tbUser")
@Setter
@Getter
public class User implements Serializable {

    private static final long serialVersionUID = 123L;

    @Id
    @GeneratedValue
    private Long id; // DB table's main key

    private String nickname; // user nickname

    private String avatar;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .add("nickname", getNickname()).toString();
    }

}
