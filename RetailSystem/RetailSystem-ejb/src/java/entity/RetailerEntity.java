package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    // Getter & Setter
    public Long getrID() {
        return rID;
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
