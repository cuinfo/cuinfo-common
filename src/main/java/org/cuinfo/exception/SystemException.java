/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cuinfo.exception;

import java.io.Serializable;

/**
 * 系统定义异常
 * @author Administrator
 */
public class SystemException extends  RuntimeException implements Serializable{
    /**
     * 出错原因，便于用户体验
     */
    private String exceptionMessage; 
    //还可以定义系统出错代码等

    public SystemException() {
    }

    public SystemException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    
    
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
    
}
