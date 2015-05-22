package com.puridiompe.patho.domain.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author
 *
 */
@Entity
@Table(name = "NOTIFY")
public class Notification{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NOTIFICATION_ID", nullable = false, unique = true)
	private Integer notificationId;

	@Column(name = "SUBJECT", nullable = false, length = 50)
	private String subject;
	
	@Column(name = "MESSAGE_EMAIL", nullable = false, length = 50)
	private String messageEmail;
	
	@Column(name = "NOTIFY_FROM", nullable = false, length = 50)
	private String notifyFrom;
	
	@Column(name = "NOTIFY_TO", nullable = false, length = 50)
	private String notifyTo;
	
	@Column(name = "STATUS", nullable = false, length = 50)
	private String status;
	
	
	public Notification(){
		
		
	}
	

	public Integer getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessageEmail() {
		return messageEmail;
	}

	public void setMessageEmail(String messageEmail) {
		this.messageEmail = messageEmail;
	}

	public String getNotifyFrom() {
		return notifyFrom;
	}

	public void setNotifyFrom(String notifyFrom) {
		this.notifyFrom = notifyFrom;
	}

	public String getNotifyTo() {
		return notifyTo;
	}

	public void setNotifyTo(String notifyTo) {
		this.notifyTo = notifyTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}






