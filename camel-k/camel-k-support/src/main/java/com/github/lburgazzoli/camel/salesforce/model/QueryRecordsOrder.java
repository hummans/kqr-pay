/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 */
package com.github.lburgazzoli.camel.salesforce.model;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;
import javax.annotation.Generated;

/**
 * Salesforce QueryRecords DTO for type Order
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class QueryRecordsOrder extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Order> records;

    public List<Order> getRecords() {
        return records;
    }

    public void setRecords(List<Order> records) {
        this.records = records;
    }
}
