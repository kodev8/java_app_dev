# Exceptions

[https://howtodoinjava.com/java/exception-handling/checked-vs-unchecked-exceptions-in-java/](https://howtodoinjava.com/java/exception-handling/checked-vs-unchecked-exceptions-in-java/)

# **What is *Exception* in Java?**

“An exception is **an unexpected event** that occurred during the execution of a program, and **disrupts the normal flow of instructions**.”

- In Java, all errors and exceptions are of type with `[Throwable](https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Throwable.html)` class.
- When an error occurs within a method, the *method creates an object* (or any subtype of `Throwable`) and hands it off to the runtime system. This object is called the exception object.
- The exception object contains information about the error, including the exception type and the program’s state when the error occurred.
- Creating an exception object and handing it to the runtime system is called **throwing an exception**.

A few examples of an exception in the program execution can be:

- the user enters alphanumeric input, and the program expectts numeric input.
- The program tries to read the file, but the file does not exist in the specified location.
- A network connection terminated while reading data from a webservice.

```java
try {
    Integer.parseInt("six") ;//This line throws an exception}
catch(NumberFormatException nfe) {
//handle exception}
```

# **2. Handling a Thrown Exception**

We have two choices when an exception object is created in our application;

- Either we will handle it within the method using the [try-catch](https://howtodoinjava.com/java/exception-handling/try-catch-finally/) block.
- Or we can pass it to the caller method to let it handle.

This is a very important decision to be made while setting the responsibilities of a method.

A **method should clearly indicate what exceptions it will handle** and which it will not. It is defined in the method declaration using the `[throws](https://howtodoinjava.com/java/exception-handling/throw-vs-throws/)` keyword.

To handle the exception, We must catch the exception in *catch* section of *try-catch* block.

```java
Try Catch Block
try {
//code}
catch(Exception e) {
//handle exception}
```

> If an exception is not handled in the application, then it will propagate to the JVM. The JVM usually terminates the program.
> 

# **3. Checked Exception vs Unchecked Exception**

In Java, exceptions are broadly categorized into two sections:

- Checked exceptions
- Unchecked exceptions

![https://howtodoinjava.com/wp-content/uploads/2022/12/java-exception-handling_hierachy.png](https://howtodoinjava.com/wp-content/uploads/2022/12/java-exception-handling_hierachy.png)

# 3**.1. Checked Exceptions**

The checked exceptions are those exceptions, as the name suggests, **which a method must handle in its body or throw to the caller method so the caller method can handle it.**

**Checked exceptions are checked by the Java compiler, so they are called compile-time exceptions.**

Java compiler **forces** us to handle these exceptions in some manner in the application code. We must handle these exceptions at a suitable level inside the application to inform the user about the failure and ask him to retry or come later.

Generally, checked exceptions denote *error scenarios outside the program’s immediate control*. These usually occur when the program interacts with other systems/network resources e.g. *database errors*, *network connection errors*, *missing files*, etc.

Note that all checked exceptions are subclasses of `Exception` class. For example,

- `ClassNotFoundException`
- `IOException`
- `SQLException`

### **Checked Exception Example**

The `FileNotFoundException` is a checked exception in Java. Anytime, we want to read a file from the filesystem, Java forces us to handle an error situation where the file may not be present in the place.

```java
Try to read file with handle FileNotFoundException
publicstaticvoid main(String[] args)
{
    FileReader file =new FileReader("somefile.txt");
}
```

In the above example, you will get compile-time error with the message – `Unhandled exception type FileNotFoundException`.

To make the program able to compile, we must handle this error situation in the *try-catch* block. Below given code will compile absolutely fine.

```java
Read a file and apply exception handling
publicstaticvoid main(String[] args)
{
try{
		FileReader file =new FileReader("somefile.txt");
	}
catch (FileNotFoundException e)
    {
//Alternate logic
		e.printStackTrace();
	}
}
```

# **3.2. Unchecked Exception**

**Unchecked exceptions are not checked by the compiler. These are called runtime exceptions.** Unchecked exceptions will come into life and occur in the program, once any buggy code is executed.

In Java, the compiler does not force a member method *to declare the unchecked exceptions* into the method declaration. Generally, such methods almost always do not declare them.

Unchecked Exceptions are subclasses of `RuntimeException` class.

- `ArithmeticException`
- `ArrayStoreException`
- `ClassCastException`

The strange thing is that `RuntimeException` is itself subclass of `Exception` i.e. **all unchecked exception classes should have been checked exceptions implicitly, BUT they are not**.”

### **Unchecked Exception Example**

The code in the given program does not give any compile-time error. But when we run the example, it throws `NullPointerException`. [NullPointerException](https://howtodoinjava.com/java/exception-handling/how-to-effectively-handle-nullpointerexception-in-java/) is an unchecked exception in Java.

```java
JVM not forcing us to check NullPointerException
publicstaticvoid main(String[] args)
{
try{
		FileReader file =new FileReader("pom.xml");

		file =null;

		file.read();
	}
catch (IOException e)
    {
//Alternate logic
		e.printStackTrace();
	}
}
```

# **4. Exception Handling Best Practices**

- Checked exceptions can be used when a method may fail to do what it must. For example, a method named `prepareSystem()` that pre-populates configuration files and does some configuration using them. It can declare throwing *FileNotFoundException*, which implies that the method uses configuration files from the file system and they are missing.
- Ideally, checked exceptions should never be used for programming errors but should absolutely be used for resource errors and flow control in such cases.
- Throw only those exceptions that a method can not handle by any means. The method should first try to handle it as soon as it encounters it. Throw the exception only if it is impossible to handle it inside the method.
- A good way to define method signatures is to declare exceptions close to method name. If the method is named `openFile()`, then it is expected to throw `FileNotFoundException`?. If the method is named `findProvider()`, then it is expected to throw `NoSuchProviderException`.
- Also, these types of exceptions should be checked as it forces the caller to deal with the problems inherent to the semantics of the methods.
- If we are creating any custom exception, then the rule is if a client can reasonably be expected to recover from an exception, make it a checked exception. If a client cannot do anything to recover from the exception, make it an unchecked exception.