
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

**AI and Real** - Real-time rendering has changed as a result of artificial intelligence (AI) being included into computer graphics. Real-time upscales of lower-resolution photos are achieved by AI techniques like Deep Learning Super Sampling (DLSS), which dramatically reduce processing load while preserving good visual quality. This is particularly crucial for VR and gaming, as keeping frame rates high is essential to the user experience.

**3D Modeling and Simulation** - Over the last five years, there have also been considerable advancements in 3D modeling. Programs such as Blender and Autodesk Maya have included more capable and user-friendly tools for 3D model creation. With the advancement of physics-based simulations, more realistic representations of materials and physical interactions are now possible, leading to increasingly precise and intricate animations in a variety of industries, including science visualization, video games, and movies.

**Augmented and Virtual Reality** - Both augmented reality (AR) and virtual reality (VR) are becoming more and more common. VR and AR are now more widely available thanks to recent advancements in technology and software. Real-time tracking and rendering in conjunction with high-fidelity visuals have produced more dynamic and immersive environments that are utilized in professional training, education, and gaming.

**Digital twins and metaverse** - The idea of a communal virtual shared environment called the Metaverse has gained popularity. Businesses like Epic Games and Meta (previously Facebook) are making significant investments in building massive virtual worlds. The representation of expansive, dynamic three-dimensional worlds is one area where these settings mostly rely on advancements in computer graphics. Advances in real-time 3D visualization and simulation have led to the emergence of digital twins, which are virtual reproductions of actual phenomena, as vital tools in engineering, healthcare, and urban planning.


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
**MODEL OF THE SCENE** in which the objects of the real scene are represented by the available modelling techniques (basic geometric objects, transformations, ...). The true geometry might only be approximated by the model 

##### Choice of a view/part of the virtual world to be displayed 
- **Clipping :** computation which objects are within the chosen view
- **Visibility considerations :** Objects in the clipping region are visible for the viewer.
- **Result :** Pixel image
	- Illumination effects, shading 
	- Two - dimensional clipping 


## Graphic Systems Configuration 

Graphic systems configuration describes how hardware and software are set up and optimized within a computer system to guarantee effective visual processing and rendering. For graphics-intensive applications like gaming, video editing, 3D rendering, and others, this is essential. An outline of the essential components necessary in setting up a graphic system are as follows:  
1. Hardware Components  
2. Software Components  
3. Power Supply  
4. Operating Systems and Updates

>[!Note]- Graphic Systems Cofiguration
>![[Pasted image 20240823150426.png]]


#### Hardware Components  

**Graphics Processing Unit (GPU)** - The most critical component in graphic system, responsible for rendering images, video, and animations. Modern GPUs are highly parallel processors optimized for handling complex calculations required in graphic rendering. *Configuration:* Selecting the right GPU based on the workload (e.g.,  
gaming, professional 3D rendering, or AI processing) is crucial. For gaming, high refresh rates and resolution support are important, while for rendering, VRAM and processing power are key.  

**Central Processing Unit (CPU)** - While the GPU handles most of the graphic rendering tasks, the CPU is still crucial for processing game logic, AI, and other tasks that affect performance.  
*Configuration:* A balanced CPU-GPU pairing is important to avoid  
bottlenecks. High core count and clock speed are beneficial for tasks that are both CPU- and GPU-intensive.  

**Memory (RAM)** - RAM is essential for handling the data being processed by both the CPU and GPU. More RAM allows for smoother multitasking and handling larger datasets in applications like 3D modeling or video editing.  
*Configuration:* Typically, 16GB to 32GB of RAM is recommended  
for graphic-intensive tasks, though more may be required for  
professional workloads.  \

**Storage** - Fast storage options like SSDs are crucial for loading large  
textures, games, or video files quickly.  
*Configuration:* NVMe SSDs are preferred for their high speed,  
which reduces load times in games and applications.  

**Monitor** - The display resolution, refresh rate, and color accuracy of the monitor impact the visual experience.  
*Configuration:* High-refresh-rate monitors (120Hz or higher) are ideal for gaming, while 4K monitors with good color accuracy are preferred for video editing and graphic design.  

