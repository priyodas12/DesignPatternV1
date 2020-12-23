package io.javalab.BuilderDesignPattern;

public class Pizza {

    private String type;
    private int size;
    private String vendor;
    private boolean avl;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.type=pizzaBuilder.type;
        this.size=pizzaBuilder.size;
        this.avl=pizzaBuilder.avl;
        this.vendor= pizzaBuilder.vendor;
    }
    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public String getVendor() {
        return vendor;
    }

    public boolean isAvl() {
        return avl;
    }

    public static class PizzaBuilder {

        private String type;
        private int size;
        private String vendor;
        private boolean avl;


        public PizzaBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PizzaBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public PizzaBuilder setAvl(boolean avl) {
            this.avl = avl;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", vendor='" + vendor + '\'' +
                ", avl=" + avl +
                '}';
    }
}
