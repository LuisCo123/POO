public class CMYK extends Pixel{
private double cyan;
private double magenta;
private double yellow;
private double key;

public CMYK(double cyan, double magenta, double yellow, double key){
    if((cyan >= 0 && cyan <= 100) && (magenta >= 0 && magenta <= 100)
        && (yellow >= 0 && yellow <= 100) && (key >= 0 && key <= 100)){
        this.setCyan (cyan);
        this.setMagenta (magenta);
        this.setYellow (yellow);
        this.setKey (key);
    }
}
private void setCyan(double cyan){
    this.cyan = cyan;
}
private void setMagenta(double magenta){
    this.magenta = magenta;
}
private void setYellow(double yellow){
    this.yellow = yellow;
}
private void setKey(double key){
    this.key = key;
}

public double getLuminosidade(){
    return this.key;
}

public double getCyan(){
    return this.cyan;
}
public double getMagenta(){
    return this.magenta;
}
public double getYellow(){
    return this.yellow;
}
public double getKey(){
    return this.key;
}
}