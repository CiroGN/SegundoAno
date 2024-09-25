<!DOCTYPE html>
<html>
<body>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $nota1 = $_POST["nota1"];
  $nota2 = $_POST["nota2"];

  // Verifica se as notas são numéricas
  if (is_numeric($nota1) && is_numeric($nota2)) {
    $media = ($nota1 + $nota2) / 2;

    echo "A média obtida foi: " . number_format($media, 1, '.', '') . "<br>";

    // Verifica as condições para exibir a mensagem adequada
    if ($media < 4.0) {
      echo "Reprovado";
    } elseif ($media >= 4.0 && $media < 7.0) {
      echo "Exame";
    } else {
      echo "Aprovado";
    }
  } else {
    echo "Por favor, insira notas válidas.";
  }
}
?>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
  <h1>Calculadora de Média</h1>
  <label for="nota1">Informe a primeira nota:</label>
  <input type="text" name="nota1" required>
  <br>

  <label for="nota2">Informe a segunda nota:</label>
  <input type="text" name="nota2" required>
  <br>

  <input type="submit" value="Calcular Média">
</form>

</body>
</html>
