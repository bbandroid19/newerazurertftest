%dw 2.0
import * from dw::test::Asserts
---
payload must equalTo([
  {
    "firstName": "jerry",
    "phoneNumber": "9048378192",
    "emailid": "jerry@gmail.com",
    "employeeId": 1234,
    "age": 24,
    "lastName": "joseph"
  }
])