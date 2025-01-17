from PIL import Image
import numpy as np
import os

def apply_mean_filter(image):
    width, height = image.size
    pixels = np.array(image) # array pixels rgb
    output = np.zeros_like(pixels) # array vazio

    for x in range(1, width - 1): # (1, width - 1) ignora bordas x
        for y in range(1, height - 1): # (1, height - 1) ignora bordas y
            for c in range(pixels.shape[2]):  # Para cada canal de cor rgb
                region = pixels[y - 1:y + 2, x - 1:x + 2, c] # matriz 3x3 
                output[y, x, c] = np.mean(region) # calcula a media da mascara

    return Image.fromarray(output.astype(np.uint8)) # converte garantindo o intervalo de 0 a 255 rgb

def apply_median_filter(image):
    width, height = image.size
    pixels = np.array(image)
    output = np.zeros_like(pixels)

    for x in range(1, width - 1):
        for y in range(1, height - 1):
            for c in range(pixels.shape[2]):
                region = pixels[y - 1:y + 2, x - 1:x + 2, c]
                output[y, x, c] = np.median(region)

    return Image.fromarray(output.astype(np.uint8))

def save_image(image, directory, filename):
    os.makedirs(directory, exist_ok=True)
    filepath = os.path.join(directory, filename)
    image.save(filepath)
    print(f"Imagem salva em: {filepath}")

if __name__ == "__main__":
    input_image = Image.open("C:/Users/cirog/source/SegundoAno/PDI/AtivFiltros/imagem.jpg")
    mean_filtered_image = apply_mean_filter(input_image)
    median_filtered_image = apply_median_filter(input_image)

    save_image(mean_filtered_image, "C:/Users/cirog/source/SegundoAno/PDI/AtivFiltros/resultados", "filtro_media.jpg")
    save_image(median_filtered_image, "C:/Users/cirog/source/SegundoAno/PDI/AtivFiltros/resultados", "filtro_mediana.jpg")

    mean_filtered_image.show()
    median_filtered_image.show()
