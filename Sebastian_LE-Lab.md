
## 1. (14 points) Draw the following images:
### (a) spheres whose radius is 25 and 300 resolution

```python
#DRAWING A SPHERE

# Define the radius of the sphere

radius = 25

num_points = 300

  

# Create a meshgrid for the spherical coordinates (theta, phi)

theta = np.linspace(0, 2 * np.pi, num_points)  # Azimuthal angle

phi = np.linspace(0, np.pi, num_points)        # Polar angle

theta, phi = np.meshgrid(theta, phi)

  
  

# Parametric equations for the sphere

x = radius * np.sin(phi) * np.cos(theta)

y = radius * np.sin(phi) * np.sin(theta)

z = radius * np.cos(phi)
```

![[Pasted image 20241212114538.png]]
### (b) the pyramid with a rectangular base (50 by 45) with height 30 ~~and resolution 300~~

```python
#DRAWING PRISM

# Parameters for the rectangular prism

length = 45  # Length of the prism

width = 50  # Width of the prism

height =30  # Height of the prism

  

# Define the vertices of the rectangular prism

vertices = np.array([

    [-length/2, -width/2, 0],  # Base corner 1

    [ length/2, -width/2, 0],  # Base corner 2

    [ length/2,  width/2, 0],  # Base corner 3

    [-length/2,  width/2, 0],  # Base corner 4

    [ 0, 0, height]    

])

  

faces = [

    [vertices[0], vertices[1], vertices[4]],  # Front face

    [vertices[1], vertices[2], vertices[4]],  # Right face

    [vertices[2], vertices[3], vertices[4]],  # Back face

    [vertices[3], vertices[0], vertices[4]],  # Left face

    [vertices[0], vertices[1], vertices[2], vertices[3]]  # Base face

]
```

![[Pasted image 20241212114559.png]]


## 2. Perform the following in the stated image.

### (a)  (14 points) Rotate the pyramid at the following angles  75 degrees  with respect to X , Y and Z axis

```python
rotation_angle = 75 * np.pi / 180  # 75 degrees in radians
angle_in_degrees = np.degrees(rotation_angle)

print(round(angle_in_degrees, 2))
# Apply rotation around the x-axis

y_rotation_matrix = np.array([

    [1, 0, 0],

    [0, np.cos(rotation_angle), -np.sin(rotation_angle)],

    [0, np.sin(rotation_angle), np.cos(rotation_angle)]

])

#DRAWING PRISM

# Parameters for the rectangular prism

length = 45  # Length of the prism

width = 50  # Width of the prism

height =30  # Height of the prism

  

# Define the vertices of the rectangular prism

vertices = np.array([

    [-length/2, -width/2, 0],  # Base corner 1

    [ length/2, -width/2, 0],  # Base corner 2

    [ length/2,  width/2, 0],  # Base corner 3

    [-length/2,  width/2, 0],  # Base corner 4

    [ 0, 0, height]    

])

  
  

faces = [

    [vertices[0], vertices[1], vertices[4]],  # Front face

    [vertices[1], vertices[2], vertices[4]],  # Right face

    [vertices[2], vertices[3], vertices[4]],  # Back face

    [vertices[3], vertices[0], vertices[4]],  # Left face

    [vertices[0], vertices[1], vertices[2], vertices[3]]  # Base face

]

  

rotated_vertices = np.dot(vertices, y_rotation_matrix)

  

rotated_faces = [

    [rotated_vertices[0], rotated_vertices[1], rotated_vertices[4]],  # Front face

    [rotated_vertices[1], rotated_vertices[2], rotated_vertices[4]],  # Right face

    [rotated_vertices[2], rotated_vertices[3], rotated_vertices[4]],  # Back face

    [rotated_vertices[3], rotated_vertices[0], rotated_vertices[4]],  # Left face

    [rotated_vertices[0], rotated_vertices[1], rotated_vertices[2], rotated_vertices[3]]  # Base face

]
```

