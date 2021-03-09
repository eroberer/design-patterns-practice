package eroberer_practice.design_pattern._3_behavioral.chapter_24_template_method.query_executor;

public class SpecialCustomerDTO {

    private Long id;
    private String fullName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "SpecialCustomerDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
