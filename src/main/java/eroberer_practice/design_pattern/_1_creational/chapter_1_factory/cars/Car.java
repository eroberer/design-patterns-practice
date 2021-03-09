package eroberer_practice.design_pattern._1_creational.chapter_1_factory.cars;

public abstract class Car {

    private String brand;
    private String modelName;
    private Integer power;

    public Car(String brand, String modelName, Integer power) {
        this.brand = brand;
        this.modelName = modelName;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", power=" + power +
                '}';
    }
}