![[Pasted image 20241212114721.png]]

#### x axis rotation

```python 
# Apply rotation around the Y-axis

x_rotation_matrix = np.array([

    [np.cos(rotation_angle), 0, np.sin(rotation_angle)],

    [0, 1, 0],

    [-np.sin(rotation_angle), 0, np.cos(rotation_angle)]

])

#DRAWING PRISM

# Parameters for the rectangular prism

length = 45  # Length of the prism

width = 50  # Width of the prism

height =30  # Height of the prism

  

# Define the vertices of the rectangular prism

vertices = np.array([

    [-length/2, -width/2, 0],  # Base corner 1

    [ length/2, -width/2, 0],  # Base corner 2

    [ length/2,  width/2, 0],  # Base corner 3

    [-length/2,  width/2, 0],  # Base corner 4

    [ 0, 0, height]    

])

  
  

faces = [

    [vertices[0], vertices[1], vertices[4]],  # Front face

    [vertices[1], vertices[2], vertices[4]],  # Right face

    [vertices[2], vertices[3], vertices[4]],  # Back face

    [vertices[3], vertices[0], vertices[4]],  # Left face

    [vertices[0], vertices[1], vertices[2], vertices[3]]  # Base face

]

  

rotated_vertices = np.dot(vertices, x_rotation_matrix)

  

rotated_faces = [

    [rotated_vertices[0], rotated_vertices[1], rotated_vertices[4]],  # Front face

    [rotated_vertices[1], rotated_vertices[2], rotated_vertices[4]],  # Right face

    [rotated_vertices[2], rotated_vertices[3], rotated_vertices[4]],  # Back face

    [rotated_vertices[3], rotated_vertices[0], rotated_vertices[4]],  # Left face

    [rotated_vertices[0], rotated_vertices[1], rotated_vertices[2], rotated_vertices[3]]  # Base face

]
```

![[Pasted image 20241212114753.png]]
#### z axis

```python
z_rotation_matrix = np.array([

    [np.cos(rotation_angle), -np.sin(rotation_angle), 0],

    [np.sin(rotation_angle), np.cos(rotation_angle), 0],

    [0, 0, 1]

])

#DRAWING PRISM

# Parameters for the rectangular prism

length = 45  # Length of the prism

width = 50  # Width of the prism

height =30  # Height of the prism

  

# Define the vertices of the rectangular prism

vertices = np.array([

    [-length/2, -width/2, 0],  # Base corner 1

    [ length/2, -width/2, 0],  # Base corner 2

    [ length/2,  width/2, 0],  # Base corner 3

    [-length/2,  width/2, 0],  # Base corner 4

    [ 0, 0, height]    

])

  
  

faces = [

    [vertices[0], vertices[1], vertices[4]],  # Front face

    [vertices[1], vertices[2], vertices[4]],  # Right face

    [vertices[2], vertices[3], vertices[4]],  # Back face

    [vertices[3], vertices[0], vertices[4]],  # Left face

    [vertices[0], vertices[1], vertices[2], vertices[3]]  # Base face

]

  

rotated_vertices = np.dot(vertices, z_rotation_matrix)

  

rotated_faces = [

    [rotated_vertices[0], rotated_vertices[1], rotated_vertices[4]],  # Front face

    [rotated_vertices[1], rotated_vertices[2], rotated_vertices[4]],  # Right face

    [rotated_vertices[2], rotated_vertices[3], rotated_vertices[4]],  # Back face

    [rotated_vertices[3], rotated_vertices[0], rotated_vertices[4]],  # Left face

    [rotated_vertices[0], rotated_vertices[1], rotated_vertices[2], rotated_vertices[3]]  # Base face

]
```

![[Pasted image 20241212114832.png]]

#### All rotations


