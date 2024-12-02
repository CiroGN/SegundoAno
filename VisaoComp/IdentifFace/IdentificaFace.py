from ultralytics import YOLO

# Load a pre-trained YOLO model (you can choose n, s, m, l, or x versions)
model = YOLO("yolo11n.pt")

# Start training on your custom dataset
# model.train(data="C:/Users/cirog/source/SegundoAno/VisaoComp/IdentifFace/asasa.v1i.yolov8/data.yaml", epochs=30, imgsz=640)

model.predict(data = 'C:/Users/cirog/source/SegundoAno/VisaoComp/IdentifFace/runs/detect/train3/weights/best.pt',source ="SegundoAno/VisaoComp/IdentifFace/rosto.jpg",project="C:/Users/cirog/source/SegundoAno/VisaoComp/IdentifFace",save=True, imgsz=320, conf=0.5)