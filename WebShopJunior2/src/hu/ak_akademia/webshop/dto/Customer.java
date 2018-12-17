package hu.ak_akademia.webshop.dto;

import java.util.Date;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String phoneNumber;
    private Date dateOfBirth;
    private Date created;
    private Date modified;
    private Status status;

    public Customer() {
    }

    public Customer(int id) {
        this.id = id;
    }

    public Customer(int id, String firstName, String lastName, String eMail, String phoneNumber, Date dateOfBirth, Date created, Date modified, Status status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.created = created;
        this.modified = modified;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (created == null ? 0 : created.hashCode());
        result = prime * result + (dateOfBirth == null ? 0 : dateOfBirth.hashCode());
        result = prime * result + (eMail == null ? 0 : eMail.hashCode());
        result = prime * result + (firstName == null ? 0 : firstName.hashCode());
        result = prime * result + id;
        result = prime * result + (lastName == null ? 0 : lastName.hashCode());
        result = prime * result + (modified == null ? 0 : modified.hashCode());
        result = prime * result + (phoneNumber == null ? 0 : phoneNumber.hashCode());
        result = prime * result + (status == null ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) obj;
        if (created == null) {
            if (other.created != null) {
                return false;
            }
        } else if (!created.equals(other.created)) {
            return false;
        }
        if (dateOfBirth == null) {
            if (other.dateOfBirth != null) {
                return false;
            }
        } else if (!dateOfBirth.equals(other.dateOfBirth)) {
            return false;
        }
        if (eMail == null) {
            if (other.eMail != null) {
                return false;
            }
        } else if (!eMail.equals(other.eMail)) {
            return false;
        }
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!lastName.equals(other.lastName)) {
            return false;
        }
        if (modified == null) {
            if (other.modified != null) {
                return false;
            }
        } else if (!modified.equals(other.modified)) {
            return false;
        }
        if (phoneNumber == null) {
            if (other.phoneNumber != null) {
                return false;
            }
        } else if (!phoneNumber.equals(other.phoneNumber)) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Customer [id=");
        builder.append(id);
        builder.append(", firstName=");
        builder.append(firstName);
        builder.append(", lastName=");
        builder.append(lastName);
        builder.append(", eMail=");
        builder.append(eMail);
        builder.append(", phoneNumber=");
        builder.append(phoneNumber);
        builder.append(", dateOfBirth=");
        builder.append(dateOfBirth);
        builder.append(", created=");
        builder.append(created);
        builder.append(", modified=");
        builder.append(modified);
        builder.append(", status=");
        builder.append(status);
        builder.append("]");
        return builder.toString();
    }

}