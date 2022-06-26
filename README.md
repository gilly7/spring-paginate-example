"# spring-paginate-example" 

Pagination is the process of dividing data into suitable chunks to save resources.

PagingAndSortingRepository is an extension of CrudRepository to provide additional methods to retrieve entities using pagination and sorting

SpringPaginateExampleApplication is the entry point which sets up Spring Boot application.

```
$ mvn -q spring-boot:run
```

We run the application.
```
$ curl localhost:8080/countries/0/5
```
We get the first page of 5 rows. The indexing starts from 0.
```
$ curl localhost:8080/countries/1/5
```
Inspired by [ZetCode](https://zetcode.com/springboot/pagination/)

