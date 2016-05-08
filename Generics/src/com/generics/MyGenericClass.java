package com.generics;

// A class or interface definition that takes one or more
// type parameters is know as a generic type

// A generic type defines a raw type which is the name of
// generic type used without any type parameters supplied.
// In this case MyGenericClass.
public interface MyGenericClass<E> {

	E get(String id);
}