**Cooling System** - Graphics-intensive tasks generate significant heat, so effective cooling (both air and liquid) is necessary to maintain performance and longevity of the hardware.  
*Configuration:* High-performance fans, liquid cooling systems, and good airflow in the case are important for preventing thermal throttling.  
#### Software components 

**Graphic Drivers** - Drivers are software that enables communication between the operating system and the GPU.  
*Configuration:* Keeping graphics drivers up to date is essential  
for optimizing performance and compatibility with the latest  
games and applications.

**Graphics APIs** - APIs like DirectX, Vulkan, and OpenGL provide a standardized way for software to interact with the GPU.  
*Configuration:* Selecting the right API (often determined by the application or game) can improve performance. For instance, Vulkan and DirectX 12 are optimized for multi-threaded workloads.  

**Overclocking Software** - Tools that allow users to increase the clock speed of the GPU and CPU to boost performance.  
*Configuration:* Overclocking can provide performance gains but  
should be done cautiously to avoid overheating and instability.

**Graphics settings** - In applications and games, settings such are resolution, texture quality, anti-aliasing, and shadows can be adjusted to balance performance and visual quality.  
*Configuration:* Tweaking these settings depending on the hardware  
capabilities can optimize the gaming or work experience. Lowering  
settings can improve frame rates, while higher settings enhance visual  
fidelity.

**Power Supply** - A sufficient power supply unit (PSU) is necessary to handle the power demands of the GPU, CPU, and other components.  
*Configuration:* Ensuring that the PSU has enough wattage and proper efficiency (like 80 Plus Gold or higher) is crucial for stable system performance, especially when overclocking.  


#### Operating Systems and Updates
The operating system must be configured to support the latest graphic technologies, with updates installed to ensure compatibility and performance.  
*Configuration:* Using the latest OS version, with optimizations for gaming or graphic workstations, can enhance overall system stability and performance.

System consists of HARDWARE & SOFTWARE 

**3 Components of software**
1. APPLICATION PROGRAM creates, store and retrieves the data/objects to be pictured on the screen from (2)  
2. APPLICATION DATA helps in producing images by sending a series of graphics output command in (3)  
3. GRAPHICS SYSTEMS interacts between the user and the application program and responsible for producing the picture from the detailed descriptions and for passing the user input to the application program for processing.  

## Graphics Systems 

In computer graphics, the system's visual quality, performance, and energy efficiency are all greatly impacted by the display technology selected. Over the years, four primary display technologies have been employed: CRT, LCD, LED, and plasma. Each has pros and cons of its own.  

**CRT (Cathode Ray Tube)**
- CRT displays work by firing electron beams from an electron gun towards a phosphorescent screen. The screen is coated with red, green, and blue phosphors that emit light when struck by the electrons, creating an image.  
- The electron beam scans the screen in a raster pattern, refreshing the image multiple times per second (usually 60Hz or more).  
*Characteristics*  
- Color and Brightness: CRTs offer excellent color reproduction and deep blacks, as they can individually control the intensity of each pixel.  
- Response Time: They have very fast response times, making them ideal for fast-moving images like in gaming.  
- Drawbacks: CRTs are large, heavy, and consume a lot of power. They also suffer from screen burn-in and are prone to flickering at lower refresh rates.  

**LCD (Liquid Crystal Display)**

- LCDs use liquid crystals that do not emit light themselves but instead modulate light from a backlight. The liquid crystals are sandwiched between two layers of glass or plastic and are manipulated to block or allow light to pass through colored filters (red, green, and blue) to create an image.  

- The backlight is typically provided by CCFLs (Cold Cathode Fluorescent Lamps) in older LCDs.  
*Characteristics*
- Resolution: LCDs have a fixed native resolution. Running at non-native resolutions can degrade image quality.  
- Color and Brightness: LCDs generally offer good color reproduction, but blacks may appear as dark gray due to the backlighting.  
- Drawbacks: Slower response times can lead to motion blur, and viewing angles are often limited.  

