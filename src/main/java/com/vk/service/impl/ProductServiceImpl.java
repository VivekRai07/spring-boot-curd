package com.vk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.model.Product;
import com.vk.repository.ProductRepository;
import com.vk.service.IProductService;



@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public Integer saveProduct(Product p) {
		Double cost = p.getProdCost();
		p.setProdDis(cost *12/100);
		p.setPrdGst(cost * 18/100);
		repo.save(p);
		return p.getProdId();
	}

	@Override
	public Integer updateProduct(Product p) {
		Product extprod = repo.findById(p.getProdId()).orElse(null);
		extprod.setProdCode(extprod.getProdCode());
		extprod.setProdCost(extprod.getPrdGst());
		repo.save(extprod);
		return extprod.getProdId();
		
	}

	@Override
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
		

	}

	@Override
	public Product getOneProduct(Integer id) {
		Optional<Product> opt = repo.findById(id);
	      return opt.get();
	}
	@Override
	public List<Product> getAll() {
	
		return repo.findAll();
	}



}
