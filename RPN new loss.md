---
sticker: lucide//skull
---



## L1 + GIOU

| Alpha and Beta                  | History per fold                     | Sample Image                             | Average scores                                                                                                                                                                                                |
| ------------------------------- | ------------------------------------ | ---------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| alpha=1<br>beta = 1             | ![[aplpha_1_beta_1.png]]             | ![[alpha_1_beta_1_sample.png]]           | RPN Test Set Performance Metrics<br>Average IOU: 0.09987664926601084 <br>Average Precision: 0.1297573348409251 <br>Average Recall: 0.20664940335248644 <br>Average F1 Score: 0.14712027287796925              |
| alpha = 0.2<br>beta = 0.8       | ![[Pasted image 20241121113148.png]] | ![[Pasted image 20241121113220.png]]     | <br>RPN Test Set Performance Metrics <br>Average IOU: 0.15482194604058014 <br>Average Precision: 0.16333881702862288 <br>Average Recall: 0.5397969092193403 <br>Average F1 Score: 0.23659619704673163<br>     |
| alpha = 0.8<br>beta = 0.2       | ![[Pasted image 20241121120348.png]] | ![[Pasted image 20241121120400.png]]     | RPN Test Set Performance Metrics <br>Average IOU: 0.21830740112223124 <br>Average Precision: 0.27682117459021116 <br>Average Recall: 0.4478963821342116 <br>Average F1 Score: 0.3213597753134213              |
| alpha = 0.5<br>beta = 0.5       | ![[Pasted image 20241121124830.png]] | ![[Pasted image 20241121124924.png]]     | RPN Test Set Performance Metrics <br>Average IOU: 0.0574208339578227 <br>Average Precision: 0.09323572563497644 <br>Average Recall: 0.08378472610523827 <br>Average F1 Score: 0.0829081118106842              |
| alpha = 0.3<br>beta = 0.7       | ![[Pasted image 20241121134034.png]] | <br>![[Pasted image 20241121134030.png]] | RPN Test Set Performance Metrics <br>Average IOU: 0.1100832937579406 <br>Average Precision: 0.11924138810289533 <br>Average Recall: 0.31699844653669157 <br>Average F1 Score: 0.16402227737401662             |
| <br>alpha = 0.1<br>beta = 0.9   | ![[Pasted image 20241121141221.png]] | ![[Pasted image 20241121141311.png]]     | RPN Test Set Performance Metrics <br>Average IOU: 0.16342736757115314<br>Average Precision: 0.17637251842963067 <br>Average Recall: 0.49064041556496374 <br>Average F1 Score: 0.24366893007567053<br><br><br> |
| <br>alpha = 0.15<br>beta = 0.85 | ![[Pasted image 20241121144401.png]] | ![[Pasted image 20241121144411.png]]     | RPN Test Set Performance Metrics <br>Average IOU: 0.10462246309769782 <br>Average Precision: 0.1170930035020176 <br>Average Recall: 0.32223638515723374 <br>Average F1 Score: 0.1559263516413538              |
| alpha = 0.7<br><br>beta = 0.3   | ![[Pasted image 20241121203419.png]] | ![[Pasted image 20241121203415.png]]     | RPN Test Set Performance Metrics <br>Average IOU: 0.05405161482723135 <br>Average Precision: 0.06323763794804874 <br>Average Recall: 0.1375369492330049 <br>Average F1 Score: 0.08127477372947492             |


## SmoothL1 + GIOU

| Alpha and Beta                  | History per fold                     | Sample Image                         | Average scores                                                                                                                                                                                      |
| ------------------------------- | ------------------------------------ | ------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| alpha = 0.2<br>beta = 0.8       | ![[Pasted image 20241121164017.png]] | ![[Pasted image 20241121164035.png]] | Average IOU: 0.038548487228782555 <br>Average Precision: 0.038860538052885155 <br>Average Recall: 0.1931706146190041 <br>Average F1 Score: 0.06270892737727415                                      |
| alpha = 0.8<br>beta = 0.2       | ![[Pasted image 20241121171019.png]] | ![[Pasted image 20241121171032.png]] | RPN Test Set Performance Metrics <br>Average IOU: 0.058007642175806194 <br>Average Precision: 0.06378446366441878 <br>Average Recall: 0.15691788541643242 <br>Average F1 Score: 0.08579270376970893 |
| alpha = 0.3<br><br>beta = 0.7   | ![[Pasted image 20241121175001.png]] | ![[Pasted image 20241121174943.png]] | RPN Test Set Performance Metrics <br>Average IOU: 0.08053064103189267 <br>Average Precision: 0.08152870104501123 <br>Average Recall: 0.3835645085886905 <br>Average F1 Score: 0.13037537720642592   |
| alpha = 0.1<br><br>beta = 0.9   | ![[Pasted image 20241121182158.png]] | ![[Pasted image 20241121182146.png]] | RPN Test Set Performance Metrics <br>Average IOU: 0.03575016369945125 <br>Average Precision: 0.035933607189278856 <br>Average Recall: 0.19689498951560575 <br>Average F1 Score: 0.05899979401575891 |
| alpha = 0.15<br><br>beta = 0.85 | ![[Pasted image 20241121185841.png]] | ![[Pasted image 20241121185823.png]] | RPN Test Set Performance Metrics Average IOU: 0.0 Average Precision: 0.0 Average Recall: 0.0 Average F1 Score: 0.0                                                                                  |
| alpha = 0.7<br><br>beta = 0.3   | ![[Pasted image 20241121194224.png]] | ![[Pasted image 20241121194243.png]] | Average IOU: 0.10076720334197346 <br>Average Precision: 0.1077379912922257 <br>Average Recall: 0.3198015518878635 <br>Average F1 Score: 0.15361712927881038                                         |







![[Pasted image 20241121234732.png]]
















