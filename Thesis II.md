---
sticker: lucide//skull
---

## Notes
- Schedule of defense - Nov 30 (All Data science)
- Dapat nakapag submit na ng waiver (Parental consent)
- Dapat before midnight ng nov 26 na submit na sa panels (online and pdf)
- On the defense proper dapat may hard copy rin (3 copies for the panels)
- Introduction is not long as the proposal defense but focus on the architecture and results 
- Siguro naman may idea na kayo na yung time hindi madalas ma susunod
- Hindi natin mapipigalan yung panel magsalita 

![[Pasted image 20241105142215.png]]

![[Pasted image 20241105142223.png]]


![[Pasted image 20241105142231.png]]


![[Pasted image 20241105142423.png]]
![[Pasted image 20241105142430.png]]

![[Pasted image 20241105142517.png]]


# With ResNet
![[Pasted image 20241030225318.png]]
![[Pasted image 20241030225325.png]]
![[Pasted image 20241030225330.png]]
![[Pasted image 20241030225334.png]]
# Decisio making 
![[Pasted image 20241029095023.png]]
![[Pasted image 20241029095034.png]]

![[Pasted image 20241029095043.png]]

	![[Pasted image 20241029183151.png]]z
![[Pasted image 20241029183051.png]]

![[Pasted image 20241029183116.png]]

![[Pasted image 20241029183125.png]]





#  Previous Embedder

2024-10-23 15:35:16,373 - INFO - target_shape: (300, 300)

2024-10-23 15:35:16,373 - INFO - rpn_mode: False

2024-10-23 15:35:16,374 - INFO - batch_size: 5

2024-10-23 15:35:16,374 - INFO - collate_fn: <function collatev2 at 0x0000024FD8360E00>

2024-10-23 15:35:16,375 - INFO - image_size: 300

2024-10-23 15:35:16,375 - INFO - input_output_dim: 2500

2024-10-23 15:35:16,376 - INFO - epochs: 7

2024-10-23 15:35:16,376 - INFO - loss: MSELoss()

2024-10-23 15:35:16,377 - INFO - lr: 0.0075


```python
class SliceEmbedding(nn.Module):

    def __init__(self, image_size, output_dim, in_channels=1, out_channels=1, kernel_size=2, stride=2):

        super().__init__()

        self.convs = nn.Sequential(

            nn.Conv2d(in_channels=in_channels, out_channels=32, kernel_size=kernel_size, stride=stride),

            nn.ReLU(),

            nn.Conv2d(in_channels=32, out_channels=24, kernel_size=kernel_size, stride=stride),

            nn.ReLU(),

            nn.Conv2d(in_channels=24, out_channels=24, kernel_size=kernel_size, stride=stride),

            nn.ReLU(),

            nn.Conv2d(in_channels=24, out_channels=out_channels, kernel_size=kernel_size, stride=stride),

            nn.ReLU(),

            nn.Flatten(2)

        )

  

        # Calculate shape after convolutions

        with torch.inference_mode():

            x = torch.zeros(1, in_channels, image_size, image_size)

            output = self.convs(x)

            final_d = output.numel()

  

        print(final_d)

  

        self.mlp = nn.Sequential(

            nn.Linear(final_d, output_dim)

        )

  
  

    def forward(self, x):

        out = self.convs(x)

        return self.mlp(out)
```

![[Pasted image 20241023162653.png]]

**Training mean: ** tensor(1661.8511)
	Validation mean: tensor(1453.3242)





```python
class SliceEmbedding(nn.Module):

    def __init__(self, image_size, output_dim, in_channels=1, out_channels=1, kernel_size=2, stride=2):

        super().__init__()

        self.convs = nn.Sequential(

            nn.Conv2d(in_channels=in_channels, out_channels=32, kernel_size=kernel_size, stride=stride),

            nn.ReLU(),

            nn.AvgPool2d(kernel_size=2, stride=2),

            # nn.BatchNorm2d(32),

            nn.Conv2d(in_channels=32, out_channels=24, kernel_size=kernel_size, stride=stride),

            nn.ReLU(),

            nn.Conv2d(in_channels=24, out_channels=24, kernel_size=kernel_size, stride=stride),

            nn.ReLU(),

            nn.Conv2d(in_channels=24, out_channels=out_channels, kernel_size=kernel_size, stride=stride),

            nn.ReLU(),

            # nn.Dropout(0.1),

            nn.Flatten(2)

        )

  

        # Calculate shape after convolutions

        with torch.inference_mode():

            x = torch.zeros(1, in_channels, image_size, image_size)

            output = self.convs(x)

            final_d = output.numel()

  

        print(final_d)

  

        self.mlp = nn.Sequential(

            nn.Linear(final_d, output_dim)

        )

  
  

    def forward(self, x):

        out = self.convs(x)

        return self.mlp(out)
```


