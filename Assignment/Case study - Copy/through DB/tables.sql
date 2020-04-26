SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
PROD_CUST_BOOKED               TABLE
CUSTOMER                       TABLE
PRODUCTS                       TABLE
BOOK_PRODUCTS                  TABLE

SQL> desc customer;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 CUST_ID                                   NOT NULL NUMBER
 CUSTNAME                                           VARCHAR2(20)
 CONTACT_NO                                         NUMBER(12)

SQL> desc products;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 PROD_ID                                   NOT NULL NUMBER
 PRODNAME                                           VARCHAR2(20)
 STATUS                                             VARCHAR2(15)
 PRICE                                              NUMBER(10,2)

SQL> desc book_products;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 B_ID                                      NOT NULL NUMBER
 C_ID                                               NUMBER
 PROD_NAME                                          VARCHAR2(20)
 QUANTITY                                           NUMBER(3)
 DISCOUNT                                           NUMBER(3)
 TOTAL_AMOUNT                                       NUMBER(10,2)

SQL> desc pro_cust_booked;
ERROR:
ORA-04043: object pro_cust_booked does not exist


SQL> desc prod_cust_booked;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 B_ID                                      NOT NULL NUMBER
 C_ID                                               NUMBER
 PROD_NAME                                          VARCHAR2(20)
 QUANTITY                                           NUMBER(3)
 
 
 
 SQL> create table booked_prod_cust(b_id mediumint not null auto_increment);
create table booked_prod_cust(b_id mediumint not null auto_increment)
                                                      *
ERROR at line 1:
ORA-00907: missing right parenthesis


SQL> CREATE SEQUENCE "P_BOOKED_ID"
  2  START WITH 1
  3  INCREMENT BY 1
  4  CACHE 10;

Sequence created.

SQL> CREATE TABLE "BOOKED_PROD_CUST"(
  2  B_ID NUMBER(5) NOT NULL,
  3  C_ID NUMBER(5),
  4  PRODUCTNAME VARCHAR2(20),
  5  QUANTITY NUMBER,
  6  CONSTRAINT "PK_b_ID" PRIMARY KEY (B_ID)
  7  );

Table created.

SQL> CREATE OR REPLACE TRIGGER "TR_BOOKED_ID"
  2  BEFORE INSERT
  3  ON BOOKED_ROD_CUST
  4  REFERENCING NEW AS NEW OLD AS OLD
  5  FOR EACH ROW
  6  BEGIN
  7  if(:new.b_id id null) then
  8  select P_BOOKED_ID.nextval
  9  into :new.B_ID
 10  from dual;
 11  end if;
 12  END;
 13  /
ON BOOKED_ROD_CUST
   *
ERROR at line 3:
ORA-00942: table or view does not exist


SQL> CREATE OR REPLACE TRIGGER "TR_BOOKED_ID"
  2  BEFORE INSERT
  3  ON BOOKED_PROD_CUST
  4  REFERENCING NEW AS NEW OLD AS OLD
  5  FOR EACH ROW
  6  BEGIN
  7  if(:new.b_id id null) then
  8  select P_BOOKED_ID.nextval
  9  into :new.B_ID
 10  from dual;
 11  end if;
 12  END;
 13  /

Warning: Trigger created with compilation errors.

SQL> insert into booked_prod_cust(c_id, productname, quantity) values (2, 'sony', 3);
insert into booked_prod_cust(c_id, productname, quantity) values (2, 'sony', 3)
            *
ERROR at line 1:
ORA-04098: trigger 'CASESTUDY.TR_BOOKED_ID' is invalid and failed re-validation


SQL> insert into booked_prod_cust(c_id, productname, quantity) values (2, 'sony', 3);
insert into booked_prod_cust(c_id, productname, quantity) values (2, 'sony', 3)
            *
ERROR at line 1:
ORA-04098: trigger 'CASESTUDY.TR_BOOKED_ID' is invalid and failed re-validation


SQL> desc booked_prod_cust;
 Name                                                                                                                                   
 ---------------------------------------------------------------------------------------------------
 B_ID                                                                                                                                   
 C_ID                                                                                                                                   
 PRODUCTNAME                                                                                                                            
 QUANTITY                                                                                                                               

SQL> create table prod_cust_book(b_id number primary key, c_id number, productname varchar2(20), qua
ntity number);

Table created.

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
BOOKED_PROD_CUST               TABLE
BIN$VbTgzXkDRG+z29zxVtMYOg==$0 TABLE
PROD_CUST_BOOK                 TABLE
CUSTOMER                       TABLE
PRODUCTS                       TABLE
BOOK_PRODUCTS                  TABLE

6 rows selected.