```python
# Apply rotation around the x-axis

x_rotation_matrix = np.array([

    [1, 0, 0],

    [0, np.cos(rotation_angle), -np.sin(rotation_angle)],

    [0, np.sin(rotation_angle), np.cos(rotation_angle)]

])

  
  

# Apply rotation around the Y-axis

y_rotation_matrix = np.array([

    [np.cos(rotation_angle), 0, np.sin(rotation_angle)],

    [0, 1, 0],

    [-np.sin(rotation_angle), 0, np.cos(rotation_angle)]

])

  

# Apply rotation around the z-axis

z_rotation_matrix = np.array([

    [np.cos(rotation_angle), -np.sin(rotation_angle), 0],

    [np.sin(rotation_angle), np.cos(rotation_angle), 0],

    [0, 0, 1]

])

  

all_rotations = np.dot(z_rotation_matrix, np.dot(y_rotation_matrix, x_rotation_matrix))

#DRAWING PRISM

# Parameters for the rectangular prism

length = 45  # Length of the prism

width = 50  # Width of the prism

height =30  # Height of the prism

  

# Define the vertices of the rectangular prism

vertices = np.array([

    [-length/2, -width/2, 0],  # Base corner 1

    [ length/2, -width/2, 0],  # Base corner 2

    [ length/2,  width/2, 0],  # Base corner 3

    [-length/2,  width/2, 0],  # Base corner 4

    [ 0, 0, height]    

])

  
  

faces = [

    [vertices[0], vertices[1], vertices[4]],  # Front face

    [vertices[1], vertices[2], vertices[4]],  # Right face

    [vertices[2], vertices[3], vertices[4]],  # Back face

    [vertices[3], vertices[0], vertices[4]],  # Left face

    [vertices[0], vertices[1], vertices[2], vertices[3]]  # Base face

]

  
  

all_rotations = np.dot(z_rotation_matrix, np.dot(y_rotation_matrix, x_rotation_matrix))

rotated_vertices = np.dot(vertices, all_rotations)

  

rotated_faces = [

    [rotated_vertices[0], rotated_vertices[1], rotated_vertices[4]],  # Front face

    [rotated_vertices[1], rotated_vertices[2], rotated_vertices[4]],  # Right face

    [rotated_vertices[2], rotated_vertices[3], rotated_vertices[4]],  # Back face

    [rotated_vertices[3], rotated_vertices[0], rotated_vertices[4]],  # Left face

    [rotated_vertices[0], rotated_vertices[1], rotated_vertices[2], rotated_vertices[3]]  # Base face

]
```

![[Pasted image 20241212114857.png]]

### (14 points) Translate the rotated object in (2.a)  using (Tx, Ty, Tz)  = (-10, 30, 25)

```python
translation = [-10,30,25]
#DRAWING PRISM

# Parameters for the rectangular prism

length = 45  # Length of the prism

width = 50  # Width of the prism

height =30  # Height of the prism

  

# Define the vertices of the rectangular prism

vertices = np.array([

    [-length/2, -width/2, 0],  # Base corner 1

    [ length/2, -width/2, 0],  # Base corner 2

    [ length/2,  width/2, 0],  # Base corner 3

    [-length/2,  width/2, 0],  # Base corner 4

    [ 0, 0, height]    

])

  
  
  

faces = [

    [vertices[0], vertices[1], vertices[4]],  # Front face

    [vertices[1], vertices[2], vertices[4]],  # Right face

    [vertices[2], vertices[3], vertices[4]],  # Back face

    [vertices[3], vertices[0], vertices[4]],  # Left face

    [vertices[0], vertices[1], vertices[2], vertices[3]]  # Base face

]

  
  

all_rotations = np.dot(z_rotation_matrix, np.dot(y_rotation_matrix, x_rotation_matrix))

rotated_vertices = np.dot(vertices, all_rotations)

  

# Translate the vertices

translated_vertices = rotated_vertices + translation

  
  

translated_faces = [

    [translated_vertices[0], translated_vertices[1], translated_vertices[4]],  # Front face

    [translated_vertices[1], translated_vertices[2], translated_vertices[4]],  # Right face

    [translated_vertices[2], translated_vertices[3], translated_vertices[4]],  # Back face

    [translated_vertices[3], translated_vertices[0], translated_vertices[4]],  # Left face

    [translated_vertices[0], translated_vertices[1], translated_vertices[2], translated_vertices[3]]  # Base face

]
```

