package ua.kiev.javacourses.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	
	private String destinationStation;
	
	private String departureStation;
	
	private String trainNumber; 
	
	private String ticketClass;
	
	private byte place;
	
	private byte wagon;
	
	@Temporal(TemporalType.DATE)
	private Date arrivalTime; 
	
	@Temporal(TemporalType.DATE)
	private Date departureTime;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "orderId")
	private ClientOrder clientOrder;
	
	public Ticket(){/*NOP*/}
																
	public Ticket(int ticketId, String destinationStation, String departureStation, byte wagon, byte place,
		String trainNumber, String ticketClass,Date arrivalTime, Date departureTime, ClientOrder order) {
		
		this.ticketId = ticketId;
		this.destinationStation = destinationStation;
		this.departureStation = departureStation;
		this.trainNumber = trainNumber;
		this.place = place;
		this.wagon = wagon;
		this.ticketClass = ticketClass;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.clientOrder = order;
	}

	public ClientOrder getClientOrder() {
		return clientOrder;
	}

	public void setClientOrder(ClientOrder clientOrder) {
		this.clientOrder = clientOrder;
	}
		
	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTicketClass() {
		return ticketClass;
	}

	public void setTicketClass(String ticketClass) {
		this.ticketClass = ticketClass;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public byte getPlace() {
		return place;
	}

	public void setPlace(byte place) {
		this.place = place;
	}

	public byte getWagon() {
		return wagon;
	}

	public void setWagon(byte wagon) {
		this.wagon = wagon;
	} 
		
	@Override
	public String toString() {
		StringBuilder strb =new StringBuilder();
		strb.append("\n TicketId: " + ticketId);
		strb.append("\n TrainNumber: " + trainNumber);
		strb.append("\n Wagon: " + wagon);
		strb.append("\n Place: " + place);
		strb.append("\n TicketClass: " + ticketClass);
		strb.append("\n DepartureStation: " + departureStation);
		strb.append("\n DestinationStation: " + destinationStation) ;
		strb.append("\n DepartureTime: " + departureTime);
		strb.append("\n ArrivalTime: " + arrivalTime);
		strb.append("\n ClientOrder: " + clientOrder);
		return strb.toString();	
	}

}