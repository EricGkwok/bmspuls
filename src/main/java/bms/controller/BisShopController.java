package bms.controller;

import bms.entity.BisShop;
import bms.entity.BisShopUser;
import bms.service.BisShopService;
import bms.service.BisShopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-06
 * Time: 10:08
 */
@RestController
public class BisShopController {
    @Autowired
    private BisShopService bisShopService;

    @Autowired
    private BisShopUserService bisShopUserService;

    /**
     * search for all shops(done)
     *
     * @return List<BisShop>
     */
    @RequestMapping("findAllShops")
    @ResponseBody
    public List<BisShop> findAllShops() {
        List<BisShop> shops = bisShopService.findAllShops();
        return shops;
    }

    /**
     * find shops by cond(done)
     *
     * @return List<BisShop>
     */
    @RequestMapping("getShopsByCond")
    @ResponseBody
    public List<BisShop> getShopsByCond(@RequestBody(required = false) BisShop bisShop) {
        List<BisShop> shops = bisShopService.getShopsByCond(bisShop);
        return shops;
    }

    /**
     * add shop
     */
    @RequestMapping("addShop")
    @ResponseBody
    public List<BisShop> addShop(@RequestBody BisShop bisShop) {
        System.out.println("bisShop = " + bisShop);
        //bisShopService.addBisShop(bisShop);
        return findAllShops();
    }

    /**
     * delete shop
     */
    @RequestMapping("delShopByShopId")
    @ResponseBody
    public List<BisShop> delShopByShopId(String[] shopIds) {
        for (String shopId : shopIds) {
            bisShopService.hideShopByShopId(shopId);
        }
        List<BisShop> shops = findAllShops();
        return shops;
    }

    /**
     * delete shop by id
     */
    @RequestMapping("delShopById")
    @ResponseBody
    public List<BisShop> delShopById(String shopId) {
        System.out.println("shopIds = " + shopId);
        bisShopService.delShopById(shopId);
        List<BisShop> allShops = findAllShops();
        return allShops;
    }

    /**
     * upd shop
     *
     * @param bisShop
     * @return List<BisShop>
     */
    @RequestMapping("updShop")
    public List<BisShop> updShop(@RequestBody BisShop bisShop) {
        System.out.println("bisShop = " + bisShop);
        bisShopService.updateShop(bisShop);
        return findAllShops();
    }

    /**
     * get accounts
     *
     * @return List<String>
     */
    @RequestMapping("getAccounts")
    public List<BisShopUser> getAccounts() {
        return bisShopUserService.getAccounts();
    }
}
