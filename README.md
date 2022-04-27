# JAVA - TUL FM

Programy vypracované během cvičení na předmětu ALG1/ALG2

### Kompozice
- Vhodné dávat přednost před dědičností
- Jiný objekt jako atribut v objektu (např. String ve třídě, Adresa v Osoba)
### Dědičnost
- Vazba is a
- Circle is a Shape
- **extends**
- Můžeme dědit pouze z jedné třídy
### Implementace
- Vazba implements
- Circle implements Computable
- **implements**
- Můžeme implementovat více rozhraní


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
```

## Stream (soubory)
 - vhodné najít takový, který nastavuje kódování

### CSV
    Jmeno | gitRep | Temp
    Kulhavy | ---- | cože
    Petricek | ---- | cože2

``` java
File f = new File("data/userDir");
File f1 = new File("data/text.txt");
```

### Text
 - READ
   - BufferedReader
     - nextLine
   - Scanner
     - nextLine
     - tokeny
 - WRITE
   - PrintWriter
   - BufferedWriter

### Byte
 - READ
   - DataInputStream
 - WRITE
   - DataOutputStream