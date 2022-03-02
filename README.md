# JAVA - TUL FM

Programy vypracované během cvičení na předmětu ALG1/ALG2

## Fraction - toString() @Override example

``` java 
@Override
public String toString() {
    if (jmenovatel == citatel) {
        double temp = (double) citatel / jmenovatel;
        return String.format("%s", (int) temp);
    } else if (jmenovatel == null) {
        return String.format("%s", citatel);
    } else {
        return String.format("%s/%s", citatel, jmenovatel);
    }
}