public class Rectangle {
    int[][] points;
    int maxX;
    int maxY;
    int minX;
    int minY;

    public Rectangle(int[][] dots){
        this.points = dots;
        int dotsNumbrer = dots.length;
        this.maxX = 0;
        System.out.println("dotsNumbrer - " + dotsNumbrer);
        for (int i = 0; i<dotsNumbrer; i++) {
            findMaxX(dots[i][0]);
            findMinX(dots[i][0]);
            findMaxY(dots[i][1]);
            findMinY(dots[i][1]);
        }
    }

    ///, возвращающий целое число (ширину прямоугольника);
   public int getWidth() {
        int width = Math.abs(minX) + Math.abs(maxX);
    return width;
   }
    //, возвращает целое число (высоту прямоугольника);
    public int getHeight() {
        int height = Math.abs(minY) + Math.abs(maxY);
        return height;
    }
    // возвращает строку вида {нижняя точка по Y, верхняя точка по Y, левая точка по Х, правая точка по Х}.
    public String getBorders() {
        String borders = new String(minY + ", " + maxY + ", " + minX + ", " + maxX);
        return borders;
    }

    private void findMaxX(int inputVal) {
        if(inputVal > maxX)
            maxX = inputVal;
    }
    private void findMaxY(int inputVal) {
        if(inputVal > maxY)
            maxY = inputVal;
    }
    private void findMinX(int inputVal) {
        if(inputVal < minX)
            minX = inputVal;
    }
    private void findMinY(int inputVal) {
        if(inputVal < minY)
            minY = inputVal;
    }
}

