package cn.blog.model.article;

import java.util.Date;
import java.util.Set;

import cn.blog.model.comment.Comment;
import cn.blog.model.user.User;
/**
 * 文章定义
 * @author xyz
 * @Date 2013-3-25
 */
public class Article {
	private int artId;//文章编号，主键
	private String typeName;//文章类别
	private String title;//题目
	private String content;//主要内容
	private String author;//作者
	private Date sendTime;//发布时间
	private int visitor;//访问次数
	private Set<Comment> comments;//文章的评论
	private User user;//所属作者
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public int getArtId() {
		return artId;
	}
	public void setArtId(int artId) {
		this.artId = artId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public int getVisitor() {
		return visitor;
	}
	public void setVisitor(int visitor) {
		this.visitor = visitor;
	}
	
}
