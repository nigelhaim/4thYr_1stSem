### Size:
$Width_{\;inches} = \frac{Width_{\;pixels}}{PPI}$
$Height_{ inches}  = \frac{Height_{ pixels}}{PPI}$

### PPI: 
$PPI = \frac{\text{Num of pixels}}{\text{Img size}_{ inches}}$

### Aspect Ratio 

$Aspect\;Ratio = \frac{width}{height}$
**Can be varied depending on the orientation or what number is larger is the denominator**
$New\;Width = Aspect\;Ratio \; x \; New \; Height$
$New \; Height  = Aspect\;Ratio\;x\;New\;Width$

### Number of possible colors and shades 

$\text{Num of bit color} = 2^{\text{Num of bits }*\text{ Num of colors}}$

### Resolution 

$\begin{align*}\text{Num of bits} &=2^{\text{Num of bits }*\text{ Num of color}}\\ \text{Num of Pixel}  &= (Resolution)\;Width \; * \; Height\\ Memory \; Required &= Resolution \; * \; \text{Num of bits} \end{align*}$


### Refresh Rate

$$\begin{align*}Num \; of \; Pixel &= (Resolution) \; Width \; * \; Height \\ Nanoseconds &= Resolution * Num \; of \frac{nanosecond}{pixel} \\ Seconds &=  \frac{nanoseconds}{10^9\frac{ns}{second}} \\ Refresh \; Rate &= \frac{1}{Seconds} \end{align*}$$

### Ellipse Standard equation

$\frac{(x-h)^2}{a^2}+\frac{(y-k)}{b^2}=1$

$\begin{align*}C &= (h,k)\\ a&= Width \\ b &= Height\end{align*}$

>[!Note]
>![[Pasted image 20240905184920.png]]

### Circle 

$(x-h)^2+(y-k)^2=r^2$
$C = (h,k)$
$r= radius$
>[!Note]-
>![[Pasted image 20240905185031.png]]
## Java

```Java
package javaapplication1;
import java.awt.*;
import java.awt.geom.*;
public class String_and_graphics_2d extends Frame{

    public void paint(Graphics g){
        //Create the canvas and put the heading title
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(7.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Serif", Font.BOLD, 24));
        g2d.drawString("Welcome 4CSC in Graphics using Java", 50, 75);

        Line2D.Double l1 = new Line2D.Double(75, 120, 250, 350);
        g2d.draw(l1);

        QuadCurve2D.Double q1 = new QuadCurve2D.Double(75, 120, 150, 400, 250, 350);
        g2d.setPaint(Color.pink);
        g2d.draw(q1);
        
        CubicCurve2D.Double c1 = new CubicCurve2D.Double(75, 120, 120, 20, 300, 200, 250, 350);
        g2d.setPaint(Color.orange);
        g2d.draw(c1);

        Rectangle2D.Double r1 = new Rectangle2D.Double(250, 100, 300, 175);
        g2d.setPaint(Color.green);
        g2d.draw(r1);
        g2d.setPaint(Color.red);
        g2d.fill(r1);

        Ellipse2D.Double e1 = new Ellipse2D.Double(300, 150, 350, 225);
        g2d.setPaint(Color.yellow);
        g2d.draw(e1);

        Arc2D.Double a1 = new Arc2D.Double(r1, 30, 70, Arc2D.PIE);
        g2d.setPaint(Color.magenta);
        g2d.draw(a1);

        Arc2D.Double a2 = new Arc2D.Double(r1, 120, 60, Arc2D.CHORD);
        g2d.setPaint(Color.white);
        g2d.draw(a2);

        Arc2D.Double a3 = new Arc2D.Double(r1, 190, 70, Arc2D.OPEN);
        g2d.setPaint(Color.blue);
        g2d.draw(a3);    
        
        Ellipse2D.Double c2 = new Ellipse2D.Double(300, 300, 300, 300);
        g2d.setPaint(Color.lightGray);
        g2d.draw(c2);
    }

    public static void main(String[] args) {
    
        String_and_graphics_2d s = new String_and_graphics_2d();
        s.setTitle("String and Graphics 2D in Java");
        s.setBackground(Color.black);
        s.setSize(900, 900);
        s.setForeground(Color.cyan);
        s.setVisible(true);
    }
}
```

