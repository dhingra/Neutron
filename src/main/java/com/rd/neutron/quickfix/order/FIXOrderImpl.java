package com.rd.neutron.quickfix.order;

import com.rd.neutron.quickfix.util.FIXUtil;
import quickfix.Message;



/* $License$ */
/**
 * Message that wraps a FIX Message. This class is public for the sake
 * of JAXB and is not intended for general use.
 *
 * @author anshul@marketcetera.com
 * @version $Id: FIXOrderImpl.java 10309 2009-02-09 20:04:30Z anshul $
 * @since 1.0.0
 */


public class FIXOrderImpl extends FIXMessageWrapper implements FIXOrder {

    @Override
    public SecurityType getSecurityType() {
        return FIXUtil.getSecurityType(getMessage());
    }

    @Override
    public BrokerID getBrokerID() {
        return mBrokerID;
    }

    @Override
    public void setBrokerID(BrokerID inBrokerID) {
        if(inBrokerID == null) {
            throw new NullPointerException();
        }
        mBrokerID = inBrokerID;
    }
    /**
     * Creates an instance.
     *
     * @param inMessage The FIX Message instance. Cannot be null.
     * @param inBrokerID the ID of the broker to which
     * this order should be sent. Cannot be null.
     */
    FIXOrderImpl(Message inMessage, BrokerID inBrokerID) {
        super(inMessage);
        if(inMessage == null || inBrokerID == null) {
            throw new NullPointerException();
        }
        mBrokerID = inBrokerID;
    }

    /**
     * Creates an uninitialized instance. This constructor is meant to be
     * used by JAXB.
     */
    private FIXOrderImpl() {
    }

    @Override
    public synchronized String toString() {
    	return "";
        /*return Messages.FIX_ORDER_TO_STRING.getText(
                getBrokerID().getValue(),
                String.valueOf(getMessage()));*/
    }

    private BrokerID mBrokerID;
    private static final long serialVersionUID = 1L;
}
