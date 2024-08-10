package org.example;

public class BankInfo {
    private String accNo;
    private String acc_name;
    private String acc_type;
    private long acc_balance;

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    public String getAccNo() {
        return accNo;
    }
    public void setName(String acc_name) {
        this.acc_name = acc_name;
    }
    public String getName() {
        return acc_name;
    }
    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }
    public String getAcc_type() {
        return acc_type;
    }
    public void setAcc_balance(long acc_balance) {
        this.acc_balance = acc_balance;
    }
    public long getAcc_balance() {
        return acc_balance;
    }

}
