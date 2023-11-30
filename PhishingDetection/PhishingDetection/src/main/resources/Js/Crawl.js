 document.getElementById('crawl').addEventListener('click', function () {
        sendData('/api/crawlHTML');
 });


function sendData(endpoint) {
    var url = document.getElementById('urlCheck').value;

    fetch(endpoint, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: new URLSearchParams({
            'URL': url
        })
    })
        .then(response => response.json())
        .then(data => {
            // Xử lý dữ liệu trả về từ server (nếu cần)
            console.log(data);
        })
        .catch(error => console.error('Error:', error));
}
