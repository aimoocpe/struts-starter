package me.aimoocpe.action;

import com.opensymphony.xwork2.ActionSupport;

import me.aimoocpe.model.MessageStore;

public class HelloWorldAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;

	public String execute() {
		messageStore = new MessageStore();

		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}
}
