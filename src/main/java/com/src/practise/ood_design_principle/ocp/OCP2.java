package com.src.practise.ood_design_principle.ocp;

/**
 * @author caojianbang
 * @date 2021/8/31 23:45
 */
public class OCP2 {
    public static void main(String[] args) {
        OCP2 ocp = new OCP2();
        GraphicEditor graphicEditor = ocp.new GraphicEditor();
        graphicEditor.drawShape(ocp.new Circle());
        graphicEditor.drawShape(ocp.new Rectangle());
        graphicEditor.drawShape(ocp.new Triangle());
    }

    //这是一个用于绘图的类
    class GraphicEditor {
        //接收shape对象，然后根据type，来绘制不同的图形
        void drawShape(Shape shape) {
            shape.draw();
        }
    }

    abstract class Shape {
        int type;
        abstract void draw();
    }

    class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("矩形");
        }

        Rectangle() {
            super.type = 1;
        }
    }

    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("圆形");
        }

        Circle() {
            super.type = 2;
        }
    }

    class Triangle extends Shape {
        Triangle() {
            super.type = 3;
        }

        @Override
        void draw() {
            System.out.println("三角形");
        }
    }
}
