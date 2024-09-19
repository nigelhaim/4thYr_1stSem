from PIL import Image, ImageDraw, ImageFont
import matplotlib.pyplot as plt

image = Image.new('RGB', (600, 600), 'white')
draw = ImageDraw.Draw(image)

outline_color = 'black'
width = 5

#Draw Hull
draw.line((100,350,150,450) , fill=outline_color, width=width)
draw.line((100,350,305,350) , fill=outline_color, width=width)
draw.line((150,450,450,450) , fill=outline_color, width=width)
draw.line((450,450,500,350) , fill=outline_color, width=width)
draw.line((500,350,305,350) , fill=outline_color, width=width)
draw.line((305,350,295,350) , fill=outline_color, width=width)

# Draw pole
draw.line((100,350,150,450) , fill=outline_color, width=width)
draw.line((150,450,450,450) , fill=outline_color, width=width)
draw.line((450,450,500,350) , fill=outline_color, width=width)
draw.line((500,350,305,350) , fill=outline_color, width=width)
draw.line((305,350,295,350) , fill=outline_color, width=width)

#Draw flag 
draw.line((295,350,295,150) , fill=outline_color, width=width)
draw.line((295,150,305,150) , fill=outline_color, width=width)
draw.line((305,150,305,200) , fill=outline_color, width=width)
draw.line((305,200,405,200) , fill=outline_color, width=width)
draw.line((405,200,305,150) , fill=outline_color, width=width)
draw.line((305,150,305,350) , fill=outline_color, width=width)
draw.line((305,350,100,350) , fill=outline_color, width=width)

image.save('LongExam_Boat.png')
plt.axis('off')
plt.imshow(image)