**LED (Light Emitting Diode)**
- LED displays are a type of LCD where the backlight is provided by LEDs instead of CCFLs. LEDs can be either edge-lit or full-array, with some models featuring local dimming to improve contrast.

*Characteristics*
- Brightness and Contrast: LED displays offer better brightness and contrast ratios compared to traditional LCDs, especially with local dimming technology.  
- Energy Efficiency: LEDs are more energy-efficient, resulting in lower power consumption and heat generation.  
- Drawbacks: Like LCDs, they have a fixed native resolution and can suffer from limited viewing angles, though these have improved in newer models.  

**Plasma**
- Plasma displays use small cells containing electrically charged ionized gases (plasma) to produce light. Each cell is essentially a tiny fluorescent lamp that emits UV light when excited by an electric current, which then excites phosphors to emit visible light.  

*Characteristics*
- Color and Brightness: Plasma displays are known for deep blacks and good color accuracy, similar to CRTs, because they can control light emission on a per-pixel basis.  
- Viewing Angles: They offer wide viewing angles with minimal color shift.  
- Drawbacks: Plasma displays consume more power, generate more heat, and are heavier compared to LCDs and LEDs. They are also susceptible to screen burn-in, especially with static images.  
## Raster Display 

- A raster display is a type of screen or display system that renders images by illuminating pixels on a grid of individual points or dots, usually in a rectangular matrix.  
- This grid is composed of rows and columns, where each point on the grid, or pixel, can be individually controlled to display a specific color or brightness level.  
- Frame buffer is a memory area in which picture in the form of pixel is stored.

*Characteristics*
**Pixel-Based:** The image is composed of thousands or millions of individual pixels. The quality of the image depends on the resolution, which is defined by the number of pixels in the grid.  

A 512 × 512 i.e. $2^9$ × $2^9$ , elements square raster require $2^{18}$ or 262144 memory bits in single bit plane

**Scan Lines:** The display refreshes the image by scanning the pixels row by row, from top to bottom. This is known as a raster scan.   

>[!Note]- Scan lines 
> The screen is scanned from left to right, top to bottom all the time to generate graphics
> ![[Pasted image 20240823162106.png]]

**Color Depth:** Each pixel can display a range of colors depending on the color depth, which is determined by the number of bits used to represent the color of a pixel.  

**Common in Screens:** Raster displays are the most common type of display used in devices such as televisions, computer monitors, and smartphones

Resolution and Refresh Rate: The resolution defines how many pixels the display can show horizontally and vertically. The refresh rate indicates how often the image is updated per second.  
- Screen must be refreshed or redrawn minimum 30 to 60 times per second (30 to 60Hz) to maintain flicker free image

**Information transfer from Frame buffer to CRT**  
The picture is built up in the frame buffer one bit at a time (either 0 or 1) causing black or white (monochrome) display.

>[!Note]- Information transfer from Frame buffer to CRT 
>![[Pasted image 20240823163412.png]]

N Bit plane frame buffer for (Monochrome Displays) Intensity level between 0 (dark) and 2N – 1 (full intensity)

>[!Note]- N Bit plane frame buffer 
>![[Pasted image 20240823170611.png]]

Increasing number of Intensity with Lookup Table Lookup tables contains 2N entries for N bit planes and with W width. Each entry will now have 2W values  

>[!Note]- With Lookup Table 
>![[Pasted image 20240823171030.png]] 

### Color Raster Display 

Color frame buffer contains three bit planes for each primary color i.e. red (R), green (G) and blue (B)  

Each bit plane drives an individual color gun for each of the primary color used in color video  

Table on the right plane shows a sample color table  

Figure in the next slide demonstrates Simple Color Frame Buffer

>[!Note]- Raster Display 
>![[Pasted image 20240823174153.png]]

### Color Frame Buffer with Lookup Table 

(Increases number of shades of each color  $(2^8)^3 = 2^{24} = 16,777,216$ possible colors )

