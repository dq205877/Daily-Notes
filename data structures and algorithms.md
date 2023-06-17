		**Where there is a will, there is a way!  Take "Data Structure and Algorithm" and be proficient in Java!**

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



Chatper1 Java Primer 1

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

​		1.9.5 Testing and Debugging

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

​		There are three ways to pass parameters to methods/functions in programming languages, call by name, call by reference, and call by value, and Java is passed by value,  so we write code should consider the object status may change, we should focus on object life cycle and status.

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

​		2. To differentiate between an instance variable and a local variable with the same 

name. If a local variable is declared in a method having the same name as an instance

variable within that method body.(We say that the local variable masks the instance varia-ble). In this case, the instance variable can still be accessed by explicitly using the dot not-ation with this as the qualifier. For example, some programmers prefer to use the followi-ng style for a constructor, with a parameter having the same name as the underlying var-iable.

```java
public Counter(int count){
	this.count = count; //set the instance variable equal to parameter
}
```

  3. To allow one constructor body to invoke another constructor body. When one met-hon of a class invokes another of that same class on the current instance, that is  typ-ically done by using the (unqualified) name of the other method. But the syntax for 

     calling a constructor is special. Java allows user of the keyword this to be used as a m-ethod within the body of one constructor, so as to invoke another constructor with a     

     different signature.(This is often useful because all of the initialization steps of one co-nstructor can be reused with appropriate parameterization.)

The main Method

​		As far as I know, every programming language has a main function/method, I think of 

it this way, let the computer operation always specify where to start.

Unit Testing

1.3 Strings,Wrappers,Arrays, and Enum Types

1.9 Software Development

​	Traditional software development involves several phases. Three major steps are:

​			1.Design

​			2.Coding

​			3.Testing and Debugging

​	In this section, we briefly discuss the role of these phases, and we introduce several good

practices for programming in Java, including coding style, naming convention, formal docu-mentation, and testing.

​	1.9.1 Design

​			For object-oriented programming, the design step is perhaps the most important 	

phase in the process of developing software. It is in the design step that we decide how to di-vide the working of our program into classes, when we decide how these classes will interact,

what data each will store, and what actions each will perform. Indeed, one of the main chall-enges tha beginning programmers face is deciding what classes to define to do the work of t-heir program. While general prescriptions are hard to come by, there are some rules of thu-mb that we can apply when determining how to define our classes:

​		1.Responsibilities: Divide the work into different actors, each with a different responsi-bility. Try to describe responsibilities using action verbs. These actors will form the classes

for the program.

​		2.Independence: Define the work for each class to be as independent from other classes

 as possible.

​		3.Behaviors: Define the behaviors for each class carefully and precisely.

​		Defining the classes, together with their instance variables and methods, are key to the design of an object -oriented program.

​		CRC(Class-Responsibility-Collaborator) cards: On the left-hand side of the card: responsi-bilities for this component. On the right-hand side of the card: collaborators for this comp-onent.

​		As the design takes form, a standard approach to explain and document the design is 

the use of UML(Unified Modeling Language) diagrams to express the organization of a prog-ram.

​	1.9.2 Pseudocode

​		Pseudocode is not a computer program, but is more structured than usual prose.

​		There really is no precise definition of the pseudocode language. At the same time, to 

help achieve clarity, pseudocode mixes natural language with standard programming lang-uage constructs. Such as: Expressions/Method declarations/Decision structures/While-loops/Repeat-loops/For-loops/Array indexing/Method calls/Method returns/Comments

​	1.9.3 Coding

​		design patterns/integrated development environment(IDE)/compile/path

​	1.9.4 Documentation and Style

​		Javadoc/tags/format

​	1.9.5 Testing and Debugging

​		are often the most time-consuming activity in the development of a program.

​		Testing

​			special cases/top-down|bottom-up/stubbing/unit testing/regression testing

​		Debugging

​			print statements/debugger/breakpoints/conditional breakpoints

​	1.10 Exercises



Chapter2 Object-Oriented Design 59

2.1 Goals, Principles, and Patterns

​		2.1.1 Object-Oriented Design Goals

