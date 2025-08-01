package com.adoumadje.spring.springcore.reftypes;

public class Scores {
    private Integer maths;
    private Integer physics;
    private Integer biology;

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getBiology() {
        return biology;
    }

    public void setBiology(Integer biology) {
        this.biology = biology;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "maths=" + maths +
                ", physics=" + physics +
                ", biology=" + biology +
                '}';
    }
}
