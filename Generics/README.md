Generics

- Type parameter - A parameter that defines a type for the class or interface definition

- A class or interface definition that has one or more type parameters is know as a generic class

public MyGenericClass<E>

- The raw type is the name of the generic type used without any of the type parameters. In the example above it is MyGenericClass. If you were to create an object of MyGenericClass without a type parameter for E you would simply get a class that took MyGenericClass as its object... its pretty much as if you had removed all the type parameter code.

- Raw types should not be used as you are saying that i am opting out of generic type checking... you will get warnings from the compiler but its down to you to ensure code elsewhere handles the objects in the right way

- It is fine to use types that allow the insertion of arbitrary objects, such as List<Object>... this is telling the compiler that it is capable of holding Objects of any type... when you go to get them out they will be Objects and will need casting in which ever way is required.

- In some cases you might be tempted to use raw types where you don't actually care what the objects are as you are doing some basic things with them (like you have two lists and you just want to get each element from the first list and see if it is in the second list2.contains(object))

- Unbounded wildcards are best to use in the position (List<?>) to remove the use of raw types and be safer. For List<?> it is saying it is the most generalised List type and is capable of holding any List type (List<String>, List<Integer>, etc. could be passed in)