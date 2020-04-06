package com.xyb.clouddemo.user.dto;

import com.google.common.base.MoreObjects;
import com.xyb.clouddemo.user.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author yebingxu
 */
@ApiModel(value = "user data transfer object")
@Setter
@Getter
public class UserDto implements Serializable {

    @ApiModelProperty(value = "key")
    private Long id;

    @ApiModelProperty(value = "nickname")
    private String nickname;

    @ApiModelProperty(value = "avatar")
    private String avatar;

    public UserDto() {
    }

    public UserDto(User user) {
        id = user.getId();
        nickname = user.getNickname();
        avatar = user.getAvatar();
    }

    @Override
    public String toString() {
        return this.toStringHelper().toString();
    }

    protected MoreObjects.ToStringHelper toStringHelper() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .add("nickname", getNickname());

    }
}
