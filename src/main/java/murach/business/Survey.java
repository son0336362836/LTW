
package murach.business;

import java.io.Serializable;

public class Survey implements Serializable {

    private String source;
    private String announcements;
    private String offers;
    private String contactMethod;

    public Survey() {
    }

    public Survey(String source, String announcements,
                  String offers, String contactMethod) {
        this.source = source;
        this.announcements = announcements;
        this.offers = offers;
        this.contactMethod = contactMethod;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String announcements) {
        this.announcements = announcements;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}
