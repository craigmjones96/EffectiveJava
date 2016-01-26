Composition and Inheritance

In this section, when talking about inheritance, it means extension

- Its a powerful way to achieve code re-use but if used inappropriately it can make code fragile.
-- Safe to use inheritance within a package where the implementations are controlled by the same developer
-- Safe to use on classes specifically designed and documented for extension
-- Dangerous when extending a normal class (especially across boundaries)

-- Unlike method invocation, inheritance violates encapsulation. A subclass relies on another class, its superclass, for its proper function. This superclass could change its implementation and possibly break the subclass... this means the subclass must evolve with the superclass (especially a concern when extending a class across a boundary that someone else updates - like a class in a dependency jar)

- A cause of fragility is often when later releases of a superclass adds new methods and your subclass has to take these into account or your implementation could break. An example would be if you have a ArrayList and you subclass it so that only booleans with a value of true are added and the ones with a value of false are not. In a later release of ArrayList a new method for adding elements is introduced. If you dont know about this, elements (such as false booleans) can be added via this method and break your implementation. You would need to be aware of this change and override the new method adding your criteria also 

- You could simply extend an object and not override any of its original methods and just add your own new ones that add completely new functionality and consider this safer. If in later releases a new method is added to the superclass with the exact same signature you will automatically be overriding it and more than likely breaking its contract. If a new method with the same signature but different return type your code will not compile and you will need to make changes.

- One way to avoid this is composition... creating a new class that has a private instance of the existing class (called composition because the existing class becomes a component of the new class)
-- Each method in the new class invokes the corresponding method in the contained class and returns the results
-- Known as forwarding methods
-- Rock solid and not affected by new methods being added to the existing class or other dependencies as it only matters about what you call from the new class






