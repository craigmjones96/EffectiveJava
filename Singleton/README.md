Singleton

- A class that can only be instantiated once

- Two approaches for enforcing a class is a singleton

- One: private constructor and store the instance as a public static field to provide access to the sole implementation

- Two: private constructor, private static field holding the sole implementation, public static factory method returning the instance