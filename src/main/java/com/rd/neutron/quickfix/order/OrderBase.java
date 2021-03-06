package com.rd.neutron.quickfix.order;



import java.math.BigDecimal;
import java.util.Map;


/**
 * Orders sent out by the system to Brokers. Orders of this type can 
 * be sent to any broker. The system will translate this order to the 
 * appropriate messages / protocol used by the broker. 
 *
 * @author Rohit Dhingra
 * @since 1.0.0
 */



public interface OrderBase extends Order {
    /**
     * The client assigned OrderID for this order. The factory
     * assigns orderIDs when creating orders. 
     *
     * @return the client assigned orderID for this order.
     *
     */
    OrderID getOrderID();

    /**
     * Sets the client assigned OrderID for this order.
     *
     * @param inOrderID the client assigned orderID for this order.
     *
     * @see #getOrderID() 
     */
    void setOrderID(OrderID inOrderID);
    /**
     * Gets the Side for the Order.
     *
     * @return the order Side.
     */
    OrderSide getSide();

    /**
     * Sets the Side for the Order.
     *
     * @param inSide the order Side.
     */
    void setSide(OrderSide inSide);

    /**
     * Gets the security's symbol.
     *
     * @return the security's symbol.
     */
    public TradableInstrument getSymbol();

    /**
     * Sets the security's symbol.
     *
     * @param inSymbol the security's symbol.
     */
    public void setSymbol(TradableInstrument inSymbol);

    /**
     * Gets the quantity for the Order.
     *
     * @return the quantity.
     */
    BigDecimal getQuantity();

    /**
     * Sets the quantity for the Order.
     *
     * @param inQuantity the quantity.
     */
    void setQuantity(BigDecimal inQuantity);

    /**
     * Gets the custom fields specified along with this order. Custom
     * fields may be optionally specified to specify order fields that
     * are not supported by this type.
     * <p>
     * For example, extra FIX field values may be supplied when sending
     * an order. When sending FIX field values, the map key should be
     * the integer field tag value and the map value should be the string
     * value of that field. 
     *
     * @return the custom fields for this order.
     */
    Map<String,String> getCustomFields();

    /**
     * Sets the custom fields for this order.
     *
     * @param inCustomFields the custom fields for this order.
     *
     * @see #getCustomFields() 
     */
    void setCustomFields(Map<String,String> inCustomFields);

    /**
     * Gets the account for the order. An account may be optionally
     * specified for an order.
     *
     * @return the account.
     */
    String getAccount();

    /**
     * Sets the account for the order.
     *
     * @param inAccount the account.
     */
    
    void setAccount(String inAccount);
    
    /**
     * 
     * @return
     */
    BigDecimal getLeavesQty() ;

    /**
     * 
     * @param inLeavesQty quantity open in market.
     */
	void setLeavesQty(BigDecimal inLeavesQty) ;

	/**
	 * 
	 * @return
	 */
	BigDecimal getLastShares() ;
	
	/**
	 * 
	 * @param inLastShares quantity last bought/sold
	 */
	void setLastShares(BigDecimal inLastShares) ;
	
	/**
	 * 
	 * @return cumulative quantity  filled.
	 */
	BigDecimal getCumQty();

	/**
	 * 
	 * @param inCumQty
	 */
	void setCumQty(BigDecimal inCumQty) ;
}
