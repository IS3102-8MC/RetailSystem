/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author ashiq
 */
@Entity
public class TransactionItemEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double quantity;
    private double price;
    private double discountPct;
    private double discountAmt;
    @ManyToOne
    private RetailerEntity retailer = new RetailerEntity();
    @ManyToOne
    private TransactionEntity transaction = new TransactionEntity();
    @OneToOne
    private ItemEntity item = new ItemEntity();
    //add locationEntity
    

    public Long getId() {
        return id;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountPct(double discountPct) {
        this.discountPct = discountPct;
    }

    public void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public void setRetailer(RetailerEntity retailer) {
        this.retailer = retailer;
    }

    public void setTransaction(TransactionEntity transaction) {
        this.transaction = transaction;
    }

    public void setItem(ItemEntity item) {
        this.item = item;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPct() {
        return discountPct;
    }

    public double getDiscountAmt() {
        return discountAmt;
    }

    public RetailerEntity getRetailer() {
        return retailer;
    }

    public TransactionEntity getTransaction() {
        return transaction;
    }

    public ItemEntity getItem() {
        return item;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof TransactionItemEntity)) {
            return false;
        }
        TransactionItemEntity other = (TransactionItemEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TransactionItemEntity[ id=" + id + " ]";
    }
    
}
