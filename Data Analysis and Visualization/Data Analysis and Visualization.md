
Ahdrian Camilo C. Gernale

## Book links 

| Book chapter | link                                                                                                                              |
| ------------ | --------------------------------------------------------------------------------------------------------------------------------- |
| ch-1         | https://github.com/stefmolin/Hands-On-Data-Analysis-with-Pandas-2nd-edition/blob/master/ch_01/introduction_to_data_analysis.ipynb |
## DataViz 101

**Whatever you do in your processing stage, walang pake si client**

Data Visualization 
- Is the representation of data or information in a graph, chart, or other visual format. 
- It communicates relationships of the data with images. 
- is the secret art of turning data into understandable visuals

Communication 
- To drive action
- To inform 
- To persuade 
- To entertain 



## Numerical Python (NumPy)
- NumPy is the most foundational package for numerical computing in Python. 
- If you are going to work on data analysis or machine learning projects, then having a solid understanding of NumPy is nearly mandatory. 
- Indeed, many other libraries, such as pandas and scikit-learn, use NumPy’s array objects as the lingua franca for data exchange. 
- One of the reasons as to why NumPy is so important for numerical computations is because it is designed for efficiency with large arrays of data. The reasons for this include: 
	- It stores data internally in a continuous block of memory, independent of other in-built Python objects.
	- It performs complex computations on entire arrays without the need for for loops.

## What you'll find in NumPy

- ndarray: an efficient multidimensional array providing fast array-orientated arithmetic operations and flexible broadcasting capabilities.
- Mathematical functions for fast operations on entire arrays of data without having to write loops.
- Tools for reading/writing array data to disk and working with memory mapped files. 
- Linear algebra, random number generation, and Fourier transform capabilities. 
- A C API for connecting NumPy with libraries written in C, C++, and FORTRAN. This is why Python is the language of choice for wrapping legacy codebases.

## The NumPy ndarray: A multi-dimensional array object 
- The NumPy ndarray object is a fast and flexible container for large data sets in Python.
- NumPy arrays are a bit like Python lists, but are still a very different beast at the same time. 
- Arrays enable you to store multiple items of the same data type. It is the facilities around the array object that makes NumPy so convenient for performing math and data manipulations.

## Ndarrays vs. lists 

- By now, you are familiar with Python lists and how incredibly useful they are. 
- So, you may be asking yourself: “I can store numbers and other objects in a Python list and do all sorts of computations and manipulations through list comprehensions, forloops etc. What do I need a NumPy array for?” 
- There are very significant advantages of using NumPy arrays overs lists.

## Creating a NumPy array 

- To understand these advantages, lets create an array. 
- One of the most common, of the many, ways to create a NumPy array is to create one from a list by passing it to the **np.array()** function.

```python
import numpy as np

list1= [0,1,2,3,4]

arr = np.array(list1)

  

print(type(arr))

print(arr)
```

#### Result
```python
<class 'numpy.ndarray'> 
[0 1 2 3 4]
```

---

## Differences between lists and ndarrays 
- The key difference between an array and a list is that arrays are designed to handle vectorised operations while a python lists are not. 
- That means, if you apply a function, it is performed on every item in the array, rather than on the whole array object.
- Let’s suppose you want to add the number 2 to every item in the list. The intuitive way to do this is something like this:
```python 
import numpy as np

list1

list = list1+2
```

#### Result 

```text
---------------------------------------------------------------------------
TypeError                  Traceback (most recent call last)
Cell In[4], line 3
      1 import numpy as np 
      2 list1
----> 3 list = list1+2

TypeError: can only concatenate list (not \"int\") to list"

```

- That was not possible with a list, but you can do that on an array:

```python

import numpy as np

list1 = [0,1,2,3,4]

arr = np.array(list1)

print(arr)

arr = arr+2

print(arr)
```

#### Result 
```text
[0 1 2 3 4]
[2 3 4 5 6]
```

- It should be noted here that, once a Numpy array is created, you cannot increase its size. 
- To do so, you will have to create a new array.

## Create a 2d array from a list of list 
- You can pass a list of lists to create a matrix-like a 2d array.

```python

import numpy as np

list2 = [[0,1,2],[3,4,5],[6,7,8]]

arr2 = np.array(list2)

print(arr2)
```

#### Result
```text
[[0 1 2]
 [3 4 5]
 [6 7 8]]
```

## The dtype argument 
- You can specify the data-type by setting the dtype() argument. 
- Some of the most commonly used NumPy dtypes are: float, int, bool, str, and object.

```python
import numpy as np

list2 = [[0,1,2],[3,4,5],[6,7,8]]

arr3 = np.array(list2, dtype = 'float')

print(arr3)
```

#### Result 
```text]
[[0. 1. 2.]
 [3. 4. 5.]
 [6. 7. 8.]]
```


## The astype argument 
- You can also convert it to a different data-type using the astype method.

```python
import numpy as np

list2 = [[0,1,2],[3,4,5],[6,7,8]]

print(arr3)

arr3_s = arr3.astype('int').astype('str')

print(arr3_s)
```