![[Pasted image 20241212114922.png]]

### (c) (14 points) Scale the sphere using the given parameters

#### c.1) (Sx, Sy, Sz) = (0.25, 4, 1)

```python
scaling_factors = [0.25,4,1]
#DRAWING A SPHERE

# Define the radius of the sphere

radius = 25

num_points = 300

  

# Create a meshgrid for the spherical coordinates (theta, phi)

theta = np.linspace(0, 2 * np.pi, num_points)  # Azimuthal angle

phi = np.linspace(0, np.pi, num_points)        # Polar angle

theta, phi = np.meshgrid(theta, phi)

  
  

# Parametric equations for the sphere

x = radius * np.sin(phi) * np.cos(theta)

y = radius * np.sin(phi) * np.sin(theta)

z = radius * np.cos(phi)

  

# Scale the sphere

scaled_x = x * scaling_factors[0]

scaled_y = y * scaling_factors[1]

scaled_z = z * scaling_factors[2]
```

![[Pasted image 20241212114949.png]]


#### c.2) (Sx, Sy, Sz) = (2, 5, -1)

```python
scaling_factors = [2,5,-1]
#DRAWING A SPHERE

# Define the radius of the sphere

radius = 25

num_points = 300

  

# Create a meshgrid for the spherical coordinates (theta, phi)

theta = np.linspace(0, 2 * np.pi, num_points)  # Azimuthal angle

phi = np.linspace(0, np.pi, num_points)        # Polar angle

theta, phi = np.meshgrid(theta, phi)

  
  

# Parametric equations for the sphere

x = radius * np.sin(phi) * np.cos(theta)

y = radius * np.sin(phi) * np.sin(theta)

z = radius * np.cos(phi)

  

# Scale the sphere

scaled_x = x * scaling_factors[0]

scaled_y = y * scaling_factors[1]

scaled_z = z * scaling_factors[2]
```


![[Pasted image 20241212115215.png]]


### (4) (14 points) Rotate  the scaled sphere at 75 degress with respect to X, Y and Z axis. Compare the results.
#### y axis rotation

```python
rotation_angle = 75 * np.pi / 180  # 75 degrees in radians
angle_in_degrees = np.degrees(rotation_angle)

print(round(angle_in_degrees, 2))
#DRAWING A SPHERE

# Define the radius of the sphere

radius = 25

num_points = 300

  

# Create a meshgrid for the spherical coordinates (theta, phi)

theta = np.linspace(0, 2 * np.pi, num_points)  # Azimuthal angle

phi = np.linspace(0, np.pi, num_points)        # Polar angle

theta, phi = np.meshgrid(theta, phi)

  
  

# Parametric equations for the sphere

x = radius * np.sin(phi) * np.cos(theta)

y = radius * np.sin(phi) * np.sin(theta)

z = radius * np.cos(phi)

  

# Scale the sphere

scaled_x = x * scaling_factors[0]

scaled_y = y * scaling_factors[1]

scaled_z = z * scaling_factors[2]

  

## Rotate the sphere

rotated_y = scaled_y * np.cos(rotation_angle) - scaled_z * np.sin(rotation_angle)
```

![[Pasted image 20241212115243.png]]

#### x axis rotation

