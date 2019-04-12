/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.struts.action;

import com.test.struts.beans.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author lolit
 */
public class MessageAction extends ActionSupport {
    private MessageStore messagestore;

    public String execute(){
        messagestore = new MessageStore();

        return SUCCESS;

    }

    public MessageStore getMessageStore() {
        return messagestore;
    }

}
