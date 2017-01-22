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

/**
 *
 * @author Nick
 */
@Entity
public class DeliveryOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long doID;
    private Long location1ID;
    private Long location2ID;
    private String date;
    private String time;
    private Long employeeID;
    private String status;

    public Long getDoID() {
        return doID;
    }

    public void setDoID(Long doID) {
        this.doID = doID;
    }

    public Long getLocation1ID() {
        return location1ID;
    }

    public void setLocation1ID(Long location1ID) {
        this.location1ID = location1ID;
    }

    public Long getLocation2ID() {
        return location2ID;
    }

    public void setLocation2ID(Long location2ID) {
        this.location2ID = location2ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    /*

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeliveryOrderEntity)) {
            return false;
        }
        DeliveryOrderEntity other = (DeliveryOrderEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DeliveryOrderEntity[ id=" + id + " ]";
    }
    */
}
