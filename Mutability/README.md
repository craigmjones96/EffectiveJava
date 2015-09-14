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

- The Rectangle example shows an immutable obejct as its original state is never changed. Adding height or width actually returns a new object, leaving the original unchanged. This is considered a functional approach as methods return a result of applying a function to their operand without modifying it

- Immutable objects are simple as the state never changes. Mutable objects are open to possibly complex states and changes, etc.

- Immutable objects are inherently thread safe and require no synchronization as they cannot be corrupted by multiple threads accessing or changing them concurrently.

- Immutable objects can be shared freely and it is encouraged that clients use existing objects wherever possible. One way to do this is to provide public static final constants of certain immutable classes that are used frequently. Some immutable classes create and cache frequently used instances and then provide a static factory method to create an instance. If it is one of the frequently used instances it is returned from the cache, rather than a new one being created.

- The only possible down side to immutable object is that you do have to create a new instance every time so this can be costly if they are large objects or if you need a lot of them. Can add extra work for the GC if they are all short lived too. There are two ways to solve this approach of creating many objects (example being a for loop where you create a temporary object to be discarded after each iteration as you only care about the final outcome). One way is to provide them as primitives as the immutable class doesn't have to be created every time. The other is to have a clever immutable object that internally has a mutable companion class that it uses in situations like this (obviously for this you need to know what operations are going to be performed on your class so you can provide this and handle it well with the private mutable companion). If you dont know what might happen you can provide a public mutable companion class. A good example is String and StringBuffer

- There is an alternative to making an immutable class final... you could make the constructors private or package-private and provide static factory methods that always return a new object (i.e. like BigInteger.valueOf() we saw earlier). This is more flexible as it allows  for multiple package-private implementations (extending), however, to its clients it is effectively final as it is impossible to extend the class or access the constructor from outside the package... This way is considered a better approach as you get all the benefits of a static factory method over a constructor discussed in StaticFactoryMethods example.

- Technically the rules about having final fields only is not fully true... An immutable object must have externally facing final fields that give the outside appearance of an unchanged state, but internally for performance reasons, etc. non final fields can be used. For instance, you may have an array that caches instances created, this will obviously be non-final as new instances are created but would return a previous instance if it already exists when it would normally generate it. -- Serializable must be taken into account at this point however as the non-final fields will be provide if your class implements Serializable and the state of the object changed. To get around this you should provide explicit readObject or readResolve methods.
