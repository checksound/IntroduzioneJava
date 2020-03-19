# Introduzione Java

Semplici esempi di come compilare ed eseguire una programma: 

* [it.isisgallarate.base.TestSimpleClass](./src/it/isisgallarate/base/TestSimpleClass.java): reimplementate il metodo `toString` nella classe [it.isisgallarate.base.DataOnly](./src/it/isisgallarate/base/DataOnly.java) (**TODO**);

* [it.isisgallarate.test.TestEqualsVino](./src/it/isisgallarate/test/TestEqualsVino.java): reimplementato il metodo equals in [it.isisgallarate.equals.Vino](./src/it/isisgallarate/equals/Vino.java);

Vedere i file *.bat* per esempi di compilazione **javac** ed esecuzione **java**.
 
 ## javap
 
 Java class disassembler
 ```
 PS D:\PROGETTI\workspace\IntroduzioneJava> javap -cp target it.isisgallarate.base.DataOnly
Compiled from "DataOnly.java"
class it.isisgallarate.base.DataOnly {
  int i;
  double d;
  boolean b;
  it.isisgallarate.base.DataOnly();
}
```

```
PS D:\PROGETTI\workspace\IntroduzioneJava> javap -cp target it.isisgallarate.equals.Vino
Compiled from "Vino.java"
public class it.isisgallarate.equals.Vino {
  public it.isisgallarate.equals.Vino(java.lang.String, int, int);
  public java.lang.String getNome();
  public void setNome(java.lang.String);
  public int getAnno();
  public void setAnno(int);
  public int getPrezzo();
  public void setPrezzo(int);
  public int hashCode();
  public boolean equals(java.lang.Object);
  public java.lang.String toString();
}
PS D:\PROGETTI\workspace\IntroduzioneJava>
```

