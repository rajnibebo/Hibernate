/**
 * 
 */
package com.action.hibernate.basics;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "MESSAGE")
public class Message {
	@Id
	@GeneratedValue
	@Column(name = "MSG_ID")
	private Long id;
	@Column(name = "MSG_TXT")
	private String messageText;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NXT_MSG_ID")
	private Message nextMessage;

	public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(String msg) {
		this.messageText = msg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public Message getNextMessage() {
		return nextMessage;
	}

	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}
	public String toString() {
		return "Msg::\n\t"+"Id:"+id+", Message:"+messageText+",NextMsg Ref:"+nextMessage+"\n";
	}
}
