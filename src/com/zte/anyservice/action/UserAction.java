package com.zte.anyservice.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zte.anyservice.bean.User;
import com.zte.anyservice.service.UserService;
import com.opensymphony.xwork2.dispatcher.HttpServletRequest;
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService service;

	public void setService(UserService service) {
		this.service = service;
	}
    
	public String add(){
		
		User user=new User();
		user.setPassword("xxoo");
		user.setUsername("william");
		service.save(user);
		return SUCCESS;
	}
	
	public String queryAllUser(){
	    List<User> users=service.queryAll();
	  //  ServletActionContext.getRequest().setAttribute("users", users);
	      
		return SUCCESS;
	}
	
	public String deleteUser(){
		
	//	String userid=ServletActionContext.getRequest().getParameter("userid");
		(HttpServletRequest)ServletActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		 //String ServletActionContext.get
		// ServletActionContext.getRequest();
		service.delete(Integer.parseInt(userid));
		return SUCCESS;
	}
	
	public String xhr() throws IOException{
		Map map=new HashMap();
		map.put("name", "wangli");
		map.put("age", "2");
		String json=JSONObject.toJSONString(map);
		PrintWriter writer=ServletActionContext.getResponse().getWriter();
		writer.write(json);
		writer.flush();
		writer.close();
		return SUCCESS;
	}
}
