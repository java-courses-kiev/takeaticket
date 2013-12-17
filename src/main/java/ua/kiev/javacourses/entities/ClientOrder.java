package ua.kiev.javacourses.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class ClientOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
		
	private int someField;;
	
	@OneToMany(mappedBy = "clientOrder", cascade = CascadeType.ALL)
	private List<Ticket> tickets = new ArrayList<Ticket>();

	public ClientOrder() {/*NOP*/}
		
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public int getSomeField() {
		return someField;
	}

	public void setSomeField(int someField) {
		this.someField = someField;
	}
	
}
