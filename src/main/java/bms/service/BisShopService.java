package bms.service;

import bms.entity.BisShop;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-06
 * Time: 10:11
 */
public interface BisShopService {
    /**
     * search for all shops
     *
     * @return List<BisShop>
     */
    List<BisShop> findAllShops();

    /**
     * find shops by condition
     *
     * @param bisShop
     * @return
     */
    List<BisShop> getShopsByCond(BisShop bisShop);


    /**
     * add bisshop
     *
     * @param bisShop
     */
    void addBisShop(BisShop bisShop);

    /**
     * delete bisshop by shopid
     *
     * @param shopId
     */
    void hideShopByShopId(String shopId);

    /**
     * del shop by id
     * @param shopId
     */
    void delShopById(String shopId);

    /**
     * upd shop
     * @param bisShop
     */
    void updateShop(BisShop bisShop);
}
