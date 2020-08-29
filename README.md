# ND035-P02-VehiclesAPI-Project

Project repository for JavaND Project 2, where students implement a Vehicles API using Java and Spring Boot that can communicate with separate location and pricing services.

## Instructions

Check each component to see its details and instructions. Note that all three applications
should be running at once for full operation. Further instructions are available in the classroom.

- [Vehicles API](vehicles-api/README.md)
- [Pricing Service](pricing-service/README.md)
- [Boogle Maps](boogle-maps/README.md)

## Dependencies

The project requires the use of Maven and Spring Boot, along with Java v11.


## 如果發現Swagger的post沒辦法過
試試看這個，原因是不要加id, manufacturer要存在才可以
```json
{
  "condition": "NEW",
  "details": {
    "body": "shannon",
    "engine": "3.6L V6",
    "externalColor": "red",
    "fuelType": "Gasoline",
    "manufacturer": {
      "code": 101,
      "name": "Chevrolet"
    },
    "mileage": 1234,
    "model": "Impala",
    "modelYear": 2018,
    "numberOfDoors": 4,
    "productionYear": 2018
  },
  "location": {
    "lat": 40.1234,
    "lon": 83.456
  }
}
```
