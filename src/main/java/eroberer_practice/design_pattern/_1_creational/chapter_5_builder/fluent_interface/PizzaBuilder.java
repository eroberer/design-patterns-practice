package eroberer_practice.design_pattern._1_creational.chapter_5_builder.fluent_interface;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private boolean cheese;
    private boolean vegetable;
    private List<String> sauce;

    public PizzaBuilder(boolean cheese, boolean vegetable, List<String> sauce) {
        this.cheese = cheese;
        this.vegetable = vegetable;
        this.sauce = sauce;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private boolean cheese;
        private boolean vegetable;
        private List<String> sauceList;

        public Builder() {
        }

        public Builder withCheese() {
            this.cheese = true;
            return this;
        }

        public Builder withVegetable() {
            this.vegetable = true;
            return this;
        }

        public Builder addSauce(String sauce) {
            if (this.sauceList == null) {
                this.sauceList = new ArrayList<>();
            }

            this.sauceList.add(sauce);
            return this;
        }

        public PizzaBuilder build() {
            return new PizzaBuilder(this.cheese, this.vegetable, sauceList);
        }
    }
}
