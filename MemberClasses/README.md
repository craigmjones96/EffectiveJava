Member classes

- A nested class is a class defined within another class. Its purpose should be solely to serve its enclosing class (if a nested class should be useful in some other context it should be a top level class)

- Four types of nested classes (all but the first are known as inner classes)

-- static member classes
--- simplest kind
--- best thought of as a an ordinary class defined inside another class with access to all the enclosing classes members, even the private ones
--- is a static member of its enclosing class and accessibility rules as other static members (if declared private, it is accessible only within enclosing class)
--- a common use is as a public helper class to its enclosing class such as an Enum inside a Calculator class can provide the Operations. Calculator.Operation.PLUS / MINUS / etc.

-- non-static member classes
--- syntactically only different to static member classes by the absence of the static keyword
--- however, they are very different
--- each instance of a non-static class is implicitly associated with an enclosing instance (as it cannot be created without an instance of the enclosing class being available first)
--- a common use of non-static member class is to define Adapters which allows the instance of the outer class to be viewed as something different. An example would be of List and Set that use non-static member classes to implement their Iterators and when you call list.iterator() you are returned a non-static member class that implements Iterator. 

* if your inner class does not need access to any of the instance variable of its outer class then always define it as a static member class to save on the referencing of the association between the inner and outer class that isn't needed when the inner class isn't reliant on the information in an instantiation of the outer class *

-- anonymous classes
--- unlike anything else in the java programming language
--- has no name and is not a member of its enclosing class
--- isnt declared alongside other members but is both declared and instantiated at point of use
--- they can have enclosing instances (members, etc.) but can never have static members (as they are defined until point of use)
--- limitations: cant instantiate them apart from the point of declaration, cant perform instanceof on them or do anything that requires you to name the class, cant implement multiple interfaces, cant extend a class and mplement an interface at the same time
--- because anonymous classes appear in the midst of expressions they should be kept short... mainly for readability purposes
--- one common use for anonymous classes is to create function objects on the fly, another is to create process objects (such as Runnable or Thread instances)


-- local classes
--- local classes are the least frequently used 
--- can be declared anywhere a local variable (i.e. inside a method block) can be and has the same scoping rules
--- 

