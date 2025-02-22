
## Summative assessment 1

1. Based on the given application fields, identify existing software that is now being used, Give at least one for each field. Describe shortly the identified software. 
	1. Operating systems provide a much more easer interface to interact iwth computers. It provides a more efficient workflow.
	2. Arts and advertising - Photoshop - photoshop is the widest photo editing platform in the current market. 
	3. Visualizations - seaborn - commonly used by data scientists to visualize predictions along with their truth values and futher understanding the data. 
	4. Reconstructing 3d - python nibabel - Used to read and write 3d Neuro MRI images for programmers and radiologists from .gz file 
	5. CAD/CAM - Autocad - the biggest platform for engineers and architects 
	6. Simulation and animation - Flight simulator 3d - Used to simulate how aircrafts work and how do they function. It also provides the physics on how airplanes react. 
	7. Interactive TV - SM interactive map - Used by mall goers to easily navigate throughout the mall. 
	8. Virtual Reality - Minecraft - An award winning creative game that is a world made of blocks and pixels. 
	9. Augmented reality - Snapchat - a common app that is used mainly for filters and other virtual cosmetics to make images more fun and creative. 
2. Assume you want to develop application software in monitoring stock market. Give a particular scenario where in the computer graphics will show the trend of the monitored stock market. 
	1. In the opening, closing or during the trading hours, stock traders tend to look at the prices or trends of the market through Line, bar, or candle stick graphs based on their trading style. These graphs also illustrates how volatile the stock and its price action based on the given time frame. They can also generate or plot patterns to help them read on the next price of the stock. 

1. Find the amount of memory required by a 3 plane frame buffer of red, green and blue of 800 x 600 screen resolution. 
$$\begin{align}Total \;pixels&=800*600=480,000 \;pixels\\ \text{Memory per plane}&=Total \; pixels*1\; byte=480,000 \;bytes\\Total \;memory&=\frac{1,440,000}{1024*1024} bytes​\approx 1.37 MB\end{align}$$
2. Find the refresh rate of a 1024 x 1024 frame buffer, if it can access 32 pixels in a group of simultaneously, in an access time of 200 ns.    $$\begin{align}Total\; pixels&=1024*1024=1,048,576\; pixels\\ Number \;  of \; groups&= \frac{\text{Total pixels}}{\text{Pixels per Group}}​=\frac{1,048,576}{32}​=32,768 \;groups\\ Total \;time&=6,553,600 \;ns=6.5536\; ms\\ Refresh \;rate&=\frac{1}{\text{Total time per frame}}​=\frac{1}{6.5536 \;ms}=\frac{1,000}{6.5536} \approx 152.5 Hz\end{align}$$
3. Find the number of colors that is possible on a 512 x 512 raster screen with 3 plane buffer each of red, green and blue. 

$$\begin{align}\text{Total bits per pixel}&=8 \;bits \;(red)+8 \;bits \;(green)+8 \;bits\; (blue)=24\; bits\\ \text{Number of colors}&=2^{\text{Total bits per pixel}}=2^{24}\\\text{Number of colors}&=16,777,216 \;colors\end{align}$$