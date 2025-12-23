class Square implements Shape {

    private int side;

    public Square2(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
