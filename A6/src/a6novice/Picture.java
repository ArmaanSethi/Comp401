package a6novice;

import java.util.Iterator;

public interface Picture{
    public int getWidth();
    public int getHeight();
    public void setPixel(int x, int y, Pixel p);
    public Pixel getPixel(int x, int y);
    public int countRange(double low, double high);
    public void print();
    public double unequalPixelRatio(Picture p);
    public double calculatePSNR(Picture p);
    SubPicture extract(int xOffset, int yOffset, int width, int height);
    public void setPixel(Coordinate c, Pixel p);
    public Pixel getPixel(Coordinate c);
    public SubPicture extract(Coordinate corner_a, Coordinate corner_b);
	public Iterator<Pixel> iterator();
}
