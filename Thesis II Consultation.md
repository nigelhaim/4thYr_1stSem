---
sticker: lucide//skull
---
3 panelists 
- May wildcard ulit 
- Mam dona can keep mam Janette in check 
	- Siya pa magttatnggol sayo 

Bakit square prediction outputs? 
- Collecting all cmbs in one bounding box 

May metrics na rin sa end to end 
- Itlog lahat 

If itatry mo iinterpolate yung mask 
- For image segmentation nagreresize naman minsan 
- Try to look for segmentation interpolation for medical images 

Using ViT 
- Do not need to be specific on the image size 
- Tinry niyo ba mag input ng raw ng walang resizing 
- Full input pero if hindi kaya the try niyo iresize 
- Match niyo yung pag interpolate ng mask sa pag interpolate ng image (yan yung mahirap sa segmentation)

2 weeks mas importatnte ang mock kesa sa final 

Try niyo as much as possible ayusin si rpn since si ViT mabilis lang irun 
Try niyo yung ground truth (on a good segmenation) so we can see how it performs 

Multiple ground truths and multiple predictions 
- Problem isang bounding box lang yung output
- Using anchor boxes malaking changes sa structure
	- Nagpauso si yolo using non maximum suppression to tweak out the less of interest bounding boxes 
	- You can try because vit has an easier job 
	- Kailangan gayahin yung paggamit ng ibang object detectors 
	- Personally if you saw this I would say can pursue two months ago but you only have 2 weeks left realistically di ko sure if kakayanin unless hindi ma tutulog
	- Baka mas mahirap yung optimization looking to multiple boxes at the same time 
	- I would support it but keep in mind of the realistic time 
	- Yung isang bounding box yung ginagawa ng previous study 
	- Were using global context to improve the single box 
Don't to be too obsessed on the region proposals 
- What is for more to check if na kukuha ni predictions yung mga ground truth 
- If were trying to compute the IOU it is based on the box but the important is not to be exactly the same as the ground truth bounding box. It is important to check if the microbleeds are in the bounding box

Valid niyo ba yung 50 padding? 
- Valid naman it makes sense lalo na ang hirap icontrol yung predictions later on 

Anong loss function? 
- Look for other loss functions 

Yung proposed regions lang 
- The proposed regions is expected to produce regions si ViT yung  magsasabi if meron or wala 
- It could affect the false positive average 
- Meron silang loss ng classification and the bounding boxes 
- The false positives here doesnt necessarily apply 
- Kunyare walang microbleed yung MRI kahit nag proposed siya pero nagpropose si RPN may 

Training separately 
- Kailnganan siya pagtagpiin in onepoint 
- Combine both losses to create an overall loss 

Kung ano yung problem in the study kailangan niyo irecreate with improving on it 

Yung pagcreate ng dataloader class 
- Transform bago pagsamahin yung lahat 
- Especially yung normalization is per cohort 
- 