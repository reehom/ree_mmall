package com.mmall.service;

import com.mmall.commons.ServerResponse;
import com.mmall.vo.CartVo;

public interface CartService {
    public ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    public ServerResponse<CartVo> update(Integer userId,Integer productId,Integer count);

    public ServerResponse<CartVo> delete(Integer userId,String productIds);

    public ServerResponse<CartVo> list(Integer userId);

    public ServerResponse<CartVo> selecOrUnSelect(Integer userId,Integer checked,Integer productId);
    

    public ServerResponse<Integer> getCartProductCount(Integer userId);

}
