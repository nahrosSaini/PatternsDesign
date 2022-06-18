package com.Creational.Builder;

public class LunchOrder {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder){

        this.bread=builder.bread;
        this.condiments=builder.condiments;
        this.dressing= builder.dressing;
        this.meat= builder.meat;

    };

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    // Builder class to build the LunchOrder object
    public static class Builder{
        private  String bread;
        private  String condiments;
        private  String dressing;
        private  String meat;

        public Builder(){};

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder setDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }
    }


}
