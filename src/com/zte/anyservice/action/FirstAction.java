package com.zte.anyservice.action;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringBufferInputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.zte.anyservice.bean.User;
import com.alibaba.fastjson.*;
public class FirstAction implements Action{

	private String json;
	private String result;
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	 private InputStream inputStream;
	  public InputStream getInputStream() {
	    return inputStream;
	   }
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public String test() throws IOException{
		 JSONObject  obj= JSON.parseObject(json);
		 JSONArray book=obj.getJSONArray("book");
		 JSONObject param=(JSONObject)obj.get("param");
		 JSONArray aR=param.getJSONArray("a");
		 User user=new User(1,"litianye","xx00");
		 result=JSON.toJSONString(user);
		/* PrintWriter writer=ServletActionContext.getResponse().getWriter();
		 writer.write(result);
		 writer.close();*/
		 inputStream = new StringBufferInputStream(
			      "Hello World! This is a text string response from a Struts 2 Action."); 
		 
		return SUCCESS;
	}

}
