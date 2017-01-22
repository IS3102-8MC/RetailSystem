package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="Retailer")
public class RetailerEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Can't decide on how to generate ID yet
    private Long rID;
    private String rName;
    private String rAddress;
    private Long rContact;
    private String rEmail;
    private String rDesc;
    private int rTier;
    private int rStatus;
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<MembershipEntity> membership = new ArrayList<MembershipEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<TransactionEntity> transaction = new ArrayList<TransactionEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<ItemEntity> items = new ArrayList<ItemEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<ItemStatusEntity> itemStatus = new ArrayList<ItemStatusEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<RFIDEntity> rfid = new ArrayList<RFIDEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<PurchaseOrderEntity> purchaseOrder = new ArrayList<PurchaseOrderEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<PurchaseOrderLineEntity> purchaseOrderLine = new ArrayList<PurchaseOrderLineEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<InventoryEntity> inventory = new ArrayList<InventoryEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<BatchEntity> batch = new ArrayList<BatchEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<LocationEntity> location = new ArrayList<LocationEntity>();
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="retailer")
    private Collection<ShelfEntity> shelf = new ArrayList<ShelfEntity>();
    
    // Getter & Setter
    public Long getrID() {
        return rID;
    }

    public void setMembership(Collection<MembershipEntity> membership) {
        this.membership = membership;
    }

    public void setTransaction(Collection<TransactionEntity> transaction) {
        this.transaction = transaction;
    }

    public Collection<MembershipEntity> getMembership() {
        return membership;
    }

    public Collection<TransactionEntity> getTransaction() {
        return transaction;
    }

    public void setrID(Long rID) {
        this.rID = rID;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrAddress() {
        return rAddress;
    }

    public void setrAddress(String rAddress) {
        this.rAddress = rAddress;
    }

    public Long getrContact() {
        return rContact;
    }

    public void setrContact(Long rContact) {
        this.rContact = rContact;
    }

    public String getrEmail() {
        return rEmail;
    }

    public void setrEmail(String rEmail) {
        this.rEmail = rEmail;
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc;
    }

    public int getrTier() {
        return rTier;
    }

    public void setrTier(int rTier) {
        this.rTier = rTier;
    }

    public int getrStatus() {
        return rStatus;
    }

    public void setrStatus(int rStatus) {
        this.rStatus = rStatus;
    }
}
