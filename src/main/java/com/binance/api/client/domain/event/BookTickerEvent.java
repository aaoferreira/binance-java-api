package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookTickerEvent {

  @JsonProperty("u")
  private long updateId;

  @JsonProperty("s")
  private String symbol;

  @JsonProperty("b")
  private String bestBidPrice;

  @JsonProperty("B")
  private String bestBidQuantity;

  @JsonProperty("a")
  private String bestAskPrice;

  @JsonProperty("A")
  private String bestAskQuantity;

  public long getUpdateId() {
    return updateId;
  }

  public void setUpdateId(long updateId) {
    this.updateId = updateId;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getBestBidPrice() {
    return bestBidPrice;
  }

  public void setBestBidPrice(String bestBidPrice) {
    this.bestBidPrice = bestBidPrice;
  }

  public String getBestBidQuantity() {
    return bestBidQuantity;
  }

  public void setBestBidQuantity(String bestBidQuantity) {
    this.bestBidQuantity = bestBidQuantity;
  }

  public String getBestAskPrice() {
    return bestAskPrice;
  }

  public void setBestAskPrice(String bestAskPrice) {
    this.bestAskPrice = bestAskPrice;
  }

  public String getBestAskQuantity() {
    return bestAskQuantity;
  }

  public void setBestAskQuantity(String bestAskQuantity) {
    this.bestAskQuantity = bestAskQuantity;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("updateId", updateId)
        .append("symbol", symbol)
        .append("bestBidPrice", bestBidPrice)
        .append("bestBidQuantity", bestBidQuantity)
        .append("bestAskPrice", bestAskPrice)
        .append("bestAskQuantity", bestAskQuantity)
        .toString();
  }
}
