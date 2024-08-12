import java.util.*;
import java.util.Date;
public class Policy1{
    private String policyID;
    private String type;
    private double premium;
    private double coverageAmount;
    private Date expiryDate;

    public Policy1(String policyID, String type, double premium, double coverageAmount, Date expiryDate) {
        this.policyID = policyID;
        this.type = type;
        this.premium = premium;
        this.coverageAmount = coverageAmount;
        this.expiryDate = expiryDate;
    }

    public String getPolicyID() {
        return policyID;
    }

    public String getType() {
        return type;
    }

    public double getPremium() {
        return premium;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyID='" + policyID + '\'' +
                ", type='" + type + '\'' +
                ", premium=" + premium +
                ", coverageAmount=" + coverageAmount +
                ", expiryDate=" + expiryDate +
                '}';
    }
}