### Line

```Java
Line2D.Double line1 = new Line2D.Double(double x1, double y1, double x2, double y2);
```

Parameters:

| Modifier and Type | Field and Description                                                  |
| ----------------- | ---------------------------------------------------------------------- |
| `double`          | **x1**<br>The X coordinate of the start point of the line segment.     |
| `double`          | **x2**<br>The X coordinate of the end point of the line segment.       |
| `double`          | **y1**<br><br>The Y coordinate of the start point of the line segment. |
| `double`          | **y2**<br><br>The Y coordinate of the end point of the line segment.   |

### Quad Curve

```Java
QuadCurve2D.Double quadcurve1 = new QuadCurve2D.Double(double x1, double y1, double ctrlx, double ctrly, double x2, double y2);

// QuadCurve2D(first endpoint x,y, cp, second endpoint x,y)
```

| Modifier and Type | Field and Description                                                               |
| ----------------- | ----------------------------------------------------------------------------------- |
| `double`          | **ctrl x**<br>The X coordinate of the control point of the quadratic curve segment. |
| `double`          | **ctrl y**<br>The Y coordinate of the control point of the quadratic curve segment. |
| `double`          | **x1**<br>The X coordinate of the start point of the quadratic curve segment.       |
| `double`          | **x2**<br>The X coordinate of the end point of the quadratic curve segment.         |
| `double`          | **y1**<br>The Y coordinate of the start point of the quadratic curve segment.       |
| `double`          | **y2**<br>The Y coordinate of the end point of the quadratic curve segment.         |

### Cubic Curve 

```Java
new CubicCurve2D.Double(double x1, double y1, double ctrlx, double ctrly, double x2, double y2);
// CubicCurve2D(terminal point, control point, control point, terminal point)
```


| Modifier and Type | Field and Description                                                                   |
| ----------------- | --------------------------------------------------------------------------------------- |
| `double`          | **ctrl x**<br><br>The X coordinate of the control point of the quadratic curve segment. |
| `double`          | **ctrl y**<br><br>The Y coordinate of the control point of the quadratic curve segment. |
| `double`          | **x1**<br><br>The X coordinate of the start point of the quadratic curve segment.       |
| `double`          | **x2**<br><br>The X coordinate of the end point of the quadratic curve segment.         |
| `double`          | **y1**<br><br>The Y coordinate of the start point of the quadratic curve segment.       |
| `double`          | **y2**<br><br>The Y coordinate of the end point of the quadratic curve segment.         |

### Rectangle 

```Java
Rectangle2D.Double rect1 = new Rectangle2D.Double(double x, double y, double w, double h); 
// Rectangle(x, y, width, height)
```

| Modifier and Type | Field and Description                                |
| ----------------- | ---------------------------------------------------- |
| `double`          | **height**<br><br>The height of this `Rectangle2D`.  |
| `double`          | **width**<br><br>The width of this `Rectangle2D`.    |
| `double`          | **x**<br><br>The X coordinate of this `Rectangle2D`. |
| `double`          | **y**<br><br>The Y coordinate of this `Rectangle2D`. |
### Ellipse

```Java
Ellipse2D.Double elli1 = new Ellipse2D.Double(double x, double y, double w, double h); 
// (x, y, width, height)
```

| Modifier and Type | Field and Description                                                                            |
| ----------------- | ------------------------------------------------------------------------------------------------ |
| `double`          | **height**<br>The overall height of the `Ellipse2D`.                                             |
| `double`          | **width**<br>The overall width of this `Ellipse2D`.                                              |
| `double`          | **x**<br>The X coordinate of the upper-left corner of the framing rectangle of this `Ellipse2D`. |
| `double`          | **y**<br>The Y coordinate of the upper-left corner of the framing rectangle of this `Ellipse2D`. |

