Function objects

**** This book is quite old and Java actually supports lambda expressions, etc. now ****

- Some languages support function pointers, delegates, lambda expressions or similar facilities that allow programs to store and transmit the ability to invoke a particular function.

- These are typically used to allow the caller of a function the ability to specialize the its behavior by passing in a second function

- An example is in C, where the qsort function takes a comparator function which it uses to compare the elements to be sorted

- Java doesnt provide function pointers but object references can be used instead.

- Usually when you invoke a method on an object it is to perform an operation on that object but it is possible to define a method that invokes operations on other objects passed to the method. 

- Creating a class that has exactly one method that operates on the objects passed in and not itself is effectively a pointer to that method

 - The primary use of function pointers is to implement the Strategy pattern. The best way to implement this is to define an interface that represents the strategy and classes that implement the interface for each concrete strategy.
 
 - When a concrete strategy is used only once it is typically declared and instantiated as an anonymous class.
 
 - When it is designed for repeated use it is general implemented as a private static member class and exported in a public static final field whose type is the interface