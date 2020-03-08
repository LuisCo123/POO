public class RGB extends Pixel{
    private double red;
    private double green;
    private double blue;
    
    
    public RGB (double red, double green, double blue){
        if((red <=255 && red >= 0) && (green <=255 && green >= 0) &&
            (blue <=255 && blue >= 0)){
                this.setRed(red);
                this.setGreen(green);
                this.setBlue(blue);
            }
    }
    
    private void setRed(double red){
        this.red = red;
    }
    private void setGreen(double green){
        this.green = green;
    }
    private void setBlue(double blue){
        this.blue = blue;
    }
    
    public double getLuminosidade(){
        return (this.red * 0.3 + this.green * 0.59 + this.blue * 0.11) / 255;
    }
}