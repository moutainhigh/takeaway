package com.takeaway.modular.dao.dto;

import java.util.List;

import com.takeaway.modular.dao.model.Feedbacks;
import com.takeaway.modular.dao.model.Items;
import com.takeaway.modular.dao.model.Merchants;
import com.takeaway.modular.dao.model.Orders;
import com.takeaway.modular.dao.model.Users;

public class FeedbacksDto {
	private String id;
	private String userId;
	private String orderId;
	private String merchantId;
	private String itemId;
	private String pid;
	private String evaluate;
	private String goodsScore;
	private String foodScore;
	private String distributionScore;
	private String createdAt;
	private String content;

	private Users users;
	private Orders orders;
	private Merchants merchants;
	private ItemsDto items;
	
	private List<Feedbacks> subFeedbacks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getGoodsScore() {
		return goodsScore;
	}

	public void setGoodsScore(String goodsScore) {
		this.goodsScore = goodsScore;
	}

	public String getFoodScore() {
		return foodScore;
	}

	public void setFoodScore(String foodScore) {
		this.foodScore = foodScore;
	}

	public String getDistributionScore() {
		return distributionScore;
	}

	public void setDistributionScore(String distributionScore) {
		this.distributionScore = distributionScore;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Merchants getMerchants() {
		return merchants;
	}

	public void setMerchants(Merchants merchants) {
		this.merchants = merchants;
	}

	public ItemsDto getItems() {
		return items;
	}

	public void setItems(ItemsDto items) {
		this.items = items;
	}

	public String getEvaluate() {
		return evaluate;
	}

	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<Feedbacks> getSubFeedbacks() {
		return subFeedbacks;
	}

	public void setSubFeedbacks(List<Feedbacks> subFeedbacks) {
		this.subFeedbacks = subFeedbacks;
	}


}