#### Example 
```Java
// Draw the ellipse whose center located at (250,300) with major axis (width) parallel to x-axis whose length is 250 and minor axis (height) whose length is equal to 200 

// moving to left or right from the center (to get the x = h minus the given half of the length of the major axis 

// formula: 
// x = h - a with 2a = 250 -> implying the given x is given to h = 250 - 125 = 125 (location of top left x) 
// width (parallel to x) = 2a = 250 
// y = k - b with 2b = 200 -> y = 300 - 100 = 200 (referring to the location and not to the length) 
// (k = y coordinate of the circle) (b = kalahati ng 200 (length of the minor axis)) 
// height (parallel to y) = 2b = 200 
Ellipse2D.Double elli1 = new Ellipse2D.Double(125, 200, 250, 200);
```



### Circle 

```Java
Ellipse2D.Double elli1 = new Ellipse2D.Double(double x, double y, double w, double h); 
// (x, y, width, height)
```

| Modifier and Type | Field and Description                                                                            |
| ----------------- | ------------------------------------------------------------------------------------------------ |
| `double`          | **height**<br>The overall height of the `Ellipse2D`.                                             |
| `double`          | **width**<br>The overall width of this `Ellipse2D`.                                              |
| `double`          | **x**<br>The X coordinate of the upper-left corner of the framing rectangle of this `Ellipse2D`. |
| `double`          | **y**<br>The Y coordinate of the upper-left corner of the framing rectangle of this `Ellipse2D`. |

#### Example 
```Java
// Draw the Circle whose general equation is (x - 200)^2 + (y - 300)^2 = 15625 

// Determine the center = C(200, 300), radius r = 125 (sqrt ng 15625) // formulafor x: 

// x = h - r = 200 - 125 = 75 (top left x coordinate) 
// (to get x or y: subtract the given h by the r (r = 125)) // length = width = 2r= 250 

// formula for y: 
		// y = (center) k - r = 300 - 125 = 175 
Ellipse2D.Double circle1 = newEllipse2D.Double(75,175, 250,250); 

```


### Arcs

```Java
Arc2D.Double arc_pie = new Arc2D.Double(double x, double y, double w, double h, double start, double extent, int type);
Arc2D.Double arc_pie = new Arc2D.Double(Rectangle2D rectangleBounds, double start, double extent, int type);
```

**Types**
- Arc2D.OPEN
- Arc2D.CHORD
- Arc2D.PIE.

>[!Note]- Arc Types
>![[Pasted image 20240905213713.png]]

>[!Note]- Control point
>![[Pasted image 20240906163322.png]]

| Modifier and Type | Field and Description                                                                                                                  |
| ----------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `double`          | **extent**<br><br>The angular extent of the arc in degrees.                                                                            |
| `double`          | **height**<br><br>The overall height of the full ellipse of which this arc is a partial section (not considering the angular extents). |
| `double`          | **start**<br><br>The starting angle of the arc in degrees.                                                                             |
| `double`          | **width**<br><br>The overall width of the full ellipse of which this arc is a partial section (not considering the angular extents).   |
| `double`          | **x**<br><br>The X coordinate of the upper-left corner of the framing rectangle of the arc.                                            |
| `double`          | **y**<br><br>The Y coordinate of the upper-left corner of the framing rectangle of the arc.                                            |
|                   |                                                                                                                                        |

>[!Note]- Making of Bouns using rectangle
>![[Pasted image 20240905212649.png]]



## Python 

**(0,0) is form the top left**

### Line 
```python
ImageDraw.line(xy_, fill=None, width=0, joint=None)
```

**PARAMETERS:**

**xy** – Sequence of either 2-tuples like `[(x, y), (x, y), ...]` or numeric values like `[x, y, x, y, ...]`.
**fill** – Color to use for the line.
**width** –The line width, in pixels.
### Arc 

```python
PIL.ImageDraw.Draw.ellipse(xy, fill=None, outline=None)
```

**PARAMETERS:**
 **xy** – Two points to define the bounding box. Sequence of `[(x0, y0), (x1, y1)]` or `[x0, y0, x1, y1]`, where `x1 >= x0` and `y1 >= y0`.
**start** – Starting angle, in degrees. Angles are measured from 3 o’clock, increasing clockwise.
**end** – Ending angle, in degrees.
**fill** – Color to use for the arc.
**width** –The line width, in pixels.


