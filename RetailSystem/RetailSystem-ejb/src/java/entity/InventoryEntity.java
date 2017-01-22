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
public class InventoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long inventoryID;
    private double quantity; //quantity of shelves.
    private Date date;
    
    @ManyToOne
    private ItemEntity item = new ItemEntity();
    
    @OneToOne
    private LocationEntity location = new LocationEntity();
    //correct mapping?
    
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="inventory")
    private Collection<BatchEntity> batch = new ArrayList<BatchEntity>();
    
    @ManyToOne
    private RetailerEntity retailer = new RetailerEntity();
    
    //what is thresholdID? did not map for now.
    
    

    public Long getId() {
        return inventoryID;
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
        if (!(object instanceof InventoryEntity)) {
            return false;
        }
        InventoryEntity other = (InventoryEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Inventory[ id=" + id + " ]";
    }
    
}
