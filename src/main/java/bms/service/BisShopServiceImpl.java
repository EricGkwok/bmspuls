package bms.service;

import bms.entity.BisShop;
import bms.mapper.BisShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-06
 * Time: 10:11
 */
@Service
@Transactional
public class BisShopServiceImpl implements BisShopService {
    @Autowired
    private BisShopMapper bisShopMapper;


    /**
     * search for all shops
     *
     * @return List<BisShop>
     */
    @Override
    public List<BisShop> findAllShops() {
        List<BisShop> shops = bisShopMapper.findAllShops();
        return shops;
    }

    /**
     * find shops by condition
     *
     * @param bisShop
     * @return List<BisShop>
     */
    @Override
    public List<BisShop> getShopsByCond(BisShop bisShop) {
        List<BisShop> shopsByCond = bisShopMapper.getShopsByCond(bisShop);
        return shopsByCond;
    }

    /**
     * add bisshop
     *
     * @param bisShop
     */
    @Override
    public void addBisShop(BisShop bisShop) {
        bisShopMapper.insert(bisShop);
//        bisShop.getBisShopUser().
    }

    /**
     * delete bisshop by shopid
     *
     * @param shopId
     */
    @Override
    public void hideShopByShopId(String shopId) {
        bisShopMapper.hideShopByShopId(shopId);
    }

    /**
     * del shop by id
     *
     * @param shopId
     */
    @Override
    public void delShopById(String shopId) {
        bisShopMapper.hideShopByShopId(shopId);
    }

    /**
     * upd shop
     *
     * @param bisShop
     */
    @Override
    public void updateShop(BisShop bisShop) {
        bisShopMapper.updateByPrimaryKeySelective(bisShop);
    }
}
