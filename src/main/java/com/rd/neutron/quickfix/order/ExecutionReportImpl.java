package com.rd.neutron.quickfix.order;


import java.util.Date;
import java.math.BigDecimal;

import quickfix.Message;

import javax.xml.bind.annotation.XmlRootElement;

import com.rd.neutron.quickfix.util.FIXUtil;

/* $License$ */
/**
 * Execution Report implementation that wraps a FIX Message. This class
 * is public for the sake of JAXB and is not intended for general use.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ExecutionReportImpl.java 10419 2009-03-12 23:38:50Z tlerios $
 * @since 1.0.0
 */

public class ExecutionReportImpl extends ReportBaseImpl implements ExecutionReport {

    @Override
    public synchronized Date getTransactTime() {
        return FIXUtil.getTransactTime(getMessage());
    }

    @Override
    public synchronized ExecutionType getExecutionType() {
        return FIXUtil.getExecOrExecTransType(getMessage());
    }

    @Override
    public synchronized String getExecutionID() {
        return FIXUtil.getExecutionID(getMessage());
    }

    @Override
    public synchronized OrderSide getSide() {
        return FIXUtil.getSide(getMessage());
    }

    @Override
    public synchronized TradableInstrument getSymbol() {
        return FIXUtil.getSymbol(getMessage());
    }

    @Override
    public synchronized BigDecimal getLastQuantity() {
        return FIXUtil.getLastQuantity(getMessage());
    }

    @Override
    public synchronized BigDecimal getLastPrice() {
        return FIXUtil.getLastPrice(getMessage());
    }

    @Override
    public synchronized String getLastMarket() {
        return FIXUtil.getLastMarket(getMessage());
    }

    @Override
    public synchronized BigDecimal getOrderQuantity() {
        return FIXUtil.getOrderQuantity(getMessage());
    }

    @Override
    public synchronized BigDecimal getLeavesQuantity() {
        return FIXUtil.getLeavesQuantity(getMessage());
    }

    @Override
    public synchronized BigDecimal getCumulativeQuantity() {
        return FIXUtil.getCumulativeQuantity(getMessage());
    }

    @Override
    public synchronized BigDecimal getAveragePrice() {
        return FIXUtil.getAveragePrice(getMessage());
    }

    @Override
    public synchronized String getAccount() {
        return FIXUtil.getAccount(getMessage());
    }

    @Override
    public synchronized OrderType getOrderType() {
        return FIXUtil.getOrderType(getMessage());
    }

    @Override
    public synchronized OrderCapacity getOrderCapacity() {
        return FIXUtil.getOrderCapacity(getMessage());
    }

   
    @Override
    public synchronized OrderTerm getTimeInForce() {
        return FIXUtil.getOrderTerm(getMessage());
    }

   /* @Override
    public synchronized boolean isCancelable() {
        return FIXMessageUtil.isCancellable(getMessage());
    }*/

    /*@Override
    public synchronized String toString() {
        return Messages.EXECUTION_REPORT_TO_STRING.getText(
                String.valueOf(getAccount()),
                String.valueOf(getAveragePrice()),
                String.valueOf(getCumulativeQuantity()),
                String.valueOf(getBrokerID()),
                String.valueOf(getExecutionID()),
                String.valueOf(getExecutionType()),
                String.valueOf(getLastMarket()),
                String.valueOf(getLastPrice()),
                String.valueOf(getLastQuantity()),
                String.valueOf(getLeavesQuantity()),
                String.valueOf(getOrderCapacity()),
                String.valueOf(getOrderID()),
                String.valueOf(getOrderQuantity()),
                String.valueOf(getOrderStatus()),
                String.valueOf(getOrderType()),
                String.valueOf(getOriginalOrderID()),
                String.valueOf(getOriginator()),
                String.valueOf(getActorID()),
                String.valueOf(getViewerID()),
               
                String.valueOf(getReportID()),
                String.valueOf(getSendingTime()),
                String.valueOf(getSide()),
                String.valueOf(getSymbol()),
                String.valueOf(getText()),
               // String.valueOf(getOrderTerm()),
                String.valueOf(getTransactTime()),
                String.valueOf(getBrokerOrderID()),
                String.valueOf(getMessage())
        );
    }
*/
    /**
     * Creates an instance.
     *
     * @param inMessage The FIX Message of type execution report.
     * @param inBrokerID the brokerID from which this report originated.
     * @param inOriginator the originator of this message.
     * @param inActorID the ID of the actor user of this report.
     * @param inViewerID the ID of the viewer user of this report.
     */
    ExecutionReportImpl(Message inMessage,
                        BrokerID inBrokerID,
                        Originator inOriginator,
                        UserID inActorID,
                        UserID inViewerID) {
        super(inMessage, inBrokerID, inOriginator, inActorID, inViewerID);
    }

    /**
     * Creates an instance. This empty constructor is intended for use
     * by JAXB.
     */

    protected ExecutionReportImpl() {
        super();
    }

    private static final long serialVersionUID = 1L;
}
