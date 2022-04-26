package com.vk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prd_tab")
public class Product {
	@GeneratedValue
	@Id
	@Column(name = "p_id")
	private Integer prodId;
	@Column(name = "p_code")
	private String prodCode;
	@Column(name = "p_cost")
	private Double prodCost;
	@Column(name = "p_vendor")
	private String prodVendor;
	@Column(name= "p_gst")
	private Double prdGst;
	@Column(name = "p_dis")
	private Double prodDis;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	public String getProdVendor() {
		return prodVendor;
	}
	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}
	public Double getPrdGst() {
		return prdGst;
	}
	public void setPrdGst(Double prdGst) {
		this.prdGst = prdGst;
	}
	public Double getProdDis() {
		return prodDis;
	}
	public void setProdDis(Double prodDis) {
		this.prodDis = prodDis;
	}

}
