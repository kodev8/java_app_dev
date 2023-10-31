# Generics

Essentially generics help prevent code duplication and provide a simple class implementation that allows the type to be dynamic and change on each use.

For example

```java
// T is normally used to denote type but it can be called anything

// public class A <Anything>
public class A <T>  {
 T field;

	public void display(T item) {
	System.out.println(item)
}

}
```

Imagine a situation where this would need to be done for Integers, Strings< Doubles and so on.. then a new class to handle each type would have to be created which is not efficient.

Hence it is the same as working with ArrayLists and HashMaps etc.

If Generics were not available, this can result in the code no longer being type safe.

```java
A<Object> // object can be anything so any types may be 
					//used within the A class which may not be ideal/intended
```

Generics also support bounding , these are called bounded Generics

```java
// also supports extending interfaces NB: interface also use the keyword extends
// and not implements
public class A <T extends BaseClass>  {
 T field; // anymethods defined on Base Class nwow become available to 
					//this varible field because Java can guarantee that the T field
					// is an instance of that BaseClass

	public void display(T item) {
	System.out.println(item)
}

}

// supports multiple bounding, you can put as many as you need
public class A <T extends BaseClass & AnotherClass>  {

...
```

****************************Generic Methods****************************

```java
// function based generics: similar to classes but <> with typed is before return type
...

// can change return type too instead of void
public static <T, N> T  (T varName, N anotherName) {
...
}
```

******************wildcards******************

“?” is used as the wildcard character as the type parameter when  we aren’t exactly sure what type of the parameter will be. 

```java
public static  (List<?>) {
...
}

// can also be bounded
public static  (List<? extends ClassDemo>) {
...
}
```