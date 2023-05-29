package com.src.practise.ood_design_pattern.ood_builder.improve;

//产品
public class House {
    private String basic;
    private String wall;
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public String getRoofed() {
        return roofed;
    }

    public House setRoofed(String roofed) {
        this.roofed = roofed;
        return this;
    }

    public House setBasic(String basic) {
        this.basic = basic;
        return this;
    }

    public String getWall() {
        return wall;
    }

    public House setWall(String wall) {
        this.wall = wall;
        return this;
    }
}
