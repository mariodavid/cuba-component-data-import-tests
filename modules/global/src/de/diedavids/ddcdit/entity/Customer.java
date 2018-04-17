package de.diedavids.ddcdit.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "DDCDIT_CUSTOMER")
@Entity(name = "ddcdit$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -2456246245187489154L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "PRIORITY")
    protected Integer priority;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @NotNull
    @Column(name = "DOCUMENT_NUMBER", nullable = false, length = 50)
    protected String documentNumber;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    public void setPriority(CustomerPriority priority) {
        this.priority = priority == null ? null : priority.getId();
    }

    public CustomerPriority getPriority() {
        return priority == null ? null : CustomerPriority.fromId(priority);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}