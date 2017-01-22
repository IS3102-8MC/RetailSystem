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
 * @author ashiq
 */
@Entity
public class ItemEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemName;
    private String itemDesc;
    private String itemCategory;
    private String itemSubCategory;
    private String itemPictureReference;
    @ManyToOne
    private RetailerEntity retailer = new RetailerEntity();
    @OneToOne(mappedBy = "item")
    private TransactionItemEntity txnItem = new TransactionItemEntity();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="item")
    private Collection<RFIDEntity> rfid = new ArrayList<RFIDEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="item")
    private Collection<ItemStatusEntity> itemStatus = new ArrayList<ItemStatusEntity>();
    @ManyToOne
    private ShelfEntity shelf = new ShelfEntity();
    
    

    public Long getId() {
        return id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setTxnItem(TransactionItemEntity txnItem) {
        this.txnItem = txnItem;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public TransactionItemEntity getTxnItem() {
        return txnItem;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setItemSubCategory(String itemSubCategory) {
        this.itemSubCategory = itemSubCategory;
    }

    public void setItemPictureReference(String itemPictureReference) {
        this.itemPictureReference = itemPictureReference;
    }

    public void setRetailer(RetailerEntity retailer) {
        this.retailer = retailer;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public String getItemSubCategory() {
        return itemSubCategory;
    }

    public String getItemPictureReference() {
        return itemPictureReference;
    }

    public RetailerEntity getRetailer() {
        return retailer;
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
        if (!(object instanceof ItemEntity)) {
            return false;
        }
        ItemEntity other = (ItemEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ItemEntity[ id=" + id + " ]";
    }
    
}
