document.getElementById('runTests').addEventListener('click', function() {
    fetch('/run-tests')
        .then(response => response.json())
        .then(data => {
            document.getElementById('testResults').textContent = data.results;
        })
        .catch(error => {
            console.error('Error al ejecutar las pruebas:', error);
            document.getElementById('testResults').textContent = 'Error al ejecutar las pruebas.';
        });
});

