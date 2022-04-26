package com.vk.productcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.model.Product;
import com.vk.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody Product prod){
		Integer id = service.saveProduct(prod);
		String data = "Product Data Save" + id;
		ResponseEntity<String> res = new ResponseEntity<String>(data,
				HttpStatus.CREATED);
		return res;
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> list = service.getAll();
		ResponseEntity<List<Product>> rs = new ResponseEntity<List<Product>>(
				list, HttpStatus.OK);
		return rs;
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Product> getOneProduct(@PathVariable Integer id){
		
		Product prd = service.getOneProduct(id);
		ResponseEntity<Product> rs = new ResponseEntity<Product>(
				prd, HttpStatus.OK);
		return rs;
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(@RequestBody Product p){
		Integer id = service.updateProduct(p);
		String data = "Product Data update" + id;
		ResponseEntity<String> res = new ResponseEntity<String>(data,
				HttpStatus.OK);
		return res;
		
	}

}
