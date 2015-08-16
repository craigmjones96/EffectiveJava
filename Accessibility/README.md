- A well designed system has modules that hide as much of its internal data and other implementation details from other modules as possible

- Should try to minimize access to classes, interfaces and members

- Java has many mechanisms to aid information hiding (encapsulation)

- Access control mechanism being one of them. It specifies the accessibility of classes, interfaces and members

- Top level (non-nested) classes can have two access levels, package-private and public. By default a class is package-private (if you don't an access modifier). If you supply public, it will be public.

- If a class can be made package-private it should be. That way it becomes part of the implementation and not part of the API (as public would mean it is seen by everything). This means you can modify it / replace it / eliminate it in future releases with no effect on the API

- If a package-private top level class is only used by one other class you should consider making it a private nested class of that class. This reduces its accessibility to the one and only class that uses it

- For members of classes (fields, methods, nested classes and nested interfaces) there are for access levels
-- public -- accessible from anywhere
-- protected -- accessible from and class in the package it is declared and any subclasses of the class it is declared
-- package-private (default) -- accessible from any class in the package it is declared
-- private - only accessible within the class it is declared

- Realistically, you should design your systems public API by only allowing the necessary class to be public. After that you should make all the members private and only move them to package-private / protected if really required if really required. If you find you are making a lot of members non-private... it may be time to look at the design of the system

- If a class implements serializable, even private members can 'leak' into the API so its best to design classes that are strictly 'public facing'
-- private and package-private members will not be seen in the public API (but could leak)
-- protected and public members are part of the public API and will always need supporting going forward

- Method accessor levels in particular have a key rule to remember. If a class overrides a super classes method, it is not allowed to set a lower access level than the superclass version 

- Instance fields should never be public. You shoot yourself in the foot by limiting yourself in the future and give up the ability to limit the values that can be stored in the field (i.e. if you were using a field as a range value 1-10, someone could come along and set it to 20). You also lose the ability to change to a different internal data representation (cant change Integer to BigDecimal).

- Public instance values should be final and be primitive fields or refer to immutable objects (including static fields). A final field that refers to a mutable object defeats the purpose as even though the reference can't be changed, the reference object can be modified. 

- Another area where reduced access levels should always be considered is arrays. An array of any length (other than zero) is always mutable so offering a public static final Thing[] array is a potential security hole as the contents can be modified
-- one way to handle this is to make the initial array private and then create a static final list that is created from the array but returns a immutable list ... Collections.unmodifiableList(Arrays.asList(privateValues));
-- another is to provide an accessor method that actually returns a clone, rather than the real thing

