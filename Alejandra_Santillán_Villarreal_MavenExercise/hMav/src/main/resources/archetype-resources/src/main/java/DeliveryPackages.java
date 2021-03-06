package run;
// Generated Jun 11, 2021, 1:48:56 AM by Hibernate Tools 5.4.30.Final

import java.util.Date;

/**
 * DeliveryPackages generated by hbm2java
 */
public class DeliveryPackages implements java.io.Serializable {

	private Integer idPackage;
	private DeliveryCompany deliveryCompany;
	private PurchaseOrders purchaseOrders;
	private int packageNumber;
	private Date deliveryDate;

	public DeliveryPackages() {
	}

	public DeliveryPackages(DeliveryCompany deliveryCompany, PurchaseOrders purchaseOrders, int packageNumber,
			Date deliveryDate) {
		this.deliveryCompany = deliveryCompany;
		this.purchaseOrders = purchaseOrders;
		this.packageNumber = packageNumber;
		this.deliveryDate = deliveryDate;
	}

	public Integer getIdPackage() {
		return this.idPackage;
	}

	public void setIdPackage(Integer idPackage) {
		this.idPackage = idPackage;
	}

	public DeliveryCompany getDeliveryCompany() {
		return this.deliveryCompany;
	}

	public void setDeliveryCompany(DeliveryCompany deliveryCompany) {
		this.deliveryCompany = deliveryCompany;
	}

	public PurchaseOrders getPurchaseOrders() {
		return this.purchaseOrders;
	}

	public void setPurchaseOrders(PurchaseOrders purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

	public int getPackageNumber() {
		return this.packageNumber;
	}

	public void setPackageNumber(int packageNumber) {
		this.packageNumber = packageNumber;
	}

	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

}
