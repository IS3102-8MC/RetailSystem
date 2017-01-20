package entity;

import java.util.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity(name="Announcement")
public class AnnouncementEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Can't decide on how to generate ID yet
    private Long anmID;
    private String anmMessage;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date anmTiming;
    private Long rID;
    
    // Getter & Setter
    public Long getAnmID() {
        return anmID;
    }

    public void setAnmID(Long anmID) {
        this.anmID = anmID;
    }

    public String getAnmMessage() {
        return anmMessage;
    }

    public void setAnmMessage(String anmMessage) {
        this.anmMessage = anmMessage;
    }

    public Date getAnmTiming() {
        return anmTiming;
    }

    public void setAnmTiming(Date anmTiming) {
        this.anmTiming = anmTiming;
    }

    public Long getrID() {
        return rID;
    }

    public void setrID(Long rID) {
        this.rID = rID;
    }
}
