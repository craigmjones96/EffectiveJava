- An immutable class is simply one whose instances cannot be modified

- All the information contained within the class is provided at creation and isnt changed for the life of the object. Examples are String, and boxed primitives like BigInteger

- Immutable class are easier to design, implement and use. 

- They are also less prone to error

- Five rules to making a class immutable
-- dont provide any methods that modify the objects state (no setters, etc.)
-- ensure the class cant be extended (helps stop careless extensions destroying the immutable behavior of the object)
-- make all fields final (clearly expresses intent for immutable behavior)
-- make all fields private (stops clients accessing mutable objects within the immutable class and amending them)
-- ensure exclusive access to any internal mutable components (like above, if the class has any mutable objects ensure clients can access these. never use a client provide class in an immutable object or return mutable objects from an accessor - make defensive copies that are passed back)

