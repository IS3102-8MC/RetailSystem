/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author keane
 */
@Entity
public class PurchaseOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long purchaseOrderID;
    private String remarks;
    private boolean approval;
    private Long invoiceNum;
    private String paymentTerms; //is this an entity?
    private Date deliveryDate;
    
    @ManyToOne
    private RetailerEntity retailer = new RetailerEntity(); 
    
    @OneToOne
    private ContractEntity contract = new ContractEntity();
    //add contract entity code once created. check mapping.
    
    @OneToOne
    private EmployeeEntity employee = new EmployeeEntity();
    
    @OneToOne
    private QuotationEntity quotation = new QuotationEntity();
    //add quotation entity code once created. check mapping.
    
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="purchaseOrder")
    private Collection<PurchaseOrderLineEntity> line = new ArrayList<PurchaseOrderLineEntity>();
    //purchase line is one to many mapping because multiple lines can combine for 1 purchase?
    
    

    public Long getId() {
        return id;
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
        if (!(object instanceof PurchaseOrderEntity)) {
            return false;
        }
        PurchaseOrderEntity other = (PurchaseOrderEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PurchaseOrderEntity[ id=" + id + " ]";
    }
    
}
