

## Orientation 


3 units (2hrs lec & 3 hrs Lab)

**Mode of class delivery:** Onsite except on Sept 04-17, Oct 14-19, Nov 18-23

**Prerequisites:** Computer programming and Linear Algebra 


#### Linear Algebra
- Rotation
- Linear transformation 


## Introduction to Computer Graphics 

### What is computer graphics?

- **Computer graphics** is a broad field of computer science that focuses on the **creation, modification, and display** of visual data by computers. 

- **Computer graphics** can be used to create anything from straightforward 2D shapes intricate 3D models and animations supporting a wide range of applications in various fields such as the entertainment, design, science, and education and sectors and others. 


**Everything you see on the screen**


### Three Main tasks of computer graphics 

- **Modeling** - (shape) creating and representing the geometry of objects in the 3D world 
- **Rendering** - (light, perspective) generating 2D images of the objects 
- **Animation** - (movement) describing how objects change in time. 

### Key concepts 

**Rendering** - the process of creating an image from a model (shown tremendous progress). Ray tracing has grown in popularity as a method of creating incredibly realistic graphics by mimicking the way light interacts with objects. Real-time ray tracing has been made possibly by the introduction of GPUs with specialized ray tracing technology, such as NVIDIA's RTX series, which has improved virtual reality and gaming experiences. 

**AI and Real** - Real-time rendering has changed as a result of artificial intelligence (AI) being included into computer graphics. Real-time upscales of lower-resolution photos are achieved by AI techniques like Deep Learning Super Sampling 

**3D Modeling and Simulation** - Over the last five years, there have also been considerable advancements in 3D modeling. Programs such as blender and Autodesk 

**Augmented and Virtual Reality** - Both augmented reality (AR) and virtual reality (VR) are becoming more and more common. VR and AR are now more widely available thanks to recent advancements in technology and software.  

**Digital twins and metaverse** - The idea of ca communal virtual shared environment called the Metaverse  has gained popularity. \


### Application Fields of Computer graphics

- Graphical User Interface (GUI)
- Arts advertising (artificial, modified image/s sequences)
- Visualizations (graphs of functions, bar chart & pie diagrams, temperature distribution on the surface of the earth, visualization of high-dimensional data, etc.)
- Reconstructing 3D-objects from measured data (3-D scanner, ultrasonic images, MRI, etc.)
- CAD/CAM (Computer Aided Design/Manufacturing) (Design of objects like, cars, building, etc.)
- Simulation and animation (flight simulators, computer games, movies, etc.)
- Interactive TV (free choice of the viewers position, computation of image based on information from a small number of cameras.)
- Virtual Reality (realistic 3D view + free movement + acoustics)
- Augmented reality (auxiliary information superimposed to the real world by a semi-transparent glasses.)
- Graphs
- Paint systems
- Cartography 


## Real Scene to an image

**Real scene** whose details/objects have to be modeled. 
##### Choice of a view/part of the virtual world to be displayed 
- **Clipping :** computation which objects are within the chosen view
- **Visibility considerations :** Objects in the clipping region are visible for the viewer.
- **Result :** Pixel image
	- Illumination effects, shading 
	- Two - dimensional clipping 


## Graphic Systems Configuration 



#### Software components 

**Graphic Drivers** - Drivers are software that enables communication between the operating system and the GPU.

**Graphics APIs** - APIs like DirectX, Vulkan and OpenGL provide a standardized way for software to interact with the GPU . 

**Overclocking Software** - Tools that allow users to increase the clock speed of the GPU and CPU to boost performance. 

**Graphics settings** - In applications and games, settings such as resolution, texture quality, anti-aliasing, and shadows can be adjusted to balance performance and visual quality. 

#### Power Supply 

A sufficient power supply unit (PSU) is necessary to handle the power demands of the GPU, CPU, and other components. 

#### Operating Systems and Updates

The operating system must be configured to support the latest graphic technologies, with updates installed to ensure compatibility and performance. 


System consists of HARDWARE & SOFTWARE 

**3 Components of software **

## Raster Display 
- is a type of screen or display system that renders images by illuminating pixels on a grid of individual points or dots, usually in a rectangular matrix

### Characteristics 

**Color Frame Buffer with Lookup Table**

(Increases number)

### Exercise 

Compute the following: 

 1. Size of 800 x 600 image at 240 pixels per inch 

$$\text{Get the width and height in inches}$$
$$\begin{align*}Width &= Width \;in \; pixels / PPI \\ Height &= Height\; in\; pixels / PPI\\\\Width &= 800 / 240 = 3.33333\\Height &= 600/240 =2.5\end{align*}$$

 2. Resolution of 2 x 2 inch image that has 512 x 512 pixels 

$$\text{PPI = Number of pixels / Image size in inches}$$

$$\begin{align}PPI &= \frac{512\; pixels }{ 2 \;inches }\\ PPI & =256 \;PPI\end{align}$$

 3. Height of the resized image 1024 x 768 to one that is 640 pixels wide with the same aspect ratio 

$$\begin{align}Aspect \; Ratio &= \frac{width}{height} = \frac{1024px}{768px} = \frac{4}{3}px\\\frac{4}{3} &= \frac{New \;width}{New\;Height}\\\\New \; Width &= 640 px \\ \frac{4}{3} &= \frac{640}{New \; Height} \\New \; Height& = 640 * \frac{4}{3}\end{align}$$
 4. Width of an image having height of 5 inches ad aspect ratio 1.5 
$$\begin{align}Aspect \; Ratio &= \frac{width}{height}\\Width &= Height\;*\;Aspect\; Ratio\\Width &= 5 \; inches * 1.5 \\Width & = 7.5 \;inches\end{align}$$