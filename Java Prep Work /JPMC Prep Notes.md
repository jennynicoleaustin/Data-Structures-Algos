### Iterate over a list 

#### Traditional for loop
```
for (i = 0; i < list_name.size(); i++)
{
// code to be executed for each item
}
```
#### Enhanced for loop 
```
for(data_type variable : List_name)
{  
do something to (variable)
}
```
#### Lambda foreach 
```
mylist.forEach (
(itemInList) -> { do something to it}
)
```

### Comparing String Objects

#### Equality 
`variable.equals(itemToCompare)`

`variable.equalsIgnoresCase(itemToCompare)`

#### Compare
*By Lexicographic order*

`variable1.compareTo(variable2)`
- if (string1 before string2) returns -1 (neg)
- if (string1 == string2) returns 0 (zero)
- if (string1 after string2) returns 1 (pos)

*By Length*
```
public int compare(String first, String second){
    return first.length() - second.length();
};
```

### Sort Lists in ascending order

*Sort lists only when items are comparable*

`Collections.sort(myList)`

*Sort by specified comparator*

`myList.sort(Comparator.typeOfComparator())`

### Compare two ArrayList in Java 
*returns true is array lists are same size and each item is same*

`boolean areEqual = myArrayList1.equals(myArrayList2)`