### Rectangle 

```python
ImageDraw.rectangle(xy, fill=None, outline=None, width=1)
```


**PARAMETERS:**
**xy** – Two points to define the bounding box. Sequence of either `[(x0, y0), (x1, y1)]` or `[x0, y0, x1, y1]`, where `x1 >= x0` and `y1 >= y0`. The bounding box is inclusive of both endpoints.
**fill** – Color to use for the fill.
**outline** – Color to use for the outline.
**width** – The line width, in pixels.

### Circle 

```python
ImageDraw.circle(xy, radius, fill=None, outline=None, width=1)
```

**PARAMETERS:**

**xy** – The point for the center of the circle, e.g. `(x, y)`.
**radius** – Radius of the circle.
**outline** – Color to use for the outline.
**fill** – Color to use for the fill.
**width** – The line width, in pixels.

### Ellipse 

```python
ImageDraw.ellipse(xy, fill=None, outline=None, width=1)
```


**PARAMETERS:**

**xy** – Two points to define the bounding box. Sequence of either `[(x0, y0), (x1, y1)]` or `[x0, y0, x1, y1]`, where `x1 >= x0` and `y1 >= y0`.
**outline** – Color to use for the outline.
**fill** – Color to use for the fill.
**width** –The line width, in pixels.

## Gen Path (Java)

```java
package javaapplication1;

import java.awt.*;

import java.awt.geom.*;

  

public class genpath_java extends Frame {    

    public void paint(Graphics g){    

        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(10.0f);
        g2d.setStroke(bs);


        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(50,50);
        gp1.lineTo(50,200); 
        gp1.quadTo(150,500,250,200); 
        gp1.curveTo(350,100,150,150,100,100); 
        gp1.lineTo(50,50); 

  

        g2d.setPaint(Color.RED);
        g2d.draw(gp1);
        g2d.setPaint(Color.YELLOW);
        g2d.fill(gp1);

  

    public static void main(String[] args){

        genpath_java gp = new genpath_java();
        gp.setTitle("General Path in Java");
        gp.setBackground(Color.GRAY);
        gp.setSize(1000, 1000);
        gp.setForeground(Color.GREEN);
        gp.setVisible(true);
    }
}
```

### moveTo

```java
gp1.MoveTo(double x, double y)
```

| Type           | Property | Description                         |
| -------------- | -------- | ----------------------------------- |
| DoubleProperty | x<br>    | Defines the specified X coordinate. |
| DoubleProperty | y<br>    | Defines the specified Y coordinate. |


### lineTo

```java
gp1.LineTo​(double x, double y)
```

| Type           | Property | Description               |
| -------------- | -------- | ------------------------- |
| DoubleProperty | x        | Defines the X coordinate. |
| DoubleProperty | y        | Defines the Y coordinate. |

### quadTo 

```java
gp1.quadTo(double x1, double y1, double x2, double y2)
```

| Type   | Property | Description                                     |
| ------ | -------- | ----------------------------------------------- |
| double | x1       | the X coordinate of the quadratic control point |
| double | y1       | the Y coordinate of the quadratic control point |
| double | x2       | the X coordinate of the final end point         |
| double | y2       | the Y coordinate of the final end point         |

### curveTo

```java
gp1.curveTo(double x1, double y1, double x2, double y2, double x3, double y3)
```

| Type   | Property | Description                                      |
| ------ | -------- | ------------------------------------------------ |
| double | x1       | the X coordinate of the first Bézier control point |
| double | y1       | the Y coordinate of the first Bézier control point |
| double | x2       | the X coordinate of the second Bézier control point |
| double | y2       | the Y coordinate of the second Bézier control point |
| double | x3       | the X coordinate of the final end point            |
| double | y3       | the Y coordinate of the final end point            |


### Area (Java)

