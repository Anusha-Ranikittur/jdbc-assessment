# Java JDBC Assessment

This assessment is for Java JDBC. Create an authors table using the following SQL query: This table will be used to store the authors of the books.

Please fork this repo to your github account and then clone to your local machine. Make the changes there and then push to your github account.

```sql
    Create table authors (
        id int not null auto_increment,
        first_name varchar(255),
        last_name varchar(255),
        genre varchar(50),
        email varchar(50),
        primary key (id)
    );
```

Use the following SQL queries to build your DAO:

```sql
    -- Insert into the Authors table
    Insert into authors (id, first_name, last_name, genre, email) values (?, ?, ?, ?, ?);

    -- Select from the Authors table
    Select * from authors;

    -- Select author by id
    Select * from authors where id = ?;

    -- Select authors by genre
    Select * from authors where genre = ?;
```

The Modal class is created and so is the DAO layer. Add implementation to the DAO layer and use JDBC to connect to the database.

Make sure the POM file is prepared for the project including all the necessary dependancies.