package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Administrator")
public class AdminEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Can't decide on how to generate ID yet
    private Long aID;
    private String aName;
    private String aEmail;
    private Long aContact;
    private String aAddress;
    private String aUserName;
    private String aPassword;
    private int aType;
    
    // Getter & Setter
    public Long getaID() {
        return aID;
    }

    public void setaID(Long aID) {
        this.aID = aID;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public Long getaContact() {
        return aContact;
    }

    public void setaContact(Long aContact) {
        this.aContact = aContact;
    }

    public String getaAddress() {
        return aAddress;
    }

    public void setaAddress(String aAddress) {
        this.aAddress = aAddress;
    }

    public String getaUserName() {
        return aUserName;
    }

    public void setaUserName(String aUserName) {
        this.aUserName = aUserName;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    public int getaType() {
        return aType;
    }

    public void setaType(int aType) {
        this.aType = aType;
    }
}
