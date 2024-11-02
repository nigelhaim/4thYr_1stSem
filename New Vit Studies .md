[[Pasted image 20241023141445.png]]

```python
config = {

    'model': ISAVIT(

        d_model=1000,

        patch_size=16,

        dim_ff=2000

    ).to(device),

    'optimizer': torch.optim.Adam,

    'device': device,

    'epochs': 1,

    'loss': nn.BCEWithLogitsLoss(),

    # 'loss': nn.MSELoss(),

    'lr': 0.0001

}
```


```python
class PatchEmbedding(nn.Module):

    def __init__(self, patch_size, vit_dim):

        super().__init__()

        self.embed = nn.Sequential(

            nn.Linear(patch_size*patch_size, vit_dim),

            nn.Dropout(0.1)

        )

  

    def forward(self, x):

        out = self.embed(x)

        return out

  

class PositionalEncoding(nn.Module):

    def __init__(self, d_model: int, max_len: int = 5000, dropout: float = 0.1):

        super().__init__()

        self.dropout = nn.Dropout(p=dropout)

  

        position = torch.arange(max_len).unsqueeze(1)

        div_term = torch.exp(torch.arange(0, d_model, 2) * (-math.log(10000.0) / d_model))

        pe = torch.zeros(max_len, 1, d_model)

        pe[:, 0, 0::2] = torch.sin(position * div_term)

        pe[:, 0, 1::2] = torch.cos(position * div_term)

        self.register_buffer('pe', pe)

  

    def forward(self, x):

        x = x + self.pe[:x.size(0)]

        return self.dropout(x)

  

class SegmentationHead(nn.Module):

    def __init__(self, d_model, patch_size, channels=1):

        super().__init__()

        self.mlp = nn.Sequential(

            nn.Linear(d_model, patch_size*patch_size*channels)

        )

  

    def forward(self, x):

        out = self.mlp(x)

        return out

  

class ISAVIT(nn.Module):

    def __init__(self, d_model, patch_size, dim_ff, n_heads=1, n_layers=1):

        super().__init__()

        self.patchem = PatchEmbedding(patch_size=patch_size, vit_dim=d_model)

        self.posenc = PositionalEncoding(d_model=d_model)

        self.encoder_layer = nn.TransformerEncoderLayer(d_model=d_model, nhead=n_heads, dim_feedforward=dim_ff)

        self.trans_encoder = nn.TransformerEncoder(self.encoder_layer, num_layers=n_layers)

        self.mlp_head = SegmentationHead(d_model, patch_size, 1)

  

    def forward(self, x, i):

        print("Running forward pass")

        print("Input shape: ", x.shape)

        x = self.patchem(x)

        print("Patch embedding: ", x.shape)

        slices = self.posenc(x)

        print("Positional encoding: ", slices.shape)

        out = self.trans_encoder(slices)

        print("Transformer encoder: ", out.shape)

        out = self.trans_encoder(slices[i])

        print("Transformer encoder: ", out.shape)

        # linear output projection

        out = self.mlp_head(out)

        print("MLP head: ", out.shape)

        # patch to image

        return out
```

# ViT 

## Patch Embedding
### nn.Linear() 
- Input is a flattened patch_size * patch_size 
- Output is a given d_model 
- Performs a alffine transform to the flattened patches 

### nn.Dropout()
- randomly zeroes some of the elements of the input tensor with probability
- Disables some neurons 
- Should only be used for training and not used for inference 

## Positioal Embedding 
- We dont use numbering the patches because it is not efficient overtime especially if there are a lot of patches 
- The positions are vectors 
- Just basiall

### torch.arrange()
- Returns a 1-D tensor of size $\frac{end-start}{step}$ with values from the interval `[start, end)` taken with common difference `step` beginning from start.
- a tensor of max length 
- example 
- tensor([[   0],
        [   1],
        [   2],
        ...,
        [4997],
        [4998],
        [4999]])

### torch.exp()
- Returns a new tensor with the exponential of the elements of the input tensor

### torch.zeros()
- Returns a tensor filled with the scalar value 0, with the shape defined by the variable argument
- Puro 0 lang talaga 

### torch.sin()
Returns a new tensor with the sine of the elements of

### torch.cos()
Returns a new tensor with the cosine of the elements of `input`.



