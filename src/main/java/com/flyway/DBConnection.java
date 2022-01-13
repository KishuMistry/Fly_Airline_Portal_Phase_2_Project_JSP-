package com.flyway;
//author Kishan Mistry Developer at Trivium ESolutions Pvt Ltd.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
	  Create table login(
	 username varchar(256),
	 password varchar(256)
	 );
	 insert into login values("Kishan","Kishan123");
	 insert into login values("Nirin","Nirin123");
	 
	 create table flightDetails(
	airlineName varchar(40),
	price int,
	flightNo int,
	sourceCity varchar(50),
	destinationCity varchar(50),
	departureTime time,
	arrivalTime time,
	totalSeats int,
	bookedSeats int,
	seatAvailability int,
	travelDate date,
	class varchar(40),
	Primary Key(flightNo)
	 );
	 
	 insert into flightDetails values("IndiGo",5000,101,"Bangalore","Surat","08:00:00","09:00:00",100,80,20,"2022-05-25","economy");
	  insert into flightDetails values("IndiGo",6000,102,"Mumbai","Surat","04:00:00","05:00:00",200,180,20,"2022-05-26","economy");
	 
	 create table register(
	 username varchar(256),
	 fullName varchar(256),
	 address varchar(500),
	 age int,
	 contact varchar(13),
	 idType varchar(40),
	 idNo varchar(40),
	 country varchar(40),
	 flightNo varchar(40),
	 travelDate date,
	 passengers int,
	 Primary Key(username)
	 );
	 
	 insert into register values("Kishan","Kishan Mistry","Keshav Kunj Valsad",23,"9737151837"," Passport","KJDHAD891","India","PNR1221","2022-05-26",120);
	 
	 insert into register values("Hensi","Hensi Mistry","Gokuldham",13,"9737151888"," Passport","WEQHAD891","India","PBBH321","2022-05-25",200);
 **/
public class DBConnection {
	Connection conn;
	
	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_world", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public void closeConnection() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}