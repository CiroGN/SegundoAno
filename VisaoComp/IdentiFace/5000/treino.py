from ultralytics import YOLO

if __name__ == "__main__":
    # Carrega o modelo YOLO
    # model = YOLO("yolo11n.pt")

    # # Treina o modelo
    # results = model.train(
    #     data="C:/Users/cirog/source/SegundoAno/VisaoComp/IdentiFace/5000/dataset5000/data.yaml",
    #     epochs=30,
    #     imgsz=640,
    #     project="SegundoAno/VisaoComp/IdentiFace/5000",
    #     name = "modelo"
    # )

    # Após o treinamento, carregue o modelo salvo para realizar previsões
    trained_model = YOLO("SegundoAno/VisaoComp/IdentiFace/5000/modelo/weights/best.pt")

    # Realiza a previsão usando o modelo treinado
    predictions = trained_model.predict(
        source="SegundoAno/VisaoComp/IdentiFace/5000/imagem.jpg",
        save=True,
        imgsz=320,
        conf=0.5,
        project="SegundoAno/VisaoComp/IdentiFace/5000",
        name = "previsao"
    )
