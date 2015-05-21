Builder Pattern

- When there are a large number of optional parameters constructors and static factory methods don't scale well.

- Classes could have up to 20 variables, some of which may not need to be set, so you would need a constructor that can take all 20 parameters and have to pass null or 0 or "", etc. in for the parameters you don't want to set.

- Obviously can get very confusing too and often you can forget which parameter means what

- Another approach is the JavaBeans pattern, where you call a parameter less constructor and then use the setters to fill the object

- This at least allows you to miss out the optional parameters that you don't want to set

- But the object can be in an inconsistent state - with a constructor you don't get the object back until all the variables are set and it is ready to use. with JavaBeans pattern, the object is given back and can be used before all the variables are set (you finish calling the setters)

- The solution is the builder pattern which allows you to remove the large constructors and set the variables that you only need but doesnt return you the final object until you call the build() method

