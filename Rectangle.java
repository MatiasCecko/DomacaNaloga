public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public double getlength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
    public String toString(){
        return "Rectangle[Shape[color="+color+", filled="+filled+"],width="+width+",length="+length+"]";
    }

}
