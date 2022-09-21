# IFCE TJW

### Utilizando REST para salvar usuário 

### POST: 
- URL:
  - http://localhost:8080/users
- Json:
```json
{
  "name": "Thiago",
  "email": "thi@gmail.com",
  "password": "123456",
  "address":
  {
    "zipCode": "00000-000",
    "city": "Fortaleza"
  },
  "phones" : ["+5585999999999", "+5585999999998"]
}
```