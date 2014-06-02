package com.mifos.objects.accounts.savings;

import com.google.gson.annotations.Expose;
import com.mifos.objects.accounts.loan.Changes;

/**
 * Created by antoniocarella on 6/1/14.
 */
public class SavingsDepositResponse {

    @Expose
    private Integer officeId;
    @Expose
    private Integer clientId;
    @Expose
    private Integer savingsId;
    @Expose
    private Integer resourceId;
    @Expose
    private Changes changes;

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getSavingsId() {
        return savingsId;
    }

    public void setSavingsId(Integer loanId) {
        this.savingsId = savingsId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Changes getChanges() {
        return changes;
    }

    public void setChanges(Changes changes) {
        this.changes = changes;
    }

}
