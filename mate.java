/* Sumas */
let sumScore = 0;
function checkSum() {
    const answer = parseInt(document.getElementById('sum-answer').value);
    const correctAnswer = window.sumCorrectAnswer;

    const feedback = document.getElementById('sum-feedback');
    if (answer === correctAnswer) {
        feedback.innerText = '¡Correcto!';
        feedback.classList.add('correct');
        feedback.classList.remove('incorrect');
        sumScore++;
        document.getElementById('sum-score').innerText = sumScore;
    } else {
        feedback.innerText = `Incorrecto. La respuesta correcta es ${correctAnswer}.`;
        feedback.classList.add('incorrect');
        feedback.classList.remove('correct');
    }

    // Generar nueva pregunta
    const num1 = getRandomInt(1, 20);
    const num2 = getRandomInt(1, 20);
    document.getElementById('sum-question').innerText = `¿Cuánto es ${num1} + ${num2}?`;
    window.sumCorrectAnswer = num1 + num2;

    // Limpiar campo y enfocar
    document.getElementById('sum-answer').value = '';
    document.getElementById('sum-answer').focus();
}