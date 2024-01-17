package day_3_inheritance;

public class CorporateCustomer  extends Customer {


    private String nationalIdentity;
    private String taxiNumber;

    public CorporateCustomer() {
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public String getTaxiNumber() {
        return taxiNumber;
    }

    public void setTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    @Override
    public String toString() {
        return "CorporateCustomer{" +
                "nationalIdentity='" + nationalIdentity + '\'' +
                ", taxiNumber='" + taxiNumber + '\'' +
                '}';
    }
}
/*

---Bir class ne ede bilirse, sadece onlari ede bilmelidir.
 Yeni basqa mentiqi funksiyani yerine yetirmemelidir,
  eyni mentiqi ardicilligi davam etdirmelidir.


 */