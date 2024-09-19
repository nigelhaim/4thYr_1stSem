from PIL import Image, ImageDraw, ImageFont
import matplotlib.pyplot as plt
image = Image.new('RGB', (600, 600), 'white')
draw = ImageDraw.Draw(image)

#Draw shirt 
outline_color = 'black'
width = 5
draw.line((100, 250, 150,250), fill=outline_color, width=width)
draw.line((150, 250, 150, 200), fill=outline_color, width=width)
draw.line((150, 200, 200, 200), fill=outline_color, width=width)
draw.line((200, 200, 200, 500), fill=outline_color, width=width)
draw.line((200, 500, 400, 500), fill=outline_color, width=width)
draw.line((400, 500, 400, 200), fill=outline_color, width=width)
draw.line((400, 200, 450, 200), fill=outline_color, width=width)
draw.line((450, 200, 450, 250), fill=outline_color, width=width)
draw.line((450, 250, 500, 250), fill=outline_color, width=width)
draw.line((500, 250, 500, 150), fill=outline_color, width=width)
draw.line((500, 150, 450, 100), fill=outline_color, width=width)
draw.line((450, 100, 150, 100), fill=outline_color, width=width)  
draw.line((150, 100, 100, 150), fill=outline_color, width=width)
draw.line((100, 150, 100, 250), fill=outline_color, width=width)


image.save('LongExam.png')
plt.axis('off')
plt.imshow(image)
