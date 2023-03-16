class Point extends Triple<Number> implements Comparable<Point>{
    public Point(Number x, Number y, Number z) {
        super(x, y, z);
    }

    public double distanceFrom(Point p){
        double distance = Math.sqrt(Math.pow(this.getElement(1).doubleValue() - p.getElement(1).doubleValue(), 2.) + Math.pow(this.getElement(2).doubleValue() - p.getElement(2).doubleValue(), 2.) + Math.pow(this.getElement(3).doubleValue() - p.getElement(3).doubleValue(), 2.));

        return distance;
    }

    public int compareTo(Point p) {
        Point center = new Point(0, 0, 0);
        double distance1 = center.distanceFrom(p);
        double distance2 = center.distanceFrom(this);
        if(distance1 < distance2)  return 1;
        else if(distance1 > distance2) return -1;
        else return 0;
    }
}