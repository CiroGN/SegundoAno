<!DOCTYPE html>
<html>
<body>

<?php
// Função para mover os zeros para o final do vetor
function moverZerosParaFinal(&$vetor) {
    $n = count($vetor);
    $j = 0;

    // Move os elementos diferentes de zero para o início do vetor
    for ($i = 0; $i < $n; $i++) {
        if ($vetor[$i] != 0) {
            $vetor[$j] = $vetor[$i];
            $j++;
        }
    }

    // Preenche o restante do vetor com zeros
    for (; $j < $n; $j++) {
        $vetor[$j] = 0;
    }
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $vetorOriginal = $_POST["vetor"];

    // Verifica se o vetor é uma lista de números separados por espaço
    if (preg_match('/^(\d+\s+)*\d+$/', $vetorOriginal)) {
        $vetor = explode(" ", $vetorOriginal);

        // Converte os elementos do vetor para números inteiros
        $vetor = array_map('intval', $vetor);

        moverZerosParaFinal($vetor);

        echo "Vetor na ordem original: " . $vetorOriginal . "<br>";
        echo "Vetor com os zeros deslocados para o final: " . implode(" ", $vetor);
    } else {
        echo "Por favor, insira um vetor válido de números separados por espaço.";
    }
}
?>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <h1>Mover Zeros para o Final</h1>
    <label for="vetor">Insira um vetor de números separados por espaço:</label>
    <input type="text" name="vetor" required>
    <br>

    <input type="submit" value="Mover Zeros">
</form>

</body>
</html>
