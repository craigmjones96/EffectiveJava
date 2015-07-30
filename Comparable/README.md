Comparable

- The Comparable interface only has one method, compareTo

- Similar to the Object's equals method but it allows for other comparisons rather than just equality of values

- Implementing the Comparable interface declares the class has some sort of natural ordering. An array of the objects can easily be sorted by Arrays.sort(a)

- Comparable object collections are much easier to manage, sort, compute extreme values, etc.

- By implementing it you allow your class to interoperate with a number of classes, alogrithms and collection implementations that depend on this interface (such as Arrays.sort())

- Comparable contract is similar to that of equals
- Compares this object with the specified object for order
- Returns a negative number, 0 or positive number depending on whether this object less than, equal to, or greater than the specified object 
- Throws a ClassCastException if the specified object's type stops it from being compared to this object

- The contract is based around the sgn(expression) notation. It designates the mathematical signum function which returns -1, 0, 1 according to whether the value of the expression is negative, zero or positive

-- must ensure sgn(x.compareTo(y)) == -sgn(y.compareTo(x)). Comparing two objects must supply the same value but negated when the comparison is switched.
-- if x.compareTo(y) throws an exception so much y.compareTo(x)
-- the relationship must be transitive. if x.compareTo(y) >0 and y.compareTo(z) >0 then by order x.compareTo(z) must be >0
-- if x.compareTo(y) == 0 then they must both be the same sign over z. i.e. sgn(x.compareTo(z)) == sgn(y.compareTo(z))
-- it isnt strictly required but recommended that if x.compareTo(y) == 0 then x.equals(y) == true. 

- If a class violates the compareTo method it effects it use in a large number of Java classes that rely on the compareTo method, such as TreeSet, for ordering the classes

- compareTo method is statically typed so dont need to check type or cast as the code wont even compile if you try and pass in an object of the wrong type

- if the argument is null it should throw a NullPointerException straight away so dont bother checking for null just let the code throw it when it first tries to access anything in the object

- the field level comparisons in the compareTo method should be order comparisons and not equality comparisons obviously

- compare objects within a class be calling compareTo recursively

- if the fields dont implement Comparable you should create a specific comparator instead

- for primitive fields use < == > operators for comparison

- for objects implementing comparable, use their compareTo

- for arrays apply the above rules to each element

- always compare the most significant field first and work your way down, that way if a highly siginificant field fails to comparison test you can get out of the method early, without having compared some less significant fields first for no reason

 