## Supporting Discipline 
- Computer science (algorithms, data structures, software engineering, ...)  
- Mathematics (geometry, numerical, matrices...)  
- Physics (Optics, mechanics, ...)  
- Psychology (Colour, perception)  
- Art and design
### Exercise 

Compute the following: 

 1. Size of 800 x 600 image at 240 pixels per inch 

$$\text{Get the width and height in inches}$$
$$\begin{align*}Width &= Width \;in \; pixels / PPI \\ Height &= Height\; in\; pixels / PPI\\\\Width &= 800 / 240 = 3.33333\\Height &= 600/240 =2.5\end{align*}$$

 2. Resolution of 2 x 2 inch image that has 512 x 512 pixels 

$$\text{PPI = Number of pixels / Image size in inches}$$

$$\begin{align}PPI &= \frac{512\; pixels }{ 2 \;inches }\\ PPI & =256\end{align}$$

 3. Height of the resized image 1024 x 768 to one that is 640 pixels wide with the same aspect ratio 

$$\begin{align}Aspect \; Ratio &= \frac{width}{height} = \frac{768px}{1024px} = \frac{3}{4}px\\\frac{3}{4} &= \frac{New \;Height}{New\;Width}\\\\New \; Width &= 640 px \\ \frac{3}{4} &= \frac{640}{New \; Height} \\New \; Height& = 640 * \frac{3}{4} = 480\end{align}$$
 4. Width of an image having height of 5 inches ad aspect ratio 1.5 
$$\begin{align}Aspect \; Ratio &= \frac{width}{height}\\Width &= Height\;*\;Aspect\; Ratio\\Width &= 5 \; inches * 1.5 \\Width & = 7.5 \;inches\end{align}$$


5. Find the number of colors a frame buffer of 8 bit planes each of red, green, and blue, and 10 bit wide lookup table can produce. 

$$\begin{align*}2^{8 \; bits}&=256 \\ 256 \; Red \; * 256  \; Green \; * \; 256 \; Blue &= 16,777,216 \\ \text{This is also called 24 - bit color}\end{align*}$$

6. Find the amount of memory required by an 8 plane frame buffer each of red, green and blue, having 1024 x 768 resolution.

$$\begin{align}8 \; bits \;  (red) + 8 \; bits  
\;(green) + 8 \; bits \; (blue)&= 24 \; bits\\(Resolution) \; 1024 * 768 &=786,432 \; pixels \\ Memory \; required  &= Resolution * Number \; of \; bits\\786,432 \;
pixels * 24 \; bits/pixels &= 18,874,368 \; bits\end{align}$$

7. Find the refresh rate of a 512 x 512 frame buffer, if the access time for each pixel is 200 nanoseconds (ns).

$$\begin{align}512*512 &= 262,144 \; pixels\\262,144 \;pixels * 200 \;ns/pixels& = 52,428,800 \; ns\\\text{Convert nanoseconds to seconds} \\ \frac{52,428,800 ns}{ 10^9 ns/second}& =  
0.0524288 seconds \\Refresh \; Rate &= \frac{1}{0.0524288 seconds}\\& = approx \; 19.07 Hz\end{align}$$
## Basic principles of 2-Dimensonial Graphics 

### Raster vs Vector Graphics 
**VECTOR GRAPHICS** is a representation by basic geometric objects (lines, circles, ellipses, cubic curves, …)

**RASTER GRAPHICS** is a representation in the form of pixel matrix.

#### RASTER GRAPHICS RASTER GRAPHICS FOR CATHODE RAY TUBE 
- The video controller reads the images buffer (row-wise from left to right and from right to left).
- At each pixel, the intensity of the ray is chosen according to the entry in the image buffer. 
- 60Hz refresh rate without flickering effects

#### VECTOR GRAPHICS 
- Scalable 
- Requires computations for display on a pixel-oriented medium (scan conversion) 
- Scan conversion can lead to ALIASING EFFECTS (such as jagged edges) which occur in general when a discrete sampling rate is used to measure a continuous signal.