#### Result 

```
[[0. 1. 2.]
 [3. 4. 5.]
 [6. 7. 8.]]
[['0' '1' '2']
 ['3' '4' '5']
 ['6' '7' '8']]
```

- Remember that, unlike lists, all items in an array have to be of the same type.

## dtype= ‘object’ 
- However, if you are uncertain about what data type your array will hold, or if you want to hold characters and numbers in the same array, you can set the dtype as 'object'.

```python

arr_list = arr_obj.tolist()

print(arr_list)
```

#### Result 

```text 
[1, 'a']
```

## The tolist() function 
- You can always convert an array into a list using the tolist() command.

```python
arr_list = arr_obj.tolist()

print(arr_list)
```

#### Result

```text
[1, 'a']
```

## Inspecting a NumPy array 

- There are a range of functions built into NumPy that allow you to inspect different aspects of an array:

```python
import numpy as np

list2 = [[0,1,2],[3,4,5],[6,7,8]]

arr3 = np.array(list2, dtype = 'float')

print("Shape: ", arr3.shape)

print("Data type: ", arr3.dtype)

print("Size: ", arr3.size)

print("Num dimensions: ", arr3.ndim)
```

#### Result 
```text
Shape:  (3, 3)
Data type:  float64
Size:  9
Num dimensions:  2
```

## Extracting specific items from an array 
- You can extract portions of the array using indices, much like when you’re working with lists. 
- Unlike lists, however, arrays can optionally accept as many parameters in the square brackets as there are number of dimensions

```python
import numpy as np

list2 = [[0,1,2],[3,4,5],[6,7,8]]

arr3 = np.array(list2, dtype = 'float')

print("Whole: ", arr3)

print("Part: ", arr3[:2, :2])
```

#### Result 
```text
Whole:  [[0. 1. 2.]
 [3. 4. 5.]
 [6. 7. 8.]]
Part:  [[0. 1.]
 [3. 4.]]
```

## Boolean indexing
- boolean index array is of the same shape as the array-to-be-filtered, but it only contains TRUE and FALSE values

```python
import numpy as np

list2 = [[0,1,2],[3,4,5],[6,7,8]]

arr3 = np.array(list2, dtype = 'float')

boo = arr3>2

print(boo)
```

#### Result 
```text
[[False False False]
 [ True  True  True]
 [ True  True  True]]
```


## Pandas 


- Pandas, like NumPy, is one of the most popular Python libraries for data analysis. 
- It is a high-level abstraction over low-level NumPy, which is written in pure C. 
- Pandas provides high-performance, easy-to-use data structures and data analysis tools. 
- There are two main structures used by pandas; data frames and series

## Indices in a pandas series
- A pandas series is similar to a list, but differs in the fact that a series associates a label with each element. This makes it look like a dictionary. 
- If an index is not explicitly provided by the user, pandas creates a Range Index ranging from 0 to N-1. 
- Each series object also has a data type.

```python
import pandas as pd

new_series = pd.Series([5,6,7,8,9,10])

print(new_series)
```

#### Result 
```text
0     5
1     6
2     7
3     8
4     9
5    10
dtype: int64
```

- As you may suspect by this point, a series has ways to extract all of the values in the series, as well as individual elements by index.

```python
import pandas as pd

new_series = pd.Series([5,6,7,8,9,10])

print(new_series.values)

print('__________________')

print(new_series[4])
```

#### Result 
```text
import pandas as pd

new_series = pd.Series([5,6,7,8,9,10])

print(new_series.values)

print('__________________')

print(new_series[4])
```

- You can also provide an index manually

```python
import pandas as pd

new_series = pd.Series([5,6,7,8,9,10], index = ['a','b','c','d','e','f'])

print(new_series.values)

print('__________________')

print(new_series['f'])
```

#### Result
```text
[ 5  6  7  8  9 10]
__________________
10
```

- It is easy to retrieve several elements of a series by their indices or make group assignments.

```python
import pandas as pd

new_series = pd.Series([5,6,7,8,9,10], index = ['a','b','c','d','e','f'])

print(new_series)

print('__________________')

new_series[['a','b','f']] = 0

print(new_series)
```

#### Result 
```text
a     5
b     6
c     7
d     8
e     9
f    10
dtype: int64
__________________
a    0
b    0
c    7
d    8
e    9
f    0
dtype: int64
```

## Filtering and maths operations 
- Filtering and maths operations are easy with Pandas as well.

```python
import pandas as pd

new_series = pd.Series([5,6,7,8,9,10], index = ['a','b','c','d','e','f'])

new_series2 = new_series[new_series>0]

print(new_series2)

print('__________________')

new_series2[new_series2>0]*2

print(new_series2)

print('__________________')

new_series2[new_series2>0]*2

print(new_series2)
```

#### Result

```text
a     5
b     6
c     7
d     8
e     9
f    10
dtype: int64
__________________
a     5
b     6
c     7
d     8
e     9
f    10
dtype: int64
__________________
a     5
b     6
c     7
d     8
e     9
f    10
dtype: int64
```


