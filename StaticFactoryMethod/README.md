StaticFactoryMethod

- Normal approach for a class to create an instance of itself is via a public constructor

- Another approach is the public static factory method
-- simple static method that returns an instance of the class
-- can be instead of or alongside public constructors
-- not the same as the Factory Method pattern

---- Advantages ----
- An advantage is that, unlike constructors, they can have more meaningful names

- Another advantage is they are not required to create a new instance of the class everytime it is called
-- Can be used for singletons
-- Allows immutable classes to use pre-constructed instances
-- Or cache instances as they are created (instance controlled)

- They can also return any return an object of any subtype of their return object

- Static factory methods are useful for compacting an API
-- Have a non-instantiable class with static factory methods
-- All returned objects are non-public
-- Return the interface of the non-public classes
-- Means that only the interface methods can be called and the implementation classes dont have to be externalised


---- Disadvantages ----
- Classes without public or protected constructors cannot be sub-classed, so having a class with only static methods stops the ability to subclass

- Static factory methods are hard to distinguish form other general static methods... constructors are obvious




