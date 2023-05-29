package com.src.practise.ood_design_pattern.ooc_prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name="songjiang";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("daniu","haha");
        DeepProtoType deepProtoType2=(DeepProtoType)  deepProtoType.clone();
        System.out.println(deepProtoType2.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType.deepCloneableTarget.hashCode());
    }
}
