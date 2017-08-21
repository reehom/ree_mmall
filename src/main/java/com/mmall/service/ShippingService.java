package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.commons.ServerResponse;
import com.mmall.pojo.Shipping;

import java.util.Map;

public interface ShippingService {
    public ServerResponse<Map> add(Integer userId, Shipping shipping);

    public ServerResponse delete(Integer userId, Integer shippingId);

    public ServerResponse update(Integer userId, Shipping shipping);

    public ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    public ServerResponse<PageInfo> list(Integer userId,int pageNum,int pageSize);
}
