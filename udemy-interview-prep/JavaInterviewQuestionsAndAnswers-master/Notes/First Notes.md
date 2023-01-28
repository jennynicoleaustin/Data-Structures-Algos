### Java Platform Popularity 
1. Platform Independence
2. Object-Oriented Programing

### Platform Independence
Once we compile a java program and build a jar, we can run the jar (compiled
java program) in any Operating System - where a JVM is installed.

- Java is a compiled. 

### Compare JDK vs JVM vs JRE

1. JVM
-  Virtual machine that run the Java bytecode.
-  Makes java portable.

2. JRE
- What is needed to run a java program
-  JVM + Libraries + Other Components (to run applets and other java applications)

3. JDK
- What is needed to develop a java program
-  JRE + Compilers + Debuggers

### ClassLoader 
- Find classes for us so that we can load and use them 

### Wrapper Classes
- Primitive Wrapper Class 
  - The capital version of the primitive types. 
  - provides object methods for the eight primitive types in Java 
- Why do we need them? 
  - encloses a data type and gives it the appearance of an object
  - allows..
    - use in collections
    - creating object like versions from other types 
    - lets null be a possible value
- Creating an instance of a wrapper class. 
  - new keyword 
    - `Character j = new Character('j')`
    - returns a new object
  - valueOf Static Method
    - `Integer seven = Integer.valueOf("7")`
    - returns a cached value
- Auto Boxing and Unboxing 
  - java automatically converts between primitive and object wrapper classes. 

### Casting
- Converting one data type to the other
  - Implicit Casting
    - `int value = 100;`
    - `long number = value;`
  - Explicit casting
    - `long number = 25555`
    - `int thatNumber = (int) number`

### String 
- Are immutable