```python
#DRAWING A SPHERE

# Define the radius of the sphere

radius = 25

num_points = 300

  

# Create a meshgrid for the spherical coordinates (theta, phi)

theta = np.linspace(0, 2 * np.pi, num_points)  # Azimuthal angle

phi = np.linspace(0, np.pi, num_points)        # Polar angle

theta, phi = np.meshgrid(theta, phi)

  
  

# Parametric equations for the sphere

x = radius * np.sin(phi) * np.cos(theta)

y = radius * np.sin(phi) * np.sin(theta)

z = radius * np.cos(phi)

  

# Scale the sphere

scaled_x = x * scaling_factors[0]

scaled_y = y * scaling_factors[1]

scaled_z = z * scaling_factors[2]

  

## Rotate the sphere

rotated_x = scaled_x * np.cos(rotation_angle) - scaled_z * np.sin(rotation_angle)
```

![[Pasted image 20241212115310.png]]

#### z axis rotation

```python
#DRAWING A SPHERE

# Define the radius of the sphere

radius = 25

num_points = 300

  

# Create a meshgrid for the spherical coordinates (theta, phi)

theta = np.linspace(0, 2 * np.pi, num_points)  # Azimuthal angle

phi = np.linspace(0, np.pi, num_points)        # Polar angle

theta, phi = np.meshgrid(theta, phi)

  
  

# Parametric equations for the sphere

x = radius * np.sin(phi) * np.cos(theta)

y = radius * np.sin(phi) * np.sin(theta)

z = radius * np.cos(phi)

  

# Scale the sphere

scaled_x = x * scaling_factors[0]

scaled_y = y * scaling_factors[1]

scaled_z = z * scaling_factors[2]

  

## Rotate the sphere

rotated_z = scaled_x * np.sin(rotation_angle) + scaled_y * np.cos(rotation_angle)
```

![[Pasted image 20241212115328.png]]

#### all rotations

```python
#DRAWING A SPHERE

# Define the radius of the sphere

radius = 25

num_points = 300

  

# Create a meshgrid for the spherical coordinates (theta, phi)

theta = np.linspace(0, 2 * np.pi, num_points)  # Azimuthal angle

phi = np.linspace(0, np.pi, num_points)        # Polar angle

theta, phi = np.meshgrid(theta, phi)

  
  

# Parametric equations for the sphere

x = radius * np.sin(phi) * np.cos(theta)

y = radius * np.sin(phi) * np.sin(theta)

z = radius * np.cos(phi)

  

# Scale the sphere

scaled_x = x * scaling_factors[0]

scaled_y = y * scaling_factors[1]

scaled_z = z * scaling_factors[2]

  

## Rotate the sphere

rotated_x = scaled_x * np.cos(rotation_angle) - scaled_z * np.sin(rotation_angle)

rotated_y = scaled_y * np.cos(rotation_angle) - scaled_z * np.sin(rotation_angle)

rotated_z = scaled_x * np.sin(rotation_angle) + scaled_y * np.cos(rotation_angle)
```

![[Pasted image 20241212115345.png]]

### Results Comparison

#### Pyramid rotation

| x                                        | y                                    | z                                    | All Rotations                        |
| ---------------------------------------- | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| <br>![[Pasted image 20241212115725.png]] | ![[Pasted image 20241212115716.png]] | ![[Pasted image 20241212115733.png]] | ![[Pasted image 20241212115754.png]] |


#### Translation

![[Pasted image 20241212115828.png]]

#### Scaling 

| Original                             | (Sx, Sy, Sz) = (0.25, 4, 1)          | (Sx, Sy, Sz) = (2, 5, -1)            |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| ![[Pasted image 20241212120451.png]] | ![[Pasted image 20241212120445.png]] | ![[Pasted image 20241212120500.png]] |
#### Scaling + Rotation

| Original                             | x                                    | y                                    | z                                    | All Rotations                        |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| ![[Pasted image 20241212120552.png]] | ![[Pasted image 20241212120602.png]] | ![[Pasted image 20241212120609.png]] | ![[Pasted image 20241212120706.png]] | ![[Pasted image 20241212120715.png]] |