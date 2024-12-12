### Geometric Transformation
- suitable to model moving objects 
**Scaling** - Stretching or shrinking of objects in the direction of the x-axis or y-axis
**Rotation** - Rotating the object depending on the rotation angle 
**Shearing** - Causes the deformation of objects
**Translation** - Shifts the object

The **stepwise changes** between two images must be **small enough** and the **time between two images** in a sequence must be **short enough**.


### How to animate 
- Once the movement is modelled by suitable geometric transformations:
	- The object must be drawn 
	- The transformed object has to be computed
	- The old object must be deleted/whiteout 
	- And the new transformed object has to be drawn again
- Deleting objects causes problems with raster graphics
- Instead of overwriting single moving objects, it is common to write the complete buffer again instead of modifying the old one 
- **Double buffering** - The new image is written to a virtual buffer which will be copied to the window buffer after the image is completed 

### Strategies on Handling Composed movements 

**Tracking** - track the position of the corresponding object or components
**Accumulation** - Leave the objects in their initial positions to compute for the accumulated geometric transformation which are applied to the objects 

## Fundamentals of 3D Graphics
- 3D virtual objects and scenarios need to be defined and stored in the computer
- Geometric objects like rectangles, circles, or polygons must be specified before they are drawn
- A three-dimensional world can contain much more than what is displayed
- Must contain information about geometry
- Usually for fantasy worlds in computer games, they do not exist in real life In these cases, the designer or programmer of the virtual world needs methods for constructing and modelling 3D virtual objects.
- Even if existing objects are to be modelled, construction and modelling techniques are still necessary. (e.g. information that is given is not enough)

### Some Detailed measurements
- 3D Laser Scanners provide detailed information about an object’s surface geometry. However, they are usually processed further with manual corrections.
- Another example are X-Rays, Ultrasonic and Tomography techniques provide information about skeletal and tissue structures from which 3D models of bones and organs can be derived

### Considerations on Modelling a virtual world 
- The first step is to design a virtual world either manually or automatically from derived measurements
- To represent a part of the virtual world, the viewer’s position and direction of view in the virtual world must be defined.
- The first step is to design a virtual world either manually or automatically from derived measurements
- To represent a part of the virtual world, the viewer’s position and direction of view in the virtual world must be defined. Field of View? Viewing Angle? Distance?
- The sources of light as well as their characteristics must be defined.
- Determining which objects are visible and hidden

### What Kind of Objects are Considered in Graphics? 
- In principle, any subset of space $R^3$ could be seen as a three-dimensional object. However, this means that even points, edges, or planes are considered as 3D
- For the purpose of showing a 3D object, its surface is of importance and not the set of points that are occupied by the object
- In certain applications, no explicit definition of the surface of the object exists. In such cases, it is very common that the object is first described as a set of points and then the surface is derived from this set

### Dealing with complex shapes 
- For complex shapes like round and bent shapes, there are various sophisticated techniques. However, these models are usually not taken directly for the generation of an image in a scene.
- Instead, surfaces are usually approximated by a larger number of polygons, triangles in most cases, in order to simplify computations for illumination and projection
- For arbitrary surfaces, it might be even impossible to find an analytical expression for the representation of the projection. Efficient and fast computation would become impossible as opposed to using polygons.
- The approximation of a curved surface by polygons is called tesselation. Using only triangles is no real restriction since any polygon can be partitioned into triangles

### Orientation of Triangles and Polygons
- Single triangles or polygons for modelling a surface are usually oriented in order to determine which side of the polygon is outside of the surface.
- The orientation is given by the order of the polygon’s vertices. The vertices are listed in counterclockwise order when looking onto the surface from the outside of an object
- Orientation speeds up rendering since it can ignore surfaces the do not point to the viewer

### Voxels: 3D building blocks 
- It is a very simple technique for modelling 3D objects. The 3D space is partitioned into a grid of small, equisized cubes. It is a counterpart of a 2D grid.
- A three-dimensional object is defined by those voxels that lie within the interior of the object.
- The computational costs in terms of memory and time for handling voxel models can be enormous. If 2D objects can be as big as 100 x 100, 10,000 pixels are needed. Then 3D objects can be as huge as 100 x 100 x 100 = 10^6 voxels are needed
- They are suitable for modelling objects based on tomography data, which provide information about the tissue density inside the measured body or object

