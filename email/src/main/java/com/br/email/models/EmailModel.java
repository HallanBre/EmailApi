package com.br.email.models;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

import com.br.email.enums.StatusEmail;

@Entity
@Table(name = "MS_EMAIL")
public class EmailModel implements Serializable {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject; //Titulo do email
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDataEmail;
    private StatusEmail statusEmail;



    //GETTERS AND SETTERS
    public Long getEmailId() {
        return emailId;
    }
    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }
    public String getOwnerRef() {
        return ownerRef;
    }
    public void setOwnerRef(String ownerRef) {
        this.ownerRef = ownerRef;
    }
    public String getEmailFrom() {
        return emailFrom;
    }
    public void setEmailFrom(String emailPara) {
        this.emailFrom = emailPara;
    }
    public String getEmailTo() {
        return emailTo;
    }
    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public LocalDateTime getSendDataEmail() {
        return sendDataEmail;
    }
    public void setSendDataEmail(LocalDateTime sendDataEmail) {
        this.sendDataEmail = sendDataEmail;
    }
    public StatusEmail getStatusEmail() {
        return statusEmail;
    }
    public void setStatusEmail(StatusEmail statusEmail) {
        this.statusEmail = statusEmail;
    }
}
