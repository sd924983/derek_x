package cn.blog.model.user;

import java.util.Set;

import cn.blog.model.article.Article;
import cn.blog.model.comment.Comment;
import cn.blog.model.usergroup.UserGroup;

/**
 * 用户定义
 * @author xyz
 * @Date 2013-3-25
 */
public class User {
	private int userId;//用户编号，主键
	private String account;//用户名
	private String password;//密码
	private String realname;//真实姓名
	private String email;//用户邮箱
	private Gender gender;//用户性别
	private String tel;//用户电话
	private String qqNum;//用户QQ号码
	private String homepage;//用户主页
	private String headgif;//用户头像地址
	private String friend;//好友名称
	private int visitor;//被访问次数
	private String self;//自我评价
	private Set<Article> articles;//用户的文章
	private Set<Comment> comments;//用户的评论
	private UserGroup userGroup;
	
	
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public UserGroup getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}
	public Set<Article> getArticles() {
		return articles;
	}
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getQqNum() {
		return qqNum;
	}
	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getHeadgif() {
		return headgif;
	}
	public void setHeadgif(String headgif) {
		this.headgif = headgif;
	}

	public String getFriend() {
		return friend;
	}
	public void setFriend(String friend) {
		this.friend = friend;
	}
	public int getVisitor() {
		return visitor;
	}
	public void setVisitor(int visitor) {
		this.visitor = visitor;
	}
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	
	
	
	
}