![[Pasted image 20241024154814.png]]


Training tensor(2088.2717)

Valiation tensor(1892.9314)


![[Pasted image 20241029002551.png]]

****
# ARCHIVE
For every val_batch in test_loader
	Create array one_case 
	Num_slices = get number of slices 
	for j in number of slices: 
		if unique values is > 1
			for i in range 


import re

val_loss = 0.0

predicted = []

impg_cropped_size = (16,16)

  

print("Predicting")

length = len(test_loader) #Total number of cases to be evaluated

case = 0

  

with torch.no_grad():

    for c, val_batch in tqdm(enumerate(test_loader, 0)):

        case_name = re.search(r'sub-(\d+)', val_batch[2][0]).group(1)

        one_case = [] #This will store all the contents of every case

        num_slices = len(val_batch[0]) #Number of slices per case

        for i in range(num_slices):

            if torch.unique(val_batch[1][i]).numel() > 1: # This will only process all the slices with cmb

                print(f"------Predicting case {case_name} | Slice {i}")

                slice_data = [] #Stores all the data of each slice

                bounding_boxes = [] #Bounding boxes of each CMB

                print("Image shape: ", val_batch[0][i].shape)

                print("Mask shape :", val_batch[1][i].shape)

                print("Mask: ", torch.unique(val_batch[1][i]))

                print("Mask length: ", len(val_batch[1][i]))

                bounding_boxes = dataset.extract_bounding_boxes(mask=val_batch[1][i][0].numpy()) # Extract all the CMB bounding boxes of each slice

                print("Slice bounding boxes :", bounding_boxes)

                if len(bounding_boxes) > 0:

                    #If there are extracted bounding boxes it will continue else it will skip and proceed to the next slice

                    cropped_images = []

                    cropped_mask = []

                    for bbox in bounding_boxes:

                        print("Extracting image and mask of coordinates: ",bbox)

                        cropped_images.append(dataset.get_cropped_locations(img=val_batch[0][i], x_min=bbox[0], y_min=bbox[1], x_max=bbox[2], y_max=bbox[3]))

                        cropped_mask.append(dataset.get_cropped_locations(img=val_batch[1][i].unsqueeze(0), x_min=bbox[0], y_min=bbox[1], x_max=bbox[2], y_max=bbox[3]))

                    print(f"Number of cmb of slice {i}:", len(cropped_images))

                    if len(cropped_images) == len(cropped_mask): # Before predicting all images and masks should be equal

                        print("Equal")

                    else:

                        print("Not equal cmb counts")

                        break

                else:

                    print("Not bounding box")

        print("---------Next case--------")


