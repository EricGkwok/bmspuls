package bms.service;

import bms.entity.BisShopPost;
import bms.mapper.BisShopPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-09
 * Time: 14:20
 */
@Service
public class BisShopPostServiceImpl implements BisShopPostService {
    @Autowired
    private BisShopPostMapper bisShopPostMapper;
    /**
     * find posts info
     *
     * @return List<BisShopPost>
     */
    @Override
    public List<BisShopPost> getPosts() {
        return bisShopPostMapper.getPosts();
    }

    /**
     * find posts info by cond
     *
     * @return List<BisShopPost>
     * @param bisShopPost
     */
    @Override
    public List<BisShopPost> getPostsByCond(BisShopPost bisShopPost) {
        return bisShopPostMapper.getPostsByCond(bisShopPost);
    }
}
