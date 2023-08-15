package builder.item;


public class Characteristic {
    private String brand;
    private String color;
    private String ram;
    private String cpu;
    private String os;
    private String weight;
    private String memory;
    private String memoryType;
    private String battery;
    private String body;
    private String wheel;

    public static Builder builder(){
        return new Builder();
    }

    private Characteristic(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.ram = builder.ram;

    }

    @Override
    public String toString()  {
        return "Characteristic{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", weight='" + weight + '\'' +
                ", memory='" + memory + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", battery='" + battery + '\'' +
                ", body='" + body + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }

    public static class Builder {
        private String brand;
        private String color;
        private String ram;

        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }
        public Builder color(String color){
            this.color = color;
            return this;
        }
        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }
        public Characteristic build(){
            return new Characteristic(this);
        }
    }


}