## Pandas data frame 
- Simplistically, a data frame is a table, with rows and columns. 
- Each column in a data frame is a series object. 
- Rows consist of elements inside series.

| Case ID | Variable one | Variable two | Variable 3 |
|---------|--------------|--------------|------------|
| 1       | 123          | ABC          | 10         |
| 2       | 456          | DEF          | 20         |
| 3       | 789          | XYZ          | 30         |

## Creating a Pandas data frame \
- Pandas data frames can be constructed using Python dictionaries.

```python
import pandas as pd

df = pd.DataFrame({

    'country': ['Kazakhstan', 'Russia', 'Belarus', 'Ukraine'],

    'population': [17.04, 143.5, 9.5, 45.5],

    'square': [2724902, 17125191, 207600, 603628]

})

print(df)
```

#### Result 

```text
      country  population    square
0  Kazakhstan       17.04   2724902
1      Russia      143.50  17125191
2     Belarus        9.50    207600
3     Ukraine       45.50    603628

```

- You can also create a data frame from a list.
```python
import pandas as pd

list2 = [[0,1,2],[3,4,5],[6,7,8]]

df = pd.DataFrame(list2)

print(df)

df.columns = ['V1', 'V2', 'V3']

print(df)
```

#### Result

```text 
   0  1  2
0  0  1  2
1  3  4  5
2  6  7  8
   V1  V2  V3
0   0   1   2
1   3   4   5
2   6   7   8
```

- You can ascertain the type of a column with the type() function.

```python
print(type(df['country']))
```

#### Result

```text
<class 'pandas.core.series.Series'>
```

- A Pandas data frame object as two indices; a column index and row index. 
- Again, if you do not provide one, Pandas will create a Range Index from 0 to N-1.

```python
import pandas as pd

df = pd.DataFrame({

    'country': ['Kazakhstan', 'Russia', 'Belarus', 'Ukraine'],

    'population': [17.04, 143.5, 9.5, 45.5],

    'square': [2724902, 17125191, 207600, 603628]

})

print(df.columns)

print('__________________')

print(df.index)
```

#### Result 

```text
Index(['country', 'population', 'square'], dtype='object')
__________________
RangeIndex(start=0, stop=4, step=1)
```
- There are numerous ways to provide row indices explicitly. 
- For example, you could provide an index when creating a data frame:

```python
import pandas as pd

df = pd.DataFrame({

    'country': ['Kazakhstan', 'Russia', 'Belarus', 'Ukraine'],

    'population': [17.04, 143.5, 9.5, 45.5],

    'square': [2724902, 17125191, 207600, 603628]

}, index = ['KZ', 'RU', 'BY', 'UA'])

print(df)
```

#### Result
```text
       country  population    square
KZ  Kazakhstan       17.04   2724902
RU      Russia      143.50  17125191
BY     Belarus        9.50    207600
UA     Ukraine       45.50    603628
```
- or do it during runtime. 
- Here, I also named the index ‘country code’.

```python
import pandas as pd

df = pd.DataFrame({

    'country': ['Kazakhstan', 'Russia', 'Belarus', 'Ukraine'],

    'population': [17.04, 143.5, 9.5, 45.5],

    'square': [2724902, 17125191, 207600, 603628]

})

print(df)

print('__________________')

df.index = ['KZ', 'RU', 'BY', 'UA']

df.index.name = 'Country Code'

print(df)
```

#### Result

```text 
      country  population    square
0  Kazakhstan       17.04   2724902
1      Russia      143.50  17125191
2     Belarus        9.50    207600
3     Ukraine       45.50    603628
__________________
                 country  population    square
Country Code                                  
KZ            Kazakhstan       17.04   2724902
RU                Russia      143.50  17125191
BY               Belarus        9.50    207600
UA               Ukraine       45.50    603628

```

- Row access using index can be performed in several ways.
- First, you could use .loc() and provide an index label.

```python 
print(df.loc['KZ'])
```

#### Result
```text
country       Kazakhstan
population         17.04
square           2724902
Name: KZ, dtype: object
```

- Second, you could use .iloc() and provide an index number

```python
print(df.iloc[0])
```

```text
country       Kazakhstan
population         17.04
square           2724902
Name: KZ, dtype: object
```

- A selection of particular rows and columns can be selected this way.

```python
print(df.loc[['KZ', 'RU'], 'population'])
```

#### Result

```text
Country Code
KZ     17.04
RU    143.50
Name: population, dtype: float64
```

- You can feed .loc() two arguments, index list and column list, slicing operation is supported as well:

```python
print(df.loc['KZ':'BY', :])
```
#### Result 

```text
                 country  population    square
Country Code                                  
KZ            Kazakhstan       17.04   2724902
RU                Russia      143.50  17125191
BY               Belarus        9.50    207600
```

## Filtering 
- Filtering is performed using so-called Boolean arrays

```python
print(df[df.population > 10][['country', 'square']])
```

#### Result

```text
                 country    square
Country Code                      
KZ            Kazakhstan   2724902
RU                Russia  17125191
UA               Ukraine    603628
```