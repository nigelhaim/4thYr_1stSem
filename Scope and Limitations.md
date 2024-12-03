
This study mainly investigated the benefits of applying global context through interslice attention for the segmentation of CMBs in MRI scans, explicitly focusing on images obtained from the axial angle. It aims in utilizing a Region Proposal Network model to obtain proposed regions from all the slices concatenated with the target slice into the second stage. The study utilizes Vision Transformer model to perform segmentation on the proposed regions with the additional global context information. 

However the study was limited to the following: 

- The study used only T2*-weighted MRI scans from the axial plane.  This was deemed sufficient because CMBs are detectable in T2* MRI scans (Poels et al., 2011). 

- The dataset used in this study was exclusively sourced from the “Where is VALDO?” challenge (Sudre et al., 2024). It contained only 72 cases and lacked additional information on each case. 

- The study focused exclusively on the detection and segmentation of cerebral microbleeds (CMBs) and did not address the diagnosis of other types of cerebral small vessel disease (CSVD).
- The study concentrated only on MRI scans, disregarding additional clinical or demographic patient information, to enhance the model’s applicability. While these patient data are important in diagnosing cerebral small vessel disease (CSVD), as highlighted by Lee et al. (2018), their importance may be less significant specifically for detecting microbleeds.
- 
- Following the studies of (Xia et al., 2024) only included the cohorts of SABRE and ALFA. The study will only utilize the said cohorts. 
- The study focuses on cases with annotated microbleeds to provide global context and avoid computational noise. 
- The two stage approach is only evaluated with the following metrics: 
	- For the region proposal network: Intersect over Union, Sensitivity, Precision, and F-measure
	- For the Vision Transformers: Sensitivity, Precision, Average Number of False Positives, F-measure, and Dice Coefficient. 
- The experiments performed for this study is also limited to hardware specifications that consists of 8gb of RAM, NVIDI GTX 1650ti (4 GB of GDDR6 memory), and a Ryzen 7 processor. 

Xia, Tianxiang, et al. (2024). “Progressive Learning Based Knowledge Distillation for Low Resolution Cerebral Microbleed Segmentation.” _ICASSP 2024 - 2024 IEEE International Conference on Acoustics, Speech and Signal Processing (ICASSP)_, IEEE, 2024, pp. 1856–60. _DOI.org (Crossref)_, https://doi.org/10.1109/ICASSP48485.2024.10447006.