```python
from matplotlib import pyplot as plt

from tqdm.auto import tqdm

  

for epoch in range(epochs):

    training_loss = 0.0

    progress_bar = tqdm(

        enumerate(train_loader, 0),

        total=len(train_loader),``

        desc=f'Epoch {epoch + 1}/{epochs} loss: {training_loss / len(train_loader):.3f}'

    )

    for i, data in progress_bar:

        # num_slices = len(data[0])

  

        cropped_images = dataset.get_cropped_locations(img=data[0], x_min=160, y_min=324, x_max=176, y_max=340)

        # cropped_labels = dataset.get_cropped_locations(img=data[1], x_min=160, y_min=324, x_max=176, y_max=340)

  

        num_slices = len(cropped_images)

        # print(num_slices)

        for j in range(num_slices):

            # print(cropped_images[0][0].shape)

            # print(data[0][j].shape)

            # print(data[1][j].shape)

            inputs = dataset.get_cropped_locations(img=data[0], x_min=160, y_min=324, x_max=176, y_max=340).float().to(device)

            labels = dataset.get_cropped_locations(img=data[1], x_min=160, y_min=324, x_max=176, y_max=340).float().to(device)

  

            # print(inputs.shape)

            # print(labels.shape)

            print('-----------------------')

            print(f'Learning case {i} slice {j}')

            optimizer.zero_grad()

            outputs, loss = transformer(inputs, labels)

            # outputs = F.interpolate(

            #     outputs,

            #     size=img_size,

            #     mode='bilinear',

            #     align_corners=False

            # )

            if labels.max() >= n_classes:

                labels = torch.clamp(labels, 0, n_classes-1)

  

            if epoch == 2:

                for i in range(outputs.shape[0]):  # Assuming outputs[0] is the batch dimension

                    img = outputs[0][i].cpu().detach().numpy()  # Move to CPU and convert to NumPy

                    plt.imshow(img.squeeze(), cmap='gray')  # Squeeze to remove single-dimensional entries

                    plt.title(f'Slice {i}')

                    plt.show()

  

            print(outputs.shape)

            batch, channel, num_slices, height, width = inputs.shape

            labels = labels.view(batch_size, height * num_slices, width)

            # labels = labels.long()

            loss = criterion(outputs, labels.long())

            loss.backward()

            optimizer.step()

            training_loss += loss.item()

    print(f'Epoch {epoch + 1}/{epochs} loss: {training_loss:.3f}')
```


```python
from matplotlib import pyplot as plt

from tqdm import tqdm

import re

for epoch in range(epochs):

    training_loss = 0.0

    progress_bar = tqdm(

        enumerate(train_loader, 0),

        total=len(train_loader),

        desc=f'Epoch {epoch + 1}/{epochs} loss: {training_loss / len(train_loader):.3f}'

    )

    for i, data in progress_bar:

        if torch.unique(data[1]).numel() > 1:  # If the case has a CMB then it will run

            num_slices = len(data[1]) # Number of slices

            case_number = re.search(r'sub-(\d+)', data[2][0]).group(1) # Extract the case number

            print(f'Case: {case_number}')

            if num_slices != len(data[0]):

                print('Not equal Number of slices:', num_slices, data[0]) #Checks if the number of slices of the MRI and the mask are the same

                break

            for j in range(num_slices):

                bounding_boxes = dataset.extract_bounding_boxes(data[1][j][0].numpy()) #Extracts all the bounding boxes of the slice

                cropped_images = []

                cropped_labels = []

                coordinates = []

                if len(bounding_boxes) <= 0: # If there are no bounding boxes then it will skip the slice

                    print('No bounding boxes found on slice ', j)

                    continue

                for bbox in bounding_boxes: # For each bounding box it will crop the image and the label based on the given coordinates

                    print(f"Slice {j} | ", bbox)

                    print(data[0][j][0].shape)

                    cropped_images.append(

                        dataset.get_cropped_locations(

                            img = data[0],

                            x_min=bbox[0],

                            y_min=bbox[1],

                            x_max=bbox[2],

                            y_max=bbox[3]

                        ))

                    cropped_labels.append(

                        dataset.get_cropped_locations(

                            img = data[1],

                            x_min=bbox[0],

                            y_min=bbox[1],

                            x_max=bbox[2],

                            y_max=bbox[3]

                        ))

                    coordinates.append(bbox)

                if len(cropped_images[0][0][0]) != len(cropped_labels[0][0]): ## Checks if the number of cropped images and labels are the same

                    print('Not equal cropped images and labels')

                    break

  

                    # TODO: Improve this method since the method requires all the slices therefore it is needed to have another loop that checks if the extracted region has a cmb or not before feeding it into the model

                print('Cropped Images length:', len(cropped_images))

                print('Cropped Labels length:', len(cropped_labels))

                print('Cropped Images number of slices:', len(cropped_images[0][0][0])) # This is the MRI image of the CMB with the coordinate

                print('Cropped Labels number of slices:', len(cropped_labels[0][0])) # This is the mask of the CMB with the coordinate

                for k, cmb in enumerate(cropped_labels[0]): # Access the CMB labels array the n checks if there are CMBs on the slice of the case

                    for l, cmb_slice in enumerate(cmb):

                        # print(cmb_slice.shape)

                        if torch.unique(cmb_slice).numel() > 1:

                            print('Multiple classes found on silce: ', l)

                            print(cmb_slice.shape)

                            print(cropped_images[0][0][0][l].shape)

                            # Enable ths method to visually see what is feeded on the model

                            # print_image(cropped_images[0][0][0][l], f'MRI Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                            # print_image(cmb_slice, f'Mask Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                            print(f'Learning on Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                            optimizer.zero_grad()

                            inputs = cropped_images[0][0][0][l].unsqueeze(0).unsqueeze(0).to(device)

                            labels = cropped_labels[0][0][l].unsqueeze(0).to(device)

                            print("Feeded inputs shape: ",inputs.shape)

                            print("Feeded mask shape: ",labels.shape)

                            outputs = transformer(inputs.float(), labels.float())

                            loss = criterion(outputs, labels.long())  

                            print("Output shape: ",outputs.shape)

                            loss.backward()

                            optimizer.step()

                            training_loss += loss.item()

                            print(f'Loss: {loss.item()}')

            print("Training Loss: ", training_loss)      

        else:

            print('Skipping...')

            continue

    print(f'Epoch {epoch + 1}/{epochs} loss: {training_loss / len(train_loader):.3f}')

print('Final training loss:', training_loss)

print('Finished Training')
```


