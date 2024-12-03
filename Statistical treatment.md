## RPN Metrics 


The Intersection of Union is a metric derived from the Jaccard index. It is an accuracy metric that evaluates the intersection of the predicted and the true bounding box. 
measure ensures that the predicted bounding boxes are equal to the real boxes of the objects. This removes unnecessary bounding boxes that do not meet the characteristics of the objects.
$IOU = \frac{Area \; of \; Overlap}{Area \; of \; Union}$

Precision focuses on the identification of relevant objects accurately. It evaluates based on the number of images are correctly classified. 

$precision =  \frac{Area  \; of \; Overlap}{Predicted \; bounding \; box}$

Recall assess the model's capability in finding all the ground truth bounding boxes. It focuses on the completeness of positive predictions relative to the ground truth. 

$Recall =  \frac{Area  \; of \; Overlap}{True \; bounding \; box}$

The F1 score observes the trade-off between precision and recall through calculating the harmonic mean.

$f1 = \frac{2\;*\;(\;precision \; * \;recall\;)}{(\;precision \;+ \;recall\;)}$



## ViT Metrics 

#### Computed per pixel

$Dice \; coef = \frac{2TP}{2TP+FP+FN}$

$precision = \frac{TP}{TP+FP}$

$recall = \frac{TP}{TP + FN}$

$FPR = \frac{FP}{FP + TN}$





Alhussainan, Norah Fahd, et al. “A Deep Learning Approach for Brain Tumor Firmness Detection Based on Five Different YOLO Versions: YOLOv3–YOLOv7.” _Computation_, vol. 12, no. 3, Mar. 2024, p. 44. _www.mdpi.com_, https://doi.org/10.3390/computation12030044.