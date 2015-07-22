Cloneable

- the Cloneable interface actually contains no methods

- it determines the object's protected clone implementation

- if a class implements the Cloneable, the Object's clone method returns a field by field copy of the object. Otherwise throws a CloneNotSupportedException

- the general clone method for Object is weak but claims
-- x.clone() != x will be true
-- x.clone().getClass() == x.getClass() will be true (no absolute requirements though)
-- x.clone().equals(x) will be true (not an absolute requirement either)

- Copying an object will typically entail creating a new object, but may also require creating new internal structures also ... but no constructors should be called

- There are a number of problems with this contract, one being the rule of no constructors being called... it is too strong... a well constructed clone method should be allowed to call constructors on internal objects of the clone under construction. Also if the class is final clone should be able to return an object created by a constructor


