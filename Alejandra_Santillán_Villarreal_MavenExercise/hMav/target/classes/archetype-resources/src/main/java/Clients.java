package run;
// Generated Jun 11, 2021, 1:48:56 AM by Hibernate Tools 5.4.30.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Clients generated by hbm2java
 */
public class Clients implements java.io.Serializable {

	private Integer idClient;
	private String name;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private Set creditCardses = new HashSet(0);
	private Set deliveryAdresses = new HashSet(0);

	public Clients() {
	}

	public Clients(String name, String lastName, String username, String password, String email) {
		this.name = name;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Clients(String name, String lastName, String username, String password, String email, Set creditCardses,
			Set deliveryAdresses) {
		this.name = name;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.creditCardses = creditCardses;
		this.deliveryAdresses = deliveryAdresses;
	}

	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getCreditCardses() {
		return this.creditCardses;
	}

	public void setCreditCardses(Set creditCardses) {
		this.creditCardses = creditCardses;
	}

	public Set getDeliveryAdresses() {
		return this.deliveryAdresses;
	}

	public void setDeliveryAdresses(Set deliveryAdresses) {
		this.deliveryAdresses = deliveryAdresses;
	}

}
