package com.gzhangming.apartment.practice.business.a_dataTest.service;

import com.gzhangming.apartment.practice.business.a_dataTest.entity.UserCeshi;
import com.qiyuesuo.pdf.text.pdf.T;
import hans.common.persistence.ResponseVo;
import hans.common.persistence.service.IBaseService;

/**
 * Service
 *
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
public interface UserCeshiService extends IBaseService<UserCeshi> {



    ResponseVo<T>  getList(String id);


}
