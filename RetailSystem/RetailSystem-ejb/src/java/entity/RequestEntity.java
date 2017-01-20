/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author ashiq
 */
@Entity
public class RequestEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String requestMessage;
    private String requestStatus;
    private Timestamp requestDate;
    @OneToOne
    private EmployeeEntity employee = new EmployeeEntity();
    //add locationEntity
    

    public Long getId() {
        return id;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public void setRequestDate(Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public Timestamp getRequestDate() {
        return requestDate;
    }

    public EmployeeEntity getEmployee() {
        return employee;
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
        if (!(object instanceof RequestEntity)) {
            return false;
        }
        RequestEntity other = (RequestEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.RequestEntity[ id=" + id + " ]";
    }
    
}
