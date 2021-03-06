package com.takeaway.modular.dao.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class Feedbacks {
	@ApiModelProperty(value = "ID(编辑时必填)", required = false)
	private Integer id;
	@ApiModelProperty(value = "角色ID(必填)", required = true)
	private Integer userId;
	@ApiModelProperty(value = "订单ID(必填)", required = true)
	private Integer orderId;
	@ApiModelProperty(value = "店铺ID(必填)", required = true)
	private Integer merchantId;
	private Integer itemId;
	@ApiModelProperty(value = "评价id(有pid代表是评价下的回复)", required = true)
	private Integer pid;
	@ApiModelProperty(value = "商品评价(1~3)1:差评;2:一般;3:好评;", required = true)
	private Integer evaluate;
	@ApiModelProperty(value = "商品评分(1~5)", required = true)
	private Integer goodsScore;
	@ApiModelProperty(value = "食物评分(1~5)", required = true)
	private Integer foodScore;
	@ApiModelProperty(value = "配送评分(1~5)", required = true)
	private Integer distributionScore;
	private Date createdAt;
	@ApiModelProperty(value = "评价内容", required = true)
	private String content;

	private String createdTime;
	
	private String userName;
	private String userPhoto;
	private String userRank;
	
	private List<Feedbacks> subFeedbacks;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getGoodsScore() {
		return goodsScore;
	}

	public void setGoodsScore(Integer goodsScore) {
		this.goodsScore = goodsScore;
	}

	public Integer getFoodScore() {
		return foodScore;
	}

	public void setFoodScore(Integer foodScore) {
		this.foodScore = foodScore;
	}

	public Integer getDistributionScore() {
		return distributionScore;
	}

	public void setDistributionScore(Integer distributionScore) {
		this.distributionScore = distributionScore;
	}

	public Integer getEvaluate() {
		return evaluate;
	}

	public void setEvaluate(Integer evaluate) {
		this.evaluate = evaluate;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getUserRank() {
		return userRank;
	}

	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}

	public List<Feedbacks> getSubFeedbacks() {
		return subFeedbacks;
	}

	public void setSubFeedbacks(List<Feedbacks> subFeedbacks) {
		this.subFeedbacks = subFeedbacks;
	}


}
