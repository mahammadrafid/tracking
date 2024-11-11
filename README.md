Scalable Tracking Number Generator API

Steps to run application with out IDE

1. Clone the project or download the zip file
2.  use maven to duild and use common : mvn clean install -DskipTests
3.  target folder will see tracking-1.jar file
4.  Run common : java -jar tracking-1.jar
5.  Able to run the application

Steps to verify the APis
to test next tracking number , open browser and hit below will get tracking number and created date
/next-tracking-number.

Example
http://localhost:8080/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2018-11-20T19:29:32%2B08%3A00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics

Sample response
{
  "trackingNumber": "EF9ZWZIUXFEE812M",
  "createdAt": "2018-11-20T19:29:32+08:00"
}


