### This is the info-log of the pre-challenge for Alkemy in JAVA

## ~~USING THEIA Blueprint (as IDE)~~
## USING IntelliJ as IDE

# Dependencies
	*Spring Web*
	*Spring Dev Tools*
	*Lomback*
	*Spring Data JPA*
	*MySQL driver*


1. Change the server.port to 4000
2. DB created under icon 's name
3. Under resources application.properties *DATASOURCE *Hibernate *SQL


server.port=4000
```
# DataSource 
# defino donde se encuentra mi DB
spring.datasource.url=jdbc:mysql://localhost:3306/icon
spring.datasource.username=root
spring.datasource.password=Anderson2985

# Hibernate
spring.jpa.hibernate.ddl-auto=update

# SQL
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=false
```
