---
sticker: lucide//skull
---
# Filtered
![[Pasted image 20241102111804.png]]
## Resnet (RPN 15a)

| Cohort | Maximum Batchsize | Runtime                |                                      |                                      |
| ------ | ----------------- | ---------------------- | ------------------------------------ | ------------------------------------ |
| 1      | 8                 | 50m 41s                | ![[Pasted image 20241102112048.png]] | ![[Pasted image 20241102112130.png]] |
| 2      | 1                 | 687m Still on  epoch 6 |                                      |                                      |
| 3      | 7                 | 48m 11s                | ![[Pasted image 20241102182345.png]] | ![[Pasted image 20241102182350.png]] |


![[Pasted image 20241102112356.png]]
## Embedding (RPN 15)

| Cohort | Maximum Batchsize | Runtime           | Histplot                             | Image                                |
| ------ | ----------------- | ----------------- | ------------------------------------ | ------------------------------------ |
| 1      | 40 or more        | 12m 44s           | ![[Pasted image 20241102112012.png]] | ![[Pasted image 20241102112024.png]] |
| 2      | 7                 | 25 mins per epoch |                                      |                                      |
| 3      | 100               | 6m 49.5s          | ![[Pasted image 20241102171405.png]] | ![[Pasted image 20241102171418.png]] |

# Unfiltered

## Embedding (RPN 15)

| Cohort | Maximum Batch size | Runtime                                            | Histplot | Image | Other notes                                                 |
| ------ | ------------------ | -------------------------------------------------- | -------- | ----- | ----------------------------------------------------------- |
| 3      | 40                 | 7.5 mins per epoch                                 |          |       | - Tried batch size 43 however ran out of memory on epoch 12 |
| 1      | 50                 | 6.25 minns per epoch                               |          |       |                                                             |
| 2      | 7                  | 250 min+ still havent reached epocch the 2nd epoch |          |       |                                                             |



## Resnet (RPN 15a)

| Cohort | Maximum Batch size | Runtime                                        | Histplot | Image | Other notes |
| ------ | ------------------ | ---------------------------------------------- | -------- | ----- | ----------- |
| 3      | 7                  | 95 mins per epoch                              |          |       |             |
| 1      | 7                  | 21.57 mins per epoch                           |          |       |             |
| 2      | 1                  | 170m+still havent reached epocch the 2nd epoch |          |       |             |


# Noted runs (Training)

## Cohort 1 


### Embedder

| Configs                              | Histplot                             | Sample image                                                             | Weights filename                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------------------------------------------ | ---------------------------------------- |
| ![[Pasted image 20241103223556.png]] | ![[Pasted image 20241103223603.png]] | ![[Pasted image 20241103223608.png]]                                     | RPN_test15_weights_Nov_03_2024_204942.pt |
| ![[Pasted image 20241104155214.png]] | ![[Pasted image 20241104155219.png]] | ![[Pasted image 2024110415522![[Pasted image 20241104155224.png]]4.png]] | RPN_test15_weights_Nov_04_2024_133614.pt |
| ![[Pasted image 20241104220921.png]] | ![[Pasted image 20241104220854.png]] | ![[Pasted image 20241104220903.png]]                                     | RPN_test15_weights_Nov_04_2024_213347.pt |
| ![[Pasted image 20241105231958.png]] | ![[Pasted image 20241105231949.png]] | ![[Pasted image 20241105232009.png]]                                     |                                          |

### Resnet
| Configs                              | Filtered/Unfiltered | Histplot                             | Sample image                         | Weights name                                        | Other notes          |
| ------------------------------------ | ------------------- | ------------------------------------ | ------------------------------------ | --------------------------------------------------- | -------------------- |
| ![[Pasted image 20241103223746.png]] | Filtered            | ![[Pasted image 20241103223752.png]] | ![[Pasted image 20241103223803.png]] | RPN_test15a_weights_Nov_03_2024_211433.pt           |                      |
| ![[Pasted image 20241104125049.png]] | Unfiltered          | ![[Pasted image 20241104125158.png]] | ![[Pasted image 20241104125414.png]] | UnfilteredRPN_test15a_weights_Nov_04_2024_021056.pt | Runtime -635 m 28.1s |
| ![[Pasted image 20241104155314.png]] | Filtered            | ![[Pasted image 20241104155303.png]] | ![[Pasted image 20241104155322.png]] | RPN_test15a_weights_Nov_04_2024_140851.pt           |                      |
## ViT 

| Configs                              | Histplot                             | Cropped Image                        | Weights name                | Full image segmentation (Ground truth) | Predicted                            | Threshold | Other notes                                      | Metrics (From lex)                                                 |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | --------------------------- | -------------------------------------- | ------------------------------------ | --------- | ------------------------------------------------ | ------------------------------------------------------------------ |
| ![[Pasted image 20241106223152.png]] | ![[Pasted image 20241106223201.png]] | ![[Pasted image 20241106223228.png]] | ViT_GTNov_06_2024_220028.pt | ![[Pasted image 20241106223222.png]]   | ![[Pasted image 20241106223248.png]] | -3.1      | Used<br>RPN_test15_weights_Nov_04_2024_213347.pt | IOU: 0.003 Precision: 0.003 Recall 0.833 Dice 0.006 Accuracy 0.001 |
| ![[Pasted image 20241107000014.png]] | ![[Pasted image 20241107000022.png]] | ![[Pasted image 20241106235935.png]] | ViT_GTNov_06_2024_233402.pt | ![[Pasted image 20241106235945.png]]   | ![[Pasted image 20241106235927.png]] | 0.3       |                                                  | IOU: 0.003 Precision: 0.003 Recall 0.833 Dice 0.006 Accuracy 0.001 |
| ![[Pasted image 20241107125049.png]] | ![[Pasted image 20241107125039.png]] | ![[Pasted image 20241107124943.png]] | ViT_GTNov_07_2024_104706.pt | ![[Pasted image 20241107125001.png]]   | ![[Pasted image 20241107124934.png]] | 0.10      | Used<br>RPN_test15_weights_Nov_04_2024_213347.pt | IOU: 0.17 Precision: 0.201 Recall 0.382 Dice 0.24 Accuracy 0.995   |
| ![[Pasted image 20241110143905.png]] | ![[Pasted image 20241110143912.png]] | ![[Pasted image 20241110143917.png]] | ViT_GTNov_10_2024_135616.pt | ![[Pasted image 20241110143946.png]]   | ![[Pasted image 20241110143933.png]] | 0.59      | Combined cohort 1 and 3                          | IOU: 0.051 Precision: 0.058 Recall 0.348 Dice 0.085 Accuracy 0.967 |