```python
val_loss = 0.0

predicted = []

  

length = len(test_loader)

case = 0

with torch.no_grad():

    for i, val_batch in tqdm(enumerate(test_loader, 0)):

        # num_slices = len(val_batch[0])

        val_slices = []

        one_case = []

        val_masks = []

  

        cropped_images = dataset.get_cropped_locations(img=val_batch[0], x_min=160, y_min=324, x_max=176, y_max=340)

        cropped_labels = dataset.get_cropped_locations(img=val_batch[1], x_min=160, y_min=324, x_max=176, y_max=340)

  

        num_slices = len(cropped_images)

        for j in range(num_slices):

            print(f'Predicting case {i} slice {j}')

            val_images = cropped_images[j].unsqueeze(0).unsqueeze(0).float().to(device)

            val_mask = cropped_labels[j].unsqueeze(0).float().to(device)

            predicted_mask = predict(transformer, val_images)

            predicted_mask = torch.from_numpy(predicted_mask).unsqueeze(1).to(device).float()

            predicted_mask = F.interpolate(

                predicted_mask,

                size=img_size,

                mode='nearest'

            ).squeeze(1)

  

            val_loss += criterion(predicted_mask, val_mask).item()

            val_slices.append(predicted_mask)

            val_masks.append(val_mask)

            print('Loss:', val_loss)

        one_case.append(val_slices)

        one_case.append(val_masks)

        predicted.append(one_case)

        case += 1

  

print(f' Final Validation Loss: {val_loss}')
```