​		2.1.2 Object-Oriented Design Principles

​		2.1.3 Design Patterns

2.2 Inheritance

​		2.2.1 Extending the CreditCard Class

​		2.2.2 Polymorphism and Dynamic Dispatch

​		2.2.3 Inheritance Hierarchies

2.3 Interfaces and Abstract Classes

​		2.3.1 Interfaces in Java

​		2.3.2 Multiple Inheritance for Interfaces

​		2.3.3 Abstract Classes

2.4 Exceptions

​		2.4.1 Catching Exceptions

​		2.4.2 Throwing Exceptions

​		2.4.3 Java's Exception Hierarchy

2.5 Casting and Generics

​		2.5.1 Casting

​		2.5.2 Generics

2.6 Nested Classes

2.7 Exercises

Chapter3 Fundamental Data Structures 103

3.1 Using Arrays

​		3.1.1 Storing Game Entries in an Array

​		3.1.2 Sorting an Array

​		3.1.3 java.util Methods for Arrays and Random Numbers

​		3.1.4 Simple Cryptography with Character Arrays

​		3.1.5 Two-Dimensional Arrays and Positional Games

3.2 Singly Linked Lists

​		3.2.1 Implementing a Singly Linked List Class

3.3 Circularly Linked Lists

​		3.3.1 Round-Bobin Scheduling

​		3.3.2 Designing and Implementing a Circularly Linked List

3.4 Doubly Linked Lists

​		3.4.1 Implementing a Doubly Linked List Class

3.5 Equivalence Testing

​		3.5.1 Equivalence Testing with Arrays

​		3.5.2 Equivalence Testing with Linked Lists

3.6 Cloning Data Structures

​		3.6.1 Cloning Arrays

​		3.6.2 Cloning Linked List

3.7 Exercises

Chapter4 Algorithm Analysis 149

4.1 Experimental Studies

​		4.1.1 Moving Beyond Experimental Analysis

4.2 The Seven Functions Used in This Book

​		4.2.1 Comparing Growth Rates

4.3 Asymptotic Analysis

​		4.3.1 The "Big-Oh" Notation

​		4.3.2 Comparative Analysis

​		4.3.3 Example of Algorithm Analysis

4.4 Simple Justification Techniques

​		4.4.1 By Example

​		4.4.2 The "Contra" Attack

​		4.4.3 Induction and Loop Invariants

4.5 Exercises

Chapter5 Recursion 189

5.1 Illustrative Examples

​		5.1.1 The Factorial Function

​		5.1.2 Drawing an English Ruler

​		5.1.3 Binary Search

​		5.1.4 File Systems

5.2 Analyzing Recursive Algorithms

5.3 Further Examples of Recursion

​		5.3.1 Linear Recursion

​		5.3.2 Binary Recursion

​		5.3.3 Multiple Recursion

5.4 Designing Recursive Algorithms

5.5 Recursion Run Amok

​		5.5.1 Maximum Recursive Depth in Java

5.6 Eliminating Tail Recursion

5.7 Exercises

Chapter6 Stacks, Queues, and Deques 225

6.1 Stacks

​		6.1.1 The Stack Abstract Data Type

​		6.1.2 A Simple Array-Based Stack Implementation

​		6.1.3 Implementing a Stack with a Singly Linked Lisg

​		6.1.4 Reversing an Array Using a Stack

​		6.1.5 Matching Parentheses and HTML Tags

6.2 Queues

​		6.2.1 The Queue Abstract Data Type

​		6.2.2 Array-Based Queue Implementation

​		6.2.3 Implementing a Queue with a Singly Linked List

​		6.2.4 A Circular Queue

6.3 Double-Ended Queues

​		6.3.1 The Deque Abstract Data Type

​		6.3.2 Implementing a Deque

​		6.3.3 Deques in the Java Collections Framework

6.4 Exercises

Chapter7 List and Iterator ADTs 257

7.1 The List ADT

7.2 Array Lists

​		7.2.1 Dynamic Arrays

​		7.2.2 Implementing a Dynamic Array

​		7.2.3 Amortized Analysis of Dynamic Arrays

