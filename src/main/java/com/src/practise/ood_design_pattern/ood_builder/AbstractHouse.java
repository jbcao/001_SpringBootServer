package com.src.practise.ood_design_pattern.ood_builder;

public abstract class AbstractHouse {
   //打地基
    abstract void buildBasic();
  //砌墙
   abstract void buildWalls();
   //封顶
   abstract void roofed();
   void build(){
       buildBasic();
       buildWalls();
       roofed();
   }

}
