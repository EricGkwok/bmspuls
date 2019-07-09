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
     * @return
     * @param bisShop
     */
    List<BisShop> getShopsByCond(BisShop bisShop);
}
