<!DOCTYPE html>
<html>
<body>

<h1>IMC</h1>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
  <label for="altura">Altura (m):</label>
  <input type="text" name="altura" id="alturaInput" required>
  <br>

  <label for="peso">Peso (kg):</label>
  <input type="text" name="peso" id="pesoInput" required>
  <br>

  <input type="submit" value="Calcular IMC">
</form>

<pre>
<h1>
|    IMC          |          CATEGORIA                        |<br>
|--------------------------------------------------------------
| Abaixo de 18,5   |  Abaixo do peso                           |<br>
| 18,5 - 24,9      |  Saudável                                 |
| 25,0 - 29,9      |  Sobrepeso                                |
| 30,0 - 39,9      |  Obeso                                    |
| Acima de 40      |  Extremo ou alto risco de obesidade       |
</pre>
<h1>

<div id="resultado">
  <?php
  if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $altura = $_POST["altura"];
    $peso = $_POST["peso"];

    // Verifica se os valores são numéricos e positivos
    if (is_numeric($altura) && is_numeric($peso) && $altura > 0 && $peso > 0) {
      $imc = $peso / ($altura * $altura);

      // Exibe a categoria do IMC
      if ($imc < 18.5) {
        echo "IMC: " . number_format($imc, 2, '.', '') . " - Abaixo do peso";
      } elseif ($imc >= 18.5 && $imc <= 24.9) {
        echo "IMC: " . number_format($imc, 2, '.', '') . " - Saudável";
      } elseif ($imc >= 25 && $imc <= 29.9) {
        echo "IMC: " . number_format($imc, 2, '.', '') . " - Sobrepeso";
      } elseif ($imc >= 30 && $imc <= 39.9) {
        echo "IMC: " . number_format($imc, 2, '.', '') . " - Obeso";
      } else {
        echo "IMC: " . number_format($imc, 2, '.', '') . " - Extremo ou alto risco de obesidade";
      }
    } else {
      echo "Por favor, insira valores válidos para altura e peso.";
    }
  }
  ?>
</div>

</body>
</html>
