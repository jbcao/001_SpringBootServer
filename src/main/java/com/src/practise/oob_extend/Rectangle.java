package com.src.practise.oob_extend;

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a ,b);
    }
    Double area() {
    	//此处是方法覆盖
        System.out.println("Inside area for rectangle.");
        return(dim1*dim2);
    }
}