package bms.mapper;

import bms.entity.BisShopWork;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:37
 */
//@Mapper
public interface BisShopWorkMapper {
    int deleteByPrimaryKey(String workId);

    int insert(BisShopWork record);

    int insertSelective(BisShopWork record);

    BisShopWork selectByPrimaryKey(String workId);

    int updateByPrimaryKeySelective(BisShopWork record);

    int updateByPrimaryKey(BisShopWork record);
}