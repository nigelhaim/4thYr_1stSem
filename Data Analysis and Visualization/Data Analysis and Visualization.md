
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