>[!Note]- Raster Graphics & Scaling 
>![[Pasted image 20240918214541.png]]

>[!Note]- Raster as a Grid 
>![[Pasted image 20240918214604.png]]


### GETTING STARTED with JAVA 2D 
- AWT (Abstract Windowing Toolkit) components displayed on the screen have a paint () method with Graphics objects as argument.
- The class Graphics2D within Java 2D extends the class Graphics. 
- In order to exploit the options of java 2D, the Graphics object must be casted into a Graphics2D object within the paint () method.

**WINDOW COORDINATES** 
- Coordinates in the upper left corner is (0, 0). • Extension of the window to the right (here 400 pixels) and downwards (here 100 pixels). 
- The y-axis points downwards. • It is not possible to draw on the margins of the window

### BASIC GEOMETRIC OBJECTS 
- **POINTS used for the definition** of the other objects (i.e. a line connecting two points). 
- **LINES, POLYLINES or CURVES** can be defined by two or more points. 
- **AREAS** are usually bounded by CLOSED POLYLINES or POLYGONS. Areas can be filled with color or a texture.

### BASIC GEOMETRIC OBJECTS 
- **LINE (SEGMENT)** is a connecting line between two points. 
- **POLYLINE** is a sequence of line where the following line starts where the previous one ends. 
- **POLYGON, CLOSED POLYLINE** is the last line segment of a polyline ends where the first line segment started.

#### POLYGONS IMPORTANT ADDITIONAL PROPERTIES OF POLYGONS: 
- NON – SELF-OVERLAPPING 
- CONVEXITY

#### PARAMETRIC 
- CURVES QUADRATIC CURVES has 2 end points and 1 control point. 
- CUBIC CURVES has 2 endpoints and 2 control points.

### GEOMETRIC OBJECTS IN JAVA 2D 
- The abstract class Shape with its various subclasses allows the construction of various two-dimensional geometric objects. 
- Vector graphics is used to define Shape objects, whose real-valued coordinates can either be give as float or double-values.
- Shapes will not be drawn until the draw or the fill method is called with the corresponding Shape as argument in the form graphics2d.draw (shape) or graphics2d.fill (shape), respectively.
- The abstract class Point2D is NOT a subclass of Shape. 
- Points cannot be drawn in Java. 
- They are only supposed to be used for the description of other objects. 
- Subclass of Point2D: Point2D.Float and Point2D.Double.

>[!Note]- Parametric Curves
>![[Pasted image 20240918214958.png]]
## Subclasses of shape 

**GENERAL PATH is a sequences of lines, quadratic and cubic curves**

```java
GeneralPath gp = new GeneralPath();
gp.moveTo(50,50)//Initial point
//gp.lineTo(Initiial point, Termial point);
gp.lineTo(50,200); //Create a line 
gp.quadTo(150,500,250,200);
//gp.quadTo(control x, control y, (Terminal point x,y))
// The line earlier is the initial point
gp.curveTo(350,100,150,150,100,100);
gp.lineTo(50,50);//To close the shape
```

### Subclasses of shape 
A GeneralPath must always start with the method moveTo, defining the starting point of the genral path.

LineTo appends a line, starting from the (previous) last point of the GeneralPath to the specified enpoint 

quadTo and curveTo append a quadratic and cubic curve, respectively, starting from the (previous) last point of the General Path connecting to the specified endpoint using the given control point.

### Definition of Areas 
- Polygons or closed sequences of curves 
- Elementary geometric objects like circles, ellipses (axels-parallel) rectangles
- Modifying the shape of elementary geometric objects by geometric transformations. 
- Application of self-theoretic 

![[Pasted image 20240912113121.png]]


## The Output Primitives 

### Image Representation
- Square image data description
- Pixel Position and Numbering 

### Straight Line 
**Criterion**
	- Line should appear straight
	- Line should terminate accurately
	- Line should have constant density
	- Line density should be independent of length and angle 
	- Line should be drawn rapidly
	-

### Differential Digital Analyzer (DDA)


