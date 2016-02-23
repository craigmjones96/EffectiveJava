Interfaces vs abstract classes

Interfaces

- You should prefer interfaces to abstract classes

- Java provides two mechanisms for defining a type that permits multiple implementations - interfaces and abstract classes

- Abstract classes are permitted to contain part of the implementation. Interface contain none of the implementation.

- To implement the type defined by an abstract class, the class in question must be a subclass of the abstract class. This is seen as a restriction as Java only permits single inheritance. A class that implements the general contract and provides an implementation of all the methods can implement any interface

- Existing class can easily be retrofitted to implement a new interface. For example, many existing classes were retrofitted to implement the Comparable interface when it was introduced to the Java language

- Abstract classes often lead to hierarchical type definitions whereas interfaces all the construction of non-hierarchical frameworks. Hierarchical frameworks are great for organizing certain things but not everything.

- Flexibility introduced vie interfaces and save you from a bloated class hierarchy containing a separate class for every supported combination of attributes

- Abstract classes are generally more fragile to breaking due to changes and force the developer into using inheritance

- Interfaces are not permitted to contain method implementations you are not prevented from providing implementation assistance to programmers. You can always introduce abstract skeletal classes to go with each non-trivial interface that you export... Some of these already exist in Java (AbstractList, AbstractCollection, etc... implement most of the methods of the collection interface and leave you with only the important ones left to do).


Abstract classes

- Using abstract classes to define types that permit multiple implementations has one great advantage over interfaces: it is far easier to evolve an abstract class than an interface.

- If you want to add a new method to an abstract class you can always add a default implementation that is reasonable for all subclasses. If you want to add a new method into an interface definition you are pretty much guaranteed to break all implementing classes as they wont compile anymore until they provide an implementation of the new method.


- To summarize the best way to define a type that permits multiple implementations you should use an interface but be aware that an interface in a public api can be very dangerous and difficult to change if you get it wrong at that start.
