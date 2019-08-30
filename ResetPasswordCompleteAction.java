package com.internousdev.texas.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.texas.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware {
	
	private Map<String, Object>session;
	
	public String execute(){
		String result = ERROR;
		//DBに新PASSを書き換える
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		int count = userInfoDAO.resetPassword(
				session.get("userIdReset").toString(),
				session.get("newPassword").toString()
				);
		//DBに書き換え終わったらsessionを初期化する
		if(count >0){
			result = SUCCESS;
		}
		session.remove("userIdReset");
		session.remove("newPassword");
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
