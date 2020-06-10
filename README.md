# customer-orders API


**How to use the API**

GET/ 
 - /customer/all
 ```json
 Response:
[
    {
       {
            "id": 1001,
            "name": "Aivaras",
            "surname": "Aivaričius",
            "companyName": "Aivaras LT",
            "companyCode": "ALT",
            "personalCode": 656656565,
            "address": "Gatve 26",
            "orderedServices": [
                {
                    "id": 1111,
                    "name": "Namų internetas",
                    "type": "INTERNET",
                    "description": "Geras planas",
                    "activeFrom": "2020-06-09T21:00:00.000+00:00",
                    "activeTo": "2020-12-11T22:00:00.000+00:00"
                }
            ]
        },
        {
            "id": 1002,
            "name": "Tomas",
            "surname": "Tomavičius",
            "companyName": "LT Televizija",
            "companyCode": "LTT",
            "personalCode": 356568912,
            "address": "Gatve 30",
            "orderedServices": [
                {
                    "id": 4444,
                    "name": "Kelionių internetas",
                    "type": "INTERNET",
                    "description": "Visai nieko planas",
                    "activeFrom": "2020-05-09T21:00:00.000+00:00",
                    "activeTo": "2020-10-21T21:00:00.000+00:00"
                }
            ]
        },
    }
]
 ```
 - /customer/{**id**}
 ```json
 Response:
{
    "id": 1002,
    "name": "Tomas",
    "surname": "Tomavičius",
    "companyName": "LT Televizija",
    "companyCode": "LTT",
    "personalCode": 356568912,
    "address": "Gatve 30",
    "orderedServices": [
        {
            "id": 4444,
            "name": "Kelionių internetas",
            "type": "INTERNET",
            "description": "Visai nieko planas",
            "activeFrom": "2020-05-09T21:00:00.000+00:00",
            "activeTo": "2020-10-21T21:00:00.000+00:00"
        },
        {
            "id": 5555,
            "name": "Daiktų internetas",
            "type": "INTERNET",
            "description": "Man patinka planas",
            "activeFrom": "2019-09-09T21:00:00.000+00:00",
            "activeTo": "2021-09-18T21:00:00.000+00:00"
        }
    ]
}
 ```
 - /order/all
 ```json
Response:
[
    {
        "orderId": 1111,
        "customerName": "Aivaras",
        "name": "Namų internetas",
        "description": "Geras planas",
        "type": "INTERNET",
        "activeFrom": "2020-06-09T21:00:00.000+00:00",
        "activeTo": "2020-12-11T22:00:00.000+00:00"
    },
    {
        "orderId": 2222,
        "customerName": "Aivaras",
        "name": "Išmani televizija",
        "description": "Super planas",
        "type": "TV",
        "activeFrom": "2019-12-31T22:00:00.000+00:00",
        "activeTo": "2021-12-31T22:00:00.000+00:00"
    },
    {
        "orderId": 3333,
        "customerName": "Aivaras",
        "name": "Nešiojamas kompiuteris",
        "description": "Liuks planas",
        "type": "LAPTOP",
        "activeFrom": "2019-05-18T21:00:00.000+00:00",
        "activeTo": "2021-05-18T21:00:00.000+00:00"
    }
]
 ```
 - /order/all/{**id**}
 ```json
Response:
    {
        "orderId": 4444,
        "customerName": "Tomas",
        "name": "Kelionių internetas",
        "description": "Visai nieko planas",
        "type": "INTERNET",
        "activeFrom": "2020-05-09T21:00:00.000+00:00",
        "activeTo": "2020-10-21T21:00:00.000+00:00"
    }
 ```

POST/ 
 - /order/new
```json
Body :
{
	"customer":{
	"name": "Tomas",
	"surname": "Pavardadienis",
	"companyName": "UAB jega",
	"companyCode": "JJJ",
	"personalCode" : 54654645645,
	"address": "Gatve 26",
	"orderedServices": [
		{
			"name": "pirmas",
			"type":"NEW",
			"description":"asdsafa",
			"activeFrom":"2019-03-29",
			"activeTo": "2020-03-29"
		}
		]
	}
}
```
 DELETE/ 
  - /order/delete/{**id**}
  ```json
  Response : "Order with id : {id} has been deleted..."

  ```
  

 