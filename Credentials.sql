create database if not exists ticketTrackerApplication;


use ticketTrackerApplication;


CREATE TABLE tickets (
        id bigint not null auto_increment,
        content longtext not null,
        created_on datetime(6),
        short_description varchar(255),
        title varchar(255) not null,
        updated_on datetime(6),
        url varchar(255) not null,
        PRIMARY KEY (id)
    );


INSERT INTO `tickets` VALUES 
(1,' Ticket 1 content ','2024-04-24 10:45:18.617432','Ticket 1 Description','Ticket 1 title','2022-12-18 10:45:18.617561','Ticket 1 url' ),
(2,' Ticket 2 content ','2024-04-24 10:45:18.630278','Ticket 2 Description','Ticket 2 title','2022-12-18 10:45:18.630297','Ticket 2 url');
 
 select * from tickets;