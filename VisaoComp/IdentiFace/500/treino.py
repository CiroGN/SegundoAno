from ultralytics import YOLO

if __name__ == "__main__":
    # Carrega o modelo YOLO
    model = YOLO("yolo11n.pt")

    # Treina o modelo
    results = model.train(
        data="C:/Users/cirog/source/SegundoAno/VisaoComp/IdentiFace/500/dataset500/data.yaml",
        epochs=30,
        imgsz=640,
        project="SegundoAno/VisaoComp/IdentifFace/dataset500",
        name = ""
    )

    # Após o treinamento, carregue o modelo salvo para realizar previsões
    trained_model = YOLO("SegundoAno/VisaoComp/IdentifFace/dataset500/train/weights/best.pt")

    # Realiza a previsão usando o modelo treinado
    predictions = trained_model.predict(
        source="SegundoAno/VisaoComp/IdentifFace/dataset500/032_CIEE_FORMATURA_30092022.JPG",
        save=True,
        imgsz=320,
        conf=0.5,
        project="SegundoAno/VisaoComp/IdentifFace/dataset500"
    )
