package cn.blog.action.manage.user;

import javax.annotation.Resource;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import cn.blog.model.user.User;
import cn.blog.service.ObjectService;
import cn.blog.utils.Struts2Utils;

@Controller @Scope("prototype")
public class UserAction implements Action {
	@Resource ObjectService objectService;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * 跳转到注册页面
	 * @return
	 */
	public String register(){
		return "register";
	}
	
	/**
	 * 跳转到注册成功页面
	 * @return
	 */
	public String addUser(){
		objectService.save(user);
		ActionContext.getContext().put("message", user.getAccount());
		return "succMessage";
		
	}
	
	/**
	 * 指向登录页面
	 * @return
	 */
	public String toLogin(){
		return "toLogin";
	}
	
	/**
	 * 用户登录
	 * @return
	 */
	public String login(){
		String code= Struts2Utils.getParameter("code")==null?"":Struts2Utils.getParameter("code");
		String rand =(String) Struts2Utils.getSession().getAttribute("rand");
		if(user.getAccount()==null||user.getAccount().equals("")) 
		{
			Struts2Utils.setAttribute("message", "用户名不能为空！");
			return "failure";
		}
		if(user.getPassword()==null||user.getPassword().equals(""))
		{
			Struts2Utils.setAttribute("message", "密码不能为空!");
			return "failure";
		}
		if(code.equals(rand))
		{
			if(user.getAccount()!=null && !"".equals(user.getAccount().trim())
					&& user.getPassword()!=null && !"".equals(user.getPassword().trim())){
				if(objectService.validate(user.getAccount().trim(), user.getPassword().trim())){
					Struts2Utils.getSession().setAttribute("user", objectService.findByAccount(user.getAccount().trim()));
					Struts2Utils.setAttribute("message", "登录成功");
					return "manage";
				}
				Struts2Utils.setAttribute("message", "用户名或密码有误!");
				return "failure";
			}		
		}
		else{
			Struts2Utils.setAttribute("message", "验证码有误!");
			return "failure";
		}
		return "failure";
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
