fetch("http://127.0.0.1:8082/api/auth/login", {
    method: 'POST',
    headers: {'Content-Type': 'application/json'},
    body: JSON.stringify({username: 'admin', passwd: '123456'})
}).then(r =>{})