​		7.2.4 Java's StringBuilder class

7.3 Positional Lists

​		7.3.1 Positions

​		7.3.2 The Positional List Abstract Data Type

​		7.3.3 Doubly Linked List Implementation

7.4 Iterators

​		7.4.1 The Iterable Interface and Java's For-Each Loop

​		7.4.2 Implementing Iterators

7.5 The Java Collections Framwork

​		7.5.1 List Iterators in Java

​		7.5.2 Comparison to Our Positional List ADT

​		7.5.3 List-Based Algorithms in the Java Collections Framework

7.6 Sorting a Positional List

7.7 Case Study: Maintaining Access Frequencies

​		7.7.1 Using a Sorted List

​		7.7.2 Using a List with the Move-to-Front Heurstic

7.8 Exercises

Chapter8 Trees 307

8.1 General Trees

​		8.1.1 Tree Definitions and Properties

​		8.1.2 The Tree Abstract Data Type

​		8.1.3 Computing Depth and Height

8.2 Binary Trees

​		8.2.1 The Binary Tree Abstract Data Type

​		8.2.2 Properties of Binary Trees

8.3 Implementing Trees

​		8.3.1 Linked Structure for Binary Trees

​		8.3.2 Array-Based Representation of a Binary Tree

​		8.3.3 Linked Structure for General Trees

8.4 Tree Traversal Algorithms

​		8.4.1 Preorder and Postorder Traversals of General Trees

​		8.4.2 Breadth-First Tree Travesal

​		8.4.3 Inorder Traversal of a Binary Tree

​		8.4.4 Implementing Tree Traversals in Java

​		8.4.5 Applications of Tree Traversals

​		8.4.6 Euler Tours

8.5 Exercise

Chapter9 Priority Queues 359

9.1 The Priority Queue Abstract Data Type

​		9.1.1 Priorities

​		9.1.2 The Priority Queue ADT

9.2 Implementing a Priority Queue

​		9.2.1 The Entry Composite

​		9.2.2 Comparing Keys with Total Orders

​		9.2.3 The AbstractPriorityQueue Base Class

​		9.2.4 Implementing a Priority Queue with an Unsorted List

​		9.2.5 Implementing a Priority Queue with a Sorted List

9.3 Heaps

​		9.3.1 The Heap Data Structure

​		9.3.2 Implementing a Priority Queue with a Heap

​		9.3.3 Analysis of a Heap-Based Priority Queue

​		9.3.4 Bottom-Up Heap Construction*

​		9.3.5 Using the java.util.PriorityQueue Class

9.4 Sorting with a Priority Queue

​		9.4.1 Selection-Sort and Insertion-Sort

​		9.4.2 Heap-Sort

9.5 Adaptable Priority Queues

​		9.5.1 Location-Aware Entries

​		9.5.2 Implementing an Adaptable Priority Queue

9.6 Exercises

Chapter10 Maps, Hash Tables, and Skip Lists 401

10.1 Maps

​		10.1.1 The Map ADT

​		10.1.2 Application: Counting Word Frequencies

​		10.1.3 An AbstactMap Base Class

​		10.1.4 A Simple Unsorted Map Implementation

10.2 Hash Tables

​		10.2.1 Hash Functions

​		10.2.2 Collision-Handing Schemes

​		10.2.3 Load Factors, Rehashing and Efficiency

​		10.2.4 Java Hash Table Implementation

10.3 Sorted Maps

​		10.3.1 Sorted Search Tables

​		10.3.2 Two Applications of Sorted Maps

10.4 Skip Lists

​		10.4.1 Search and Update Operation in a Skip List

​		10.4.2 Probabilistic Analysis of Skip Lists*

10.5 Sets, Multisets, and Multimaps

​		10.5.1 The Set ADT

​		10.5.2 The Multiset ADT

​		10.5.3 The Multimap ADT

10.6 Exercises

Chapter11 Search Trees 459

11.1 Binary Search Trees

​		11.1.1 Searching Within a Binary Search Tree

​		11.1.2 Insertions and Deletions

​		11.1.3 Java Implementation

