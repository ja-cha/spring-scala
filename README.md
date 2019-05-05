### api 
    /swagger-ui.html
        
### h2 config 
    /h2-console
    
   ```Get All Users```
   
   ```
   curl -X GET --header 'Accept: application/json' 'http://localhost:8080/users'
   ``` 
   
   ```Create User```
   
   ```curl -X POST --header 'Content-Type: application/json' --header 'Accept: text/plain' -d '{
        "birthDate": "2019-05-05T06:22:03.035Z",
        "id": 1005,
        "name": "John"
      }' 'http://localhost:8080/user'
   ```
   
   ```Update User```
   
   ```
   curl -X PUT --header 'Content-Type: application/json' --header 'Accept: text/plain' -d '{
        "birthDate": "2019-05-05T06:22:03.035Z",
        "id": 0,
        "name": "Jan"
      }' 'http://localhost:8080/user/{id}'
   ```
      
       
```Get a Particular User```

  ```
  curl -X GET --header 'Accept: application/json' 'http://localhost:8080/users/0'
  ``` 
   