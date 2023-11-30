document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('check').addEventListener('click', function () {
        sendData('/api/analystfromdataset');
    });
});

function sendData(endpoint) {
    fetch(endpoint, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: new URLSearchParams({
            'URL': '/info'
        })
    })
        .then(response => response.json())
        .then(data => {
            displayJsonData(data);
            // Redirect to the '/info' page
            window.location.href = '/info';
        })
        .catch(error => console.error('Error:', error));
}

function displayJsonData(jsonData) {
    var tableHtml = '<table>';
    for (var key in jsonData) {
        if (jsonData.hasOwnProperty(key)) {
            tableHtml += '<tr><th>' + key + '</th><td>' + jsonData[key] + '</td></tr>';
        }
    }
    tableHtml += '</table>';
    document.getElementById('jsonTable').innerHTML = tableHtml;
}
