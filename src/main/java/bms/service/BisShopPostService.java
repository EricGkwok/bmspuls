package bms.service;

import bms.entity.BisShopPost;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-09
 * Time: 14:20
 */
public interface BisShopPostService {
    /**
     * find posts info
     *
     * @return List<BisShopPost>
     */
    List<BisShopPost> getPosts();

    /**
     * find posts info by cond
     *
     * @return List<BisShopPost>
     * @param bisShopPost
     */
    List<BisShopPost> getPostsByCond(BisShopPost bisShopPost);
}
