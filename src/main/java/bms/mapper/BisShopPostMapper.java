package bms.mapper;

import bms.entity.BisShopPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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

    /**
     * find post name by post code
     *
     * @return BisShopPost
     */
    BisShopPost findPostNameByCode(String postCode);

    /**
     * find post name by post code
     *
     * @return BisShopPost
     */
    List<BisShopPost> getPosts();

    /**
     * find post  by cond
     *
     * @return BisShopPost
     */
    List<BisShopPost> getPostsByCond(BisShopPost bisShopPost);
}