```python

val_loss = 0.0

length = len(test_loader)

case = 0

with torch.no_grad():

    for i, val_batch in tqdm(enumerate(test_loader, 0)):

        num_slices = len(val_batch[1])#Number of slces

        one_case = []

        case_number = re.search(r'sub-(\d+)', val_batch[2][0]).group(1) # Extract the case number

        print(f'Case: {case_number}')

        if num_slices != len(val_batch[0]):

            print('Not equal Number of slices:', num_slices, val_batch[0])#Checks if the number of slices of the MRI and the mask are the same

            break

        for j in range(num_slices):

            slice_data = []

            bounding_boxes = dataset.extract_bounding_boxes(val_batch[1][j][0].numpy())#Extracts all the bounding boxes of the slice

            cropped_images = []

            cropped_labels = []

            coordinates = []

            if len(bounding_boxes) <= 0: # If there are no bounding boxes then it will skip the slice

                print('No bounding boxes found on slice ', j)

                continue

            for bbox in bounding_boxes: #For each bounding box it will crop the image and the label based on the given

                print(f"Slice {j} | ", bbox)

                print(val_batch[0][j][0].shape)

                cropped_images.append(

                    dataset.get_cropped_locations(

                        img = val_batch[0],

                        x_min=bbox[0],

                        y_min=bbox[1],

                        x_max=bbox[2],

                        y_max=bbox[3]

                    ))

                cropped_labels.append(

                    dataset.get_cropped_locations(

                        img = val_batch[1],

                        x_min=bbox[0],

                        y_min=bbox[1],

                        x_max=bbox[2],

                        y_max=bbox[3]

                    ))

                coordinates.append(bbox)

            if len(cropped_images[0][0][0]) != len(cropped_labels[0][0]):## Checks if the number of cropped images and labels are the same

                print('Not equal cropped images and labels')

                break

            # TODO: Improve this method since the method requires all the slices therefore it is needed to have another loop that checks if the extracted region has a cmb or not before feeding it into the model

            print('Cropped Images length:', len(cropped_images))

            print('Cropped Labels length:', len(cropped_labels))

            print('Cropped Images number of slices:', len(cropped_images[0][0][0]))

            print('Cropped Labels number of slices:', len(cropped_labels[0][0]))

            for k, cmb in enumerate(cropped_labels[0]):# Access the CMB labels array the n checks if there are CMBs on the slice of the case

                for l, cmb_slice in enumerate(cmb):

                    if torch.unique(cmb_slice).numel() > 1:

                        print('Predicting CMB with coordinates: ', coordinates[k])

                        print(cmb_slice.shape)

                        print(cropped_images[0][0][0][l].shape)

                        # Enable ths method to visually see what is feeded on the model

                        print_image(cropped_images[0][0][0][l], f'MRI Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                        print_image(cmb_slice, f'Mask Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                        print(f'Predicting on Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                        inputs = cropped_images[0][0][0][l].unsqueeze(0).unsqueeze(0).to(device)

                        labels = cropped_labels[0][0][l].unsqueeze(0).to(device)

                        print("Feeded inputs shape: ",inputs.shape)

                        print("Feeded mask shape: ",labels.shape)

                        predicted_mask = predict(transformer, image = inputs.float(), mask = labels.float())

                        print("Output shape: ",predicted_mask.shape)

                        print_image(predicted_mask[0], f'Predicted Mask Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                        print_image(cmb_slice, f'Ground Truth Mask Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')
```


### Prediction data 

Each prediction_data list has a
- Predicted_mask 
- GroundTrueth cropped 
- Coordinates of every CMB

where it is stored on a slilces_predictions
slices_true_labels is where the ground truth is stored 
slices images is where the images are stored 


all are appeneed to one_case that is appened to predictiosn 



```python
 for i, val_batch in tqdm(enumerate(test_loader, 0)):

        num_slices = len(val_batch[1])#Number of slces

        one_case = []#This is where we store every slice of the case

        case_number = re.search(r'sub-(\d+)', val_batch[2][0]).group(1) # Extract the case number

        **one_case.append(case_number)**

        slices_images = [] #This is where we store the images of the slices

        slices_predictions = [] #This is where we store the predictions of the slices

        slices_true_labels = [] #This is where we store the true labels of the slices

        print(f'Case: {case_number}')

        if num_slices != len(val_batch[0]):

            print('Not equal Number of slices:', num_slices, val_batch[0])
            break

        for j in range(num_slices):

            prediction_data = []
            slice_data = []

            bounding_boxes = dataset.extract_bounding_boxes(val_batch[1][j][0].numpy())

            cropped_images = []

            cropped_labels = []

            coordinates = []

            if len(bounding_boxes) <= 0: # If there are no bounding boxes then it will skip the slice

                print('No bounding boxes found on slice ', j)

                continue

            for bbox in bounding_boxes: #For each bounding box it will crop the image and the label based on the given

                print(f"Slice {j} | ", bbox)

                print(val_batch[0][j][0].shape)

                cropped_images.append(

                    dataset.get_cropped_locations(img = val_batch[0]))

                cropped_labels.append(

                    dataset.get_cropped_locations(img = val_batch[1]))

                coordinates.append(bbox)

            if len(cropped_images[0][0][0]) != len(cropped_labels[0][0]):## Checks if the number of cropped images and labels are the same

                print('Not equal cropped images and labels')

                break

            for k, cmb in enumerate(cropped_labels[0]):

                for l, cmb_slice in enumerate(cmb):

                    if torch.unique(cmb_slice).numel() > 1:



                        print(f'Predicting on Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                        inputs = cropped_images[0][0][0][l].unsqueeze(0).unsqueeze(0).to(device)

                        labels = cropped_labels[0][0][l].unsqueeze(0).to(device)

                        predicted_mask = predict(transformer, image = inputs.float(), mask = labels.float())


                        prediction_data.append(predicted_mask)

                        prediction_data.append(cmb_slice)

                        prediction_data.append(coordinates[k])

            slices_predictions.append(prediction_data)

            slices_true_labels.append(val_batch[1][j][0])

            slices_images.append(val_batch[0][j][0])

        one_case.append(slices_images)

        one_case.append(slices_predictions)

        one_case.append(slices_true_labels)

        predictions.append(one_case)```


