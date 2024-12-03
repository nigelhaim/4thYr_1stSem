
**

1. ## Statistical Treatment of the Data
    

1. ### Classification Metrics
    

Rianio et al. (2024) discussed in their paper that in a binary classification task, there are four possible outcomes: true positives (TP), true negatives (TN), false positives (FP), and false negative (FN). Some of the most commonly used metrics for evaluating these outcomes are sensitivity and precision. In addition to these metrics, this study adopted their approach to include Intersection over Union to evaluate the intersection of the predicted and the true bounding box.  Dice coefficient for binary image segmentation. 

a.1 object detection:

To asses the accuracy of the Region Proposal network quantitative measures are used

Intersection over union (IOU). It measures how equal the predicted  
bounding boxes to the real bounding box (Alhussainan, et al., 2024).

IOU (%) = Area of OverlapArea of Union 100

Sensitivity (Recall). It is defined by the ratio of actual positives to the sum of actual positives and false negatives (Lee et al., 2023; Kim et al., 2023).

Sensitivity (%) = Area of overlapTrue bounding box 100

Precision. It is defined by the ratio of correctly predicted positive observations to the total predicted positives (Lee et al., 2023; Kim et al., 2023).

Precision (%) = area of overlapPredicted bounding box 100

F1 Score (F-measure). It is calculated as the harmonic mean of precision and sensitivity, offering a performance metric for classification models with uneven class distribution and balancing the trade-offs between precision and sensitivity (Chen et al., 2015).

F1 = (precision sensitivity) (precision + sensitivity) 2

  

The performance metrics used for the ViT in this study were as follows:

Sensitivity (Recall). It deals with the ground truth detection or classification (Ferlin, et al., 2023).

Sensitivity (%) = TP(TP + FN) 100

Precision. Evaluates whether the prediction matches the ground truth. (Ferlin, et al., 2023).

Precision (%) = TP(TP + FP) 100

False Positives Rate. It measures the average number of non-microbleed regions incorrectly predicted as microbleeds per image  (Lee et al., 2023; Kim et al., 2023).

False Positives Rate = FPFP+TN

F1 Score (F-measure). It is the harmonic mean of precision and recall that depends on which class is defined positive and negative (Hicks et al.,2022)

F1 = (precision sensitivity) (precision + sensitivity) 2

Sørensen–Dice similarity coefficient (Dice coefficient). It is used to evaluate the similarity of the predicted positive segment given by the model and the ground-truth positive segment annotated by a clinical expert, providing a quantitative measure of how closely the predictions of the model aligns with the actual microbleeds determined by radiologists (Kim et al., 2023). 

D = 2 TP (2 TP) + FP + FN



**Naminas, Karyna. Object Detection Evaluation Metric Explained. 13 Aug. 2024, https://labelyourdata.com/articles/object-detection-metrics.**