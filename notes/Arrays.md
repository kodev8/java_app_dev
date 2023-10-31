# Arrays

****************************************Arrays vs Array List vs Linked lists****************************************

*****NB: Array Lists and linked lists are very similar because they both implement the List interface*****

Array Lists are simply wrappers for Java Arrays.

“Empty” arrays still have fixed sizes where each slot is null

They all maintain order of insertion as opposed to sets and hash sets

| Arrays | Array Lists | Linked List |
| --- | --- | --- |
| fixed size | dynamic size: resizes automatically | Dynamic size |
| stores objects and primitive data types | Stores objects only, hence you must use wrapper classes for primitive data types like Integer | stores objects |
| Supports indexing with [index] | Supports indexing with a method call arrayListVar.get(Index) | Supports indexing with a method call linkedListVar.get(Index) |
| Length: get by accessing field length i.e. arrayVar.length | Length: get by using method call on size() method i.e. arrayVar.size() | Length: get by using method call on size() method i.e. arrayVar.size() |
| Syntax (empty) : datatype[] var = new datatype[capacity] | Syntax (empty) : ArrayList<wrapperClass/Object> var = new ArrayList<>(); (previously it was required to repeat the type in the second call Java 7 and earlier) | “” but LinkedList in place of Array List |
| Syntax (filled): datatype[] var = new {item1, item2 … } | Syntax (filled): “” var = ArrayList<>(Arrays.aslist(some comma sepearted items)). Note that if you do not use the array list ,  it will be immutable! | not sure yet |
| cannot add an item | var.add(item) | var.add(item) |
| set an item at an index: var[index] = item | var.set(index, item) | “” |
| cannot remove item due to fixed size | var.remove(index) or var.remove(object) | “” |
| printing shows memory address | printing show array elements like python (implements the toString() method here) |  |
| no import  | import java.util.ArrayList | import java.util.ArrayListLinked |

Linked lists differ from Array Lists based on their implementation behind the scenes. Array Lists simply store their values in arrays while Linked List use a data structure such that there is a head, (first element) a tail (last element) and each item saves a reference/pointer to the next item in that List. Doubly Linked lists, which are used in Java are those where the a pointer is also saved to the previous item in that list. In java, a reference from head to tail and vice versa is also maintained.

- Array Lists are quicker for data retrieval since in Java it is done almost at constant time (random access ? ). Linked lists must traverse the entire reference path until the item is found
- Linked lists are quicker for insertion and removal. For linked lists, once the item is added, all pointers that need to be changed are updated accordingly, others remain the same. Array Lists have to create a new array, with an empty slot for the inserted item (or one less for removed item) and then copy the items from the original array to the new one

********Map and Hash Map********

Map is set of key value pairs. It is an interface

Hash Map is the base implementation of a Map

```java
import java.util.HashMap
HashMap<Object1, Object2> varName = new HashMap<>(); // no need to readd as metnioned above
// adding to the array - updates they key if it is already present
var.put(key, value)
	// only adds item if it is not already in hash map
var.putIfAbsent(key, value)
	// only replaces item if it is already in hash map
var.replace(key, value) 

// get a value based on key
var.get(key)

// check if key is in HashMap
var.containsKey(key)

// check if value is in HashMap
var.containsValue(value)
```

**********************************Sets and HashSets**********************************

Set is similar to set in python i.e. only stores unique items, cannot be indexed

Set is the interface while HashSet is the implementation

Uses a hash table to store data

```java
Set<Obejct> var = new HashSet<>();

// add item - does not maintain order of instertion
var.add(item)

// remove
var.remove(item) // cannot use index because they are not in order

var.size() // for length
var.contains(item)  // checl if item is in set
var.isEmpty() // check if set is empty
var.clear() // remove all items from set

// can be iterated with regualr for loop or for each
 // using lambdas
var.forEach(System.out::println)

var.iterator() // creates an iterator which works the same as lists and other objects int the java collections
Iterator<object> varIterator = var.iterator();
var.hasNext() // check if there are any other items while iterating
var.next() // calls next to proceed to the next element

// dump an array to a set 
// 1. addAll: takes elements from one collection and adds it to another collection
varSet.addAll(varArray)

// 2. On itialization - passing a collection to the constructor 
Set<Obejct> var = new HashSet<>(varList);
```

Other implementations:

Tree set: maintains natural order i.e. strings alpha order, numbers increasing order. But hash set is a lot faster

Linked hash set: maintains insertion order