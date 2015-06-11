package cn.xrmy.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.xrmy.biz.NewsService;
import cn.xrmy.biz.ProductService;
import cn.xrmy.mapper.NewsMapper;
import cn.xrmy.mapper.NewsMapperCustom;
import cn.xrmy.mapper.ProductMapper;
import cn.xrmy.mapper.ProductMapperCustom;
import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;
import cn.xrmy.pojo.Product;
import cn.xrmy.pojo.ProductCustom;
import cn.xrmy.pojo.ProductQueryVo;

/**
 * 
 * <p>Title: ItemsServiceImpl</p>
 * <p>Description: 商品管理</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-4-13下午3:49:54
 * @version 1.0
 */
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductMapperCustom productMapperCustom;
	
	@Autowired
	private ProductMapper productMapper;

	public List<ProductCustom> findProductList(ProductQueryVo proQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return productMapperCustom.findProductList(proQueryVo);
	}

	public Product findProductById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(id);
	}

	public void updateProduct(Long id, ProductCustom proCustom)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void insertSelective(Product product) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void deleteByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
