/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author ashiq
 */
@Entity
public class TransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double invoiceAmount;
    private String paymentMode;
    private Long creditCardTxn;
    private double baseAmount;
    private double discountAmount;
    private double discountPct;
    private double taxes;
    private Timestamp invoiceTime;
    @ManyToOne
    private RetailerEntity retailer = new RetailerEntity();
    @ManyToOne
    private EmployeeEntity employee = new EmployeeEntity();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="transaction")
    private Collection<TransactionItemEntity> tItems = new ArrayList<TransactionItemEntity>();
    //add LocationEntity

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void setCreditCardTxn(Long creditCardTxn) {
        this.creditCardTxn = creditCardTxn;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setDiscountPct(double discountPct) {
        this.discountPct = discountPct;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public void setInvoiceTime(Timestamp invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public void setRetailer(RetailerEntity retailer) {
        this.retailer = retailer;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public Long getCreditCardTxn() {
        return creditCardTxn;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPct() {
        return discountPct;
    }

    public double getTaxes() {
        return taxes;
    }

    public Timestamp getInvoiceTime() {
        return invoiceTime;
    }

    public RetailerEntity getRetailer() {
        return retailer;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionEntity)) {
            return false;
        }
        TransactionEntity other = (TransactionEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TransactionEntity[ id=" + id + " ]";
    }
    
}
