/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
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
public class LocationEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String locationName;
    private String locationAddress;
    private String locationContact;
    private String locationEmail;
    private String locationDescription;
    private String locationType;
    private String locationStatus;
    
    @ManyToOne
    private RetailerEntity retailer = new RetailerEntity();
    
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="location")
    private Collection<ShelfEntity> shelf = new ArrayList<ShelfEntity>();
    
    @OneToOne(mappedBy="location")
    private InventoryEntity inventory = new InventoryEntity();
    
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="location")
    private Collection<RFIDEntity> rfid = new ArrayList<RFIDEntity>();

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
        if (!(object instanceof LocationEntity)) {
            return false;
        }
        LocationEntity other = (LocationEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.LocationEntity[ id=" + id + " ]";
    }
    
}
