---
sticker: lucide//skull
---
# Filtered
![[Pasted image 20241102111804.png]]
## Resnet (RPN 15a)

| Cohort | Maximum Batchsize | Runtime           |                                      |                                      |
| ------ | ----------------- | ----------------- | ------------------------------------ | ------------------------------------ |
| 1      | 8                 | 50m 41s           | ![[Pasted image 20241102112048.png]] | ![[Pasted image 20241102112130.png]] |
| 2      | 1                 | 115 m per cohhort |                                      |                                      |
| 3      | 7                 | 48m 11s           | ![[Pasted image 20241102182345.png]] | ![[Pasted image 20241102182350.png]] |


![[Pasted image 20241102112356.png]]
## Embedding (RPN 15)

| Cohort | Maximum Batchsize | Runtime           | Histplot                             | Image                                |
| ------ | ----------------- | ----------------- | ------------------------------------ | ------------------------------------ |
| 1      | 40 or more        | 12m 44s           | ![[Pasted image 20241102112012.png]] | ![[Pasted image 20241102112024.png]] |
| 2      | 7                 | 25 mins per epoch |                                      |                                      |
| 3      | 100               | 6m 49.5s          | ![[Pasted image 20241102171405.png]] | ![[Pasted image 20241102171418.png]] |

# Unfiltered

## Embedding (RPN 15)

| Cohort | Maximum Batch size | Runtime            | Histplot | Image |
| ------ | ------------------ | ------------------ | -------- | ----- |
| 3      | 40                 | 7.5 mins per epoch |          |       |
