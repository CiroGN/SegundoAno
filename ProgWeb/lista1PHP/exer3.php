<!DOCTYPE html>
<html>
<body>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $vetor = $_POST["vetor"];

  // Verifica se o vetor é uma lista de números separados por vírgula
  if (preg_match('/^(\d+,)*\d+$/', $vetor)) {
    $valores = explode(",", $vetor);

    // Converte os elementos do vetor para números inteiros
    $valores = array_map('intval', $valores);

    // Remove possíveis valores duplicados no vetor
    $valores = array_unique($valores);

    // Ordena o vetor em ordem decrescente
    rsort($valores);

    // Verifica se há pelo menos dois valores no vetor
    if (count($valores) >= 2) {
      echo "O maior valor é: " . $valores[0] . "<br>";
      echo "O segundo maior é: " . $valores[1];
    } else {
      echo "deve conter pelo menos dois valores diferentes.";
    }
  } else {
    echo "insira um inteiros separados por vírgula.";
  }
}
?>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
  <h1>Encontrar Segundo Maior Valor</h1>
  <label for="vetor">Insira um vetor de inteiros separados por vírgula:</label>
  <input type="text" name="vetor" required>
  <br>

  <input type="submit" value="Maiores valores">
</form>

</body>
</html>
