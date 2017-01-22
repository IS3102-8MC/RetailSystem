/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author ashiq
 */
@Entity
public class AfterSalesEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Timestamp date;
    private String returnType;
    private String remarks;
    //add LocationEntity
    @OneToOne
    private TransactionEntity transaction = new TransactionEntity();
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTransaction(TransactionEntity transaction) {
        this.transaction = transaction;
    }

    public TransactionEntity getTransaction() {
        return transaction;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getReturnType() {
        return returnType;
    }

    public String getRemarks() {
        return remarks;
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
        if (!(object instanceof AfterSalesEntity)) {
            return false;
        }
        AfterSalesEntity other = (AfterSalesEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AfterSalesEntity[ id=" + id + " ]";
    }
    
}