```java
package javaapplication1;
import java.awt.*;
import java.awt.geom.*;

public class SetOperations extends Frame {

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(7.0f);
        g2d.setStroke(bs);
        
        Ellipse2D.Double e1 = new Ellipse2D.Double(40, 40, 300, 200);
        Ellipse2D.Double circ = new Ellipse2D.Double(80, 100, 200, 200);
        Rectangle2D.Double rect = new Rectangle2D.Double(230, 100, 200, 300);
        Rectangle2D.Double sq = new Rectangle2D.Double(200, 150, 200, 200);
        
        g2d.draw(e1);
        g2d.draw(circ);
        g2d.draw(rect);
        g2d.draw(sq);

        Area e = new Area(e1);
        Area c = new Area(circ);
        Area r = new Area(rect);
        Area s = new Area(sq);

        g2d.setPaint(Color.yellow);
        
        e.add(r);
        g2d.fill(e); 
        
        c.intersect(s);
        g2d.fill(c);
        
        c.subtract(s);
        g2d.fill(c);

        r.exclusiveOr(s);
        g2d.fill(r);

    }

  

    public static void main(String[] args) {
        SetOperations s = new SetOperations();
        s.setTitle("String and Graphics 2D in Java");
        s.setBackground(Color.BLACK);
        s.setSize(1000, 1000);
        s.setForeground(Color.WHITE);
        s.setVisible(true);
    }
}
```

### Area 

```java 
Area a = new Area(Shape s);
```


### Add

Adds the shape of the specified `Area` to the shape of this `Area`. The resulting shape of this `Area` will include the union of both shapes, or all areas that were contained in either this or the specified `Area`.

```java
public void add(Area rhs)
```

```java
// Example:
Area a1 = new Area([triangle 0,0 => 8,0 => 0,8]);
Area a2 = new Area([triangle 0,0 => 8,0 => 8,8]);
a1.add(a2);

a1(before)     +         a2         =     a1(after)

 ################     ################     ################
 ##############         ##############     ################
 ############             ############     ################
 ##########                 ##########     ################
 ########                     ########     ################
 ######                         ######     ######    ######
 ####                             ####     ####        ####
 ##                                 ##     ##            ##
```


### Subtract

```java
public void subtract(Area rhs)
```

Subtracts the shape of the specified `Area` from the shape of this `Area`. The resulting shape of this `Area` will include areas that were contained only in this `Area` and not in the specified `Area`.

```java
 // Example:
 Area a1 = new Area([triangle 0,0 => 8,0 => 0,8]);
 Area a2 = new Area([triangle 0,0 => 8,0 => 8,8]);
 a1.subtract(a2);

	a1(before)     -         a2         =     a1(after)

 ################     ################
 ##############         ##############     ##
 ############             ############     ####
 ##########                 ##########     ######
 ########                     ########     ########
 ######                         ######     ######
 ####                             ####     ####
 ##                                 ##     ##
```

### Intersect 

```java
public void intersect(Area rhs)
```
Sets the shape of this `Area` to the intersection of its current shape and the shape of the specified `Area`. The resulting shape of this `Area` will include only areas that were contained in both this `Area` and also in the specified `Area`.

```java
 // Example:
 Area a1 = new Area([triangle 0,0 => 8,0 => 0,8]);
 Area a2 = new Area([triangle 0,0 => 8,0 => 8,8]);
 a1.intersect(a2);

  a1(before)   intersect     a2         =     a1(after)

 ################     ################     ################
 ##############         ##############       ############
 ############             ############         ########
 ##########                 ##########           ####
 ########                     ########
 ######                         ######
 ####                             ####
 ##                                 ##
```

### Exclusive Or

Sets the shape of this `Area` to be the combined area of its current shape and the shape of the specified `Area`, minus their intersection. The resulting shape of this `Area` will include only areas that were contained in either this `Area` or in the specified `Area`, but not in both.

```java
public void exclusiveOr(Area rhs)
```

```java
 // Example:
 Area a1 = new Area([triangle 0,0 => 8,0 => 0,8]);
 Area a2 = new Area([triangle 0,0 => 8,0 => 8,8]);
 a1.exclusiveOr(a2);

	a1(before)    xor        a2         =     a1(after)

 ################     ################
 ##############         ##############     ##            ##
 ############             ############     ####        ####
 ##########                 ##########     ######    ######
 ########                     ########     ################
 ######                         ######     ######    ######
 ####                             ####     ####        ####
 ##                                 ##     ##            ##
```
