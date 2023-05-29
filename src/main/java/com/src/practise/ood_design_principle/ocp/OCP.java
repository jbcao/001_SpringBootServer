package com.src.practise.ood_design_principle.ocp;

/**
 * @author caojianbang
 * @date 2021/8/31 22:44
 */
public class OCP {
    public static void main(String[] args) {
        OCP ocp = new OCP();
        GraphicEditor graphicEditor = ocp.new GraphicEditor();
        graphicEditor.drawShape(ocp.new Circle());
        graphicEditor.drawShape(ocp.new Rectangle());
        graphicEditor.drawShape(ocp.new Triangle());
}

    //这是一个用于绘图的类
    class GraphicEditor {
        //接收shape对象，然后根据type，来绘制不同的图形
        void drawShape(Shape shape) {
            if (shape.type == 1) {
                drawRectangle(shape);

            } else if (shape.type == 2) {
                drawCircle(shape);
            } else {
                drawTriangle(shape);
            }
        }

        //绘制矩形
        void drawRectangle(Shape shape) {
            System.out.println("矩形");
        }

        //绘制
        void drawCircle(Shape shape) {
            System.out.println("圆形");
        }

        void drawTriangle(Shape shape) {
            System.out.println("三角形");
        }
    }

    class Shape {
        int type;
    }

    class Rectangle extends Shape {
        Rectangle() {
            super.type = 1;
        }
    }

    class Circle extends Shape {
        Circle() {
            super.type = 2;
        }
    }
    class Triangle extends Shape {
        Triangle() {
            super.type = 3;
        }
    }
}
