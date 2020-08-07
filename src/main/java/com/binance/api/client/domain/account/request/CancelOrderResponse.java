package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderStatus;
import com.binance.api.client.domain.OrderType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response object returned when an order is canceled.
 *
 * @see CancelOrderRequest for the request
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelOrderResponse {

  private String symbol;

  private String origClientOrderId;

  private Long orderId;

  private String clientOrderId;

  private String price;

  private String stopPrice;

  private String origQty;

  private String executedQty;

  private OrderStatus status;

  private OrderType type;

  private OrderSide side;

  public String getSymbol() {
    return symbol;
  }

  public CancelOrderResponse setSymbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  public String getOrigClientOrderId() {
    return origClientOrderId;
  }

  public CancelOrderResponse setOrigClientOrderId(String origClientOrderId) {
    this.origClientOrderId = origClientOrderId;
    return this;
  }

  public Long getOrderId() {
    return orderId;
  }

  public CancelOrderResponse setOrderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public String getClientOrderId() {
    return clientOrderId;
  }

  public CancelOrderResponse setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
    return this;
  }

  public String getPrice() {
    return price;
  }

  public CancelOrderResponse setPrice(String price) {
    this.price = price;
    return this;
  }

  public String getStopPrice() {
    return stopPrice;
  }

  public CancelOrderResponse setStopPrice(String stopPrice) {
    this.stopPrice = stopPrice;
    return this;
  }

  public String getOrigQty() {
    return origQty;
  }

  public CancelOrderResponse setOrigQty(String origQty) {
    this.origQty = origQty;
    return this;
  }

  public String getExecutedQty() {
    return executedQty;
  }

  public CancelOrderResponse setExecutedQty(String executedQty) {
    this.executedQty = executedQty;
    return this;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public CancelOrderResponse setStatus(OrderStatus status) {
    this.status = status;
    return this;
  }

  public OrderType getType() {
    return type;
  }

  public CancelOrderResponse setType(OrderType type) {
    this.type = type;
    return this;
  }

  public OrderSide getSide() {
    return side;
  }

  public CancelOrderResponse setSide(OrderSide side) {
    this.side = side;
    return this;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("origClientOrderId", origClientOrderId)
        .append("orderId", orderId)
        .append("clientOrderId", clientOrderId)
        .append("price", price)
        .append("stopPrice", stopPrice)
        .append("origQty", origQty)
        .append("executedQty", executedQty)
        .append("status", status)
        .append("type", type)
        .append("side", side)
        .toString();
  }
}
