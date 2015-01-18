package com.partOne.resources;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8315057757268890401L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long amount;
    
    private String mandatID;
    
    private String dateOfSignature;
    
    private String IBAN_debitor;
    
    private String BIC_debitor;
    
    private String IBAN_creditor;
    
    private String BIC_creditor;

    private String endToEndId;

    public String getMandatID() {
        return mandatID;
    }

    public void setMandatID(String mandatID) {
        this.mandatID = mandatID;
    }

    public String getDateOfSignature() {
        return dateOfSignature;
    }

    public void setDateOfSignature(String dateOfSignature) {
        this.dateOfSignature = dateOfSignature;
    }

    public String getIBAN_creditor() {
        return IBAN_creditor;
    }

    public void setIBAN_creditor(String IBAN_creditor) {
        this.IBAN_creditor = IBAN_creditor;
    }

    public String getBIC_creditor() {
        return BIC_creditor;
    }

    public void setBIC_creditor(String BIC_creditor) {
        this.BIC_creditor = BIC_creditor;
    }

    public String getIBAN_debitor() {
        return IBAN_debitor;
    }

    public void setIBAN_debitor(String IBAN_debitor) {
        this.IBAN_debitor = IBAN_debitor;
    }

    public String getBIC_debitor() {
        return BIC_debitor;
    }

    public void setBIC_debitor(String BIC_debitor) {
        this.BIC_debitor = BIC_debitor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

}