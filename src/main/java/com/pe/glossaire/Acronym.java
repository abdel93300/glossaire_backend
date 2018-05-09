package com.pe.glossaire;

import java.util.Date;

public class Acronym {
    public String name;
    public Date lastUpdate;
    public Description description;
    public String author;
    public boolean obsolete;

    public Acronym(String name, Date lastUpdate, Description description, String author, boolean obsolete) {
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.description = description;
        this.author = author;
        this.obsolete = obsolete;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getObsolete() {
        return obsolete;
    }

    public void setObsolete(boolean obsolete) {
        this.obsolete = obsolete;
    }
}