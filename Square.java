public class Square extends Rectangle{

    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    
    public String toString(){
        return "Square[Rectangle[Shape[color="+color+", filled="+filled+"],width="+width+",length="+length+"]]";
    }

}
