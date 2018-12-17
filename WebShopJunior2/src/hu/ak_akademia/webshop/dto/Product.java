package hu.ak_akademia.webshop.dto;

import java.util.Date;

public class Product {

    private int id;
    private String name;
    private int price;
    private Date created;
    private Date modified;
    private Status status;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String name, int price, Date created, Date modified, Status status) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
        result = prime * result + id;
        result = prime * result + (modified == null ? 0 : modified.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + price;
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
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        if (created == null) {
            if (other.created != null) {
                return false;
            }
        } else if (!created.equals(other.created)) {
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
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (price != other.price) {
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
        builder.append("Product [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", price=");
        builder.append(price);
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