<!DOCTYPE html>
<html>
<body>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $numeros = $_POST["numeros"];

  // Verifica se a variável $numeros está configurada e é uma string
  if (isset($numeros) && is_string($numeros)) {
    $numerosArray = explode(",", $numeros);
    
    // Remove espaços em branco ao redor de cada número
    $numerosArray = array_map('trim', $numerosArray);
    
    // Converte os elementos do array para números
    $numerosArray = array_map('floatval', $numerosArray);

    // Verifica se há exatamente 10 números
    if (count($numerosArray) === 10) {
      $soma = array_sum($numerosArray);
      $media = $soma / count($numerosArray);

      echo "Números digitados: " . implode(", ", $numerosArray) . "<br>";
      echo "Média: " . $media . "<br>";
    } else {
      echo "Digite exatamente 10 números separados por vírgula.";
    }
  } else {
    echo "Por favor, insira 10 números válidos.";
  }
}
?>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
  <h1>Calculadora de Média</h1>
  <label for="numeros">Digite 10 números separados por vírgula:</label>
  <textarea id="numeros" name="numeros" rows="4" cols="50" required></textarea>
  <br>
  <input type="submit" value="Calcular Média">
</form>

</body>
</html>
