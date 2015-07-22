Comparable

- The Comparable interface only has one method, compareTo

- Similar to the Object's equals method but it allows for other comparisons rather than just equality of values

- Implementing the Comparable interface declares the class has some sort of natural ordering. An array of the objects can easily be sorted by Arrays.sort(a)

- Comparable object collections are much easier to manage, sort, compute extreme values, etc.

- By implementing it you allow your class to interoperate with a number of classes, alogrithms and collection implementations that depend on this interface (such as Arrays.sort())

- Comparable contract is similar to that of equals
-- 

