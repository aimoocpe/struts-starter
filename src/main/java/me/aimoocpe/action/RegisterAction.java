package me.aimoocpe.action;

import com.opensymphony.xwork2.ActionSupport;

import me.aimoocpe.model.Person;

public class RegisterAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	private Person personBean;

	public String execute() throws Exception {
		// call Service class to store personBean's state in database

		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person person) {
		personBean = person;
	}
}
