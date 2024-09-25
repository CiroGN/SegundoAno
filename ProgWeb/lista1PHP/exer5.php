<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Calculadora de Viagem</title>
</head>
<body>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $tempo = $_POST["tempo"];
    $velocidadeMedia = $_POST["velocidadeMedia"];

    // Verifica se os valores são numéricos e positivos
    if (is_numeric($tempo) && is_numeric($velocidadeMedia) && $tempo > 0 && $velocidadeMedia > 0) {
        // Calcula a distância percorrida e a quantidade de litros utilizados
        $distancia = $tempo * $velocidadeMedia;
        $litros = $distancia / 12;

        echo "Velocidade Média: " . $velocidadeMedia . " km/h<br>";
        echo "Tempo Gasto na Viagem: " . $tempo . " horas<br>";
        echo "Distância Percorrida: " . $distancia . " km<br>";
        echo "Quantidade de Litros Utilizados: " . number_format($litros, 2, '.', '') . " litros";
    } else {
        echo "Por favor, insira valores válidos para tempo e velocidade média.";
    }
}
?>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <h1>Calculadora de Viagem</h1>
    <label for="tempo">Tempo gasto na viagem (horas):</label>
    <input type="text" name="tempo" required>
    <br>

    <label for="velocidadeMedia">Velocidade média (km/h):</label>
    <input type="text" name="velocidadeMedia" required>
    <br>

    <input type="submit" value="Calcular">
</form>

</body>
</html>
