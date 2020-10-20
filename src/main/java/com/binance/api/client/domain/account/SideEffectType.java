package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Desired side effect type of NewMarginOrder requests.
 * @see NewOrderResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum SideEffectType {
    NO_SIDE_EFFECT,
    MARGIN_BUY,
    AUTO_REPAY
}

