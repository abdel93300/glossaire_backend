package com.pe.glossaire;

public class Description {
    public String summary;
    public String definition;

    public Description(String summary, String definition) {
        this.summary = summary;
        this.definition = definition;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
