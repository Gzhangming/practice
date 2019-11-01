package com.gzhangming.apartment.practice.business.a_dataTest.dto.vo;

import hans.common.persistence.dto.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Vo
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Getter
@Setter
@ApiModel(value = "UserCeshiVo")
public class UserCeshiVo extends BaseVo {

    private static final long serialVersionUID = 1L;

    /** 名字 */
    @ApiModelProperty(value = "名字")
    private String name = "";

}
