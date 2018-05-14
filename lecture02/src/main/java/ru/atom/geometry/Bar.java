package ru.atom.geometry;

import java.util.Objects;

public class Bar implements Collider {

//    Collider createBar(int firstCornerX, int firstCornerY, int secondCornerX, int secondCornerY)

    private Point firstCornerPoint;
    private Point secondCornerPoint;

    public Bar(int firstCornerX, int firstCornerY, int secondCornerX, int secondCornerY) {
        this.firstCornerPoint = new Point(firstCornerX, firstCornerY);
        this.secondCornerPoint = new Point(secondCornerX, secondCornerY);
    }

    public Point getFirstCornerPoint() {
        return firstCornerPoint;
    }

    public void setFirstCornerPoint(Point firstCornerPoint) {
        this.firstCornerPoint = firstCornerPoint;
    }

    public Point getSecondCornerPoint() {
        return secondCornerPoint;
    }

    public void setSecondCornerPoint(Point secondCornerPoint) {
        this.secondCornerPoint = secondCornerPoint;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        if (Objects.equals(firstCornerPoint, bar.firstCornerPoint))
            if (Objects.equals(secondCornerPoint, bar.secondCornerPoint)) return true;
        if (Objects.equals(firstCornerPoint, bar.secondCornerPoint))
            if (Objects.equals(secondCornerPoint, bar.firstCornerPoint)) return true;

        if ((firstCornerPoint.getX() == bar.secondCornerPoint.getX()) && (firstCornerPoint.getY() == bar.firstCornerPoint.getY())
                && (secondCornerPoint.getX() == bar.firstCornerPoint.getX()) && (secondCornerPoint.getY() == bar.secondCornerPoint.getY())) {
            return true;
        }


        return false;
    }


    @Override
    public boolean isColliding(Collider other) {
        if (other instanceof Point) {
            Point point = (Point) other;
            if (((firstCornerPoint.getX() <= point.getX()) && (firstCornerPoint.getY() <= point.getY()))
                    && ((secondCornerPoint.getX() >= point.getX()) && (secondCornerPoint.getY() >= point.getY()))) {
                return true;
            } else {
                return false;
            }

        } else if (other instanceof Bar) {
            Bar bar = (Bar) other;

//            if ((firstCornerPoint.getX() <= secondCornerPoint.getX()) && (firstCornerPoint.getY() <= secondCornerPoint.getY())) {
//
//
//                if ((((firstCornerPoint.getX() <= bar.firstCornerPoint.getX()) && (firstCornerPoint.getY() <= bar.firstCornerPoint.getY()))
//                        && ((secondCornerPoint.getX() >= bar.firstCornerPoint.getX()) && (secondCornerPoint.getY() >= bar.firstCornerPoint.getY())))
//                        || (((firstCornerPoint.getX() <= bar.secondCornerPoint.getX()) && (firstCornerPoint.getY() <= bar.secondCornerPoint.getY()))
//                        && ((secondCornerPoint.getX() >= bar.secondCornerPoint.getX()) && (secondCornerPoint.getY() >= bar.secondCornerPoint.getY())))) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//
//            if ((firstCornerPoint.getX() >= secondCornerPoint.getX()) && (firstCornerPoint.getY() >= secondCornerPoint.getY())) {
//
//                if ((((secondCornerPoint.getX() <= bar.firstCornerPoint.getX()) && (secondCornerPoint.getY() <= bar.firstCornerPoint.getY()))
//                        && ((firstCornerPoint.getX() >= bar.firstCornerPoint.getX()) && (firstCornerPoint.getY() >= bar.firstCornerPoint.getY())))
//                        || (((secondCornerPoint.getX() <= bar.secondCornerPoint.getX()) && (secondCornerPoint.getY() <= bar.secondCornerPoint.getY()))
//                        && ((firstCornerPoint.getX() >= bar.secondCornerPoint.getX()) && (firstCornerPoint.getY() >= bar.secondCornerPoint.getY())))) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//
//            if ((firstCornerPoint.getX() <= secondCornerPoint.getX()) && (firstCornerPoint.getY() >= secondCornerPoint.getY())) {
//
//
//                if ((((firstCornerPoint.getX() <= bar.firstCornerPoint.getX()) && (firstCornerPoint.getY() >= bar.firstCornerPoint.getY()))
//                        && ((secondCornerPoint.getX() >= bar.firstCornerPoint.getX()) && (secondCornerPoint.getY() <= bar.firstCornerPoint.getY())))
//                        || (((firstCornerPoint.getX() <= bar.secondCornerPoint.getX()) && (firstCornerPoint.getY() >= bar.secondCornerPoint.getY()))
//                        && ((secondCornerPoint.getX() >= bar.secondCornerPoint.getX()) && (secondCornerPoint.getY() <= bar.secondCornerPoint.getY())))) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//
//            if ((firstCornerPoint.getX() >= secondCornerPoint.getX()) && (firstCornerPoint.getY() <= secondCornerPoint.getY())) {
//
//
//                if ((((firstCornerPoint.getX() >= bar.firstCornerPoint.getX()) && (firstCornerPoint.getY() <= bar.firstCornerPoint.getY()))
//                        && ((secondCornerPoint.getX() <= bar.firstCornerPoint.getX()) && (secondCornerPoint.getY() >= bar.firstCornerPoint.getY())))
//                        || (((firstCornerPoint.getX() >= bar.secondCornerPoint.getX()) && (firstCornerPoint.getY() <= bar.secondCornerPoint.getY()))
//                        && ((secondCornerPoint.getX() <= bar.secondCornerPoint.getX()) && (secondCornerPoint.getY() >= bar.secondCornerPoint.getY())))) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//
//            return false;
//
//        } else {
//            return false;

            return (bar.getFirstCornerPoint().getX() <= getSecondCornerPoint().getX()
                    && bar.getSecondCornerPoint().getX() >= getFirstCornerPoint().getX())
                    && (bar.getFirstCornerPoint().getY() <= getSecondCornerPoint().getY()
                    && bar.getSecondCornerPoint().getY() >= getFirstCornerPoint().getY());

        }
        return false;
    }


}