| Advantages                                                                                                         | Disadvantages                                                                                             |
| ------------------------------------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------- |
| Voxels are a more “accurate” 3D building block than any other modeling type, as they mimic particles               | Without using prohibitively expensive techniques, it is much harder to build complex objects using voxels |
| Voxels are the quickest way to quickly model and visualize volumetric data (especially natural/organic formations) | Current computer hardware is optimized for rendering polygons                                             |

## Introduction to Multimedia

### Multimedia Technology 
- The word multimedia comes from the word `multus` which means `numerous` and `media` which means `middle` or `center`.
- **Multimedia** - Combination of: 
	- Text
	- Video and Animation 
	- Images and Graphics 
	- Sound 

### Applications 

**Home Entertainment** - Includes computer based games for kids, interactive encyclopedia, etc. Computer games are one of the best application of multimedia

**Educational Purposes** - The multisensory perceptions of these study materials are expected to provide a good grasp of the subject matter and interactivity elements for better retention

**Industrial Training** - These applications involve computer based training (CBT) for employee both technical and marketing.

**Information Kisok** - These are devices where information is accessed through a touch screen and viewed on a monitor. These include multilingual product catalog for placing orders

**Corporate Presentation** - Corporate presentations are emphasizing the salient features and activities of a company, its products, business partners like suppliers and retailers, etc.

**Business** - Items like glass utensils are difficult to stock; industrial equipment can be displayed to perspectives buyers by company sales people

**Tourism and Travel** - Travel companies can market packaged tools by showing prospective customers, glimpses of the places they would like to visit, etc.

**e-Shopping** - Like the travel industry, customized presentations for consumer and industrial products can be created and distributed to prospective customers.

### Multimedia Technology: Text

In multimedia presentations, text can be combined with other media in a powerful way to present information and express moods. Text can be of various types: 

- **Plain Text:** Consisting of fixed sized characters having essentially the same type of appearance. 
- **Formatted Text:** Where appearance of the text can be varied and manipulated using font parameters 
- **Hypertext:** Can serve to link different electronic documents and enable the user to jump from one to the other in a non-linear way.

Internally text is represented via binary codes as per the ASCII Table or the American Standard Code for Information Interchange. An improved called the Unicode standard is capable of representing international characters from various languages throughout the world.


### Unicode Standards 
- Some of the languages and their corresponding codes are: Latin (00), Greek (03), Arabic (06), Devanagari/Bengali (09), Oriya/Tamil (0B), etc. Several methods have been suggested to implement Unicode based on variations in storage space and compatibility Unicode Standards 
- The mapping methods are called Unicode Transformation Formats (UTF) and Universal Character Set (UCS). Some of the major mapping methods are: 
	- **UCS-4, UTF-32**: Uses 32-bit for each character. It is not efficient for space and memory. 
	- **UTF-16**: Uses 16-bit for each character 
	- **UTF-8**: Divided characters into 8-bit numbers

### Text Compression: Huffman Coding 
- Large text documents covering a number of pages may take a lot of disk space. We can apply compression algorithms to reduce the size of the text file during storage. A reverse algorithm must be applied to decompress the file before its contents can be displayed on screen.
- This type of coding is intended for applications in which the text to be compressed has known characteristics in terms of the characters used and their relative frequencies of occurrences. An optimum set of variable-length code words is derived such that the shortest code word is used to represent the most frequently occurring characters.

### Text Compression: Lempel-Ziv Coding

- Large text documents covering a number of pages may take a lot of disk space. We can apply compression algorithms to reduce the size of the text file during storage. A reverse algorithm must be applied to decompress the file before its contents can be displayed on screen. 
- Lempel-Ziv Coding Instead of using a single character as a basis of the coding operation, a string of characters is used. For example, a table containing all the possible words that occur in a text document, is held by both the encoder and decoder.