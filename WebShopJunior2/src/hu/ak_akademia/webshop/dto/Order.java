package hu.ak_akademia.webshop.dto;

import java.util.Date;

public class Order {

    private int id;
    private int customerId;
    private int productId;
    private int quantity;
    private Date created;
    private Date modified;
    private Status status;

    public Order() {
    }

    public Order(int id) {
        this.id = id;
    }

    public Order(int id, int customerId, int productId, int quantity, Date created, Date modified, Status status) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        result = prime * result + customerId;
        result = prime * result + id;
        result = prime * result + (modified == null ? 0 : modified.hashCode());
        result = prime * result + productId;
        result = prime * result + quantity;
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
        if (!(obj instanceof Order)) {
            return false;
        }
        Order other = (Order) obj;
        if (created == null) {
            if (other.created != null) {
                return false;
            }
        } else if (!created.equals(other.created)) {
            return false;
        }
        if (customerId != other.customerId) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        if (modified == null) {
            if (other.modified != null) {
                return false;
            }
        } else if (!modified.equals(other.modified)) {
            return false;
        }
        if (productId != other.productId) {
            return false;
        }
        if (quantity != other.quantity) {
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
        builder.append("Order [id=");
        builder.append(id);
        builder.append(", customerId=");
        builder.append(customerId);
        builder.append(", productId=");
        builder.append(productId);
        builder.append(", quantity=");
        builder.append(quantity);
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