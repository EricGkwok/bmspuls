package bms.service;

import bms.entity.BisShop;
import bms.entity.BisShopUser;
import bms.mapper.BisShopMapper;
import bms.mapper.BisShopUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-06
 * Time: 10:11
 */
@Service
public class BisShopServiceImpl implements BisShopService {
    @Autowired
    private BisShopMapper bisShopMapper;
    @Autowired
    private BisShopUserMapper bisShopUserMapper;

    /**
     * search for all shops
     *
     * @return List<BisShop>
     */
    @Override
    public List<BisShop> findAllShops() {
        return bisShopMapper.findAllShops();
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
}
