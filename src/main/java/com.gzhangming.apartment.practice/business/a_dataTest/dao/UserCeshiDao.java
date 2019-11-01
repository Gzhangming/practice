package com.gzhangming.apartment.practice.business.a_dataTest.dao;

import com.gzhangming.apartment.practice.business.a_dataTest.dto.vo.UserCeshiVo;
import com.gzhangming.apartment.practice.business.a_dataTest.entity.UserCeshi;
import hans.common.persistence.dao.CrudDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * Dao
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Mapper
public interface UserCeshiDao extends CrudDao<UserCeshi> {

    UserCeshiVo getList(String id);

}
