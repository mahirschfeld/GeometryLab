public class GeometryLab {

    public int f(int x, int y) {
        return x + y;
    }
    
    public int g(int x, int y) {
        return x - y;
    }
    
    public int h(int x, int y) {
        return x * y;
    }
    
    public int k(int x, int y) {
        return x % y;
    }
    
    public int j(int x, int y) {
        return x / y;
    }
    
    public int m(int x, int y, int z) {
        return x + y + z;
    }
    public double triArea(int b, int h) {
    	return 0.5 * b * h;
    }

    public double trapArea(int b1, int b2, int h) { 
    	return 0.5 * h * (b1+b2);
    }

    public int rectArea(int b, int h) {
	    return b * h;
    }

    public double circArea(int r) {
	    return 3.14 * r * r;
    }

    public int paralArea(int b, int h) {
	    return b * h;
    }
    
    public int pythHypotenuse(int a, int b) {
	    return a*a + b*b;
    }

    public double triPrismVol(int b, int h, int w) {
	    return 0.5 * b * h * w;
    }

    public int rectPrismVol(int b, int h, int w) {
	    return b * h * w;
    }

    public int rectPyramidVol(int b, int h, int w) {
	    return 1/3 * b*h * w;
    }

    public double cylVol(int r, int h) {
	    return 3.14 * r * r * h;}
    
    public double sphereVol(int r) {
	    return 4/3 * 3.14 * r * r * r;
    }
    }