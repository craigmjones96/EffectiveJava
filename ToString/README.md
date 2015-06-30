ToString

- The basic implementation of the toString method provides a representation of the object that generally isnt useful to the developer / user. 

- It is made up of the object name, an @ sign, and the hexidecimal representation of the hash code.

- The general contract of the toString method is to provide a representation of the object that is a concise and informative representation of the object that is easy for a person to read

- It is recommended that all subclasses override this method to provide a more specific representation of the child objects

- A good toString method is useful as it is invoked when passing an object to the println() method, the string concatenation operator, etc.

- Ideally, it should only return the useful information. If you have a large object it may be best to only print out the main fields, rather than every field.

- It is often a good idea to pick a 'format' for the string representation as these can be used to parse the object by other programs, such as program that want a standard, human-readable representation of the object. E.g. a program may take the string representation of the object and convert it to an xml document... to do that the developer needs to know the format. -- If you do standardise the format and it is felt developers may require the ability to translate back and forth from the object, it is often a good idea to provide a static factory method or constructor so this can be done easily

- You should definitely try to produce a standard format for any value objects you have (examples of value objects are Integer, BigDecimal, etc.)

- For any variable you provide in the toString method, you should always ensure there are the relevant accessors availble to a developer for the variable