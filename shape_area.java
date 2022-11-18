// public keyword necessary anonnu ariyilla!!
// work cheyuvonnu ariyiilla..
public class shapes {
    double area ;
    int length;
    int width;
    int radius;
    int height;

    void findarea(int R){
        float pi = 3.14;
        radius = R;
        area = (float) pi * R * R;

        System.out.println("Area of Circle " + area);
    }

    
    void findarea(int L, int W){

        length = L;
        width = W;
        area = (float) L * W ;

        System.out.println("Area of Rectangle " + area);
    }
    
    void findarea(int W, int H){
        
        width = W;
        height = H;
        area = (float) W * H * 0.5 ;

        System.out.println("Area of Triangle " + area);
    }
}

public class shape_area_finder {
    public static void main (String[] args){
        shapes circle = new shapes();
        findarea(5);
    }
}