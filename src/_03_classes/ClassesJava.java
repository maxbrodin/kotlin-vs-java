package _03_classes;

import java.util.Date;
import java.util.Objects;

class WorkspaceJava {
    private String accountId;
    private String id;
    private String alias;
    private String status;
    private String createdBy;
    private Date createdAt;
    private String updatedBy;
    private Date updatedAt;

    WorkspaceJava(String accountId, String id, String alias, String status, String createdBy, Date createdAt, String updatedBy, Date updatedAt) {
        this.accountId = accountId;
        this.id = id;
        this.alias = alias;
        this.status = status;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public String getStatus() {
        return status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "WorkspaceJava{" +
                "accountId='" + accountId + '\'' +
                ", id='" + id + '\'' +
                ", alias='" + alias + '\'' +
                ", status='" + status + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdAt=" + createdAt +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkspaceJava that = (WorkspaceJava) o;
        return Objects.equals(accountId, that.accountId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(alias, that.alias) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedBy, that.updatedBy) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, id, alias, status, createdBy, createdAt, updatedBy, updatedAt);
    }
}
