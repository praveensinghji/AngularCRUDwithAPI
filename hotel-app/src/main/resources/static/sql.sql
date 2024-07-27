Create table hotel_Reservation(
id int not null auto_increment primary key,
guestName varchar(20) not null,
guestEmail varchar(20) not null,
mobNo varchar(13) not null,
roomNo int not null,
checkInDate date not null,
checkOutDate date not null
 ) engine = InnoDB auto_increment=1;