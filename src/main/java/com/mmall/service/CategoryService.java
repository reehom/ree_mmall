package com.mmall.service;

import com.mmall.commons.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

public interface CategoryService {

    public ServerResponse<String> addCategory(String categoryName, Integer parentId);

    public ServerResponse<String> updateCategoryName(Integer categoryId,String categoryName);

    public ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    public ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
