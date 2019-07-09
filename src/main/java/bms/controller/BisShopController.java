package bms.controller;

import bms.entity.BisShop;
import bms.service.BisShopService;
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
        System.out.println(bisShop);
        List<BisShop> shops = bisShopService.getShopsByCond(bisShop);
        System.out.println("shops = " + shops);
        return shops;
    }
}
