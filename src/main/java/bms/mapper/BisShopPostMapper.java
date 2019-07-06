package bms.mapper;

import bms.entity.BisShopPost;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:36
 */
@Mapper
public interface BisShopPostMapper {
    int deleteByPrimaryKey(String postId);

    int insert(BisShopPost record);

    int insertSelective(BisShopPost record);

    BisShopPost selectByPrimaryKey(String postId);

    int updateByPrimaryKeySelective(BisShopPost record);

    int updateByPrimaryKey(BisShopPost record);
}