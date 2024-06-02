const express = require('express');
const { exec } = require('child_process');
const app = express();
const port = 3000;

app.use(express.static('web'));

app.get('/run-tests', (req, res) => {
    exec('mvn test', (error, stdout, stderr) => {
        if (error) {
            console.error(`Error ejecutando las pruebas: ${error}`);
            return res.json({ results: `Error ejecutando las pruebas: ${stderr}` });
        }
        res.json({ results: stdout });
    });
});

app.listen(port, () => {
    console.log(`Servidor escuchando en http://localhost:${port}`);
});
