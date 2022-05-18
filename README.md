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

**REKURZE**

*Převod do bináru*

```java
public static String mystery(int n) { //24
	String s;
	if(n <= 1) {
		return String.valueOf(n);
	}
	s = mystery(n/2) + String.valueOf(n%2);
	return s;
}
```
***RETURN 11000***

mystery(24) => mystery(12) return s = 1100 + 0 = 11000

mystery(12) => mystery(6)  return s = 110 + 0 = 1100

mystery(6)  => mystery(3)  return s = 11 + 0 = 110

mystery(3)  => mystery(1)  return s = 1 + 1 = 11

mystery(1)  => 		   return s = 1