​		11.1.4 Performance of a Binary Search Tree

11.2 Balanced Search Trees

​		11.2.1 Java Framework for Balancing Search Trees

11.3 AVL Trees

​		11.3.1 Update Operations

​		11.3.2 Java Implementation

11.4 Splay Trees

​		11.4.1 Splaying

​		11.4.2 When to Splay

​		11.4.3 Java Implementation

​		11.4.4 Amortized Analysis of Splaying*

11.5 (2,4) Trees

​		11.5.1 Multiway Search Trees

​		11.5.2 (2,4)-Tree Operations

11.6 Red-Black Trees

​		11.6.1 Red-Black Tree Operations

​		11.6.2 Java Implementation

11.7 Exercises

Chapter12 Sorting and Selection 531

12.1 Merge-Sort

​		12.1.1 Divide-and-Conquer

​		12.1.2 Array-Based Implementation of Merge-Sort

​		12.1.3 The Running Time of Merge-Sort

​		12.1.4 Merge-Sort and Recurrence Equations*

​		12.1.5 Alternative Implementations of Merge-Sort

12.2 Quick-Sort

​		12.2.1 Randomized Quick-Sort

​		12.2.2 Additional Optimizations for Quick-Sort

12.3 Studying Sorting through an Algorithmic Lens

​		12.3.1 Lower Bound for Sorting

​		12.3.2 Linear-Time Sorting Bucket-Sort and Radix-Sort

12.4 Comparing Sorting Algorithms

12.5 Selection

​		12.5.1 Prune-and-Search

​		12.5.2 Randomized Quick-Select

​		12.5.3 Analyzing Randomized Quick-Select

12.6 Exercises

Chapter13 Text Processing 573

13.1 Abundance of Digitized Text

​		13.1.1 Notations for Character Strings

13.2 Pattern-Matching Algorithms

​		13.2.1 Brute Force

​		13.2.2 The Boyer-Moore Algorithm

​		13.2.3 The Knuth-Morris-Pratt Algorithm

13.3 Tries

​		13.3.1 Standard Tries

​		13.3.2 Compressed Tries

​		13.3.3 Suffix Tries

​		13.3.4 Search Engine Indexing

13.4 Text Compression and the Greedy Method

​		13.4.1 The Huffman Coding Algorithm

​		13.4.2 The Greedy Method

13.5 Dynamic Programming

​		13.5.1 Matrix Chain-Product

​		13.5.2 DNA and Text Sequence Alignment

13.6 Exercises

Chapter14 Graph Algorithms 611

14.1 Graphs

​		14.1.1 The Graph ADT

14.2 Data Structures for Graphs

​		14.2.1 Edge List Structure

​		14.2.2 Adjacency List Structure

​		14.2.3 Adjacency Map Structure

​		14.2.4 Adjacency Matrix Structure

​		14.2.5 Java Implementation

14.3 Graph Traversals

​		14.3.1 Depth-First Search

​		14.3.2 DFS Implementation and Extensions

​		14.3.3 Breadth-Frist Search

14.4 Transitive Closure

14.5 Directed Acyclic Graphs

​		14.5.1 Topological Ordering

14.6 Shortest Paths

​		14.6.1 Weighted Graphs

​		14.6.2 Dijkstra's Algorithm

14.7 Minimum Spanning Trees

​		14.7.1 Prim-Jarni(two)k Algorithm

​		14.7.2 Kruskal's Algorithm

​		14.7.3 Disjoint Partitions and Union-Find Structures

14.8 Exercises

Chapter15 Memory Management and B-Trees 687

15.1 Memory Management

​		15.1.1 Stacks in the Java Virtual Machine

​		15.1.2 Allocating Space in the Memory Heap

​		15.1.3 Garbage Collection

15.2 Memory Hierarchies and Caching

​		15.2.1 Memory Systems

​		15.2.2 Caching Strategies

15.3 External Searching and B-Trees

​		15.3.1 (a,b) Trees

​		15.3.2 B-Trees

15.4 External-Memory Sorting

​		15.4.1 Multiway Merging

15.5 Exercises





​		





