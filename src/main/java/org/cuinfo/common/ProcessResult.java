/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cuinfo.common;

import java.io.Serializable;

/**
 *处理结果
 * @author Administrator
 */
public class ProcessResult implements  Serializable{
    /**
     * 业务处理是否成功
     */
    private boolean success;
    /**
     * 业务处理信息
     */
    private String message;
    /*
     * 业务处理结果，无结果为null
     */
    private Object result;
    
    /**
	 * 是否刷新bodyUrl
	 * 默认false不刷新bodyUrl
	 * 
	 */
	private boolean refresh;
	/***
	 * 是否重定向
	 */
	private boolean redirect;

    public ProcessResult() {
    }

    public ProcessResult(boolean success) {
        this.success = success;
    }
    public ProcessResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ProcessResult(boolean success, String message, Object result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }

    public boolean isRefresh() {
        return refresh;
    }

    public void setRefresh(boolean refresh) {
        this.refresh = refresh;
    }

    public boolean isRedirect() {
        return redirect;
    }

    public void setRedirect(boolean redirect) {
        this.redirect = redirect;
    }

    
    
    
    

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
    
    
}
