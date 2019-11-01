package com.gzhangming.apartment.practice.business.a_dataTest.dto.arg;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gzhangming.apartment.practice.business.a_dataTest.entity.UserCeshi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotBlank;

/**
 * Insert
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "UserCeshiInsert")
public class UserCeshiInsert {

    private static final long serialVersionUID = 1L;

    /** 名字 */
    @ApiModelProperty(value = "名字")
    @NotBlank(message = "名字不能为空")
    @Length(max = 25, message = "名字长度不能大于25")
    private String name = "";

    public UserCeshi toUserCeshi() {
        UserCeshi userCeshi = new UserCeshi();
        BeanUtils.copyProperties(this, userCeshi);
        return userCeshi;
    }

}
