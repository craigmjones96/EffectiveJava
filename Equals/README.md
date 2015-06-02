Equals Method

- Checks whether a class is the same as another in terms of the same object in memory (the references point to the same object in memory)

- Try not to override it and shouldn't need to if:
-- each instance of the class is inherently unique
-- You don't need the class to provide a logical equality test (you need to test for more than object identity equality and check data encapsulated in the object is the same)
-- A superclass overrides the equals method and it is suitable for subclasses
-- The class is private or package-private and you are sure the equals method will never get invoked

- Should overrride the equals method when there is a need for logical equality over object identity

- Generally used in Value Classes. Classes that are used to store a value of some sort (e.g. Integer or Date are value classes) as you expect the equals method to tell you whether the classes are logically equal rather than the same object in memory

- The equals method is used for map keys or set elements to determine if the object is unique in the collection

- Another situation of objects that don't need the equals method overwritten are classes that use instance control. This is where insurance is provided that at most one object exists for a certain value. Enums fall into this category.

- Best advice for equals method:
-- Use the == method to check if the argument is a reference to this object
-- Use the instanceof method to check if the argument is of the right type
-- Cast the argument to the correct type (this should have been covered by above but worth a double check)
-- Check each 'significant' field in the class is equal to the corresponding value (checking for null values also)

- If you overrride the equals method you should always overrride the hashcode method