```python
                        prediction_data.append(predicted_mask)

                            prediction_data.append(cmb_slice)

                            prediction_data.append(coordinates[k])
            slice_data.append(f"Slice {j}")

            slice_data.append(val_batch[0][j][0])

            slice_data.append(prediction_data)

            slice_data.append(val_batch[1][j][0])
```

```python
for case in predictions:

    case_number = case[0]

    print(f"------------Case {case_number}---------------")

    print("Length of the whole case: ", len(case))

    print("Case number", case[0])

    print("Number of slices: ", len(case[1]))

  

    for i, case_slice in enumerate(case[1]):

        slice_number = case_slice[0]

        print(f"================Case {case_number} Slice {slice_number}================")

        print(f"Slice {slice_number}")

        print("Image shape: ", case_slice[1].shape)

        print("Prediction length: ", len(case_slice[2]))

        print("True label shape: ", case_slice[3].shape)

        slice_image = case_slice[1][0]

        slice_prediction = case_slice[2]

        for j, slice_pred in enumerate(slice_prediction):

            print(f"Prediction {j}")

            print("Predicted Mask shape: ", slice_pred[0].shape)

            print("True Mask shape: ", slice_pred[1].shape)

            print("Coordinates: ", slice_pred[2])

            predicted_mask = slice_pred[0]

            true_mask = slice_pred[1]

            coordinates = slice_pred[2]

            # print_image(predicted_mask, f'Predicted Mask Case {case_number} Slice {slice_number} CMB coordinates {coordinates}')

            # print_image(true_mask, f'Ground Truth Mask Case {case_number} Slice {slice_number} CMB coordinates {coordinates}')

        slice_true_label = case_slice[3]

        # print_image(case_slice[1][0], f'ImageCase {case_number} Slice {slice_number}')

  

    # break
```



Nigel vit notes 
- whole /dataset/ folder committed 
- did not use fitter class 
- outputs too length 
- might be better to use log files 
	- no headers 
- no config dict 
- workspace not in conjunction with set up workspace

merge conflict for some reasonn
d_model = 256



