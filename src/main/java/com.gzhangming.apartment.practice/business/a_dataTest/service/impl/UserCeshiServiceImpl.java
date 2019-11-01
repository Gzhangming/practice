package com.gzhangming.apartment.practice.business.a_dataTest.service.impl;

import com.gzhangming.apartment.practice.business.a_dataTest.dao.UserCeshiDao;
import com.gzhangming.apartment.practice.business.a_dataTest.dto.vo.UserCeshiVo;
import com.gzhangming.apartment.practice.business.a_dataTest.entity.UserCeshi;
import com.gzhangming.apartment.practice.business.a_dataTest.service.UserCeshiService;
import com.qiyuesuo.pdf.text.pdf.T;
import hans.common.persistence.ResponseVo;
import hans.common.persistence.service.CrudService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Service
 *
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Service

public class UserCeshiServiceImpl extends CrudService<UserCeshiDao, UserCeshi, UserCeshiVo> implements UserCeshiService {

    @Resource
    UserCeshiDao userCeshiDao;


    @Override
    public ResponseVo<T> getList(String id) {
        System.out.println("??????????????????????????????????????");
        UserCeshiVo list = userCeshiDao.getList(id);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        return  new ResponseVo().ok(list);
    }


}
