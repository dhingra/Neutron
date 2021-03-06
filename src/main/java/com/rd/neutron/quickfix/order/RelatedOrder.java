package com.rd.neutron.quickfix.order;



/* $License$ */
/**
 * Orders that are related to an existing order. These orders
 * are usually used to cancel or replace an existing order. This type is
 * not meant to be used directly. Use one of its subtypes. 
 *
 * @author anshul@marketcetera.com
 * @version $Id: RelatedOrder.java 10229 2008-12-09 21:48:48Z klim $
 * @since 1.0.0
 */

public interface RelatedOrder extends Order {
    /**
     * The original order ID of the order that is being cancelled or replaced.
     *
     * @return the orderID of the order being cancelled or replaced.
     */
    OrderID getOriginalOrderID();

    /**
     * Set the original order ID of the order that is being cancelled.
     *
     * @param inOrderID the orderID of the order being cancelled.
     */
    void setOriginalOrderID(OrderID inOrderID);

    /**
     * The order ID assigned by broker to the original order.
     *
     * @return the broker assigned order ID.
     */
    String getBrokerOrderID();

    /**
     * Set the broker assigned order ID.
     * 
     * @param inBrokerOrderID the broker assigned order ID.
     */
    void setBrokerOrderID(String inBrokerOrderID);
}
