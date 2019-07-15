package bms.mapper;

import bms.entity.BisShop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:33
 */
//@Mapper
public interface BisShopMapper {

    /**
     * delete shop by shopid
     *
     * @param shopId
     */
    int deleteByPrimaryKey(String shopId);

    int insert(BisShop record);

    int insertSelective(BisShop record);

    BisShop selectByPrimaryKey(String shopId);

    int updateByPrimaryKeySelective(BisShop record);

    int updateByPrimaryKey(BisShop record);

    /**
     * search for all shops
     *
     * @return List<BisShop>
     */
    List<BisShop> findAllShops();

    /**
     * search for shops by shopname
     *
     * @return List<BisShop>
     */
    List<BisShop> selectByShopName(String shopName);

    /**
     * search for shops by shopid
     *
     * @return BisShop
     */
    BisShop getNameByShopId(Integer shopId);

    /**
     * find shops by condition
     *
     * @param bisShop
     * @return List<BisShop>
     */
    List<BisShop> getShopsByCond(BisShop bisShop);

    /**
     * add shop
     *
     * @param bisShop
     */
    void addShop(BisShop bisShop);

    /**
     * 隐藏店铺
     *
     * @param shopId
     */
    void hideShopByShopId(String  shopId);

    void updateShop(BisShop bisShop);
}