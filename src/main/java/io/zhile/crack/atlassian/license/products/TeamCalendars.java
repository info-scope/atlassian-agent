package io.zhile.crack.atlassian.license.products;

/**
 * @author pengzhile
 * @link https://zhile.io
 * @version 1.0
 */
public class TeamCalendars extends Plugin {
    public TeamCalendars(String ContactName, String ContactEMail, String ServerID, String Organisation, boolean dataCenter) {
        super(ContactName, ContactEMail, ServerID, Organisation, dataCenter);
    }

    public TeamCalendars(String ContactName, String ContactEMail, String ServerID, String Organisation) {
        this(ContactName, ContactEMail, ServerID, Organisation, false);
    }

    @Override
    public String getProductName() {
        return "team_calendars";
    }
}