```python
class ViTFitter(Fitter):

    def train_one_epoch(self, train_loader):

        self.model.train()

        loss_history = []

        box_count = 0

        epoch_loss = 0

        for case in train_loader:

            if torch.unique(case[1]).numel() > 1:

                num_slices= len(case[1]) # Number of slices

                case_number = re.search(r'sub-(\d+)', case[2][0]).group(1) # Extract the case number

                # print(f'Case: {case_number}')

                logger.info(f'Training with Case: {case_number}')

                if num_slices != len(case[0]):


                    logger.error(f'Not equal Number of slices: {num_slices} MRI: {len(case[0])} Mask: {len(data[1])}')

                    break

                for j in range(num_slices):

                    bounding_boxes = dataset.extract_bounding_boxes(case[1][j][0].numpy())
                    cropped_images = []

                    cropped_labels = []

                    coordinates = []

                    if len(bounding_boxes) <= 0: 
                        logger.warning(f'No bounding boxes found on slice {j}')
                        continue
                    box_count += len(bounding_boxes)

                    for bbox in bounding_boxes:
                        logger.info(f'Slice {j} | {bbox}')
                        logger.info(f'Image shape: {case[0][j][0].shape}')
                        cropped_images.append(
                            dataset.get_cropped_locations(
                                img = case[0],
                                x_min=bbox[0],
                                y_min=bbox[1],
                                x_max=bbox[2],
                                y_max=bbox[3]
                            ))

                        cropped_labels.append(

                            dataset.get_cropped_locations(

                                img = case[1],

                                x_min=bbox[0],

                                y_min=bbox[1],

                                x_max=bbox[2],

                                y_max=bbox[3]

                            ))

                        coordinates.append(bbox)

                    if len(cropped_images[0][0][0]) != len(cropped_labels[0][0]): ## Checks if the number of cropped images and labels are the same

                        print('Not equal cropped images and labels')

                        logger.error(f'Not equal cropped images and labels')    

                        break

  

                        # TODO: Improve this method since the method requires all the slices therefore it is needed to have another loop that checks if the extracted region has a cmb or not before feeding it into the model

                    # print('Cropped Images length:', len(cropped_images))

                    # print('Cropped Labels length:', len(cropped_labels))

                    # print('Cropped Images number of slices:', len(cropped_images[0][0][0])) # This is the MRI image of the CMB with the coordinate

                    # print('Cropped Labels number of slices:', len(cropped_labels[0][0])) # This is the mask of the CMB with the coordinate

                    logger.info(f'Cropped Images length: {len(cropped_images)}')

                    logger.info(f'Cropped Labels length: {len(cropped_labels)}')

                    logger.info(f'Cropped Images number of slices: {len(cropped_images[0][0][0])}')

                    logger.info(f'Cropped Labels number of slices: {len(cropped_labels[0][0])}')

                    for k, cmb in enumerate(cropped_labels[0]): # Access the CMB labels array the n checks if there are CMBs on the slice of the case

                         for l, cmb_slice in enumerate(cmb):

                            # print(cmb_slice.shape)

                            if torch.unique(cmb_slice).numel() > 1:

                                # print('Multiple classes found on silce: ', l)

                                # print(cmb_slice.shape)

                                # print(cropped_images[0][0][0][l].shape)

                                logger.info(f'Multiple classes found on slice: {l}')

                                logger.info(f'Mask shape: {cmb_slice.shape}')

                                logger.info(f'Image shape: {cropped_images[0][0][0][l].shape}')

                                # Enable ths method to visually see what is feeded on the model

                                # print_image(cropped_images[0][0][0][l], f'MRI Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                                # print_image(cmb_slice, f'Mask Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                                # print(f'Learning on Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                                logger.info(f'MRI Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                                logger.info(f'Mask Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                                logger.info(f'Learning on Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                                self.optimizer.zero_grad()

                                inputs = cropped_images[0][0][0][l].unsqueeze(0).unsqueeze(0).to(device)

                                labels = cropped_labels[0][0][l].unsqueeze(0).to(device)

                                # print("Feeded inputs shape: ",inputs.shape)

                                # print("Feeded mask shape: ",labels.shape)

                                logger.info(f'Feeded inputs shape: {inputs.shape}')

                                logger.info(f'Feeded mask shape: {labels.shape}')

                                outputs = self.model.forward(inputs.float(), labels.float())

                                loss = criterion(outputs, labels.long())  

                                # print("Output shape: ",outputs.shape)

                                logger.info(f'Output shape: {outputs.shape}')

                                loss.backward()

                                self.optimizer.step()

                                # loss_history.append(loss.item())

                                epoch_loss += loss.item()

                                logger.info(f'Loss: {loss.item()}')

                print("Training Loss: ", loss_history) # Prints the last loss of the epoch

                print("[Training] | CPU Usage: ", psutil.cpu_percent(), '%') # Prints the CPU usage

                print("[Training] | Memory Usage: ", psutil.virtual_memory().percent, '%') # Prints the memory usage

                print("[Training] | GPU Usage: ") # Prints the GPU usage

                monitor_gpu()

            else:

                # print('Skipping case with no CMBs')

                logger.warning('Skipping case with no CMBs')

                continue

        loss_history.append(epoch_loss/box_count)

        return loss_history

    def validation(self, val_loader):

        def predict(model, image, mask):

            model.eval()

            with torch.no_grad():

                image = image.to(device)

                output = self.model.forward(images = image, mask = mask)

                output = F.interpolate(output, size=img_size, mode='bilinear', align_corners=False)

                prediction = torch.argmax(output, dim=1)

            return prediction.cpu().numpy()

        loss_history = []

        with torch.no_grad():

            box_count = 0

            epoch_loss = 0

            for val_batch in val_loader:

                num_slices = len(val_batch[1])#Number of slces

                one_case = []#This is where we store every slice of the case

                case_number = re.search(r'sub-(\d+)', val_batch[2][0]).group(1) # Extract the case number

                one_case.append(case_number)

  

                # print(f'Validation with Case: {case_number}')

                logger.info(f'Validation with Case: {case_number}')

                if num_slices != len(val_batch[0]):

                    # print('Not equal Number of slices:', num_slices, val_batch[0])#Checks if the number of slices of the MRI and the mask are the same

                    logger.error(f'Not equal Number of slices: {num_slices} MRI: {len(val_batch[0])} Mask: {len(val_batch[1])}')

                    break

                for j in range(num_slices):

                    bounding_boxes = dataset.extract_bounding_boxes(val_batch[1][j][0].numpy())#Extracts all the bounding boxes of the slice

                    cropped_images = []

                    cropped_labels = []

                    coordinates = []

                    if len(bounding_boxes) > 0: # If there are no bounding boxes then it will skip the slice

                        # print('No bounding boxes found on slice ', j)

                        logger.warning(f'No bounding boxes found on slice {j}')

                        box_count += len(bounding_boxes)

                        for bbox in bounding_boxes: #For each bounding box it will crop the image and the label based on the given

                            # print(f"Slice {j} | ", bbox)

                            logger.info(f'Slice {j} | {bbox}')

                            # print(val_batch[0][j][0].shape)

                            cropped_images.append(

                                dataset.get_cropped_locations(

                                    img = val_batch[0],

                                    x_min=bbox[0],

                                    y_min=bbox[1],

                                    x_max=bbox[2],

                                    y_max=bbox[3]

                                ))

                            cropped_labels.append(

                                dataset.get_cropped_locations(

                                    img = val_batch[1],

                                    x_min=bbox[0],

                                    y_min=bbox[1],

                                    x_max=bbox[2],

                                    y_max=bbox[3]

                                ))

                            coordinates.append(bbox)

                        if len(cropped_images[0][0][0]) != len(cropped_labels[0][0]):## Checks if the number of cropped images and labels are the same

                            # print('Not equal cropped images and labels')

                            logger.error(f'Not equal cropped images and labels')

                            break

                        # TODO: Improve this method since the method requires all the slices therefore it is needed to have another loop that checks if the extracted region has a cmb or not before feeding it into the model

                        for k, cmb in enumerate(cropped_labels[0]):# Access the CMB labels array the n checks if there are CMBs on the slice of the case

                            for l, cmb_slice in enumerate(cmb):

                                if torch.unique(cmb_slice).numel() > 1:

                                    # print(f'Predicting on Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                                    logger.info(f'Predicting on Case {case_number} Slice {l} CMB coordinates {coordinates[k]}')

                                    inputs = cropped_images[0][0][0][l].unsqueeze(0).unsqueeze(0).to(device)

                                    labels = cropped_labels[0][0][l].unsqueeze(0).to(device)

                                    predicted_mask = predict(self.model, image = inputs.float(), mask = labels.float().to(device))

                                    predicted_mask = torch.tensor(predicted_mask).to(device)

                                    loss = criterion(predicted_mask.float(), labels.float())

                                    # loss_history.append(loss.item())

                                    epoch_loss += loss.item()

            print("[Validating] | CPU Usage: ", psutil.cpu_percent(), '%') # Prints the CPU usage

            print("[Validating] | Memory Usage: ", psutil.virtual_memory().percent, '%') # Prints the memory usage

            print("[Validating] | GPU Usage: ") # Prints the GPU usage

            monitor_gpu()

            loss_history.append(epoch_loss/box_count)

            return loss_history
```