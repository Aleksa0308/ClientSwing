package restClient.dto;

public class RankDto{

    private int idrank;
    private String name;
    private Object criteria;
    private String value;
    private int discount;

    public RankDto() {
    }

    public void setIdrank(int idrank) {
        this.idrank = idrank;
    }

    public int getIdrank() {
        return this.idrank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCriteria(Object criteria) {
        this.criteria = criteria;
    }

    public Object getCriteria() {
        return this.criteria;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return this.discount;
    }
}