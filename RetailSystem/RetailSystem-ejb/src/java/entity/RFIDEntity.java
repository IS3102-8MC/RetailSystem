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

/**
 *
 * @author keane
 */
@Entity
public class RFIDEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rfID;
    private Long barcodeID;
    
    @ManyToOne
    private ItemEntity item = new ItemEntity();
    
    @ManyToOne
    private SupplierEntity supplier = new SupperEntity();
    //add supplier entity code once created. Check mapping.
    
    @ManyToOne
    private RetailerEntity retailer = new RetailerEntity();
    
    @ManyToOne
    private LocationEntity location = new LocationEntity();
    //add location entity code once created. Check mapping.
    
    @OneToOne
    private ItemStatusEntity itemStatus = new ItemStatusEntity();
    //add to RFID list. Not included previously.
    
    

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
        if (!(object instanceof RFIDEntity)) {
            return false;
        }
        RFIDEntity other = (RFIDEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.RFIDEntity[ id=" + id + " ]";
    }
    
}
