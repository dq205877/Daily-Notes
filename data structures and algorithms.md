Data Structures and Algorithms in Java  

Sixth Edition 

1.Java Primer

2.Object-Oriented Design

3.Fundamental Data Structures

4.Algorithm Analysis

5.Recursion

6.Stacks,Queues,and Deques

7.List and Iterator ADTs

8.Trees

9.Priority Queues

10.Maps,Hash Tables,and Skip Lists

11.Search Trees

12.Sorting and Selection

13.Text Processing

14.Graph Algorithms

15.Memory Management and B-Trees



1.Java Primer

1.1 Getting Started

​		1.1.1 Base Types

1.2 Classes and Objects

​		1.2.1 Creating and Using Objects

​		1.2.2 Defining a Class

1.3 Strings,Wrappers,Arrays,and Enum Types

1.4 Expressions

​		1.4.1 Literals

​		1.4.2 Operators

​		1.4.3 Type Conversions

1.5 Control Flow

​		1.5.1 The If and Switch Statements

​		1.5.2 Operators

​		1.5.3 Explicit Control-Flow Statements

1.6 Simple Input and Output

1.7 An Example Program

1.8 Packages and Imports

1.9 Software Development

​		1.9.1 Design

​		1.9.2 Pseudocode

​		1.9.3 Coding

​		1.9.4 Documentation and Style

1.10 Exercises

​	In Java,executable statements are placed in functions,known as methods,that belong to class definitions.main method is the first method to be executed when running a Java program.Any set of statements between the braces "{" and "}" define a program block.

​	The name of a class,method,or variable in Java is called an identifier,which can be any string of characters as long as it begins with a letter and consists of lett-ers,numbers and underscore characters(can be from any written language define-d in the Unicode character set). 

**reserved words:** abstract assert boolean break byte case catch char class const co-ntinue default do double else enum extends false final finally float for goto if im-plements import instanceof int interface long native new null package private p-ublic return short static strictfp super switch synchronized this throw throws tr-ansient true try void volatile while

**Comments:** Java allows two kinds of comments: inline comments and block co-mments.

Base Types: also called primitive types.

boolean: a boolean value: true or false

char: 16-bit Unicode character

byte: 8-bit signed two's complement integer

short: 16-bit signed two's complement integer

int: 32-bit signed two's complement integer

long: 64-bit signed two's complement integer

float: 32-bit floating-point number(IEEE 754-1985)

double: 64-bit floating-point number(IEEE 754-1985)

​		Classes are known as reference types in Java, and a variable of that type is known as a reference variable. A reference variable is capable of storing the location of an object from the declared class. So we might assign it to reference an existing i-nstance or a newly constructed instance. A reference variable can also store a sp-ecial value, null, that represents the lack of an object.

​		Three events occur as part of the creation of a new instance of a class:

​		1.A new object is dynamically allocated in memory, and all instance variables      

are  initialized to standard  default values(But I saw should be explicitly declared as the initial value is better). The default values are null for reference variables a-nd 0 for all base types except boolean variables(which are false by default).

​		2.The constructor for the new object is called with the parameters specifi-ed.The constructor may assign more meaningful values to any of the instance vari-ables, and perform any additional computations that must be done due to the c-reation of this object.

​		3.After the constructor returns, the new operator returns a reference to the newly created object. If the expression is in the form of an assignment statement, then this address is stored in the object variable, so the object variable refers to this newly created object.

​		Java does not allow two methods with the same signature(name and param-eters are the same) to return different types(This is a  rule, maybe the designer considers the execution program does not pay attention to the return value).

​		Java is call by reference,  so we write code should consider the object statu-s may change, we should focus on object life cycle and status.

**Modifiers**

​		Access Control Modifiers

|           | same PKG   | same PKG       | diff PKG   | diff PKG       |
| --------- | ---------- | -------------- | ---------- | -------------- |
|           | subclasses | non-subclasses | subclasses | non-subclasses |
| private   | 0          | 0              | 0          | 0              |
|           | 1          | 1              | 0          | 0              |
| protected | 1          | 1              | 1          | 0              |
| public    | 1          | 1              | 1          | 1              |

​		static Modifier

​		abstract Modifier

​		final Modifer

Declaring Instance Variables

Declaring Methods

​		Return Types

​		Parameters

Defining Constructors

The Keyword this

​		Within the body of a (non-static) method in Java, the keyword this is automatically

defined as a reference to the instance upon which the method was invoked. That is, if a 

caller uses a syntax such as thing.foo(a,b,c), then within the body of method foo for that

call,the keyword this refers to the object known as thing in the caller's context. There are

three common reasons why this reference is needed from within a method body:

​		1. To store the reference in a variable,  or send it as a parameter to another method

that expects an instance of that type as an argument.

​		2.To differentiate between an instance variable and a local variable with the same 

name. If a local variable is declared in a method having the same name as an instance

variable within that method body.()

​		3.

The main Method

Unit Testing

1.3 Strings,Wrappers,Arrays, and Enum Types