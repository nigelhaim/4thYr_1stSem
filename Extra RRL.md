

**Region proposal on Smaller objects**

Wu et al., (2023) proposed a two-stage model named RS Transformer that utilizes the capabilities of the Swin Transformer. Swin Transformers is another form of Vision Transformer that produces a hierarchical feature representation and has linear computational complexity concerning input image size (Liu et al., 2021). However, the Swin Transformer often lacks effective global information integration and discriminative feature representation. The Swin Transformer has the capability to have a stronger feature extraction by incorporating CNN's local and hierarchical structure, which utilizes attention mechanisms to produce a more interpretable model and examine the attention distribution. However, it is also enhanced with a feature pyramid network to allow for a better fusion of feature maps. A Region proposal Network then follows it to produce candidate regions in the k anchor boxes to the regression layer and candidate the prediction boundaries as a target. The ROI finds the feature map corresponding toto the candidate box and processes a feature map of different proportions into a fixed size. Their proposed feature extraction enhances the alignment of global features that improve the localization accuracy while reducing the computational cost of the transformer through the implementation of the shift window model. They conclude that the RS Transformer can be used not only for agriculture but for tasks in complex datasets such as transportation, medicine, and industrial devices. 

**Vision Transformers on Tiny objects**

Microbleeds tend to be very small, and some structures or lesions exhibit susceptibility effects that can mimic CMBs (Puy et al., 2021). Camouflage object detection (COD) focuses on detecting and segmenting objects that are seamlessly integrated into their surroundings (Hao et al., 2024). Numerous studies have attempted to utilize vision transformers for COD and shown promising performance. However, one of the major issues within the existing techniques is that the implementation of vision transformers to COD is less effective in local feature modeling for transformer backbones. The study of Huang et al. (2023) argued that both global context and local features play essential roles in COD tasks. However, they observed that most transformer-based methods need a locality mechanism for information exchange within local regions. They also argued that global context and local features are essential in Camouflage object detection tasks. (Huang et al., 2023). 

**Region proposal Vision Transformers**

Despite the good performance of Vision Transformers on multiple tasks, it doesn't perform well on small amounts of data. One of the reasons of the success of the Constitutional Neural Networks as a pillar of vision machine learning is because of the inductive bias that includes translational invariance and scale invariance (Ge et al., 2022). Without complex network structures (Ge et al., 2022) propose a model of RPViT that divides the image and preserves the scale invariance and locality of objects through a vision transformer based on a region proposal network. They also improve the transformer architecture through a multi-class token approach that learns local and global relationships. They concluded that the RPViT shows effectiveness on the ImageNet dataset and achieved a high classification accuracy of 75.3% on 4.8M and 82.0% on 23.6M parameters. 


## References 

Wu, T., Shi, L., Zhang, L., Wen, X., Lu, J., & Li, Z. (2023). RS Transformer: A Two-Stage Region Proposal Using Swin Transformer for Few-Shot Pest Detection in Automated Agricultural Monitoring Systems. _Applied Sciences_, _13_(22), 12206. https://doi.org/10.3390/app132212206


Ge, J., Wang, Q., Tong, J., & Gao, G. (2022, January 7). _RPViT: Vision Transformer Based on Region Proposal_. ACM Digital Library. https://doi.org/10.1145/3512388.3512421

Hao, C., Yu, Z., Liu, X., Xu, J., Yue, H., & Yang, J. (2024, February 29). _A Simple yet Effective Network based on Vision Transformer for Camouflaged Object and Salient Object Detection_. arXiv.org. https://arxiv.org/abs/2402.18922

Puy, L., Pasi, M., Rodrigues, M., Van Veluw, S. J., Tsivgoulis, G., Shoamanesh, A., & Cordonnier, C. (2021). Cerebral microbleeds: from depiction to interpretation. _Journal of Neurology Neurosurgery & Psychiatry_, _92_(6), 598–607. https://doi.org/10.1136/jnnp-2020-323951

Huang, Z., Dai, H., Xiang, T., Wang, S., Chen, H., Qin, J., & Xiong, H. (2023, March 26). _Feature Shrinkage Pyramid for Camouflaged Object Detection with Transformers_. arXiv.org. https://arxiv.org/abs/2303.14816

Liu, Z., Lin, Y., Cao, Y., Hu, H., Wei, Y., Zhang, Z., Lin, S., & Guo, B. (2021, March 25). _Swin Transformer: Hierarchical Vision Transformer using Shifted Windows_. arXiv.org. https://arxiv.org/abs/2103.14030