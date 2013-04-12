package cn.blog.model.comment;

import java.util.Date;

import cn.blog.model.article.Article;

/**
 * 文章回复
 * @author xyz
 * @Date 2013-3-25
 */
public class Comment {
	private int commentId;//系统自动编号，主键
	private Article article;//所属文章
	private int userId;//回复人的ID
	private String account;//回复人的用户名
	private String content;//回复内容
	private Date commentTime;//回复时间
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	
	

}
