package ru.atom.geometry;

import java.util.Objects;

/**
 * Template class for
 */
public class Point implements Collider/* super class and interfaces here if necessary */ {
    // fields
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean isColliding(Collider other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Point point = (Point) other;
        if (this.x ==  point.getX() && this.y == point.getY()) {
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
//        return isColliding(point);
    }

//    @Override
//    public int hashCode() {
//
//        return Objects.hash(x, y);
//    }


    // and methods

    /**
     * @param o - other object to check equality with
     * @return true if two points are equal and not null.
     */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        // cast from Object to Point
//        Point point = (Point) o;
//
//        // your code here
//        throw new UnsupportedOperationException();
//    }


}
